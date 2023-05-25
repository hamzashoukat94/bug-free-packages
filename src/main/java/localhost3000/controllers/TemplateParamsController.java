/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.EchoResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface TemplateParamsController {
    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    EchoResponse sendStringArray(
            final List<String> strings) throws ApiException, IOException;

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     */
    CompletableFuture<EchoResponse> sendStringArrayAsync(
            final List<String> strings);

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    EchoResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException;

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the EchoResponse response from the API call
     */
    CompletableFuture<EchoResponse> sendIntegerArrayAsync(
            final List<Integer> integers);

}