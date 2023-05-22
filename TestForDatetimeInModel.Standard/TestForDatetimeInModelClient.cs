// <copyright file="TestForDatetimeInModelClient.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using APIMatic.Core;
    using APIMatic.Core.Types;
    using TestForDatetimeInModel.Standard.Controllers;
    using TestForDatetimeInModel.Standard.Http.Client;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// The gateway for the SDK. This class acts as a factory for Controller and
    /// holds the configuration of the SDK.
    /// </summary>
    public sealed class TestForDatetimeInModelClient : IConfiguration
    {
        // A map of environments and their corresponding servers/baseurls
        private static readonly Dictionary<Environment, Dictionary<Enum, string>> EnvironmentsMap =
            new Dictionary<Environment, Dictionary<Enum, string>>
        {
            {
                Environment.Production, new Dictionary<Enum, string>
                {
                    { Server.Default, "http://apimatic.hopto.org:{suites}" },
                    { Server.AuthServer, "http://apimaticauth.hopto.org:3000" },
                }
            },
            {
                Environment.Testing, new Dictionary<Enum, string>
                {
                    { Server.Default, "http://localhost:3000" },
                    { Server.AuthServer, "http://apimaticauth.xhopto.org:3000" },
                }
            },
        };

        private readonly GlobalConfiguration globalConfiguration;
        private const string userAgent = "APIMATIC 3.0";
        private readonly HttpCallBack httpCallBack;
        private readonly Lazy<BodyParamsController> bodyParams;
        private readonly Lazy<FormParamsController> formParams;

        private TestForDatetimeInModelClient(
            Environment environment,
            string port,
            Models.SuiteCodeEnum suites,
            HttpCallBack httpCallBack,
            IHttpClientConfiguration httpClientConfiguration)
        {
            this.Environment = environment;
            this.Port = port;
            this.Suites = suites;
            this.httpCallBack = httpCallBack;
            this.HttpClientConfiguration = httpClientConfiguration;

            globalConfiguration = new GlobalConfiguration.Builder()
                .ApiCallback(httpCallBack)
                .HttpConfiguration(httpClientConfiguration)
                .ServerUrls(EnvironmentsMap[environment], Server.Default)
                .Parameters(globalParameter => globalParameter
                    .Template(templateParameter => templateParameter.Setup("port", this.Port))
                    .Template(templateParameter => templateParameter.Setup("suites", (int)this.Suites)))
                .UserAgent(userAgent)
                .Build();


            this.bodyParams = new Lazy<BodyParamsController>(
                () => new BodyParamsController(globalConfiguration));
            this.formParams = new Lazy<FormParamsController>(
                () => new FormParamsController(globalConfiguration));
        }

        /// <summary>
        /// Gets BodyParamsController controller.
        /// </summary>
        public BodyParamsController BodyParamsController => this.bodyParams.Value;

        /// <summary>
        /// Gets FormParamsController controller.
        /// </summary>
        public FormParamsController FormParamsController => this.formParams.Value;

        /// <summary>
        /// Gets the configuration of the Http Client associated with this client.
        /// </summary>
        public IHttpClientConfiguration HttpClientConfiguration { get; }

        /// <summary>
        /// Gets Environment.
        /// Current API environment.
        /// </summary>
        public Environment Environment { get; }

        /// <summary>
        /// Gets Port.
        /// Port value.
        /// </summary>
        public string Port { get; }

        /// <summary>
        /// Gets Suites.
        /// Suites value.
        /// </summary>
        public Models.SuiteCodeEnum Suites { get; }

        /// <summary>
        /// Gets http callback.
        /// </summary>
        internal HttpCallBack HttpCallBack => this.httpCallBack;

        /// <summary>
        /// Gets the URL for a particular alias in the current environment and appends
        /// it with template parameters.
        /// </summary>
        /// <param name="alias">Default value:DEFAULT.</param>
        /// <returns>Returns the baseurl.</returns>
        public string GetBaseUri(Server alias = Server.Default)
        {
            return globalConfiguration.ServerUrl(alias);
        }

        /// <summary>
        /// Creates an object of the TestForDatetimeInModelClient using the values provided for the builder.
        /// </summary>
        /// <returns>Builder.</returns>
        public Builder ToBuilder()
        {
            Builder builder = new Builder()
                .Environment(this.Environment)
                .Port(this.Port)
                .Suites(this.Suites)
                .HttpCallBack(httpCallBack)
                .HttpClientConfig(config => config.Build());

            return builder;
        }

        /// <inheritdoc/>
        public override string ToString()
        {
            return
                $"Environment = {this.Environment}, " +
                $"Port = {this.Port}, " +
                $"Suites = {this.Suites}, " +
                $"HttpClientConfiguration = {this.HttpClientConfiguration}, ";
        }

        /// <summary>
        /// Creates the client using builder.
        /// </summary>
        /// <returns> TestForDatetimeInModelClient.</returns>
        internal static TestForDatetimeInModelClient CreateFromEnvironment()
        {
            var builder = new Builder();

            string environment = System.Environment.GetEnvironmentVariable("TEST_FOR_DATETIME_IN_MODEL_STANDARD_ENVIRONMENT");
            string port = System.Environment.GetEnvironmentVariable("TEST_FOR_DATETIME_IN_MODEL_STANDARD_PORT");
            string suites = System.Environment.GetEnvironmentVariable("TEST_FOR_DATETIME_IN_MODEL_STANDARD_SUITES");

            if (environment != null)
            {
                builder.Environment(ApiHelper.JsonDeserialize<Environment>($"\"{environment}\""));
            }

            if (port != null)
            {
                builder.Port(port);
            }

            if (suites != null)
            {
                builder.Suites(ApiHelper.JsonDeserialize<Models.SuiteCodeEnum>($"\"{suites}\""));
            }

            return builder.Build();
        }

        /// <summary>
        /// Builder class.
        /// </summary>
        public class Builder
        {
            private Environment environment = TestForDatetimeInModel.Standard.Environment.Testing;
            private string port = "80";
            private Models.SuiteCodeEnum suites = Models.SuiteCodeEnum.Hearts;
            private HttpClientConfiguration.Builder httpClientConfig = new HttpClientConfiguration.Builder();
            private HttpCallBack httpCallBack;

            /// <summary>
            /// Sets Environment.
            /// </summary>
            /// <param name="environment"> Environment. </param>
            /// <returns> Builder. </returns>
            public Builder Environment(Environment environment)
            {
                this.environment = environment;
                return this;
            }

            /// <summary>
            /// Sets Port.
            /// </summary>
            /// <param name="port"> Port. </param>
            /// <returns> Builder. </returns>
            public Builder Port(string port)
            {
                this.port = port ?? throw new ArgumentNullException(nameof(port));
                return this;
            }

            /// <summary>
            /// Sets Suites.
            /// </summary>
            /// <param name="suites"> Suites. </param>
            /// <returns> Builder. </returns>
            public Builder Suites(Models.SuiteCodeEnum suites)
            {
                this.suites = suites;
                return this;
            }

            /// <summary>
            /// Sets HttpClientConfig.
            /// </summary>
            /// <param name="action"> Action. </param>
            /// <returns>Builder.</returns>
            public Builder HttpClientConfig(Action<HttpClientConfiguration.Builder> action)
            {
                if (action is null)
                {
                    throw new ArgumentNullException(nameof(action));
                }

                action(this.httpClientConfig);
                return this;
            }

           

            /// <summary>
            /// Sets the HttpCallBack for the Builder.
            /// </summary>
            /// <param name="httpCallBack"> http callback. </param>
            /// <returns>Builder.</returns>
            internal Builder HttpCallBack(HttpCallBack httpCallBack)
            {
                this.httpCallBack = httpCallBack;
                return this;
            }

            /// <summary>
            /// Creates an object of the TestForDatetimeInModelClient using the values provided for the builder.
            /// </summary>
            /// <returns>TestForDatetimeInModelClient.</returns>
            public TestForDatetimeInModelClient Build()
            {

                return new TestForDatetimeInModelClient(
                    environment,
                    port,
                    suites,
                    httpCallBack,
                    httpClientConfig.Build());
            }
        }
    }
}
