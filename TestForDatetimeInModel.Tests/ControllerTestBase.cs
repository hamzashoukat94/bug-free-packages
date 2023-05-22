// <copyright file="ControllerTestBase.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using APIMatic.Core.Types;
    using NUnit.Framework;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Http.Client;
    using TestForDatetimeInModel.Standard.Models;

    /// <summary>
    /// ControllerTestBase Class.
    /// </summary>
    [TestFixture]
    public class ControllerTestBase
    {
        /// <summary>
        /// Assert precision.
        /// </summary>
        protected const double AssertPrecision = 0.1;

        /// <summary>
        /// Gets HttpCallBackHandler.
        /// </summary>
        internal HttpCallBack HttpCallBack { get; private set; } = new HttpCallBack();

        /// <summary>
        /// Gets TestForDatetimeInModelClient Client.
        /// </summary>
        protected TestForDatetimeInModelClient Client { get; private set; }

        /// <summary>
        /// Set up the client.
        /// </summary>
        [OneTimeSetUp]
        public void SetUp()
        {
            TestForDatetimeInModelClient config = TestForDatetimeInModelClient.CreateFromEnvironment();
            this.Client = config.ToBuilder()
                .HttpCallBack(HttpCallBack)
                .Environment(TestForDatetimeInModel.Standard.Environment.Testing)
                .Build();
        }
    }
}