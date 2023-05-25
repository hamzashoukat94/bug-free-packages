/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.ServerResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface HeaderController {
    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendHeaders(
            final String customHeader,
            final String value) throws ApiException, IOException;

    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendHeadersAsync(
            final String customHeader,
            final String value);

}