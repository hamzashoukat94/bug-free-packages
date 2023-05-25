/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.exceptions.CustomErrorResponseException;
import localhost3000.exceptions.ExceptionWithBooleanException;
import localhost3000.exceptions.ExceptionWithDateException;
import localhost3000.exceptions.ExceptionWithDynamicException;
import localhost3000.exceptions.ExceptionWithLongException;
import localhost3000.exceptions.ExceptionWithNumberException;
import localhost3000.exceptions.ExceptionWithPrecisionException;
import localhost3000.exceptions.ExceptionWithRfc3339DateTimeException;
import localhost3000.exceptions.ExceptionWithStringException;
import localhost3000.exceptions.ExceptionWithUUIDException;
import localhost3000.exceptions.LocalTestException;
import localhost3000.exceptions.NestedModelException;
import localhost3000.exceptions.Rfc1123Exception;
import localhost3000.exceptions.UnixTimeStampException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.Complex5;
import localhost3000.models.DynamicResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultErrorCodesController extends BaseController implements ErrorCodesController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultErrorCodesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse catch412GlobalError() throws ApiException, IOException {
        return prepareCatch412GlobalErrorRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> catch412GlobalErrorAsync() {
        try { 
            return prepareCatch412GlobalErrorRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for catch412GlobalError.
     */
    private ApiCall<DynamicResponse, ApiException> prepareCatch412GlobalErrorRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/412")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get501() throws ApiException, IOException {
        return prepareGet501Request().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get501Async() {
        try { 
            return prepareGet501Request().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get501.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGet501Request() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/501")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("501",
                                 ErrorCase.setReason("error 501",
                                (reason, context) -> new NestedModelException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get400() throws ApiException, IOException {
        return prepareGet400Request().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get400Async() {
        try { 
            return prepareGet400Request().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get400.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGet400Request() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/400")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get500() throws ApiException, IOException {
        return prepareGet500Request().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get500Async() {
        try { 
            return prepareGet500Request().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get500.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGet500Request() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/500")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get401() throws ApiException, IOException {
        return prepareGet401Request().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get401Async() {
        try { 
            return prepareGet401Request().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get401.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGet401Request() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/401")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("401",
                                 ErrorCase.setReason("401 Local",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .localErrorCase("421",
                                 ErrorCase.setReason("Default",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .localErrorCase("431",
                                 ErrorCase.setReason("Default",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .localErrorCase("432",
                                 ErrorCase.setReason("Default",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .localErrorCase("441",
                                 ErrorCase.setReason("Default",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Invalid response.",
                                (reason, context) -> new LocalTestException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithUnixtimestampException() throws ApiException, IOException {
        return prepareReceiveExceptionWithUnixtimestampExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithUnixtimestampExceptionAsync() {
        try { 
            return prepareReceiveExceptionWithUnixtimestampExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for receiveExceptionWithUnixtimestampException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareReceiveExceptionWithUnixtimestampExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/unixTimeStampException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("unixtimestamp exception",
                                (reason, context) -> new UnixTimeStampException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithRfc1123Datetime() throws ApiException, IOException {
        return prepareReceiveExceptionWithRfc1123DatetimeRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithRfc1123DatetimeAsync() {
        try { 
            return prepareReceiveExceptionWithRfc1123DatetimeRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for receiveExceptionWithRfc1123Datetime.
     */
    private ApiCall<DynamicResponse, ApiException> prepareReceiveExceptionWithRfc1123DatetimeRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/rfc1123Exception")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("Rfc1123 Exception",
                                (reason, context) -> new Rfc1123Exception(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithRfc3339Datetime() throws ApiException, IOException {
        return prepareReceiveExceptionWithRfc3339DatetimeRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithRfc3339DatetimeAsync() {
        try { 
            return prepareReceiveExceptionWithRfc3339DatetimeRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for receiveExceptionWithRfc3339Datetime.
     */
    private ApiCall<DynamicResponse, ApiException> prepareReceiveExceptionWithRfc3339DatetimeRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/Rfc3339InException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("DateTime Exception",
                                (reason, context) -> new ExceptionWithRfc3339DateTimeException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex5 receiveEndpointLevelException() throws ApiException, IOException {
        return prepareReceiveEndpointLevelExceptionRequest().execute();
    }

    /**
     * @return    Returns the Complex5 response from the API call
     */
    public CompletableFuture<Complex5> receiveEndpointLevelExceptionAsync() {
        try { 
            return prepareReceiveEndpointLevelExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for receiveEndpointLevelException.
     */
    private ApiCall<Complex5, ApiException> prepareReceiveEndpointLevelExceptionRequest() throws IOException {
        return new ApiCall.Builder<Complex5, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/451")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Complex5.class))
                        .localErrorCase("451",
                                 ErrorCase.setReason("caught endpoint exception",
                                (reason, context) -> new CustomErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex5 receiveGlobalLevelException() throws ApiException, IOException {
        return prepareReceiveGlobalLevelExceptionRequest().execute();
    }

    /**
     * @return    Returns the Complex5 response from the API call
     */
    public CompletableFuture<Complex5> receiveGlobalLevelExceptionAsync() {
        try { 
            return prepareReceiveGlobalLevelExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for receiveGlobalLevelException.
     */
    private ApiCall<Complex5, ApiException> prepareReceiveGlobalLevelExceptionRequest() throws IOException {
        return new ApiCall.Builder<Complex5, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/450")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Complex5.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse dateInException() throws ApiException, IOException {
        return prepareDateInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> dateInExceptionAsync() {
        try { 
            return prepareDateInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for dateInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareDateInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/dateInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("date in exception",
                                (reason, context) -> new ExceptionWithDateException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse uUIDInException() throws ApiException, IOException {
        return prepareUUIDInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> uUIDInExceptionAsync() {
        try { 
            return prepareUUIDInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for uUIDInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareUUIDInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/uuidInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("uuid in exception",
                                (reason, context) -> new ExceptionWithUUIDException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse dynamicInException() throws ApiException, IOException {
        return prepareDynamicInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> dynamicInExceptionAsync() {
        try { 
            return prepareDynamicInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for dynamicInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareDynamicInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/dynamicInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("dynamic in Exception",
                                (reason, context) -> new ExceptionWithDynamicException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse precisionInException() throws ApiException, IOException {
        return preparePrecisionInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> precisionInExceptionAsync() {
        try { 
            return preparePrecisionInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for precisionInException.
     */
    private ApiCall<DynamicResponse, ApiException> preparePrecisionInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/precisionInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("precision in Exception",
                                (reason, context) -> new ExceptionWithPrecisionException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse booleanInException() throws ApiException, IOException {
        return prepareBooleanInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> booleanInExceptionAsync() {
        try { 
            return prepareBooleanInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for booleanInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareBooleanInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/booleanInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("Boolean in Exception",
                                (reason, context) -> new ExceptionWithBooleanException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse longInException() throws ApiException, IOException {
        return prepareLongInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> longInExceptionAsync() {
        try { 
            return prepareLongInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for longInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareLongInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/longInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("long in exception",
                                (reason, context) -> new ExceptionWithLongException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse numberInException() throws ApiException, IOException {
        return prepareNumberInExceptionRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> numberInExceptionAsync() {
        try { 
            return prepareNumberInExceptionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for numberInException.
     */
    private ApiCall<DynamicResponse, ApiException> prepareNumberInExceptionRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/numberInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("number in exception",
                                (reason, context) -> new ExceptionWithNumberException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse getExceptionWithString() throws ApiException, IOException {
        return prepareGetExceptionWithStringRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getExceptionWithStringAsync() {
        try { 
            return prepareGetExceptionWithStringRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getExceptionWithString.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGetExceptionWithStringRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/error/stringInException")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .localErrorCase("444",
                                 ErrorCase.setReason("exception with string",
                                (reason, context) -> new ExceptionWithStringException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}