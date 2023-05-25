/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import localhost3000.controllers.BodyParamsController;
import localhost3000.controllers.DefaultBodyParamsController;
import localhost3000.controllers.DefaultEchoController;
import localhost3000.controllers.DefaultErrorCodesController;
import localhost3000.controllers.DefaultFormParamsController;
import localhost3000.controllers.DefaultHeaderController;
import localhost3000.controllers.DefaultQueryParamController;
import localhost3000.controllers.DefaultQueryParamsController;
import localhost3000.controllers.DefaultResponseTypesController;
import localhost3000.controllers.DefaultTemplateParamsController;
import localhost3000.controllers.EchoController;
import localhost3000.controllers.ErrorCodesController;
import localhost3000.controllers.FormParamsController;
import localhost3000.controllers.HeaderController;
import localhost3000.controllers.QueryParamController;
import localhost3000.controllers.QueryParamsController;
import localhost3000.controllers.ResponseTypesController;
import localhost3000.controllers.TemplateParamsController;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClientConfiguration;
import localhost3000.http.client.ReadonlyHttpClientConfiguration;
import localhost3000.models.SuiteCode;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class TesterClient implements TesterClientInterface {

    /**
     * Private store for controllers.
     */
    private ResponseTypesController responseTypes;
    private FormParamsController formParams;
    private BodyParamsController bodyParams;
    private ErrorCodesController errorCodes;
    private QueryParamController queryParam;
    private EchoController echo;
    private HeaderController header;
    private TemplateParamsController templateParams;
    private QueryParamsController queryParams;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * port value.
     */
    private final String port;

    /**
     * suites value.
     */
    private final SuiteCode suites;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private TesterClient(Environment environment, String port, SuiteCode suites,
            HttpClient httpClient, ReadonlyHttpClientConfiguration httpClientConfig,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.port = port;
        this.suites = suites;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);


        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .callback(httpCallback)
                .build();
        responseTypes = new DefaultResponseTypesController(globalConfig);
        formParams = new DefaultFormParamsController(globalConfig);
        bodyParams = new DefaultBodyParamsController(globalConfig);
        errorCodes = new DefaultErrorCodesController(globalConfig);
        queryParam = new DefaultQueryParamController(globalConfig);
        echo = new DefaultEchoController(globalConfig);
        header = new DefaultHeaderController(globalConfig);
        templateParams = new DefaultTemplateParamsController(globalConfig);
        queryParams = new DefaultQueryParamsController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of ResponseTypesController.
     * @return responseTypes
     */
    public ResponseTypesController getResponseTypesController() {
        return responseTypes;
    }

    /**
     * Get the instance of FormParamsController.
     * @return formParams
     */
    public FormParamsController getFormParamsController() {
        return formParams;
    }

    /**
     * Get the instance of BodyParamsController.
     * @return bodyParams
     */
    public BodyParamsController getBodyParamsController() {
        return bodyParams;
    }

    /**
     * Get the instance of ErrorCodesController.
     * @return errorCodes
     */
    public ErrorCodesController getErrorCodesController() {
        return errorCodes;
    }

    /**
     * Get the instance of QueryParamController.
     * @return queryParam
     */
    public QueryParamController getQueryParamController() {
        return queryParam;
    }

    /**
     * Get the instance of EchoController.
     * @return echo
     */
    public EchoController getEchoController() {
        return echo;
    }

    /**
     * Get the instance of HeaderController.
     * @return header
     */
    public HeaderController getHeaderController() {
        return header;
    }

    /**
     * Get the instance of TemplateParamsController.
     * @return templateParams
     */
    public TemplateParamsController getTemplateParamsController() {
        return templateParams;
    }

    /**
     * Get the instance of QueryParamsController.
     * @return queryParams
     */
    public QueryParamsController getQueryParamsController() {
        return queryParams;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * port value.
     * @return port
     */
    public String getPort() {
        return port;
    }

    /**
     * suites value.
     * @return suites
     */
    public SuiteCode getSuites() {
        return suites;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("port",
                new SimpleEntry<Object, Boolean>(this.port, false));
        parameters.put("suites",
                new SimpleEntry<Object, Boolean>(this.suites, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://apimatic.hopto.org:{suites}";
            }
            if (server.equals(Server.AUTH_SERVER)) {
                return "http://apimaticauth.hopto.org:3000";
            }
        }
        if (environment.equals(Environment.TESTING)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://localhost:3000";
            }
            if (server.equals(Server.AUTH_SERVER)) {
                return "http://apimaticauth.xhopto.org:3000";
            }
        }
        return "http://localhost:3000";
    }

    /**
     * Converts this TesterClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TesterClient [" + "environment=" + environment + ", port=" + port + ", suites="
                + suites + ", httpClientConfig=" + httpClientConfig + ", authentications="
                + authentications + "]";
    }

    /**
     * Builds a new {@link TesterClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link TesterClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.port = getPort();
        builder.suites = getSuites();
        builder.httpClient = getHttpClient();
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link TesterClient}.
     */
    public static class Builder {

        private Environment environment = Environment.TESTING;
        private String port = "80";
        private SuiteCode suites = SuiteCode.HEARTS;
        private HttpClient httpClient;
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * port value.
         * @param port The port for client.
         * @return Builder
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * suites value.
         * @param suites The suites for client.
         * @return Builder
         */
        public Builder suites(SuiteCode suites) {
            this.suites = suites;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new TesterClient object using the set fields.
         * @return TesterClient
         */
        public TesterClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new TesterClient(environment, port, suites, httpClient, httpClientConfig,
                    authentications, httpCallback);
        }
    }
}