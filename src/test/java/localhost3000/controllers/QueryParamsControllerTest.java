/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.apimatic.core.utilities.TestHelper;
import java.time.LocalDate;
import java.time.LocalDateTime;
import localhost3000.DateTimeHelper;
import localhost3000.TesterClient;
import localhost3000.exceptions.ApiException;
import localhost3000.models.ServerResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueryParamsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static QueryParamsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getQueryParamsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Send Number as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testNumberAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        int number = 1;
        Integer number1 = 1;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendNumberAsOptional(number, number1);
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
     * Test case for send long as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testLongAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        long mLong = 123123L;
        Long long1 = 123123L;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendLongAsOptional(mLong, long1);
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
    public void testPrecisionAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        double precision = 1.23d;
        Double precision1 = 1.23d;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.precisionAsOptional(precision, precision1);
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
     * Test case for Boolean as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testBooleanAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        boolean mBoolean = true;
        Boolean boolean1 = true;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.booleanAsOptional(mBoolean, boolean1);
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
     * Test case for rfc1123 datetime as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc1123DatetimeAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        LocalDateTime dateTime = DateTimeHelper.fromRfc1123DateTime(
                "Sun, 06 Nov 1994 08:49:37 GMT");
        LocalDateTime dateTime1 = DateTimeHelper.fromRfc1123DateTime(
                "Sun, 06 Nov 1994 08:49:37 GMT");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc1123DatetimeAsOptional(dateTime, dateTime1);
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
     * Test case for rfc3339 datetime as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc3339AsOptionalInQuery() throws Exception {
        // Parameters for the API call
        LocalDateTime dateTime = DateTimeHelper.fromRfc8601DateTime(
                "1994-02-13T14:01:54.9571247Z");
        LocalDateTime dateTime1 = DateTimeHelper.fromRfc8601DateTime(
                "1994-02-13T14:01:54.9571247Z");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc3339DatetimeAsOptional(dateTime, dateTime1);
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
     * Test case for send date as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDateAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        LocalDate date = DateTimeHelper.fromSimpleDate(
                "1994-02-13");
        LocalDate date1 = DateTimeHelper.fromSimpleDate(
                "1994-02-13");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendDateAsOptional(date, date1);
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
     * Test case for send string as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testStringAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        String string = 
                "test";
        String string1 = 
                "test";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendStringAsOptional(string, string1);
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
     * Test case for unixdatetime as optional.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUnixtimestampAsOptionalInQuery() throws Exception {
        // Parameters for the API call
        LocalDateTime dateTime = DateTimeHelper.fromUnixTimestamp(1484719381L);
        LocalDateTime dateTime1 = DateTimeHelper.fromUnixTimestamp(1484719381L);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.unixdatetimeAsOptional(dateTime, dateTime1);
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

}
