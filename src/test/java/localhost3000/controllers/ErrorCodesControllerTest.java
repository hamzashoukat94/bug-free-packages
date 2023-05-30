/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import localhost3000.TesterClient;
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
import localhost3000.exceptions.NestedModelException;
import localhost3000.exceptions.Rfc1123Exception;
import localhost3000.exceptions.UnixTimeStampException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ErrorCodesControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ErrorCodesController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getErrorCodesController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Receive Exception with unixtimestamp exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReceiveUnixTimestampException() throws Exception {

        // Set callback and perform API call
        try {
            controller.receiveExceptionWithUnixtimestampException();
        } catch (UnixTimeStampException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Receive Exception with rfc 1123 datetime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReceiveRfc1123Exception() throws Exception {

        // Set callback and perform API call
        try {
            controller.receiveExceptionWithRfc1123Datetime();
        } catch (Rfc1123Exception e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Boolean in exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testBooleanInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.booleanInException();
        } catch (ExceptionWithBooleanException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for long in exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testLongInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.longInException();
        } catch (ExceptionWithLongException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Number in exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testNumberInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.numberInException();
        } catch (ExceptionWithNumberException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for catch 412 global error.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet412GlobalException() throws Exception {

        // Set callback and perform API call
        try {
            controller.catch412GlobalError();
        } catch (NestedModelException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 412", 
                412, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Get500.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet500() throws Exception {

        // Set callback and perform API call
        try {
            controller.get500();
        } catch (localhost3000.exceptions.GlobalTestException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 500", 
                500, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for receive endpoint level exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testCheckEndpointLevelException() throws Exception {

        // Set callback and perform API call
        try {
            controller.receiveEndpointLevelException();
        } catch (CustomErrorResponseException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 451", 
                451, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Dynamic in Exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDynamicInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.dynamicInException();
        } catch (ExceptionWithDynamicException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Get501.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet501() throws Exception {

        // Set callback and perform API call
        try {
            controller.get501();
        } catch (NestedModelException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 501", 
                501, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Get400.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet400() throws Exception {

        // Set callback and perform API call
        try {
            controller.get400();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 400", 
                400, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Receive Exception with rfc 3339 datetime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRfc3339DateTimeException() throws Exception {

        // Set callback and perform API call
        try {
            controller.receiveExceptionWithRfc3339Datetime();
        } catch (ExceptionWithRfc3339DateTimeException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Date in exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDateInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.dateInException();
        } catch (ExceptionWithDateException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for UUID in exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUUIDInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.uUIDInException();
        } catch (ExceptionWithUUIDException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Precision in Exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testPrecisionInException() throws Exception {

        // Set callback and perform API call
        try {
            controller.precisionInException();
        } catch (ExceptionWithPrecisionException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for get exception with string.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testExceptionWithString() throws Exception {

        // Set callback and perform API call
        try {
            controller.getExceptionWithString();
        } catch (ExceptionWithStringException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 444", 
                444, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Receive global level exception.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testCheckGlobalLevelException() throws Exception {

        // Set callback and perform API call
        try {
            controller.receiveGlobalLevelException();
        } catch (CustomErrorResponseException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 450", 
                450, httpResponse.getResponse().getStatusCode());

    }

}
