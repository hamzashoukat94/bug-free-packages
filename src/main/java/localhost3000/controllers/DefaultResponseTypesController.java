/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpMethod;
import localhost3000.models.BossCompany;
import localhost3000.models.Company;
import localhost3000.models.Complex1;
import localhost3000.models.Complex2;
import localhost3000.models.Complex3;
import localhost3000.models.Days;
import localhost3000.models.Developer;
import localhost3000.models.DynamicResponse;
import localhost3000.models.EmployeeComp;
import localhost3000.models.Person;
import localhost3000.models.ResponseWithEnum;
import localhost3000.models.SoftwareTester;
import localhost3000.models.SuiteCode;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultResponseTypesController extends BaseController implements ResponseTypesController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultResponseTypesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @return    Returns the List of LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDate> getDateArray() throws ApiException, IOException {
        return prepareGetDateArrayRequest().execute();
    }

    /**
     * @return    Returns the List of LocalDate response from the API call
     */
    public CompletableFuture<List<LocalDate>> getDateArrayAsync() {
        try { 
            return prepareGetDateArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDateArray.
     */
    private ApiCall<List<LocalDate>, ApiException> prepareGetDateArrayRequest() throws IOException {
        return new ApiCall.Builder<List<LocalDate>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/date")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response,
                                        new TypeReference<List<LocalDate>>(){},
                                        LocalDate.class,
                                        new DateTimeHelper.SimpleDateDeserializer()))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDate getDate() throws ApiException, IOException {
        return prepareGetDateRequest().execute();
    }

    /**
     * @return    Returns the LocalDate response from the API call
     */
    public CompletableFuture<LocalDate> getDateAsync() {
        try { 
            return prepareGetDateRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDate.
     */
    private ApiCall<LocalDate, ApiException> prepareGetDateRequest() throws IOException {
        return new ApiCall.Builder<LocalDate, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/date")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> DateTimeHelper.fromSimpleDate(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Company response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Company returnCompanyModel() throws ApiException, IOException {
        return prepareReturnCompanyModelRequest().execute();
    }

    /**
     * @return    Returns the Company response from the API call
     */
    public CompletableFuture<Company> returnCompanyModelAsync() {
        try { 
            return prepareReturnCompanyModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnCompanyModel.
     */
    private ApiCall<Company, ApiException> prepareReturnCompanyModelRequest() throws IOException {
        return new ApiCall.Builder<Company, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/company")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Company.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the BossCompany response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BossCompany returnBossModel() throws ApiException, IOException {
        return prepareReturnBossModelRequest().execute();
    }

    /**
     * @return    Returns the BossCompany response from the API call
     */
    public CompletableFuture<BossCompany> returnBossModelAsync() {
        try { 
            return prepareReturnBossModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnBossModel.
     */
    private ApiCall<BossCompany, ApiException> prepareReturnBossModelRequest() throws IOException {
        return new ApiCall.Builder<BossCompany, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/boss")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BossCompany.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the EmployeeComp response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EmployeeComp returnEmployeeModel() throws ApiException, IOException {
        return prepareReturnEmployeeModelRequest().execute();
    }

    /**
     * @return    Returns the EmployeeComp response from the API call
     */
    public CompletableFuture<EmployeeComp> returnEmployeeModelAsync() {
        try { 
            return prepareReturnEmployeeModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnEmployeeModel.
     */
    private ApiCall<EmployeeComp, ApiException> prepareReturnEmployeeModelRequest() throws IOException {
        return new ApiCall.Builder<EmployeeComp, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/employee")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EmployeeComp.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Developer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Developer returnDeveloperModel() throws ApiException, IOException {
        return prepareReturnDeveloperModelRequest().execute();
    }

    /**
     * @return    Returns the Developer response from the API call
     */
    public CompletableFuture<Developer> returnDeveloperModelAsync() {
        try { 
            return prepareReturnDeveloperModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnDeveloperModel.
     */
    private ApiCall<Developer, ApiException> prepareReturnDeveloperModelRequest() throws IOException {
        return new ApiCall.Builder<Developer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/developer")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Developer.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the SoftwareTester response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SoftwareTester returnTesterModel() throws ApiException, IOException {
        return prepareReturnTesterModelRequest().execute();
    }

    /**
     * @return    Returns the SoftwareTester response from the API call
     */
    public CompletableFuture<SoftwareTester> returnTesterModelAsync() {
        try { 
            return prepareReturnTesterModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnTesterModel.
     */
    private ApiCall<SoftwareTester, ApiException> prepareReturnTesterModelRequest() throws IOException {
        return new ApiCall.Builder<SoftwareTester, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/tester")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SoftwareTester.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Complex1 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex1 returnComplex1Object() throws ApiException, IOException {
        return prepareReturnComplex1ObjectRequest().execute();
    }

    /**
     * @return    Returns the Complex1 response from the API call
     */
    public CompletableFuture<Complex1> returnComplex1ObjectAsync() {
        try { 
            return prepareReturnComplex1ObjectRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnComplex1Object.
     */
    private ApiCall<Complex1, ApiException> prepareReturnComplex1ObjectRequest() throws IOException {
        return new ApiCall.Builder<Complex1, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/complex1")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Complex1.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseWithEnum returnResponseWithEnums() throws ApiException, IOException {
        return prepareReturnResponseWithEnumsRequest().execute();
    }

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     */
    public CompletableFuture<ResponseWithEnum> returnResponseWithEnumsAsync() {
        try { 
            return prepareReturnResponseWithEnumsRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnResponseWithEnums.
     */
    private ApiCall<ResponseWithEnum, ApiException> prepareReturnResponseWithEnumsRequest() throws IOException {
        return new ApiCall.Builder<ResponseWithEnum, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/responseWitEnum")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ResponseWithEnum.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Complex2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex2 returnComplex2Object() throws ApiException, IOException {
        return prepareReturnComplex2ObjectRequest().execute();
    }

    /**
     * @return    Returns the Complex2 response from the API call
     */
    public CompletableFuture<Complex2> returnComplex2ObjectAsync() {
        try { 
            return prepareReturnComplex2ObjectRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnComplex2Object.
     */
    private ApiCall<Complex2, ApiException> prepareReturnComplex2ObjectRequest() throws IOException {
        return new ApiCall.Builder<Complex2, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/complex2")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Complex2.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Complex3 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex3 returnComplex3Object() throws ApiException, IOException {
        return prepareReturnComplex3ObjectRequest().execute();
    }

    /**
     * @return    Returns the Complex3 response from the API call
     */
    public CompletableFuture<Complex3> returnComplex3ObjectAsync() {
        try { 
            return prepareReturnComplex3ObjectRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for returnComplex3Object.
     */
    private ApiCall<Complex3, ApiException> prepareReturnComplex3ObjectRequest() throws IOException {
        return new ApiCall.Builder<Complex3, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/complex3")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Complex3.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Long response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Long getLong() throws ApiException, IOException {
        return prepareGetLongRequest().execute();
    }

    /**
     * @return    Returns the Long response from the API call
     */
    public CompletableFuture<Long> getLongAsync() {
        try { 
            return prepareGetLongRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getLong.
     */
    private ApiCall<Long, ApiException> prepareGetLongRequest() throws IOException {
        return new ApiCall.Builder<Long, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/long")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Long.parseLong(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Person getModel() throws ApiException, IOException {
        return prepareGetModelRequest().execute();
    }

    /**
     * @return    Returns the Person response from the API call
     */
    public CompletableFuture<Person> getModelAsync() {
        try { 
            return prepareGetModelRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getModel.
     */
    private ApiCall<Person, ApiException> prepareGetModelRequest() throws IOException {
        return new ApiCall.Builder<Person, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/model")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Person.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Days> getStringEnumArray() throws ApiException, IOException {
        return prepareGetStringEnumArrayRequest().execute();
    }

    /**
     * @return    Returns the List of Days response from the API call
     */
    public CompletableFuture<List<Days>> getStringEnumArrayAsync() {
        try { 
            return prepareGetStringEnumArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getStringEnumArray.
     */
    private ApiCall<List<Days>, ApiException> prepareGetStringEnumArrayRequest() throws IOException {
        return new ApiCall.Builder<List<Days>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/enum")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value("string").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Days[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Days getStringEnum() throws ApiException, IOException {
        return prepareGetStringEnumRequest().execute();
    }

    /**
     * @return    Returns the Days response from the API call
     */
    public CompletableFuture<Days> getStringEnumAsync() {
        try { 
            return prepareGetStringEnumRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getStringEnum.
     */
    private ApiCall<Days, ApiException> prepareGetStringEnumRequest() throws IOException {
        return new ApiCall.Builder<Days, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/enum")
                        .queryParam(param -> param.key("type")
                                .value("string").isRequired(false))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Days.fromString(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Person> getModelArray() throws ApiException, IOException {
        return prepareGetModelArrayRequest().execute();
    }

    /**
     * @return    Returns the List of Person response from the API call
     */
    public CompletableFuture<List<Person>> getModelArrayAsync() {
        try { 
            return prepareGetModelArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getModelArray.
     */
    private ApiCall<List<Person>, ApiException> prepareGetModelArrayRequest() throws IOException {
        return new ApiCall.Builder<List<Person>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/model")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Person[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SuiteCode getIntEnum() throws ApiException, IOException {
        return prepareGetIntEnumRequest().execute();
    }

    /**
     * @return    Returns the SuiteCode response from the API call
     */
    public CompletableFuture<SuiteCode> getIntEnumAsync() {
        try { 
            return prepareGetIntEnumRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getIntEnum.
     */
    private ApiCall<SuiteCode, ApiException> prepareGetIntEnumRequest() throws IOException {
        return new ApiCall.Builder<SuiteCode, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/enum")
                        .queryParam(param -> param.key("type")
                                .value("int").isRequired(false))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> SuiteCode.fromInteger(Integer.parseInt(response)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SuiteCode> getIntEnumArray() throws ApiException, IOException {
        return prepareGetIntEnumArrayRequest().execute();
    }

    /**
     * @return    Returns the List of SuiteCode response from the API call
     */
    public CompletableFuture<List<SuiteCode>> getIntEnumArrayAsync() {
        try { 
            return prepareGetIntEnumArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getIntEnumArray.
     */
    private ApiCall<List<SuiteCode>, ApiException> prepareGetIntEnumArrayRequest() throws IOException {
        return new ApiCall.Builder<List<SuiteCode>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/enum")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value("int").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SuiteCode[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Double response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Double getPrecision() throws ApiException, IOException {
        return prepareGetPrecisionRequest().execute();
    }

    /**
     * @return    Returns the Double response from the API call
     */
    public CompletableFuture<Double> getPrecisionAsync() {
        try { 
            return prepareGetPrecisionRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getPrecision.
     */
    private ApiCall<Double, ApiException> prepareGetPrecisionRequest() throws IOException {
        return new ApiCall.Builder<Double, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/precision")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Double.parseDouble(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * gets a binary object.
     * @return    Returns the InputStream response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InputStream getBinary() throws ApiException, IOException {
        return prepareGetBinaryRequest().execute();
    }

    /**
     * gets a binary object.
     * @return    Returns the InputStream response from the API call
     */
    public CompletableFuture<InputStream> getBinaryAsync() {
        try { 
            return prepareGetBinaryRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getBinary.
     */
    private ApiCall<InputStream, ApiException> prepareGetBinaryRequest() throws IOException {
        return new ApiCall.Builder<InputStream, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/binary")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .hasBinaryResponse(true))
                .build();
    }

    /**
     * Gets a integer response.
     * @return    Returns the Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Integer getInteger() throws ApiException, IOException {
        return prepareGetIntegerRequest().execute();
    }

    /**
     * Gets a integer response.
     * @return    Returns the Integer response from the API call
     */
    public CompletableFuture<Integer> getIntegerAsync() {
        try { 
            return prepareGetIntegerRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getInteger.
     */
    private ApiCall<Integer, ApiException> prepareGetIntegerRequest() throws IOException {
        return new ApiCall.Builder<Integer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/integer")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Integer.parseInt(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Integer> getIntegerArray() throws ApiException, IOException {
        return prepareGetIntegerArrayRequest().execute();
    }

    /**
     * Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     */
    public CompletableFuture<List<Integer>> getIntegerArrayAsync() {
        try { 
            return prepareGetIntegerArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getIntegerArray.
     */
    private ApiCall<List<Integer>, ApiException> prepareGetIntegerArrayRequest() throws IOException {
        return new ApiCall.Builder<List<Integer>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/integer")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Integer[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse getDynamic() throws ApiException, IOException {
        return prepareGetDynamicRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getDynamicAsync() {
        try { 
            return prepareGetDynamicRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDynamic.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGetDynamicRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/dynamic")
                        .queryParam(param -> param.key("echo")
                                .value("true").isRequired(false))
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
    public DynamicResponse getDynamicArray() throws ApiException, IOException {
        return prepareGetDynamicArrayRequest().execute();
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getDynamicArrayAsync() {
        try { 
            return prepareGetDynamicArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDynamicArray.
     */
    private ApiCall<DynamicResponse, ApiException> prepareGetDynamicArrayRequest() throws IOException {
        return new ApiCall.Builder<DynamicResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/dynamic")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .queryParam(param -> param.key("echo")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.DYNAMIC_RESPONSE)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime get3339Datetime() throws ApiException, IOException {
        return prepareGet3339DatetimeRequest().execute();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> get3339DatetimeAsync() {
        try { 
            return prepareGet3339DatetimeRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get3339Datetime.
     */
    private ApiCall<LocalDateTime, ApiException> prepareGet3339DatetimeRequest() throws IOException {
        return new ApiCall.Builder<LocalDateTime, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/3339datetime")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> DateTimeHelper.fromRfc8601DateTime(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> get3339DatetimeArray() throws ApiException, IOException {
        return prepareGet3339DatetimeArrayRequest().execute();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> get3339DatetimeArrayAsync() {
        try { 
            return prepareGet3339DatetimeArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get3339DatetimeArray.
     */
    private ApiCall<List<LocalDateTime>, ApiException> prepareGet3339DatetimeArrayRequest() throws IOException {
        return new ApiCall.Builder<List<LocalDateTime>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/3339datetime")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response,
                                        new TypeReference<List<LocalDateTime>>(){},
                                        LocalDateTime.class,
                                        new DateTimeHelper.Rfc8601DateTimeDeserializer()))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean getBoolean() throws ApiException, IOException {
        return prepareGetBooleanRequest().execute();
    }

    /**
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> getBooleanAsync() {
        try { 
            return prepareGetBooleanRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getBoolean.
     */
    private ApiCall<Boolean, ApiException> prepareGetBooleanRequest() throws IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/boolean")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Boolean> getBooleanArray() throws ApiException, IOException {
        return prepareGetBooleanArrayRequest().execute();
    }

    /**
     * @return    Returns the List of Boolean response from the API call
     */
    public CompletableFuture<List<Boolean>> getBooleanArrayAsync() {
        try { 
            return prepareGetBooleanArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getBooleanArray.
     */
    private ApiCall<List<Boolean>, ApiException> prepareGetBooleanArrayRequest() throws IOException {
        return new ApiCall.Builder<List<Boolean>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/boolean")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Boolean[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void getHeaders() throws ApiException, IOException {
        prepareGetHeadersRequest().execute();
    }

    /**
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> getHeadersAsync() {
        try { 
            return prepareGetHeadersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getHeaders.
     */
    private ApiCall<Void, ApiException> prepareGetHeadersRequest() throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/headers")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime get1123DateTime() throws ApiException, IOException {
        return prepareGet1123DateTimeRequest().execute();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> get1123DateTimeAsync() {
        try { 
            return prepareGet1123DateTimeRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get1123DateTime.
     */
    private ApiCall<LocalDateTime, ApiException> prepareGet1123DateTimeRequest() throws IOException {
        return new ApiCall.Builder<LocalDateTime, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/1123datetime")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> DateTimeHelper.fromRfc1123DateTime(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime getUnixDateTime() throws ApiException, IOException {
        return prepareGetUnixDateTimeRequest().execute();
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> getUnixDateTimeAsync() {
        try { 
            return prepareGetUnixDateTimeRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getUnixDateTime.
     */
    private ApiCall<LocalDateTime, ApiException> prepareGetUnixDateTimeRequest() throws IOException {
        return new ApiCall.Builder<LocalDateTime, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/unixdatetime")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> DateTimeHelper.fromUnixTimestamp(response))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> get1123DateTimeArray() throws ApiException, IOException {
        return prepareGet1123DateTimeArrayRequest().execute();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> get1123DateTimeArrayAsync() {
        try { 
            return prepareGet1123DateTimeArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for get1123DateTimeArray.
     */
    private ApiCall<List<LocalDateTime>, ApiException> prepareGet1123DateTimeArrayRequest() throws IOException {
        return new ApiCall.Builder<List<LocalDateTime>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/1123datetime")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response,
                                        new TypeReference<List<LocalDateTime>>(){},
                                        LocalDateTime.class,
                                        new DateTimeHelper.Rfc1123DateTimeDeserializer()))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> getUnixDateTimeArray() throws ApiException, IOException {
        return prepareGetUnixDateTimeArrayRequest().execute();
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> getUnixDateTimeArrayAsync() {
        try { 
            return prepareGetUnixDateTimeArrayRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getUnixDateTimeArray.
     */
    private ApiCall<List<LocalDateTime>, ApiException> prepareGetUnixDateTimeArrayRequest() throws IOException {
        return new ApiCall.Builder<List<LocalDateTime>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/unixdatetime")
                        .queryParam(param -> param.key("array")
                                .value("true").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response,
                                        new TypeReference<List<LocalDateTime>>(){},
                                        LocalDateTime.class,
                                        new DateTimeHelper.UnixTimestampDeserializer()))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void getContentTypeHeaders() throws ApiException, IOException {
        prepareGetContentTypeHeadersRequest().execute();
    }

    /**
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> getContentTypeHeadersAsync() {
        try { 
            return prepareGetContentTypeHeadersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getContentTypeHeaders.
     */
    private ApiCall<Void, ApiException> prepareGetContentTypeHeadersRequest() throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/response/getContentType")
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}