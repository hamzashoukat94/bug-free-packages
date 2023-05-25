/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.DynamicResponse;
import localhost3000.models.EchoResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultEchoController extends BaseController implements EchoController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultEchoController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse jsonEcho(
            final Object input) throws ApiException, IOException {
        return prepareJsonEchoRequest(input).execute();
    }

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> jsonEchoAsync(
            final Object input) {
        try { 
            return prepareJsonEchoRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for jsonEcho.
     */
    private ApiCall<DynamicResponse, ApiException> prepareJsonEchoRequest(
            final Object input) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/")
                        .bodyParam(param -> param.value(input))
                        .bodySerializer(() ->  ApiHelper.serialize(input))
                        .queryParam(param -> param.key("echo")
                                .value("true").isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse formEcho(
            final Object input) throws ApiException, IOException {
        return prepareFormEchoRequest(input).execute();
    }

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> formEchoAsync(
            final Object input) {
        try { 
            return prepareFormEchoRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for formEcho.
     */
    private ApiCall<DynamicResponse, ApiException> prepareFormEchoRequest(
            final Object input) throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/")
                        .formParam(param -> param.key("input")
                                .value(input))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse queryEcho(
            final Map<String, Object> queryParameters) throws ApiException, IOException {
        return prepareQueryEchoRequest(queryParameters).execute();
    }

    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> queryEchoAsync(
            final Map<String, Object> queryParameters) {
        try { 
            return prepareQueryEchoRequest(queryParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for queryEcho.
     */
    private ApiCall<EchoResponse, ApiException> prepareQueryEchoRequest(
            final Map<String, Object> queryParameters) throws IOException {
        return new ApiCall.Builder<EchoResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EchoResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}