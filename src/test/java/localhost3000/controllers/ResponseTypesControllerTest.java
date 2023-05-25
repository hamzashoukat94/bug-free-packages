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
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.TesterClient;
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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResponseTypesControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ResponseTypesController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getResponseTypesController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Get Date Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetDateArray() throws Exception {

        // Set callback and perform API call
        List<LocalDate> result = null;
        try {
            result = controller.getDateArray();
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
        // Deserialize expected output
        List<LocalDate> expected = ApiHelper.deserialize(
                "[\"1994-02-13\",\"1994-02-13\"]",
                new TypeReference<List<LocalDate>>(){},
                LocalDate.class,
                new DateTimeHelper.SimpleDateDeserializer());

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get Date.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetDate() throws Exception {

        // Set callback and perform API call
        LocalDate result = null;
        try {
            result = controller.getDate();
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
        assertEquals("Response does not match expected value", 
            DateTimeHelper.fromSimpleDate("1994-02-13"), result);
    }

    /**
     * Test case for return company model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnCompanyModel() throws Exception {

        // Set callback and perform API call
        Company result = null;
        try {
            result = controller.returnCompanyModel();
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
                "{\n\t\"company name\" : \"APIMatic\",\n\t\"address\" : \"nust\",\n\t\"cell number"
                + "\" : \"090078601\"\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return boss model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnBossModel() throws Exception {

        // Set callback and perform API call
        BossCompany result = null;
        try {
            result = controller.returnBossModel();
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
                "{\n\t\"company name\" : \"APIMatic\",\n\t\"address\" : \"nust\",\n\t\"cell number"
                + "\" : \"090078601\",\n\t\"first name\" : \"Adeel\",\n\t\"last name\" : \"Ali\",\n"
                + "\t\"address_boss\" : \"nust\"\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return employee model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnEmployeeModel() throws Exception {

        // Set callback and perform API call
        EmployeeComp result = null;
        try {
            result = controller.returnEmployeeModel();
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
                "{\n\t\"company name\" : \"APIMatic\",\n\t\"address\" : \"nust\",\n\t\"cell number"
                + "\" : \"090078601\",\n\t\"first name\" : \"Nauman\",\n\t\"last name\" : \"Ali\","
                + "\n\t\"id\" : \"123456\"\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return developer model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnDeveloperModel() throws Exception {

        // Set callback and perform API call
        Developer result = null;
        try {
            result = controller.returnDeveloperModel();
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
                "{\n\t\"company name\" : \"APIMatic\",\n\t\"address\" : \"nust\",\n\t\"cell number"
                + "\" : \"090078601\",\n\t\"first name\" : \"Nauman\",\n\t\"last name\" : \"Ali\","
                + "\n\t\"id\" : \"123456\",\n\t\"team\" : \"CORE\",\n\t\"designation\" : \"Manager"
                + "\",\n\t\"role\" : \"Team Lead\"\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return Tester model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnTesterModel() throws Exception {

        // Set callback and perform API call
        SoftwareTester result = null;
        try {
            result = controller.returnTesterModel();
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
                "{\n\t\"company name\" : \"APIMatic\",\n\t\"address\" : \"nust\",\n\t\"cell number"
                + "\" : \"090078601\",\n\t\"first name\" : \"Muhammad\",\n\t\"last name\" : \"Farha"
                + "n\",\n\t\"id\" : \"123456\",\n\t\"team\" : \"Testing\",\n\t\"designation\" : \"T"
                + "ester\",\n\t\"role\" : \"Testing\"\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Return complex1 object.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnComplex1Object() throws Exception {

        // Set callback and perform API call
        Complex1 result = null;
        try {
            result = controller.returnComplex1Object();
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
                "{\n        \"medications\":[{\n                \"aceInhibitors\":[{\n             "
                + "       \"name\":\"lisinopril\",\n                    \"strength\":\"10 mg Tab\","
                + "\n                    \"dose\":\"1 tab\",\n                    \"route\":\"PO\","
                + "\n                    \"sig\":\"daily\",\n                    \"pillCount\":\"#9"
                + "0\",\n                    \"refills\":\"Refill 3\"\n                }],\n       "
                + "         \"antianginal\":[{\n                    \"name\":\"nitroglycerin\",\n  "
                + "                  \"strength\":\"0.4 mg Sublingual Tab\",\n                    "
                + "\"dose\":\"1 tab\",\n                    \"route\":\"SL\",\n                    "
                + "\"sig\":\"q15min PRN\",\n                    \"pillCount\":\"#30\",\n           "
                + "         \"refills\":\"Refill 1\"\n                }],\n                \"antico"
                + "agulants\":[{\n                    \"name\":\"warfarin sodium\",\n              "
                + "      \"strength\":\"3 mg Tab\",\n                    \"dose\":\"1 tab\",\n     "
                + "               \"route\":\"PO\",\n                    \"sig\":\"daily\",\n      "
                + "              \"pillCount\":\"#90\",\n                    \"refills\":\"Refill 3"
                + "\"\n                }],\n                \"betaBlocker\":[{\n                   "
                + " \"name\":\"metoprolol tartrate\",\n                    \"strength\":\"25 mg Tab"
                + "\",\n                    \"dose\":\"1 tab\",\n                    \"route\":\"PO"
                + "\",\n                    \"sig\":\"daily\",\n                    \"pillCount\":"
                + "\"#90\",\n                    \"refills\":\"Refill 3\"\n                }],\n   "
                + "             \"diuretic\":[{\n                    \"name\":\"furosemide\",\n    "
                + "                \"strength\":\"40 mg Tab\",\n                    \"dose\":\"1 ta"
                + "b\",\n                    \"route\":\"PO\",\n                    \"sig\":\"daily"
                + "\",\n                    \"pillCount\":\"#90\",\n                    \"refills"
                + "\":\"Refill 3\"\n                }],\n                \"mineral\":[{\n          "
                + "          \"name\":\"potassium chloride ER\",\n                    \"strength\":"
                + "\"10 mEq Tab\",\n                    \"dose\":\"1 tab\",\n                    "
                + "\"route\":\"PO\",\n                    \"sig\":\"daily\",\n                    "
                + "\"pillCount\":\"#90\",\n                    \"refills\":\"Refill 3\"\n          "
                + "      }]\n            }\n        ],\n        \"labs\":[{\n            \"name\":"
                + "\"Arterial Blood Gas\",\n            \"time\":\"Today\",\n            \"location"
                + "\":\"Main Hospital Lab\"      \n            },\n            {\n            \"nam"
                + "e\":\"BMP\",\n            \"time\":\"Today\",\n            \"location\":\"Primar"
                + "y Care Clinic\"    \n            },\n            {\n            \"name\":\"BNP"
                + "\",\n            \"time\":\"3 Weeks\",\n            \"location\":\"Primary Care "
                + "Clinic\"    \n            },\n            {\n            \"name\":\"BUN\",\n    "
                + "        \"time\":\"1 Year\",\n            \"location\":\"Primary Care Clinic\"  "
                + "  \n            },\n            {\n            \"name\":\"Cardiac Enzymes\",\n  "
                + "          \"time\":\"Today\",\n            \"location\":\"Primary Care Clinic\" "
                + "   \n            },\n            {\n            \"name\":\"CBC\",\n            "
                + "\"time\":\"1 Year\",\n            \"location\":\"Primary Care Clinic\"    \n    "
                + "        },\n            {\n            \"name\":\"Creatinine\",\n            \"t"
                + "ime\":\"1 Year\",\n            \"location\":\"Main Hospital Lab\"  \n           "
                + " },\n            {\n            \"name\":\"Electrolyte Panel\",\n            \"t"
                + "ime\":\"1 Year\",\n            \"location\":\"Primary Care Clinic\"    \n       "
                + "     },\n            {\n            \"name\":\"Glucose\",\n            \"time\":"
                + "\"1 Year\",\n            \"location\":\"Main Hospital Lab\"  \n            },\n "
                + "           {\n            \"name\":\"PT/INR\",\n            \"time\":\"3 Weeks"
                + "\",\n            \"location\":\"Primary Care Clinic\"    \n            },\n     "
                + "       {\n            \"name\":\"PTT\",\n            \"time\":\"3 Weeks\",\n    "
                + "        \"location\":\"Coumadin Clinic\"    \n            },\n            {\n   "
                + "         \"name\":\"TSH\",\n            \"time\":\"1 Year\",\n            \"loca"
                + "tion\":\"Primary Care Clinic\"    \n            }\n        ],\n        \"imaging"
                + "\":[{\n            \"name\":\"Chest X-Ray\",\n            \"time\":\"Today\",\n "
                + "           \"location\":\"Main Hospital Radiology\"    \n            },\n       "
                + "     {\n            \"name\":\"Chest X-Ray\",\n            \"time\":\"Today\",\n"
                + "            \"location\":\"Main Hospital Radiology\"    \n            },\n      "
                + "      {\n            \"name\":\"Chest X-Ray\",\n            \"time\":\"Today\","
                + "\n            \"location\":\"Main Hospital Radiology\"    \n            }\n     "
                + "   ]\n    }",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return response with enums.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnResponseWithEnumObject() throws Exception {

        // Set callback and perform API call
        ResponseWithEnum result = null;
        try {
            result = controller.returnResponseWithEnums();
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
                "{\n        \"paramFormat\": \"Template\",\n        \"optional\": false,\n        "
                + "\"type\": \"Long\",\n        \"constant\": false,\n        \"isArray\": false,\n"
                + "        \"isStream\": false,\n        \"isAttribute\": false,\n        \"isMap"
                + "\": false,\n        \"attributes\": {\n          \"exclusiveMaximum\": false,\n "
                + "         \"exclusiveMinimum\": false,\n          \"id\": \"5a9fcb01caacc310dc6ba"
                + "b51\"\n        },\n        \"nullable\": false,\n        \"id\": \"5a9fcb01caacc"
                + "310dc6bab50\",\n        \"name\": \"petId\",\n        \"description\": \"ID of p"
                + "et to update\"\n    }",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Return complex2 object.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnComplex2Object() throws Exception {

        // Set callback and perform API call
        Complex2 result = null;
        try {
            result = controller.returnComplex2Object();
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
                "{\n        \"glossary\": {\n            \"title\": \"example glossary\",\n        "
                + "    \"GlossDiv\": {\n                \"title\": \"S\",\n                \"GlossL"
                + "ist\": {\n                    \"GlossEntry\": {\n                        \"ID\":"
                + " \"SGML\",\n                        \"SortAs\": \"SGML\",\n                     "
                + "   \"GlossTerm\": \"Standard Generalized Markup Language\",\n                   "
                + "     \"Acronym\": \"SGML\",\n                        \"Abbrev\": \"ISO 8879:1986"
                + "\",\n                        \"GlossDef\": {\n                            \"para"
                + "\": \"A meta-markup language, used to create markup languages such as DocBook."
                + "\",\n                            \"GlossSeeAlso\": [\"GML\", \"XML\"]\n         "
                + "               },\n                        \"GlossSee\": \"markup\"\n           "
                + "         }\n                }\n            }\n        }\n    }",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for return complex3 object.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testReturnComplex3Object() throws Exception {

        // Set callback and perform API call
        Complex3 result = null;
        try {
            result = controller.returnComplex3Object();
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
                "{\n  \"documentId\": \"099cceda-38a8-4b01-87b9-a8f2007675d6\",\n  \"signers\": [\n"
                + "    {\n      \"id\": \"1bef97d1-0704-4eb2-a490-a8f2007675db\",\n      \"url\": "
                + "\"https://sign-test.idfy.io/start?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJrd"
                + "mVyc2lvbiI6IjdmNzhjNzNkMmQ1MjQzZWRiYjdiNDI0MmI2MDE1MWU4IiwiZG9jaWQiOiIwOTljY2VkY"
                + "S0zOGE4LTRiMDEtODdiOS1hOGYyMDA3Njc1ZDYiLCJhaWQiOiJjMGNlMTQ2OC1hYzk0LTRiMzQtODc2Z"
                + "S1hODg1MDBjMmI5YTEiLCJsZyI6ImVuIiwiZXJyIjpudWxsLCJpZnIiOmZhbHNlLCJ3Ym1zZyI6ZmFsc"
                + "2UsInNmaWQiOiIxYmVmOTdkMS0wNzA0LTRlYjItYTQ5MC1hOGYyMDA3Njc1ZGIiLCJ1cmxleHAiOm51b"
                + "GwsImF0aCI6bnVsbCwiZHQiOiJUZXN0IGRvY3VtZW50IiwidmYiOmZhbHNlLCJhbiI6IklkZnkgU0RLI"
                + "GRlbW8iLCJ0aCI6IlBpbmsiLCJzcCI6IkN1YmVzIiwiZG9tIjpudWxsLCJyZGlyIjpmYWxzZSwidXQiO"
                + "iJ3ZWIiLCJ1dHYiOm51bGwsInNtIjoidGVzdEB0ZXN0LmNvbSJ9.Dyy2RSeR6dmU8qxOEi-2gEX3Gg7w"
                + "ry6JhkZIWOuADDdu5jJWidQLcxfJn_qAHNpb\",\n      \"links\": [],\n      \"externalS"
                + "ignerId\": \"uoiahsd321982983jhrmnec2wsadm32\",\n      \"redirectSettings\": {\n"
                + "        \"redirectMode\": \"donot_redirect\"\n      },\n      \"signatureType\":"
                + " {\n        \"mechanism\": \"pkisignature\",\n        \"onEacceptUseHandWrittenS"
                + "ignature\": false\n      },\n      \"ui\": {\n        \"dialogs\": {\n          "
                + "\"before\": {\n            \"useCheckBox\": false,\n            \"title\": \"Inf"
                + "o\",\n            \"message\": \"Please read the contract on the next pages care"
                + "fully. Pay some extra attention to paragraph 5.\"\n          }\n        },\n    "
                + "    \"language\": \"EN\",\n        \"styling\": {\n          \"colorTheme\": \"P"
                + "ink\",\n          \"spinner\": \"Cubes\"\n        }\n      },\n      \"tags\": ["
                + "],\n      \"order\": 0,\n      \"required\": false\n    }\n  ],\n  \"status\": {"
                + "\n    \"documentStatus\": \"unsigned\",\n    \"completedPackages\": [],\n    \"a"
                + "ttachmentPackages\": {}\n  },\n  \"title\": \"Test document\",\n  \"description"
                + "\": \"This is an important document\",\n  \"externalId\": \"ae7b9ca7-3839-4e0d-a"
                + "070-9f14bffbbf55\",\n  \"dataToSign\": {\n    \"fileName\": \"sample.txt\",\n   "
                + " \"convertToPDF\": false\n  },\n  \"contactDetails\": {\n    \"email\": \"test@t"
                + "est.com\",\n    \"url\": \"https://idfy.io\"\n  },\n  \"advanced\": {\n    \"tag"
                + "s\": [\n      \"develop\",\n      \"fun_with_documents\"\n    ],\n    \"attachme"
                + "nts\": 0,\n    \"requiredSignatures\": 0,\n    \"getSocialSecurityNumber\": fals"
                + "e,\n    \"timeToLive\": {\n      \"deadline\": \"2018-06-29T14:57:25Z\",\n      "
                + "\"deleteAfterHours\": 1\n    }\n  }\n}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Get Long.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetLong() throws Exception {

        // Set callback and perform API call
        long result = 0;
        try {
            result = controller.getLong();
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
        assertEquals("Response does not match expected value", 
            5147483647L, result);
    }

    /**
     * Test case for Get Model.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetModel() throws Exception {

        // Set callback and perform API call
        Person result = null;
        try {
            result = controller.getModel();
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
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Get String Enum Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetStringEnumArray() throws Exception {

        // Set callback and perform API call
        List<Days> result = null;
        try {
            result = controller.getStringEnumArray();
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
        // Deserialize expected output
        List<Days> expected = ApiHelper.deserializeArray(
                "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]",
                Days[].class);

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get String Enum.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetStringEnum() throws Exception {

        // Set callback and perform API call
        Days result = null;
        try {
            result = controller.getStringEnum();
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
        assertEquals("Response does not match expected value", 
            Days.fromString("Monday"), result);
    }

    /**
     * Test case for Get Model Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetModelArray() throws Exception {

        // Set callback and perform API call
        List<Person> result = null;
        try {
            result = controller.getModelArray();
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
                TestHelper.isArrayOfJsonObjectsProperSubsetOf(
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
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Get Int Enum.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetIntEnum() throws Exception {

        // Set callback and perform API call
        SuiteCode result = null;
        try {
            result = controller.getIntEnum();
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
        assertEquals("Response does not match expected value", 
            SuiteCode.fromInteger(Integer.parseInt("3")), result);
    }

    /**
     * Test case for Get Int Enum Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetIntEnumArray() throws Exception {

        // Set callback and perform API call
        List<SuiteCode> result = null;
        try {
            result = controller.getIntEnumArray();
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
        // Deserialize expected output
        List<SuiteCode> expected = ApiHelper.deserializeArray(
                "[1, 3, 4, 2, 3]",
                SuiteCode[].class);

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get Precision.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetPrecision() throws Exception {

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getPrecision();
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
        assertEquals("Response does not match expected value", 
            4.999, result, ASSERT_PRECISION);
    }

    /**
     * Test case for Get Binary.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetBinary() throws Exception {

        // Set callback and perform API call
        InputStream result = null;
        try {
            result = controller.getBinary();
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
        assertTrue("Binary result does not match the given file", 
                TestHelper.isSameAsFile(
                "http://localhost:3000/response/image",
                result));
    }

    /**
     * Test case for Get Integer.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetInteger() throws Exception {

        // Set callback and perform API call
        int result = 0;
        try {
            result = controller.getInteger();
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
        assertEquals("Response does not match expected value", 
            4, result);
    }

    /**
     * Test case for Get Integer Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetIntegerArray() throws Exception {

        // Set callback and perform API call
        List<Integer> result = null;
        try {
            result = controller.getIntegerArray();
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
        // Deserialize expected output
        List<Integer> expected = ApiHelper.deserializeArray(
                "[1,2,3,4,5]",
                Integer[].class);

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get Dynamic.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetDynamic() throws Exception {

        // Set callback and perform API call
        DynamicResponse result = null;
        try {
            result = controller.getDynamic();
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
                "{\"method\":\"GET\",\"body\":{},\"uploadCount\":0}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Get Dynamic Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetDynamicArray() throws Exception {

        // Set callback and perform API call
        DynamicResponse result = null;
        try {
            result = controller.getDynamicArray();
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
                "{\"method\":\"GET\",\"body\":{},\"uploadCount\":0}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Test case for Get 3339Datetime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet3339Datetime() throws Exception {

        // Set callback and perform API call
        LocalDateTime result = null;
        try {
            result = controller.get3339Datetime();
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
        assertEquals("Response does not match expected value", 
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"), result);
    }

    /**
     * Test case for Get 3339Datetime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet3339DatetimeArray() throws Exception {

        // Set callback and perform API call
        List<LocalDateTime> result = null;
        try {
            result = controller.get3339DatetimeArray();
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
        // Deserialize expected output
        List<LocalDateTime> expected = ApiHelper.deserialize(
                "[\"2016-03-13T12:52:32.123Z\",\"2016-03-13T12:52:32.123Z\",\"2016-03-13T12:52:32.1"
                + "23Z\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc8601DateTimeDeserializer());

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get Boolean.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetBoolean() throws Exception {

        // Set callback and perform API call
        boolean result = false;
        try {
            result = controller.getBoolean();
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
        assertEquals("Response does not match expected value", 
            true, result);
    }

    /**
     * Test case for Get Boolean Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetBooleanArray() throws Exception {

        // Set callback and perform API call
        List<Boolean> result = null;
        try {
            result = controller.getBooleanArray();
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
        // Deserialize expected output
        List<Boolean> expected = ApiHelper.deserializeArray(
                "[true, false, true, true, false]",
                Boolean[].class);

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get Headers.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetHeadersAllowExtra() throws Exception {

        // Set callback and perform API call
        try {
            controller.getHeaders();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("NauManAli", TestHelper.NULL_STRING);
        headers.put("WaseemHasAn", TestHelper.NULL_STRING);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Test case for Get 1123DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet1123DateTime() throws Exception {

        // Set callback and perform API call
        LocalDateTime result = null;
        try {
            result = controller.get1123DateTime();
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
        assertEquals("Response does not match expected value", 
            DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"), result);
    }

    /**
     * Test case for Get UnixDateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetUnixDateTime() throws Exception {

        // Set callback and perform API call
        LocalDateTime result = null;
        try {
            result = controller.getUnixDateTime();
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
        assertEquals("Response does not match expected value", 
            DateTimeHelper.fromUnixTimestamp("1484719381"), result);
    }

    /**
     * Test case for Get 1123DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGet1123DateTimeArray() throws Exception {

        // Set callback and perform API call
        List<LocalDateTime> result = null;
        try {
            result = controller.get1123DateTimeArray();
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
        // Deserialize expected output
        List<LocalDateTime> expected = ApiHelper.deserialize(
                "[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc1123DateTimeDeserializer());

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for Get UnixDateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetUnixDateTimeArray() throws Exception {

        // Set callback and perform API call
        List<LocalDateTime> result = null;
        try {
            result = controller.getUnixDateTimeArray();
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
        // Deserialize expected output
        List<LocalDateTime> expected = ApiHelper.deserialize(
                "[1484719381,1484719381]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.UnixTimestampDeserializer());

        assertTrue("Response array does not match in values and size", 
            result.containsAll(expected));
    }

    /**
     * Test case for get content type headers.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetContentTypeInResponse() throws Exception {

        // Set callback and perform API call
        try {
            controller.getContentTypeHeaders();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/responseType");
        headers.put("Accept", "application/noTerm");
        headers.put("Accept-Encoding", "UTF-8");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
