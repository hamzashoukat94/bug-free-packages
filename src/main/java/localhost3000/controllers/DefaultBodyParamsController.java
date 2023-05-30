/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
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
import localhost3000.models.AdditionalModelParameters;
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
import localhost3000.models.Validate;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultBodyParamsController extends BaseController implements BodyParamsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultBodyParamsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeletePlainText(
            final String textString) throws ApiException, IOException {
        return prepareSendDeletePlainTextRequest(textString).execute();
    }

    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeletePlainTextAsync(
            final String textString) {
        try { 
            return prepareSendDeletePlainTextRequest(textString).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeletePlainText.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeletePlainTextRequest(
            final String textString) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/deletePlainTextBody")
                        .bodyParam(param -> param.value(textString))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
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
                        .path("/body/date")
                        .bodyParam(param -> param.value(DateTimeHelper.toSimpleDate(date)))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
                        .path("/body/rfc3339datetime")
                        .bodyParam(param -> param.value(DateTimeHelper.toRfc8601DateTime(datetime)))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
            final List<LocalDateTime> datetimes) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/rfc1123datetime")
                        .bodyParam(param -> param.value(datetimes))
                        .bodySerializer(() -> ApiHelper.serialize(datetimes,  new DateTimeHelper.Rfc1123DateTimeSerializer()))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final List<LocalDateTime> datetimes) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/rfc3339datetime")
                        .bodyParam(param -> param.value(datetimes))
                        .bodySerializer(() -> ApiHelper.serialize(datetimes,  new DateTimeHelper.Rfc8601DateTimeSerializer()))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
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
    public ServerResponse updateString(
            final String value) throws ApiException, IOException {
        return prepareUpdateStringRequest(value).execute();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringAsync(
            final String value) {
        try { 
            return prepareUpdateStringRequest(value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateString.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateStringRequest(
            final String value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/updateString")
                        .bodyParam(param -> param.value(value))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
            final List<Integer> integers) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/number")
                        .bodyParam(param -> param.value(integers))
                        .bodySerializer(() ->  ApiHelper.serialize(integers))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse wrapBodyInObject(
            final String field,
            final String name) throws ApiException, IOException {
        return prepareWrapBodyInObjectRequest(field, name).execute();
    }

    /**
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> wrapBodyInObjectAsync(
            final String field,
            final String name) {
        try { 
            return prepareWrapBodyInObjectRequest(field, name).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for wrapBodyInObject.
     */
    private ApiCall<ServerResponse, ApiException> prepareWrapBodyInObjectRequest(
            final String field,
            final String name) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/wrapParamInObject")
                        .bodyParam(param -> param.key("field")
                                .value(field))
                        .bodyParam(param -> param.key("name")
                                .value(name))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse additionalModelParameters(
            final AdditionalModelParameters model) throws ApiException, IOException {
        return prepareAdditionalModelParametersRequest(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> additionalModelParametersAsync(
            final AdditionalModelParameters model) {
        try { 
            return prepareAdditionalModelParametersRequest(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for additionalModelParameters.
     */
    private ApiCall<ServerResponse, ApiException> prepareAdditionalModelParametersRequest(
            final AdditionalModelParameters model) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/additionalModelProperties")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final Employee model) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/model")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final List<Employee> models) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/model")
                        .bodyParam(param -> param.value(models))
                        .bodySerializer(() ->  ApiHelper.serialize(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
                        .path("/body/string")
                        .bodyParam(param -> param.value(value))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
            final List<SuiteCode> suites) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/integerenum")
                        .bodyParam(param -> param.value(suites))
                        .bodySerializer(() ->  ApiHelper.serialize(suites))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
                        .path("/body/optionalUnixTimeStamp")
                        .bodyParam(param -> param.value(DateTimeHelper.toUnixTimestamp(dateTime)).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
                        .path("/body/optionalDateTime")
                        .bodyParam(param -> param.value(DateTimeHelper.toRfc8601DateTime(body)).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
            final SendUnixDateTime dateTime) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalUnixTimeStampInNestedModel")
                        .bodyParam(param -> param.value(dateTime))
                        .bodySerializer(() ->  ApiHelper.serialize(dateTime))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final ModelWithOptionalRfc1123DateTime dateTime) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/OptionalRfc1123InModel")
                        .bodyParam(param -> param.value(dateTime))
                        .bodySerializer(() ->  ApiHelper.serialize(dateTime))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final SendRfc339DateTime body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/dateTimeInNestedModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse allOptionals(
            final AllOptionals body,
            final Optionals option) throws ApiException, IOException {
        return prepareAllOptionalsRequest(body, option).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> allOptionalsAsync(
            final AllOptionals body,
            final Optionals option) {
        try { 
            return prepareAllOptionalsRequest(body, option).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for allOptionals.
     */
    private ApiCall<ServerResponse, ApiException> prepareAllOptionalsRequest(
            final AllOptionals body,
            final Optionals option) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/alloptionals")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("option")
                                .value((option != null) ? option.value() : "empty").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final StringAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalStringInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final LongAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalLongInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final NumberAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalNumberInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse sendDeleteBody(
            final DeleteBody body) throws ApiException, IOException {
        return prepareSendDeleteBodyRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyAsync(
            final DeleteBody body) {
        try { 
            return prepareSendDeleteBodyRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteBody.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteBodyRequest(
            final DeleteBody body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/deleteBody")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
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
                        .path("/body/rfc1123datetime")
                        .bodyParam(param -> param.value(DateTimeHelper.toRfc1123DateTime(datetime)))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
    public ServerResponse sendModelMap(
            final Map<String, Employee> models) throws ApiException, IOException {
        return prepareSendModelMapRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelMapAsync(
            final Map<String, Employee> models) {
        try { 
            return prepareSendModelMapRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendModelMap.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendModelMapRequest(
            final Map<String, Employee> models) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/model")
                        .bodyParam(param -> param.value(models))
                        .bodySerializer(() ->  ApiHelper.serialize(models))
                        .queryParam(param -> param.key("map")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse updateModel(
            final Employee model) throws ApiException, IOException {
        return prepareUpdateModelRequest(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelAsync(
            final Employee model) {
        try { 
            return prepareUpdateModelRequest(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateModelRequest(
            final Employee model) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/updateModel")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse sendDeleteBodyWithModel(
            final Employee model) throws ApiException, IOException {
        return prepareSendDeleteBodyWithModelRequest(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyWithModelAsync(
            final Employee model) {
        try { 
            return prepareSendDeleteBodyWithModelRequest(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteBodyWithModel.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteBodyWithModelRequest(
            final Employee model) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/deleteBody1")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse sendDeleteBodyWithModelArray(
            final List<Employee> models) throws ApiException, IOException {
        return prepareSendDeleteBodyWithModelArrayRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyWithModelArrayAsync(
            final List<Employee> models) {
        try { 
            return prepareSendDeleteBodyWithModelArrayRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDeleteBodyWithModelArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDeleteBodyWithModelArrayRequest(
            final List<Employee> models) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/deleteBody1")
                        .bodyParam(param -> param.value(models))
                        .bodySerializer(() ->  ApiHelper.serialize(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
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
    public ServerResponse updateString1(
            final String value) throws ApiException, IOException {
        return prepareUpdateString1Request(value).execute();
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateString1Async(
            final String value) {
        try { 
            return prepareUpdateString1Request(value).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateString1.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateString1Request(
            final String value) throws IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/updateString")
                        .bodyParam(param -> param.value(value))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
            final UnixDateTime dateTime) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalUnixDateTimeInModel")
                        .bodyParam(param -> param.value(dateTime))
                        .bodySerializer(() ->  ApiHelper.serialize(dateTime))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final UuidAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalUUIDInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final DateAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalDateInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
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
            final List<LocalDate> dates) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/date")
                        .bodyParam(param -> param.value(dates))
                        .bodySerializer(() -> ApiHelper.serialize(dates,  new DateTimeHelper.SimpleDateSerializer()))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringArray(
            final List<String> sarray) throws ApiException, IOException {
        return prepareSendStringArrayRequest(sarray).execute();
    }

    /**
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringArrayAsync(
            final List<String> sarray) {
        try { 
            return prepareSendStringArrayRequest(sarray).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringArrayRequest(
            final List<String> sarray) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/string")
                        .bodyParam(param -> param.value(sarray))
                        .bodySerializer(() ->  ApiHelper.serialize(sarray))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final List<Days> days) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/stringenum")
                        .bodyParam(param -> param.value(days))
                        .bodySerializer(() ->  ApiHelper.serialize(days))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse updateModelArray(
            final List<Employee> models) throws ApiException, IOException {
        return prepareUpdateModelArrayRequest(models).execute();
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelArrayAsync(
            final List<Employee> models) {
        try { 
            return prepareUpdateModelArrayRequest(models).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateModelArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateModelArrayRequest(
            final List<Employee> models) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/updateModel")
                        .bodyParam(param -> param.value(models))
                        .bodySerializer(() ->  ApiHelper.serialize(models))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
    public ServerResponse sendStringWithNewLine(
            final TestNstringEncoding body) throws ApiException, IOException {
        return prepareSendStringWithNewLineRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringWithNewLineAsync(
            final TestNstringEncoding body) {
        try { 
            return prepareSendStringWithNewLineRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringWithNewLine.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringWithNewLineRequest(
            final TestNstringEncoding body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/stringEncoding")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse sendStringInBodyWithRN(
            final TestRNstringEncoding body) throws ApiException, IOException {
        return prepareSendStringInBodyWithRNRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInBodyWithRNAsync(
            final TestRNstringEncoding body) {
        try { 
            return prepareSendStringInBodyWithRNRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringInBodyWithRN.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringInBodyWithRNRequest(
            final TestRNstringEncoding body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/stringEncoding")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
                        .path("/body/optionlRfc1123")
                        .bodyParam(param -> param.value(DateTimeHelper.toRfc1123DateTime(body)))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
            final SendRfc1123DateTime body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/rfc1123InNestedModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final DynamicAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalDynamicInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final PrecisionAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalPrecisionInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
                        .path("/body/unixdatetime")
                        .bodyParam(param -> param.value(DateTimeHelper.toUnixTimestamp(datetime)))
                        .headerParam(param ->param.key("content-type").value("text/plain; charset=utf-8"))
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
            final List<LocalDateTime> datetimes) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/unixdatetime")
                        .bodyParam(param -> param.value(datetimes))
                        .bodySerializer(() -> ApiHelper.serialize(datetimes,  new DateTimeHelper.UnixTimestampSerializer()))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
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
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse validateRequiredParameter(
            final Validate model,
            final String option) throws ApiException, IOException {
        return prepareValidateRequiredParameterRequest(model, option).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> validateRequiredParameterAsync(
            final Validate model,
            final String option) {
        try { 
            return prepareValidateRequiredParameterRequest(model, option).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for validateRequiredParameter.
     */
    private ApiCall<ServerResponse, ApiException> prepareValidateRequiredParameterRequest(
            final Validate model,
            final String option) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/validateRequiredParam")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .queryParam(param -> param.key("option")
                                .value(option).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse additionalModelParameters1(
            final AdditionalModelParameters model) throws ApiException, IOException {
        return prepareAdditionalModelParameters1Request(model).execute();
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> additionalModelParameters1Async(
            final AdditionalModelParameters model) {
        try { 
            return prepareAdditionalModelParameters1Request(model).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for additionalModelParameters1.
     */
    private ApiCall<ServerResponse, ApiException> prepareAdditionalModelParameters1Request(
            final AdditionalModelParameters model) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/additionalModelProperties")
                        .bodyParam(param -> param.value(model))
                        .bodySerializer(() ->  ApiHelper.serialize(model))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDynamic(
            final Object dynamic) throws ApiException, IOException {
        return prepareSendDynamicRequest(dynamic).execute();
    }

    /**
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDynamicAsync(
            final Object dynamic) {
        try { 
            return prepareSendDynamicRequest(dynamic).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendDynamic.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendDynamicRequest(
            final Object dynamic) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/dynamic")
                        .bodyParam(param -> param.value(dynamic))
                        .bodySerializer(() ->  ApiHelper.serialize(dynamic))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
    public ServerResponse updateStringArray(
            final List<String> strings) throws ApiException, IOException {
        return prepareUpdateStringArrayRequest(strings).execute();
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringArrayAsync(
            final List<String> strings) {
        try { 
            return prepareUpdateStringArrayRequest(strings).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateStringArray.
     */
    private ApiCall<ServerResponse, ApiException> prepareUpdateStringArrayRequest(
            final List<String> strings) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/updateString")
                        .bodyParam(param -> param.value(strings))
                        .bodySerializer(() ->  ApiHelper.serialize(strings))
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
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
    public ServerResponse sendStringWithR(
            final TestRstringEncoding body) throws ApiException, IOException {
        return prepareSendStringWithRRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringWithRAsync(
            final TestRstringEncoding body) {
        try { 
            return prepareSendStringWithRRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendStringWithR.
     */
    private ApiCall<ServerResponse, ApiException> prepareSendStringWithRRequest(
            final TestRstringEncoding body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/stringEncoding")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final ModelWithOptionalRfc3339DateTime body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalDateTimeInBody")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
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
            final BooleanAsOptional body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/body/optionalBooleanInModel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServerResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}