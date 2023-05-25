/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultHeaderController extends BaseController implements HeaderController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultHeaderController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendHeaders(
            final String customHeader,
            final String value) throws ApiException, IOException {
        return prepareSendHeadersRequest(customHeader, value).execute();
    }

    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendHeadersAsync(
            final String customHeader,
            final String value) {
        try { 
            return prepareSendHeadersRequest(customHeader, value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendHeaders.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendHeadersRequest(
            final String customHeader,
            final String value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/header")
                        .formParam(param -> param.key("value")
                                .value(value))
                        .headerParam(param -> param.key("custom-header")
                                .value(customHeader).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}