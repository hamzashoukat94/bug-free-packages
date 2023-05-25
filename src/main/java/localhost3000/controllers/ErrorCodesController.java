/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.Complex5;
import localhost3000.models.DynamicResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ErrorCodesController {
    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse catch412GlobalError() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> catch412GlobalErrorAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse get501() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> get501Async();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse get400() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> get400Async();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse get500() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> get500Async();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse get401() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> get401Async();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse receiveExceptionWithUnixtimestampException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> receiveExceptionWithUnixtimestampExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse receiveExceptionWithRfc1123Datetime() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> receiveExceptionWithRfc1123DatetimeAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse receiveExceptionWithRfc3339Datetime() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> receiveExceptionWithRfc3339DatetimeAsync();

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Complex5 receiveEndpointLevelException() throws ApiException, IOException;

    /**
     * @return    Returns the Complex5 response from the API call
     */
    CompletableFuture<Complex5> receiveEndpointLevelExceptionAsync();

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Complex5 receiveGlobalLevelException() throws ApiException, IOException;

    /**
     * @return    Returns the Complex5 response from the API call
     */
    CompletableFuture<Complex5> receiveGlobalLevelExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse dateInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> dateInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse uUIDInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> uUIDInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse dynamicInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> dynamicInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse precisionInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> precisionInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse booleanInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> booleanInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse longInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> longInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse numberInException() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> numberInExceptionAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse getExceptionWithString() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> getExceptionWithStringAsync();

}