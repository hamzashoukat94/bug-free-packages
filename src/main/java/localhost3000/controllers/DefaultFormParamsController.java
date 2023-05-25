/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.MutliPartRequestType;
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
import localhost3000.models.AllOptionals;
import localhost3000.models.BooleanAsOptional;
import localhost3000.models.DateAsOptional;
import localhost3000.models.Days;
import localhost3000.models.DeleteBody;
import localhost3000.models.DynamicAsOptional;
import localhost3000.models.Employee;
import localhost3000.models.LongAsOptional;
import localhost3000.models.ModelWithOptionalRfc1123DateTime;
import localhost3000.models.ModelWithOptionalRfc3339DateTime;
import localhost3000.models.NumberAsOptional;
import localhost3000.models.Optionals;
import localhost3000.models.PrecisionAsOptional;
import localhost3000.models.SendMixedArrayInput;
import localhost3000.models.SendRfc1123DateTime;
import localhost3000.models.SendRfc339DateTime;
import localhost3000.models.SendUnixDateTime;
import localhost3000.models.ServerResponse;
import localhost3000.models.StringAsOptional;
import localhost3000.models.SuiteCode;
import localhost3000.models.TestNstringEncoding;
import localhost3000.models.TestRNstringEncoding;
import localhost3000.models.TestRstringEncoding;
import localhost3000.models.UnixDateTime;
import localhost3000.models.UuidAsOptional;
import localhost3000.utilities.FileWrapper;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultFormParamsController extends BaseController implements FormParamsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultFormParamsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteForm(
            final DeleteBody body) throws ApiException, IOException {
        return prepareSendDeleteFormRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteFormAsync(
            final DeleteBody body) {
        try { 
            return prepareSendDeleteFormRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteFormRequest(
            final DeleteBody body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/deleteForm")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  file  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteMultipart(
            final FileWrapper file) throws ApiException, IOException {
        return prepareSendDeleteMultipartRequest(file).execute();
    }

    /**
     * @param  file  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteMultipartAsync(
            final FileWrapper file) {
        try { 
            return prepareSendDeleteMultipartRequest(file).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteMultipart.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteMultipartRequest(
            final FileWrapper file) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/deleteMultipart")
                        .formParam(param -> param.key("file")
                                .value(file)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDateArray(
            final List<LocalDate> dates) throws ApiException, IOException {
        return prepareSendDateArrayRequest(dates).execute();
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateArrayAsync(
            final List<LocalDate> dates) {
        try { 
            return prepareSendDateArrayRequest(dates).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDateArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDateArrayRequest(
            final List<LocalDate> dates) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/date")
                        .formParam(param -> param.key("dates")
                                .value(DateTimeHelper.toSimpleDate(dates)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendDate(
            final LocalDate date) throws ApiException, IOException {
        return prepareSendDateRequest(date).execute();
    }

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateAsync(
            final LocalDate date) {
        try { 
            return prepareSendDateRequest(date).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDate.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDateRequest(
            final LocalDate date) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/date")
                        .formParam(param -> param.key("date")
                                .value(DateTimeHelper.toSimpleDate(date)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendUnixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareSendUnixDateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendUnixDateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareSendUnixDateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendUnixDateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendUnixDateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/unixdatetime")
                        .formParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toUnixTimestamp(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendRfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareSendRfc1123DateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareSendRfc1123DateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc1123DateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc1123DateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/rfc1123datetime")
                        .formParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toRfc1123DateTime(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendRfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        return prepareSendRfc3339DateTimeRequest(datetime).execute();
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc3339DateTimeAsync(
            final LocalDateTime datetime) {
        try { 
            return prepareSendRfc3339DateTimeRequest(datetime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc3339DateTime.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc3339DateTimeRequest(
            final LocalDateTime datetime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/rfc3339datetime")
                        .formParam(param -> param.key("datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(datetime)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendUnixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareSendUnixDateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendUnixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareSendUnixDateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendUnixDateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendUnixDateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/unixdatetime")
                        .formParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toUnixTimestamp(datetimes)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendRfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareSendRfc1123DateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareSendRfc1123DateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc1123DateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc1123DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/rfc1123datetime")
                        .formParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toRfc1123DateTime(datetimes)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendLong(
            final long value) throws ApiException, IOException {
        return prepareSendLongRequest(value).execute();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendLongAsync(
            final long value) {
        try { 
            return prepareSendLongRequest(value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendLong.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendLongRequest(
            final long value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/number")
                        .formParam(param -> param.key("value")
                                .value(value).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException {
        return prepareSendIntegerArrayRequest(integers).execute();
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIntegerArrayAsync(
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
    private ApiCall<ServerResponse, ApiException> prepareSendIntegerArrayRequest(
            final List<Integer> integers) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/number")
                        .formParam(param -> param.key("integers")
                                .value(integers))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendStringArray(
            final List<String> strings) throws ApiException, IOException {
        return prepareSendStringArrayRequest(strings).execute();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringArrayAsync(
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
    private ApiCall<ServerResponse, ApiException> prepareSendStringArrayRequest(
            final List<String> strings) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/string")
                        .formParam(param -> param.key("strings")
                                .value(strings))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  name  Required parameter: Example:
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse allowDynamicFormFields(
            final String name,
            final Map<String, Object> fieldParameters) throws ApiException, IOException {
        return prepareAllowDynamicFormFieldsRequest(name, fieldParameters).execute();
    }

    /**
     * @param  name  Required parameter: Example:
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> allowDynamicFormFieldsAsync(
            final String name,
            final Map<String, Object> fieldParameters) {
        try { 
            return prepareAllowDynamicFormFieldsRequest(name, fieldParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allowDynamicFormFields.
     */
    private ApiCall<ServerResponse, ApiException> prepareAllowDynamicFormFieldsRequest(
            final String name,
            final Map<String, Object> fieldParameters) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/allowDynamicFormFields")
                        .formParam(param -> param.key("name")
                                .value(name))
                        .formParam(fieldParameters)
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendModel(
            final Employee model) throws ApiException, IOException {
        return prepareSendModelRequest(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelAsync(
            final Employee model) {
        try { 
            return prepareSendModelRequest(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendModelRequest(
            final Employee model) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/model")
                        .formParam(param -> param.key("model")
                                .value(model))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendModelArray(
            final List<Employee> models) throws ApiException, IOException {
        return prepareSendModelArrayRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelArrayAsync(
            final List<Employee> models) {
        try { 
            return prepareSendModelArrayRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendModelArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendModelArrayRequest(
            final List<Employee> models) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/model")
                        .formParam(param -> param.key("models")
                                .value(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  file  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendFile(
            final FileWrapper file) throws ApiException, IOException {
        return prepareSendFileRequest(file).execute();
    }

    /**
     * @param  file  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendFileAsync(
            final FileWrapper file) {
        try { 
            return prepareSendFileRequest(file).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendFile.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendFileRequest(
            final FileWrapper file) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/file")
                        .formParam(param -> param.key("file")
                                .value(file)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  file  Required parameter: Example:
     * @param  file1  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendMultipleFiles(
            final FileWrapper file,
            final FileWrapper file1) throws ApiException, IOException {
        return prepareSendMultipleFilesRequest(file, file1).execute();
    }

    /**
     * @param  file  Required parameter: Example:
     * @param  file1  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendMultipleFilesAsync(
            final FileWrapper file,
            final FileWrapper file1) {
        try { 
            return prepareSendMultipleFilesRequest(file, file1).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendMultipleFiles.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendMultipleFilesRequest(
            final FileWrapper file,
            final FileWrapper file1) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/multipleFiles")
                        .formParam(param -> param.key("file")
                                .value(file)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .formParam(param -> param.key("file1")
                                .value(file1)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendString(
            final String value) throws ApiException, IOException {
        return prepareSendStringRequest(value).execute();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringAsync(
            final String value) {
        try { 
            return prepareSendStringRequest(value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendString.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringRequest(
            final String value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/string")
                        .formParam(param -> param.key("value")
                                .value(value))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendRfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        return prepareSendRfc3339DateTimeArrayRequest(datetimes).execute();
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        try { 
            return prepareSendRfc3339DateTimeArrayRequest(datetimes).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc3339DateTimeArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc3339DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/rfc3339datetime")
                        .formParam(param -> param.key("datetimes")
                                .value(DateTimeHelper.toRfc8601DateTime(datetimes)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Send a variety for form params. Returns file count and body params.
     * @param  input  SendMixedArrayInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendMixedArray(
            final SendMixedArrayInput input) throws ApiException, IOException {
        return prepareSendMixedArrayRequest(input).execute();
    }

    /**
     * Send a variety for form params. Returns file count and body params.
     * @param  input  SendMixedArrayInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendMixedArrayAsync(
            final SendMixedArrayInput input) {
        try { 
            return prepareSendMixedArrayRequest(input).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendMixedArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendMixedArrayRequest(
            final SendMixedArrayInput input) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/mixed")
                        .formParam(param -> param.key("file")
                                .value(input.getFile())
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .formParam(param -> param.key("integers")
                                .value(input.getIntegers()))
                        .formParam(param -> param.key("models")
                                .value(input.getModels()))
                        .formParam(param -> param.key("strings")
                                .value(input.getStrings()))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModelWithForm(
            final Employee model) throws ApiException, IOException {
        return prepareUpdateModelWithFormRequest(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelWithFormAsync(
            final Employee model) {
        try { 
            return prepareUpdateModelWithFormRequest(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateModelWithForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateModelWithFormRequest(
            final Employee model) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/updateModel")
                        .formParam(param -> param.key("model")
                                .value(model))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteForm1(
            final Employee model) throws ApiException, IOException {
        return prepareSendDeleteForm1Request(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteForm1Async(
            final Employee model) {
        try { 
            return prepareSendDeleteForm1Request(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteForm1.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteForm1Request(
            final Employee model) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/deleteForm1")
                        .formParam(param -> param.key("model")
                                .value(model))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteFormWithModelArray(
            final List<Employee> models) throws ApiException, IOException {
        return prepareSendDeleteFormWithModelArrayRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteFormWithModelArrayAsync(
            final List<Employee> models) {
        try { 
            return prepareSendDeleteFormWithModelArrayRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteFormWithModelArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteFormWithModelArrayRequest(
            final List<Employee> models) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/deleteForm1")
                        .formParam(param -> param.key("models")
                                .value(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModelArrayWithForm(
            final List<Employee> models) throws ApiException, IOException {
        return prepareUpdateModelArrayWithFormRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelArrayWithFormAsync(
            final List<Employee> models) {
        try { 
            return prepareUpdateModelArrayWithFormRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateModelArrayWithForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateModelArrayWithFormRequest(
            final List<Employee> models) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/updateModel")
                        .formParam(param -> param.key("models")
                                .value(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateStringWithForm(
            final String value) throws ApiException, IOException {
        return prepareUpdateStringWithFormRequest(value).execute();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringWithFormAsync(
            final String value) {
        try { 
            return prepareUpdateStringWithFormRequest(value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateStringWithForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateStringWithFormRequest(
            final String value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/updateString")
                        .formParam(param -> param.key("value")
                                .value(value))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
    public ServerResponse updateStringArrayWithForm(
            final List<String> strings) throws ApiException, IOException {
        return prepareUpdateStringArrayWithFormRequest(strings).execute();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringArrayWithFormAsync(
            final List<String> strings) {
        try { 
            return prepareUpdateStringArrayWithFormRequest(strings).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateStringArrayWithForm.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateStringArrayWithFormRequest(
            final List<String> strings) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/updateString")
                        .formParam(param -> param.key("strings")
                                .value(strings))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
    public ServerResponse sendIntegerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException {
        return prepareSendIntegerEnumArrayRequest(suites).execute();
    }

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIntegerEnumArrayAsync(
            final List<SuiteCode> suites) {
        try { 
            return prepareSendIntegerEnumArrayRequest(suites).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendIntegerEnumArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendIntegerEnumArrayRequest(
            final List<SuiteCode> suites) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/integerenum")
                        .formParam(param -> param.key("suites")
                                .value(SuiteCode.toValue(suites)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
    public ServerResponse sendStringEnumArray(
            final List<Days> days) throws ApiException, IOException {
        return prepareSendStringEnumArrayRequest(days).execute();
    }

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringEnumArrayAsync(
            final List<Days> days) {
        try { 
            return prepareSendStringEnumArrayRequest(days).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringEnumArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringEnumArrayRequest(
            final List<Days> days) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/stringenum")
                        .formParam(param -> param.key("days")
                                .value(Days.toValue(days)))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithNewLine(
            final TestNstringEncoding body) throws ApiException, IOException {
        return prepareSendStringInFormWithNewLineRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithNewLineAsync(
            final TestNstringEncoding body) {
        try { 
            return prepareSendStringInFormWithNewLineRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringInFormWithNewLine.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringInFormWithNewLineRequest(
            final TestNstringEncoding body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/stringEncoding")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithR(
            final TestRstringEncoding body) throws ApiException, IOException {
        return prepareSendStringInFormWithRRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithRAsync(
            final TestRstringEncoding body) {
        try { 
            return prepareSendStringInFormWithRRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringInFormWithR.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringInFormWithRRequest(
            final TestRstringEncoding body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/stringEncoding")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithRN(
            final TestRNstringEncoding body) throws ApiException, IOException {
        return prepareSendStringInFormWithRNRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithRNAsync(
            final TestRNstringEncoding body) {
        try { 
            return prepareSendStringInFormWithRNRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringInFormWithRN.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringInFormWithRNRequest(
            final TestRNstringEncoding body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/stringEncoding")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse allOptionals(
            final AllOptionals model,
            final Optionals option) throws ApiException, IOException {
        return prepareAllOptionalsRequest(model, option).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> allOptionalsAsync(
            final AllOptionals model,
            final Optionals option) {
        try { 
            return prepareAllOptionalsRequest(model, option).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allOptionals.
     */
    private ApiCall<ServerResponse, ApiException> prepareAllOptionalsRequest(
            final AllOptionals model,
            final Optionals option) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/alloptionals")
                        .formParam(param -> param.key("model")
                                .value(model))
                        .formParam(param -> param.key("option")
                                .value((option != null) ? option.value() : "empty").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixDateTimeInBody(
            final LocalDateTime dateTime) throws ApiException, IOException {
        return prepareSendOptionalUnixDateTimeInBodyRequest(dateTime).execute();
    }

    /**
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixDateTimeInBodyAsync(
            final LocalDateTime dateTime) {
        try { 
            return prepareSendOptionalUnixDateTimeInBodyRequest(dateTime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendOptionalUnixDateTimeInBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendOptionalUnixDateTimeInBodyRequest(
            final LocalDateTime dateTime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalUnixTimeStamp")
                        .formParam(param -> param.key("dateTime")
                                .value(DateTimeHelper.toUnixTimestamp(dateTime)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalRfc1123InBody(
            final LocalDateTime body) throws ApiException, IOException {
        return prepareSendOptionalRfc1123InBodyRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalRfc1123InBodyAsync(
            final LocalDateTime body) {
        try { 
            return prepareSendOptionalRfc1123InBodyRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendOptionalRfc1123InBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendOptionalRfc1123InBodyRequest(
            final LocalDateTime body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionlRfc1123")
                        .formParam(param -> param.key("body")
                                .value(DateTimeHelper.toRfc1123DateTime(body)))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDatetimeOptionalInEndpoint(
            final LocalDateTime body) throws ApiException, IOException {
        return prepareSendDatetimeOptionalInEndpointRequest(body).execute();
    }

    /**
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDatetimeOptionalInEndpointAsync(
            final LocalDateTime body) {
        try { 
            return prepareSendDatetimeOptionalInEndpointRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDatetimeOptionalInEndpoint.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDatetimeOptionalInEndpointRequest(
            final LocalDateTime body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalDateTime")
                        .formParam(param -> param.key("body")
                                .value(DateTimeHelper.toRfc8601DateTime(body)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixTimeStampInModelBody(
            final UnixDateTime dateTime) throws ApiException, IOException {
        return prepareSendOptionalUnixTimeStampInModelBodyRequest(dateTime).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInModelBodyAsync(
            final UnixDateTime dateTime) {
        try { 
            return prepareSendOptionalUnixTimeStampInModelBodyRequest(dateTime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendOptionalUnixTimeStampInModelBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendOptionalUnixTimeStampInModelBodyRequest(
            final UnixDateTime dateTime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalUnixDateTimeInModel")
                        .formParam(param -> param.key("dateTime")
                                .value(dateTime))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixTimeStampInNestedModelBody(
            final SendUnixDateTime dateTime) throws ApiException, IOException {
        return prepareSendOptionalUnixTimeStampInNestedModelBodyRequest(dateTime).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInNestedModelBodyAsync(
            final SendUnixDateTime dateTime) {
        try { 
            return prepareSendOptionalUnixTimeStampInNestedModelBodyRequest(dateTime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendOptionalUnixTimeStampInNestedModelBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendOptionalUnixTimeStampInNestedModelBodyRequest(
            final SendUnixDateTime dateTime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalUnixTimeStampInNestedModel")
                        .formParam(param -> param.key("dateTime")
                                .value(dateTime))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTimeInNestedModel(
            final SendRfc1123DateTime body) throws ApiException, IOException {
        return prepareSendRfc1123DateTimeInNestedModelRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeInNestedModelAsync(
            final SendRfc1123DateTime body) {
        try { 
            return prepareSendRfc1123DateTimeInNestedModelRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc1123DateTimeInNestedModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc1123DateTimeInNestedModelRequest(
            final SendRfc1123DateTime body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/rfc1123InNestedModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTimeInModel(
            final ModelWithOptionalRfc1123DateTime dateTime) throws ApiException, IOException {
        return prepareSendRfc1123DateTimeInModelRequest(dateTime).execute();
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeInModelAsync(
            final ModelWithOptionalRfc1123DateTime dateTime) {
        try { 
            return prepareSendRfc1123DateTimeInModelRequest(dateTime).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc1123DateTimeInModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc1123DateTimeInModelRequest(
            final ModelWithOptionalRfc1123DateTime dateTime) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/OptionalRfc1123InModel")
                        .formParam(param -> param.key("dateTime")
                                .value(dateTime))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalDatetimeInModel(
            final ModelWithOptionalRfc3339DateTime body) throws ApiException, IOException {
        return prepareSendOptionalDatetimeInModelRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalDatetimeInModelAsync(
            final ModelWithOptionalRfc3339DateTime body) {
        try { 
            return prepareSendOptionalDatetimeInModelRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendOptionalDatetimeInModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendOptionalDatetimeInModelRequest(
            final ModelWithOptionalRfc3339DateTime body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalDateTimeInBody")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc339DateTimeInNestedModels(
            final SendRfc339DateTime body) throws ApiException, IOException {
        return prepareSendRfc339DateTimeInNestedModelsRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc339DateTimeInNestedModelsAsync(
            final SendRfc339DateTime body) {
        try { 
            return prepareSendRfc339DateTimeInNestedModelsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendRfc339DateTimeInNestedModels.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendRfc339DateTimeInNestedModelsRequest(
            final SendRfc339DateTime body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/dateTimeInNestedModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse uuidAsOptional(
            final UuidAsOptional body) throws ApiException, IOException {
        return prepareUuidAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> uuidAsOptionalAsync(
            final UuidAsOptional body) {
        try { 
            return prepareUuidAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for uuidAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareUuidAsOptionalRequest(
            final UuidAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalUUIDInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse booleanAsOptional(
            final BooleanAsOptional body) throws ApiException, IOException {
        return prepareBooleanAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final BooleanAsOptional body) {
        try { 
            return prepareBooleanAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for booleanAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareBooleanAsOptionalRequest(
            final BooleanAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalBooleanInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dateAsOptional(
            final DateAsOptional body) throws ApiException, IOException {
        return prepareDateAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateAsOptionalAsync(
            final DateAsOptional body) {
        try { 
            return prepareDateAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for dateAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareDateAsOptionalRequest(
            final DateAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalDateInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dynamicAsOptional(
            final DynamicAsOptional body) throws ApiException, IOException {
        return prepareDynamicAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dynamicAsOptionalAsync(
            final DynamicAsOptional body) {
        try { 
            return prepareDynamicAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for dynamicAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareDynamicAsOptionalRequest(
            final DynamicAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalDynamicInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringAsOptional(
            final StringAsOptional body) throws ApiException, IOException {
        return prepareStringAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringAsOptionalAsync(
            final StringAsOptional body) {
        try { 
            return prepareStringAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stringAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareStringAsOptionalRequest(
            final StringAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalStringInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse precisionAsOptional(
            final PrecisionAsOptional body) throws ApiException, IOException {
        return preparePrecisionAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final PrecisionAsOptional body) {
        try { 
            return preparePrecisionAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for precisionAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> preparePrecisionAsOptionalRequest(
            final PrecisionAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalPrecisionInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse longAsOptional(
            final LongAsOptional body) throws ApiException, IOException {
        return prepareLongAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> longAsOptionalAsync(
            final LongAsOptional body) {
        try { 
            return prepareLongAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for longAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareLongAsOptionalRequest(
            final LongAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalLongInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendNumberAsOptional(
            final NumberAsOptional body) throws ApiException, IOException {
        return prepareSendNumberAsOptionalRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final NumberAsOptional body) {
        try { 
            return prepareSendNumberAsOptionalRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendNumberAsOptional.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendNumberAsOptionalRequest(
            final NumberAsOptional body) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/form/optionalNumberInModel")
                        .formParam(param -> param.key("body")
                                .value(body))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}