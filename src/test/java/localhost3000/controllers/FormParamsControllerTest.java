/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.type.TypeReference;
import io.apimatic.core.utilities.TestHelper;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.TesterClient;
import localhost3000.exceptions.ApiException;
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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FormParamsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static FormParamsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getFormParamsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTest() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"QA\"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithMultilinerName() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\"farhan\\nnouman\",\"field\":\"QA\"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithSpecialCharactersField() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"&&&\"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithBlankField() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\" \"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithBlankNameField() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\" \",\"field\":\" \"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithBlankName() throws Exception {
        // Parameters for the API call
        DeleteBody body = ApiHelper.deserialize(
                "{\"name\":\" \",\"field\":\"QA\"}",
                DeleteBody.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Date Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendDateArray() throws Exception {
        // Parameters for the API call
        List<LocalDate> dates = ApiHelper.deserialize(
                "[\"1994-02-13\",\"1994-02-13\"]",
                new TypeReference<List<LocalDate>>(){},
                LocalDate.class,
                new DateTimeHelper.SimpleDateDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDateArray(dates);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Date.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendDate() throws Exception {
        // Parameters for the API call
        LocalDate date = DateTimeHelper.fromSimpleDate(
                "1994-02-13");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDate(date);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send UnixDateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendUnixDateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromUnixTimestamp(1484719381L);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendUnixDateTime(datetime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Rfc1123 DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendRfc1123DateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime(
                "Sun, 06 Nov 1994 08:49:37 GMT");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc1123DateTime(datetime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Rfc3339 DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendRfc3339DateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromRfc8601DateTime(
                "1994-02-13T14:01:54.9571247Z");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc3339DateTime(datetime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send UnixDateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendUnixDateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[1484719381,1484719381]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.UnixTimestampDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendUnixDateTimeArray(datetimes);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Rfc1123 DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendRfc1123DateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc1123DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc1123DateTimeArray(datetimes);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Long.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendLong() throws Exception {
        // Parameters for the API call
        long value = 5147483647L;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendLong(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Integer Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendIntegerArray() throws Exception {
        // Parameters for the API call
        List<Integer> integers = ApiHelper.deserializeArray(
                "[1,2,3,4,5]",
                Integer[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendIntegerArray(integers);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringArray() throws Exception {
        // Parameters for the API call
        List<String> strings = ApiHelper.deserializeArray(
                "[\"abc\", \"def\"]",
                String[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringArray(strings);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Allow Dynamic Form Fields.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAllowDynamicFormFields() throws Exception {
        // Parameters for the API call
        String name = 
                "farhan";
        // key-value map for optional form parameters
        LinkedHashMap<String, Object> formParams = new LinkedHashMap<String, Object>();
        formParams.put("field", "QA");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.allowDynamicFormFields(name, formParams);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendModel() throws Exception {
        // Parameters for the API call
        Employee model = ApiHelper.deserialize(
                "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{"
                + "\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}",
                Employee.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendModel(model);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Model Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendModelArray() throws Exception {
        // Parameters for the API call
        List<Employee> models = ApiHelper.deserializeArray(
                "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\","
                + "\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:"
                + "54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joining"
                + "Day\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":"
                + "{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"},{\"name\":\"Shahid Khaliq"
                + "\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birth"
                + "day\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":2"
                + "0000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"worki"
                + "ngDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\","
                + "\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents"
                + "\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20"
                + "\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:"
                + "01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # "
                + "531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"199"
                + "4-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"pr"
                + "omotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483"
                + "649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13"
                + "\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"ag"
                + "e\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":"
                + "\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Su"
                + "n, 06 Nov 1994 08:49:37 GMT\"}]",
                Employee[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendModelArray(models);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send File.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendFile() throws Exception {
        // Parameters for the API call
        FileWrapper file = new FileWrapper(TestHelper.getFile(
                "http://localhost:3000/response/image"));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendFile(file);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Multiple files.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendMultipleFiles() throws Exception {
        // Parameters for the API call
        FileWrapper file = new FileWrapper(TestHelper.getFile(
                "http://localhost:3000/response/image"));
        FileWrapper file1 = new FileWrapper(TestHelper.getFile(
                "http://localhost:3000/response/image"));

        // Set callback and perform API call
        try {
            controller.sendMultipleFiles(file, file1);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Send String.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendString() throws Exception {
        // Parameters for the API call
        String value = 
                "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendString(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendMultilinerString() throws Exception {
        // Parameters for the API call
        String value = 
                "TestString\nnouman";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendString(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringWithSpecialCharacters() throws Exception {
        // Parameters for the API call
        String value = 
                "$%^!@#$%^&*";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendString(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringWithOnlySpace() throws Exception {
        // Parameters for the API call
        String value = 
                " ";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendString(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendEmptyString() throws Exception {
        // Parameters for the API call
        String value = 
                "";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendString(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Rfc3339 DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendRfc3339DateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[\"1994-02-13T14:01:54.9571247Z\",\"1994-02-13T14:01:54.9571247Z\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc8601DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc3339DateTimeArray(datetimes);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for SendMixedArray.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendMixedArray() throws Exception {
        // Parameters for the API call
        SendMixedArrayInput input = new SendMixedArrayInput();
        input.setFile(new FileWrapper(TestHelper.getFile(
                "http://localhost:3000/response/image")));
        input.setIntegers(ApiHelper.deserializeArray(
                "[1,2,3,4,5]",
                Integer[].class));
        input.setModels(ApiHelper.deserializeArray(
                "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\","
                + "\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:"
                + "54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joining"
                + "Day\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":"
                + "{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"},{\"name\":\"Shahid Khaliq"
                + "\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birth"
                + "day\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":2"
                + "0000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"worki"
                + "ngDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\","
                + "\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents"
                + "\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20"
                + "\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:"
                + "01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # "
                + "531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"199"
                + "4-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"pr"
                + "omotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483"
                + "649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13"
                + "\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"ag"
                + "e\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":"
                + "\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Su"
                + "n, 06 Nov 1994 08:49:37 GMT\"}]",
                Employee[].class));
        input.setStrings(ApiHelper.deserializeArray(
                "[\"abc\", \"def\"]",
                String[].class));

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendMixedArray(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Update Model with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateModelWithForm() throws Exception {
        // Parameters for the API call
        Employee model = ApiHelper.deserialize(
                "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{"
                + "\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}",
                Employee.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateModelWithForm(model);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send delete Form1.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteFormTestWithModel() throws Exception {
        // Parameters for the API call
        Employee model = ApiHelper.deserialize(
                "{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{"
                + "\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}",
                Employee.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteForm1(model);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Delete Form with Model Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendDeleteFormWithModelArray() throws Exception {
        // Parameters for the API call
        List<Employee> models = ApiHelper.deserializeArray(
                "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\","
                + "\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:"
                + "54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joining"
                + "Day\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":"
                + "{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}, {\"name\":\"Shahid Khali"
                + "q\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birt"
                + "hday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":"
                + "20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"work"
                + "ingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\","
                + "\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents"
                + "\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20"
                + "\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:"
                + "01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # "
                + "531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"199"
                + "4-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"pr"
                + "omotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483"
                + "649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13"
                + "\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"ag"
                + "e\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":"
                + "\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Su"
                + "n, 06 Nov 1994 08:49:37 GMT\"}]",
                Employee[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDeleteFormWithModelArray(models);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Update Model Array with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateModelArrayWithForm() throws Exception {
        // Parameters for the API call
        List<Employee> models = ApiHelper.deserializeArray(
                "[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\","
                + "\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:"
                + "54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joining"
                + "Day\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":"
                + "{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address"
                + "\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtim"
                + "e\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software "
                + "Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday"
                + "\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"ad"
                + "dress\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"bir"
                + "thtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147"
                + "483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02"
                + "-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov"
                + " 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Futu"
                + "re Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\","
                + "\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"n"
                + "ame\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":"
                + "\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.95712"
                + "47Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}, {\"name\":\"Shahid Khali"
                + "q\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birt"
                + "hday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":"
                + "20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"work"
                + "ingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\","
                + "\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"u"
                + "id\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54."
                + "9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay"
                + "\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents"
                + "\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20"
                + "\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:"
                + "01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # "
                + "531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"199"
                + "4-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"pr"
                + "omotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483"
                + "649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13"
                + "\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"ag"
                + "e\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":"
                + "\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Su"
                + "n, 06 Nov 1994 08:49:37 GMT\"}]",
                Employee[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateModelArrayWithForm(models);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for update String with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateStringWithForm() throws Exception {
        // Parameters for the API call
        String value = 
                "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringWithForm(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for update String with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateSpecialStringWithForm() throws Exception {
        // Parameters for the API call
        String value = 
                "$%^!@#$%^&*";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringWithForm(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for update String with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateMultilinerStringWithForm() throws Exception {
        // Parameters for the API call
        String value = 
                "TestString\nnouman";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringWithForm(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for update String with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateStringWithFormCornerCase() throws Exception {
        // Parameters for the API call
        String value = 
                " ";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringWithForm(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for update String with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateEmptyStringWithForm() throws Exception {
        // Parameters for the API call
        String value = 
                "";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringWithForm(value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Update String Array with Form.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateStringArrayWithForm() throws Exception {
        // Parameters for the API call
        List<String> strings = ApiHelper.deserializeArray(
                "[\"abc\", \"def\"]",
                String[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.updateStringArrayWithForm(strings);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for SendIntegerEnumArray.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendIntegerEnumArray() throws Exception {
        // Parameters for the API call
        List<SuiteCode> suites = ApiHelper.deserializeArray(
                "[1, 3, 4, 2, 3]",
                SuiteCode[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendIntegerEnumArray(suites);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 
                && httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for SendStringEnumArray.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringEnumArray() throws Exception {
        // Parameters for the API call
        List<Days> days = ApiHelper.deserializeArray(
                "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]",
                Days[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringEnumArray(days);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 
                && httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send string in form with new line.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithNewLine1() throws Exception {
        // Parameters for the API call
        TestNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\", \"field\":\"QA\"}",
                TestNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithNewLine(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send string in form with new line.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithNewLine2() throws Exception {
        // Parameters for the API call
        TestNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\", \"field\":\"QA&Dev\"}",
                TestNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithNewLine(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send string in form with new line.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithNewLine3() throws Exception {
        // Parameters for the API call
        TestNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan&nouman\", \"field\":\"QA\"}",
                TestNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithNewLine(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send String in form with \r.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithR1() throws Exception {
        // Parameters for the API call
        TestRstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"QA\"}",
                TestRstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithR(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send String in form with \r.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithR2() throws Exception {
        // Parameters for the API call
        TestRstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"QA&Dev\"}",
                TestRstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithR(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send String in form with \r.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithR3() throws Exception {
        // Parameters for the API call
        TestRstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan&nouman\",\"field\":\"QA\"}",
                TestRstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithR(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String in Form with \r\n.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithRN1() throws Exception {
        // Parameters for the API call
        TestRNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"QA\"}",
                TestRNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithRN(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String in Form with \r\n.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithRN2() throws Exception {
        // Parameters for the API call
        TestRNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan\",\"field\":\"QA&Dev\"}",
                TestRNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithRN(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send String in Form with \r\n.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendStringInFormWithRN3() throws Exception {
        // Parameters for the API call
        TestRNstringEncoding body = ApiHelper.deserialize(
                "{\"name\":\"farhan&nouman\",\"field\":\"QA\"}",
                TestRNstringEncoding.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringInFormWithRN(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for all optionals.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testEmptyOptionals() throws Exception {
        // Parameters for the API call
        AllOptionals model = ApiHelper.deserialize(
                "{}",
                AllOptionals.class);
        Optionals option = null;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.allOptionals(model, option);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for all optionals.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSetOptionalsWithEmptyBody() throws Exception {
        // Parameters for the API call
        AllOptionals model = ApiHelper.deserialize(
                "{\"optionalNumbers\":[{},{}],\"optionalLong\":{},\"optionalPrecision\":{},\"string"
                + "\": \"parent optional string\"}",
                AllOptionals.class);
        Optionals option = Optionals.fromString(
                "withEmptyFields");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.allOptionals(model, option);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for all optionals.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSetOptionalsWithSetBody() throws Exception {
        // Parameters for the API call
        AllOptionals model = ApiHelper.deserialize(
                "{\"id\":14,\"optionalNumbers\":[{\"number\":23},{\"number\":45}],\"optionalLong\":"
                + "{\"long\":67899658},\"optionalPrecision\":{\"precision\":45.45},\"string\": \"pa"
                + "rent optional string\"}",
                AllOptionals.class);
        Optionals option = Optionals.fromString(
                "withFields");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.allOptionals(model, option);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Optional Unix DateTime In Body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalUnixTimeStampInBody() throws Exception {
        // Parameters for the API call
        LocalDateTime dateTime = DateTimeHelper.fromUnixTimestamp(1484719381L);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendOptionalUnixDateTimeInBody(dateTime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send optional rfc1123 in body.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalRfc1123InBody() throws Exception {
        // Parameters for the API call
        LocalDateTime body = DateTimeHelper.fromRfc1123DateTime(
                "Sun, 06 Nov 1994 08:49:37 GMT");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendOptionalRfc1123InBody(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send datetime optional in endpoint.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestSendingDatetimeAsOptionalInPlainTextBody() throws Exception {
        // Parameters for the API call
        LocalDateTime body = DateTimeHelper.fromRfc8601DateTime(
                "1994-02-13T14:01:54.9571247Z");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDatetimeOptionalInEndpoint(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send optional unixTimeStamp in Model (body).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalUnixTimeStampInModelBody() throws Exception {
        // Parameters for the API call
        UnixDateTime dateTime = ApiHelper.deserialize(
                "{\"dateTime\" : 1484719381}",
                UnixDateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendOptionalUnixTimeStampInModelBody(dateTime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send optional unixTimeStamp in nested model (body).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalUnixTimeStampInNestedModelBody() throws Exception {
        // Parameters for the API call
        SendUnixDateTime dateTime = ApiHelper.deserialize(
                "{\"dateTime\" : {\"dateTime\":1484719381}}",
                SendUnixDateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendOptionalUnixTimeStampInNestedModelBody(dateTime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send Rfc1123 dateTime in Nested Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestSendingRfc1123DateTimeInNestedMode() throws Exception {
        // Parameters for the API call
        SendRfc1123DateTime body = ApiHelper.deserialize(
                "{\"dateTime\" : {\"dateTime\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}}",
                SendRfc1123DateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc1123DateTimeInNestedModel(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Rfc1123 dateTime in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalRfc1123DateTimeInModelBody() throws Exception {
        // Parameters for the API call
        ModelWithOptionalRfc1123DateTime dateTime = ApiHelper.deserialize(
                "{\"dateTime\" : \"Sun, 06 Nov 1994 08:49:37 GMT\"}",
                ModelWithOptionalRfc1123DateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc1123DateTimeInModel(dateTime);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send Optional Datetime in Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendOptionalDatetimeInModelAsBody() throws Exception {
        // Parameters for the API call
        ModelWithOptionalRfc3339DateTime body = ApiHelper.deserialize(
                "{\"dateTime\" : \"1994-02-13T14:01:54.9571247Z\"}",
                ModelWithOptionalRfc3339DateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendOptionalDatetimeInModel(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Send rfc339 dateTime in nestedModels.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendRfc3339DateTimeInNestedModel() throws Exception {
        // Parameters for the API call
        SendRfc339DateTime body = ApiHelper.deserialize(
                "{\"dateTime\" : {\"dateTime\" : \"1994-02-13T14:01:54.9571247Z\"}}",
                SendRfc339DateTime.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendRfc339DateTimeInNestedModels(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for uuid as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUuidAsOptional() throws Exception {
        // Parameters for the API call
        UuidAsOptional body = ApiHelper.deserialize(
                "{   \"uuid\" : \"123e4567-e89b-12d3-a456-426655440000\" }",
                UuidAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.uuidAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for boolean as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testBooleanAsOptional() throws Exception {
        // Parameters for the API call
        BooleanAsOptional body = ApiHelper.deserialize(
                "{\"boolean\" : true}",
                BooleanAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.booleanAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for date as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDateAsOptional() throws Exception {
        // Parameters for the API call
        DateAsOptional body = ApiHelper.deserialize(
                "{ \"date\" : \"1994-02-13\" }",
                DateAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.dateAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for dynamic as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDynamicAsOptional() throws Exception {
        // Parameters for the API call
        DynamicAsOptional body = ApiHelper.deserialize(
                "{   \"dynamic\" : {     \"dynamic\" : \"test\"   } }",
                DynamicAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.dynamicAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for string as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testStringAsOptional() throws Exception {
        // Parameters for the API call
        StringAsOptional body = ApiHelper.deserialize(
                "{\"string\" : \"test\"}",
                StringAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.stringAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for precision as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testPrecisionAsOptional() throws Exception {
        // Parameters for the API call
        PrecisionAsOptional body = ApiHelper.deserialize(
                "{\"precision\" : 1.23}",
                PrecisionAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.precisionAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for long as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testLongAsOptional() throws Exception {
        // Parameters for the API call
        LongAsOptional body = ApiHelper.deserialize(
                "{\"long\" : 123123}",
                LongAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.longAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for send number as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testNumberAsOptional() throws Exception {
        // Parameters for the API call
        NumberAsOptional body = ApiHelper.deserialize(
                "{\"number\" : 1}",
                NumberAsOptional.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendNumberAsOptional(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\" : true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
