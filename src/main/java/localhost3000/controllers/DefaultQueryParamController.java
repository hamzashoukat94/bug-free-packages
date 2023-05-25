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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.ComplexType;
import localhost3000.models.Days;
import localhost3000.models.ServerResponse;
import localhost3000.models.SuiteCode;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultQueryParamController extends BaseController implements QueryParamController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultQueryParamController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dateArray(
            final List<LocalDate> dates) throws ApiException, IOException {
        return prepareDateArrayRequest(dates).execute();
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateArrayAsync(
            final List<LocalDate> dates) {
        try { 
            return prepareDateArrayRequest(dates).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for dateArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareDateArrayRequest(
            final List<LocalDate> dates) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/datearray")
                        .queryParam(param -> param.key("dates")
                                .value(DateTimeHelper.toSimpleDate(dates)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse optionalDynamicQueryParam(
            final String name,
            final Map<String, Object> queryParameters) throws ApiException, IOException {
        return prepareOptionalDynamicQueryParamRequest(name, queryParameters).execute();
    }

    /**
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> optionalDynamicQueryParamAsync(
            final String name,
            final Map<String, Object> queryParameters) {
        try { 
            return prepareOptionalDynamicQueryParamRequest(name, queryParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for optionalDynamicQueryParam.
     */
    private ApiCall<ServerResponse, ApiException> prepareOptionalDynamicQueryParamRequest(
            final String name,
            final Map<String, Object> queryParameters) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/optionalQueryParam")
                        .queryParam(param -> param.key("name")
                                .value(name))
                        .queryParam(queryParameters)
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
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse date(
            final LocalDate date) throws ApiException, IOException {
        return prepareDateRequest(date).execute();
    }

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateAsync(
            final LocalDate date) {
        try { 
            return prepareDateRequest(date).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for date.
     */
    private ApiCall<ServerResponse, ApiException> prepareDateRequest(
            final LocalDate date) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/date")
                        .queryParam(param -> param.key("date")
                                .value(DateTimeHelper.toSimpleDate(date)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse unixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareUnixDateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareUnixDateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for unixDateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareUnixDateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/unixdatetimearray")
                        .queryParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toUnixTimestamp(datetimes)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse unixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareUnixDateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixDateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareUnixDateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for unixDateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareUnixDateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/unixdatetime")
                        .queryParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toUnixTimestamp(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareRfc1123DateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareRfc1123DateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc1123DateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc1123DateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc1123datetime")
                        .queryParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toRfc1123DateTime(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareRfc1123DateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareRfc1123DateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc1123DateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc1123DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc1123datetimearray")
                        .queryParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toRfc1123DateTime(datetimes)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareRfc3339DateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareRfc3339DateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc3339DateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc3339DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc3339datetimearray")
                        .queryParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toRfc8601DateTime(datetimes)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareRfc3339DateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareRfc3339DateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for rfc3339DateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareRfc3339DateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/rfc3339datetime")
                        .queryParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse noParams() throws ApiException, IOException {
        return prepareNoParamsRequest().execute();
    }

    /**
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> noParamsAsync() {
        try { 
            return prepareNoParamsRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for noParams.
     */
    private ApiCall<ServerResponse, ApiException> prepareNoParamsRequest() throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/noparams")
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
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringParam(
            final String string) throws ApiException, IOException {
        return prepareStringParamRequest(string).execute();
    }

    /**
     * @param  string  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringParamAsync(
            final String string) {
        try { 
            return prepareStringParamRequest(string).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stringParam.
     */
    private ApiCall<ServerResponse, ApiException> prepareStringParamRequest(
            final String string) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/stringparam")
                        .queryParam(param -> param.key("string")
                                .value(string))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse urlParam(
            final String url) throws ApiException, IOException {
        return prepareUrlParamRequest(url).execute();
    }

    /**
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> urlParamAsync(
            final String url) {
        try { 
            return prepareUrlParamRequest(url).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for urlParam.
     */
    private ApiCall<ServerResponse, ApiException> prepareUrlParamRequest(
            final String url) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/urlparam")
                        .queryParam(param -> param.key("url")
                                .value(url))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse numberArray(
            final List<Integer> integers) throws ApiException, IOException {
        return prepareNumberArrayRequest(integers).execute();
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> numberArrayAsync(
            final List<Integer> integers) {
        try { 
            return prepareNumberArrayRequest(integers).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for numberArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareNumberArrayRequest(
            final List<Integer> integers) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/numberarray")
                        .queryParam(param -> param.key("integers")
                                .value(integers))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringArray(
            final List<String> strings) throws ApiException, IOException {
        return prepareStringArrayRequest(strings).execute();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringArrayAsync(
            final List<String> strings) {
        try { 
            return prepareStringArrayRequest(strings).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stringArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareStringArrayRequest(
            final List<String> strings) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/stringarray")
                        .queryParam(param -> param.key("strings")
                                .value(strings))
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
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse simpleQuery(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) throws ApiException, IOException {
        return prepareSimpleQueryRequest(mBoolean, number, string, queryParameters).execute();
    }

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> simpleQueryAsync(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) {
        try { 
            return prepareSimpleQueryRequest(mBoolean, number, string, queryParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for simpleQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSimpleQueryRequest(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query")
                        .queryParam(param -> param.key("boolean")
                                .value(mBoolean).isRequired(false))
                        .queryParam(param -> param.key("number")
                                .value(number).isRequired(false))
                        .queryParam(param -> param.key("string")
                                .value(string))
                        .queryParam(queryParameters)
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringEnumArray(
            final List<Days> days) throws ApiException, IOException {
        return prepareStringEnumArrayRequest(days).execute();
    }

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringEnumArrayAsync(
            final List<Days> days) {
        try { 
            return prepareStringEnumArrayRequest(days).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stringEnumArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareStringEnumArrayRequest(
            final List<Days> days) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/stringenumarray")
                        .queryParam(param -> param.key("days")
                                .value(Days.toValue(days)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse multipleParams(
            final int number,
            final double precision,
            final String string,
            final String url) throws ApiException, IOException {
        return prepareMultipleParamsRequest(number, precision, string, url).execute();
    }

    /**
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> multipleParamsAsync(
            final int number,
            final double precision,
            final String string,
            final String url) {
        try { 
            return prepareMultipleParamsRequest(number, precision, string, url).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for multipleParams.
     */
    private ApiCall<ServerResponse, ApiException> prepareMultipleParamsRequest(
            final int number,
            final double precision,
            final String string,
            final String url) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/multipleparams")
                        .queryParam(param -> param.key("number")
                                .value(number).isRequired(false))
                        .queryParam(param -> param.key("precision")
                                .value(precision).isRequired(false))
                        .queryParam(param -> param.key("string")
                                .value(string))
                        .queryParam(param -> param.key("url")
                                .value(url))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse integerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException {
        return prepareIntegerEnumArrayRequest(suites).execute();
    }

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> integerEnumArrayAsync(
            final List<SuiteCode> suites) {
        try { 
            return prepareIntegerEnumArrayRequest(suites).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for integerEnumArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareIntegerEnumArrayRequest(
            final List<SuiteCode> suites) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/integerenumarray")
                        .queryParam(param -> param.key("suites")
                                .value(SuiteCode.toValue(suites)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedComplexTypeInQuery(
            final ComplexType complexType) throws ApiException, IOException {
        return prepareSendIndexedComplexTypeInQueryRequest(complexType).execute();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedComplexTypeInQueryAsync(
            final ComplexType complexType) {
        try { 
            return prepareSendIndexedComplexTypeInQueryRequest(complexType).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendIndexedComplexTypeInQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendIndexedComplexTypeInQueryRequest(
            final ComplexType complexType) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/complex/indexed")
                        .queryParam(param -> param.key("complexType")
                                .value(complexType))
                        .queryParam(param -> param.key("content")
                                .value("SIMPLE").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedListOfComplexTypeInQuery(
            final List<ComplexType> complexType) throws ApiException, IOException {
        return prepareSendIndexedListOfComplexTypeInQueryRequest(complexType).execute();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedListOfComplexTypeInQueryAsync(
            final List<ComplexType> complexType) {
        try { 
            return prepareSendIndexedListOfComplexTypeInQueryRequest(complexType).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendIndexedListOfComplexTypeInQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendIndexedListOfComplexTypeInQueryRequest(
            final List<ComplexType> complexType) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/complex/indexed")
                        .queryParam(param -> param.key("complexType")
                                .value(complexType))
                        .queryParam(param -> param.key("content")
                                .value("ARRAY").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedMapOfComplexTypeInQuery(
            final Map<String, ComplexType> complexType) throws ApiException, IOException {
        return prepareSendIndexedMapOfComplexTypeInQueryRequest(complexType).execute();
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedMapOfComplexTypeInQueryAsync(
            final Map<String, ComplexType> complexType) {
        try { 
            return prepareSendIndexedMapOfComplexTypeInQueryRequest(complexType).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendIndexedMapOfComplexTypeInQuery.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendIndexedMapOfComplexTypeInQueryRequest(
            final Map<String, ComplexType> complexType) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/query/complex/indexed")
                        .queryParam(param -> param.key("complexType")
                                .value(complexType))
                        .queryParam(param -> param.key("content")
                                .value("MAP").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}