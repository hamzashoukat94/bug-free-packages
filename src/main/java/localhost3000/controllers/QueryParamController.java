/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.ComplexType;
import localhost3000.models.Days;
import localhost3000.models.ServerResponse;
import localhost3000.models.SuiteCode;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface QueryParamController {
    /**
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse optionalDynamicQueryParam(
            final String name,
            final Map<String, Object> queryParameters) throws ApiException, IOException;

    /**
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> optionalDynamicQueryParamAsync(
            final String name,
            final Map<String, Object> queryParameters);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse noParams() throws ApiException, IOException;

    /**
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> noParamsAsync();

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse stringEnumArray(
            final List<Days> days) throws ApiException, IOException;

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> stringEnumArrayAsync(
            final List<Days> days);

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendIndexedComplexTypeInQuery(
            final ComplexType complexType) throws ApiException, IOException;

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendIndexedComplexTypeInQueryAsync(
            final ComplexType complexType);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc1123DateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * @param  string  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse stringParam(
            final String string) throws ApiException, IOException;

    /**
     * @param  string  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> stringParamAsync(
            final String string);

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse numberArray(
            final List<Integer> integers) throws ApiException, IOException;

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> numberArrayAsync(
            final List<Integer> integers);

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse simpleQuery(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) throws ApiException, IOException;

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> simpleQueryAsync(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters);

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendIndexedMapOfComplexTypeInQuery(
            final Map<String, ComplexType> complexType) throws ApiException, IOException;

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendIndexedMapOfComplexTypeInQueryAsync(
            final Map<String, ComplexType> complexType);

    /**
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse urlParam(
            final String url) throws ApiException, IOException;

    /**
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> urlParamAsync(
            final String url);

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse integerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException;

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> integerEnumArrayAsync(
            final List<SuiteCode> suites);

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse dateArray(
            final List<LocalDate> dates) throws ApiException, IOException;

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> dateArrayAsync(
            final List<LocalDate> dates);

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse date(
            final LocalDate date) throws ApiException, IOException;

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> dateAsync(
            final LocalDate date);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse unixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> unixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse unixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> unixDateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc3339DateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse stringArray(
            final List<String> strings) throws ApiException, IOException;

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> stringArrayAsync(
            final List<String> strings);

    /**
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse multipleParams(
            final int number,
            final double precision,
            final String string,
            final String url) throws ApiException, IOException;

    /**
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> multipleParamsAsync(
            final int number,
            final double precision,
            final String string,
            final String url);

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendIndexedListOfComplexTypeInQuery(
            final List<ComplexType> complexType) throws ApiException, IOException;

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendIndexedListOfComplexTypeInQueryAsync(
            final List<ComplexType> complexType);

}