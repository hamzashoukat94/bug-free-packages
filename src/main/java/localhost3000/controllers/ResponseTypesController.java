/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
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
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ResponseTypesController {
    /**
     * @return    Returns the List of LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<LocalDate> getDateArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of LocalDate response from the API call
     */
    CompletableFuture<List<LocalDate>> getDateArrayAsync();

    /**
     * @return    Returns the LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    LocalDate getDate() throws ApiException, IOException;

    /**
     * @return    Returns the LocalDate response from the API call
     */
    CompletableFuture<LocalDate> getDateAsync();

    /**
     * @return    Returns the Company response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Company returnCompanyModel() throws ApiException, IOException;

    /**
     * @return    Returns the Company response from the API call
     */
    CompletableFuture<Company> returnCompanyModelAsync();

    /**
     * @return    Returns the BossCompany response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BossCompany returnBossModel() throws ApiException, IOException;

    /**
     * @return    Returns the BossCompany response from the API call
     */
    CompletableFuture<BossCompany> returnBossModelAsync();

    /**
     * @return    Returns the EmployeeComp response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    EmployeeComp returnEmployeeModel() throws ApiException, IOException;

    /**
     * @return    Returns the EmployeeComp response from the API call
     */
    CompletableFuture<EmployeeComp> returnEmployeeModelAsync();

    /**
     * @return    Returns the Developer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Developer returnDeveloperModel() throws ApiException, IOException;

    /**
     * @return    Returns the Developer response from the API call
     */
    CompletableFuture<Developer> returnDeveloperModelAsync();

    /**
     * @return    Returns the SoftwareTester response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SoftwareTester returnTesterModel() throws ApiException, IOException;

    /**
     * @return    Returns the SoftwareTester response from the API call
     */
    CompletableFuture<SoftwareTester> returnTesterModelAsync();

    /**
     * @return    Returns the Complex1 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Complex1 returnComplex1Object() throws ApiException, IOException;

    /**
     * @return    Returns the Complex1 response from the API call
     */
    CompletableFuture<Complex1> returnComplex1ObjectAsync();

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ResponseWithEnum returnResponseWithEnums() throws ApiException, IOException;

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     */
    CompletableFuture<ResponseWithEnum> returnResponseWithEnumsAsync();

    /**
     * @return    Returns the Complex2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Complex2 returnComplex2Object() throws ApiException, IOException;

    /**
     * @return    Returns the Complex2 response from the API call
     */
    CompletableFuture<Complex2> returnComplex2ObjectAsync();

    /**
     * @return    Returns the Complex3 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Complex3 returnComplex3Object() throws ApiException, IOException;

    /**
     * @return    Returns the Complex3 response from the API call
     */
    CompletableFuture<Complex3> returnComplex3ObjectAsync();

    /**
     * @return    Returns the Long response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Long getLong() throws ApiException, IOException;

    /**
     * @return    Returns the Long response from the API call
     */
    CompletableFuture<Long> getLongAsync();

    /**
     * @return    Returns the Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Person getModel() throws ApiException, IOException;

    /**
     * @return    Returns the Person response from the API call
     */
    CompletableFuture<Person> getModelAsync();

    /**
     * @return    Returns the List of Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<Days> getStringEnumArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of Days response from the API call
     */
    CompletableFuture<List<Days>> getStringEnumArrayAsync();

    /**
     * @return    Returns the Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Days getStringEnum() throws ApiException, IOException;

    /**
     * @return    Returns the Days response from the API call
     */
    CompletableFuture<Days> getStringEnumAsync();

    /**
     * @return    Returns the List of Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<Person> getModelArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of Person response from the API call
     */
    CompletableFuture<List<Person>> getModelArrayAsync();

    /**
     * @return    Returns the SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SuiteCode getIntEnum() throws ApiException, IOException;

    /**
     * @return    Returns the SuiteCode response from the API call
     */
    CompletableFuture<SuiteCode> getIntEnumAsync();

    /**
     * @return    Returns the List of SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<SuiteCode> getIntEnumArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of SuiteCode response from the API call
     */
    CompletableFuture<List<SuiteCode>> getIntEnumArrayAsync();

    /**
     * @return    Returns the Double response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Double getPrecision() throws ApiException, IOException;

    /**
     * @return    Returns the Double response from the API call
     */
    CompletableFuture<Double> getPrecisionAsync();

    /**
     * gets a binary object.
     * @return    Returns the InputStream response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InputStream getBinary() throws ApiException, IOException;

    /**
     * gets a binary object.
     * @return    Returns the InputStream response from the API call
     */
    CompletableFuture<InputStream> getBinaryAsync();

    /**
     * Gets a integer response.
     * @return    Returns the Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Integer getInteger() throws ApiException, IOException;

    /**
     * Gets a integer response.
     * @return    Returns the Integer response from the API call
     */
    CompletableFuture<Integer> getIntegerAsync();

    /**
     * Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<Integer> getIntegerArray() throws ApiException, IOException;

    /**
     * Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     */
    CompletableFuture<List<Integer>> getIntegerArrayAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse getDynamic() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> getDynamicAsync();

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DynamicResponse getDynamicArray() throws ApiException, IOException;

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    CompletableFuture<DynamicResponse> getDynamicArrayAsync();

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    LocalDateTime get3339Datetime() throws ApiException, IOException;

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    CompletableFuture<LocalDateTime> get3339DatetimeAsync();

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<LocalDateTime> get3339DatetimeArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    CompletableFuture<List<LocalDateTime>> get3339DatetimeArrayAsync();

    /**
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    Boolean getBoolean() throws ApiException, IOException;

    /**
     * @return    Returns the Boolean response from the API call
     */
    CompletableFuture<Boolean> getBooleanAsync();

    /**
     * @return    Returns the List of Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<Boolean> getBooleanArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of Boolean response from the API call
     */
    CompletableFuture<List<Boolean>> getBooleanArrayAsync();

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    void getHeaders() throws ApiException, IOException;

    /**
     * @return    Returns the void response from the API call
     */
    CompletableFuture<Void> getHeadersAsync();

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    LocalDateTime get1123DateTime() throws ApiException, IOException;

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    CompletableFuture<LocalDateTime> get1123DateTimeAsync();

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    LocalDateTime getUnixDateTime() throws ApiException, IOException;

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    CompletableFuture<LocalDateTime> getUnixDateTimeAsync();

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<LocalDateTime> get1123DateTimeArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    CompletableFuture<List<LocalDateTime>> get1123DateTimeArrayAsync();

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<LocalDateTime> getUnixDateTimeArray() throws ApiException, IOException;

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    CompletableFuture<List<LocalDateTime>> getUnixDateTimeArrayAsync();

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    void getContentTypeHeaders() throws ApiException, IOException;

    /**
     * @return    Returns the void response from the API call
     */
    CompletableFuture<Void> getContentTypeHeadersAsync();

}