/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultQueryParamsController extends BaseController implements QueryParamsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultQueryParamsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  number  Required parameter: Example:
     * @param  number1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendNumberAsOptional(
            final int number,
            final Integer number1) throws ApiException, IOException {
        return prepareSendNumberAsOptionalRequest(number, number1).execute();
    }

    /**
     * @param  number  Required parameter: Example:
     * @param  number1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final int number,
            final Integer number1) {
        try { 
            return prepareSendNumberAsOptionalRequest(number, number1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendNumberAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendNumberAsOptionalRequest(
            final int number,
            final Integer number1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/numberAsOptional")
                        .queryParam(param -> param.key("number")
                                .value(number).isRequired(false))
                        .queryParam(param -> param.key("number1")
                                .value(number1).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  mLong  Required parameter: Example:
     * @param  long1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendLongAsOptional(
            final long mLong,
            final Long long1) throws ApiException, IOException {
        return prepareSendLongAsOptionalRequest(mLong, long1).execute();
    }

    /**
     * @param  mLong  Required parameter: Example:
     * @param  long1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendLongAsOptionalAsync(
            final long mLong,
            final Long long1) {
        try { 
            return prepareSendLongAsOptionalRequest(mLong, long1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendLongAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendLongAsOptionalRequest(
            final long mLong,
            final Long long1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/longAsOptional")
                        .queryParam(param -> param.key("long")
                                .value(mLong).isRequired(false))
                        .queryParam(param -> param.key("long1")
                                .value(long1).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  precision  Required parameter: Example:
     * @param  precision1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse precisionAsOptional(
            final double precision,
            final Double precision1) throws ApiException, IOException {
        return preparePrecisionAsOptionalRequest(precision, precision1).execute();
    }

    /**
     * @param  precision  Required parameter: Example:
     * @param  precision1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final double precision,
            final Double precision1) {
        try { 
            return preparePrecisionAsOptionalRequest(precision, precision1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for precisionAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> preparePrecisionAsOptionalRequest(
            final double precision,
            final Double precision1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/precisionAsOptional")
                        .queryParam(param -> param.key("precision")
                                .value(precision).isRequired(false))
                        .queryParam(param -> param.key("precision1")
                                .value(precision1).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  boolean1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse booleanAsOptional(
            final boolean mBoolean,
            final Boolean boolean1) throws ApiException, IOException {
        return prepareBooleanAsOptionalRequest(mBoolean, boolean1).execute();
    }

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  boolean1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final boolean mBoolean,
            final Boolean boolean1) {
        try { 
            return prepareBooleanAsOptionalRequest(mBoolean, boolean1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for booleanAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareBooleanAsOptionalRequest(
            final boolean mBoolean,
            final Boolean boolean1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/booleanAsOptional")
                        .queryParam(param -> param.key("boolean")
                                .value(mBoolean).isRequired(false))
                        .queryParam(param -> param.key("boolean1")
                                .value(boolean1).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc1123DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        return prepareRfc1123DatetimeAsOptionalRequest(dateTime, dateTime1).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        try { 
            return prepareRfc1123DatetimeAsOptionalRequest(dateTime, dateTime1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc1123DatetimeAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc1123DatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc1123dateTimeAsOptional")
                        .queryParam(param -> param.key("dateTime")
                                .value(DateTimeHelper.toRfc1123DateTime(dateTime)))
                        .queryParam(param -> param.key("dateTime1")
                                .value(DateTimeHelper.toRfc1123DateTime(dateTime1)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc3339DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        return prepareRfc3339DatetimeAsOptionalRequest(dateTime, dateTime1).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        try { 
            return prepareRfc3339DatetimeAsOptionalRequest(dateTime, dateTime1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc3339DatetimeAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc3339DatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc3339dateTimeAsOptional")
                        .queryParam(param -> param.key("dateTime")
                                .value(DateTimeHelper.toRfc8601DateTime(dateTime)))
                        .queryParam(param -> param.key("dateTime1")
                                .value(DateTimeHelper.toRfc8601DateTime(dateTime1)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  date  Required parameter: Example:
     * @param  date1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDateAsOptional(
            final LocalDate date,
            final LocalDate date1) throws ApiException, IOException {
        return prepareSendDateAsOptionalRequest(date, date1).execute();
    }

    /**
     * @param  date  Required parameter: Example:
     * @param  date1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateAsOptionalAsync(
            final LocalDate date,
            final LocalDate date1) {
        try { 
            return prepareSendDateAsOptionalRequest(date, date1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDateAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDateAsOptionalRequest(
            final LocalDate date,
            final LocalDate date1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/dateAsOptional")
                        .queryParam(param -> param.key("date")
                                .value(DateTimeHelper.toSimpleDate(date)))
                        .queryParam(param -> param.key("date1")
                                .value(DateTimeHelper.toSimpleDate(date1)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  string  Required parameter: Example:
     * @param  string1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringAsOptional(
            final String string,
            final String string1) throws ApiException, IOException {
        return prepareSendStringAsOptionalRequest(string, string1).execute();
    }

    /**
     * @param  string  Required parameter: Example:
     * @param  string1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringAsOptionalAsync(
            final String string,
            final String string1) {
        try { 
            return prepareSendStringAsOptionalRequest(string, string1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringAsOptionalRequest(
            final String string,
            final String string1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/stringAsOptional")
                        .queryParam(param -> param.key("string")
                                .value(string))
                        .queryParam(param -> param.key("string1")
                                .value(string1).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse unixdatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        return prepareUnixdatetimeAsOptionalRequest(dateTime, dateTime1).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @param  dateTime1  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixdatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        try { 
            return prepareUnixdatetimeAsOptionalRequest(dateTime, dateTime1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for unixdatetimeAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareUnixdatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/unixdateTimeAsOptional")
                        .queryParam(param -> param.key("dateTime")
                                .value(DateTimeHelper.toUnixTimestamp(dateTime)))
                        .queryParam(param -> param.key("dateTime1")
                                .value(DateTimeHelper.toUnixTimestamp(dateTime1)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}