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
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface BodyParamsController {
    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDeletePlainText(
            final String textString) throws ApiException, IOException;

    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDeletePlainTextAsync(
            final String textString);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDeleteBody(
            final DeleteBody body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDeleteBodyAsync(
            final DeleteBody body);

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDateArray(
            final List<LocalDate> dates) throws ApiException, IOException;

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDateArrayAsync(
            final List<LocalDate> dates);

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDate(
            final LocalDate date) throws ApiException, IOException;

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDateAsync(
            final LocalDate date);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendUnixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendUnixDateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc1123DateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException;

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc3339DateTimeAsync(
            final LocalDateTime datetime);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendUnixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendUnixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException;

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes);

    /**
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringArray(
            final List<String> sarray) throws ApiException, IOException;

    /**
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringArrayAsync(
            final List<String> sarray);

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse updateString(
            final String value) throws ApiException, IOException;

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> updateStringAsync(
            final String value);

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException;

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendIntegerArrayAsync(
            final List<Integer> integers);

    /**
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse wrapBodyInObject(
            final String field,
            final String name) throws ApiException, IOException;

    /**
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> wrapBodyInObjectAsync(
            final String field,
            final String name);

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse additionalModelParameters(
            final AdditionalModelParameters model) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> additionalModelParametersAsync(
            final AdditionalModelParameters model);

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse validateRequiredParameter(
            final Validate model,
            final String option) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> validateRequiredParameterAsync(
            final Validate model,
            final String option);

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse additionalModelParameters1(
            final AdditionalModelParameters model) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> additionalModelParameters1Async(
            final AdditionalModelParameters model);

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendModel(
            final Employee model) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendModelAsync(
            final Employee model);

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendModelArray(
            final List<Employee> models) throws ApiException, IOException;

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendModelArrayAsync(
            final List<Employee> models);

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendModelMap(
            final Map<String, Employee> models) throws ApiException, IOException;

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendModelMapAsync(
            final Map<String, Employee> models);

    /**
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDynamic(
            final Object dynamic) throws ApiException, IOException;

    /**
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDynamicAsync(
            final Object dynamic);

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendString(
            final String value) throws ApiException, IOException;

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringAsync(
            final String value);

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringEnumArray(
            final List<Days> days) throws ApiException, IOException;

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringEnumArrayAsync(
            final List<Days> days);

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendIntegerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException;

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendIntegerEnumArrayAsync(
            final List<SuiteCode> suites);

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse updateModel(
            final Employee model) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> updateModelAsync(
            final Employee model);

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDeleteBodyWithModel(
            final Employee model) throws ApiException, IOException;

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDeleteBodyWithModelAsync(
            final Employee model);

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDeleteBodyWithModelArray(
            final List<Employee> models) throws ApiException, IOException;

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDeleteBodyWithModelArrayAsync(
            final List<Employee> models);

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse updateModelArray(
            final List<Employee> models) throws ApiException, IOException;

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> updateModelArrayAsync(
            final List<Employee> models);

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse updateString1(
            final String value) throws ApiException, IOException;

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> updateString1Async(
            final String value);

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse updateStringArray(
            final List<String> strings) throws ApiException, IOException;

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> updateStringArrayAsync(
            final List<String> strings);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringWithNewLine(
            final TestNstringEncoding body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringWithNewLineAsync(
            final TestNstringEncoding body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringWithR(
            final TestRstringEncoding body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringWithRAsync(
            final TestRstringEncoding body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringInBodyWithRN(
            final TestRNstringEncoding body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringInBodyWithRNAsync(
            final TestRNstringEncoding body);

    /**
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendOptionalUnixDateTimeInBody(
            final LocalDateTime dateTime) throws ApiException, IOException;

    /**
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendOptionalUnixDateTimeInBodyAsync(
            final LocalDateTime dateTime);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendOptionalRfc1123InBody(
            final LocalDateTime body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendOptionalRfc1123InBodyAsync(
            final LocalDateTime body);

    /**
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDatetimeOptionalInEndpoint(
            final LocalDateTime body) throws ApiException, IOException;

    /**
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDatetimeOptionalInEndpointAsync(
            final LocalDateTime body);

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendOptionalUnixTimeStampInModelBody(
            final UnixDateTime dateTime) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInModelBodyAsync(
            final UnixDateTime dateTime);

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendOptionalUnixTimeStampInNestedModelBody(
            final SendUnixDateTime dateTime) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInNestedModelBodyAsync(
            final SendUnixDateTime dateTime);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc1123DateTimeInNestedModel(
            final SendRfc1123DateTime body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc1123DateTimeInNestedModelAsync(
            final SendRfc1123DateTime body);

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc1123DateTimeInModel(
            final ModelWithOptionalRfc1123DateTime dateTime) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc1123DateTimeInModelAsync(
            final ModelWithOptionalRfc1123DateTime dateTime);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendOptionalDatetimeInModel(
            final ModelWithOptionalRfc3339DateTime body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendOptionalDatetimeInModelAsync(
            final ModelWithOptionalRfc3339DateTime body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendRfc339DateTimeInNestedModels(
            final SendRfc339DateTime body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendRfc339DateTimeInNestedModelsAsync(
            final SendRfc339DateTime body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse uuidAsOptional(
            final UuidAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> uuidAsOptionalAsync(
            final UuidAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse booleanAsOptional(
            final BooleanAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final BooleanAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse dateAsOptional(
            final DateAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> dateAsOptionalAsync(
            final DateAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse dynamicAsOptional(
            final DynamicAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> dynamicAsOptionalAsync(
            final DynamicAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse allOptionals(
            final AllOptionals body,
            final Optionals option) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> allOptionalsAsync(
            final AllOptionals body,
            final Optionals option);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse stringAsOptional(
            final StringAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> stringAsOptionalAsync(
            final StringAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse precisionAsOptional(
            final PrecisionAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final PrecisionAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse longAsOptional(
            final LongAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> longAsOptionalAsync(
            final LongAsOptional body);

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendNumberAsOptional(
            final NumberAsOptional body) throws ApiException, IOException;

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final NumberAsOptional body);

}