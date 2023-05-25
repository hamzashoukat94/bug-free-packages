/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import localhost3000.ApiHelper;
import localhost3000.TesterClient;
import localhost3000.exceptions.ApiException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemplateParamsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TemplateParamsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTemplateParamsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
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
        try {
            controller.sendStringArray(strings);
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
        try {
            controller.sendIntegerArray(integers);
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

}
