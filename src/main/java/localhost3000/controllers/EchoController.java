/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.DynamicResponse;
import localhost3000.models.EchoResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface EchoController {
    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    EchoResponse queryEcho(
            final Map<String, Object> queryParameters) throws ApiException, IOException;

    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     */
    CompletableFuture<EchoResponse> queryEchoAsync(
            final Map<String, Object> queryParameters);

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse jsonEcho(
            final Object input) throws ApiException, IOException;

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> jsonEchoAsync(
            final Object input);

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse formEcho(
            final Object input) throws ApiException, IOException;

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> formEchoAsync(
            final Object input);

}