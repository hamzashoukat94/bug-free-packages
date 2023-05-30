/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import localhost3000.Environment;
import localhost3000.TesterClient;
import localhost3000.models.SuiteCode;
import localhost3000.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 60;

    public static final double ASSERT_PRECISION = 0.1;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static TesterClient createConfigurationFromEnvironment() {
        TesterClient.Builder builder = new TesterClient.Builder();

        final String environment = System.getenv("TESTER_LIB_ENVIRONMENT");
        final String port = System.getenv("TESTER_LIB_PORT");
        final String suites = System.getenv("TESTER_LIB_SUITES");
        final String timeout = System.getenv("TESTER_LIB_TIMEOUT");

        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (port != null) {
            builder.port(port);
        }
        if (suites != null) {
            builder.suites(SuiteCode.fromInteger(Integer.parseInt(suites)));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static TesterClient createConfiguration() {
        // Set Configuration parameters for test execution
        TesterClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .environment(Environment.TESTING)
                .port("3000")
                .suites(SuiteCode.DIAMONDS)
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
