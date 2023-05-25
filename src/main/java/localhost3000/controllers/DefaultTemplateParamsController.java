/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.EchoResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultTemplateParamsController extends BaseController implements TemplateParamsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultTemplateParamsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse sendStringArray(
            final List<String> strings) throws ApiException, IOException {
        return prepareSendStringArrayRequest(strings).execute();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> sendStringArrayAsync(
            final List<String> strings) {
        try { 
            return prepareSendStringArrayRequest(strings).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringArray.
     */
    private ApiCall<EchoResponse, ApiException> prepareSendStringArrayRequest(
            final List<String> strings) throws IOException {
        return new ApiCall.Builder<EchoResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/template/{strings}")
                        .templateParam(param -> param.key("strings").value(strings)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EchoResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException {
        return prepareSendIntegerArrayRequest(integers).execute();
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> sendIntegerArrayAsync(
            final List<Integer> integers) {
        try { 
            return prepareSendIntegerArrayRequest(integers).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendIntegerArray.
     */
    private ApiCall<EchoResponse, ApiException> prepareSendIntegerArrayRequest(
            final List<Integer> integers) throws IOException {
        return new ApiCall.Builder<EchoResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/template/{integers}")
                        .templateParam(param -> param.key("integers").value(integers)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EchoResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}