/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.HttpClient;
import java.util.HashMap;
import java.util.Map;
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
import localhost3000.exceptions.GlobalTestException;
import localhost3000.exceptions.NestedModelException;
import localhost3000.exceptions.Rfc1123Exception;
import localhost3000.exceptions.SendBooleanInModelAsException;
import localhost3000.exceptions.SendDateInModelAsException;
import localhost3000.exceptions.SendDynamicInModelAsException;
import localhost3000.exceptions.SendLongInModelAsException;
import localhost3000.exceptions.SendNumberInModelAsException;
import localhost3000.exceptions.SendPrecisionInModelAsException;
import localhost3000.exceptions.SendRfc1123InModelAsException;
import localhost3000.exceptions.SendRfc3339InModelAsException;
import localhost3000.exceptions.SendStringInModelAsException;
import localhost3000.exceptions.SendUnixTimeStampInModelAsException;
import localhost3000.exceptions.SendUuidInModelAsException;
import localhost3000.exceptions.UnixTimeStampException;
import localhost3000.http.client.HttpCallback;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {
    protected final static String AUTHENTICATION_KEY = "global";
    protected static final Map<String, ErrorCase<ApiException>> GLOBAL_ERROR_CASES =
            new HashMap<String, ErrorCase<ApiException>>();
    private GlobalConfiguration globalConfig;
    static {
        GLOBAL_ERROR_CASES.put("400", ErrorCase.setReason("400 Global",
                (reason, context) -> new ApiException(reason, context)));
        GLOBAL_ERROR_CASES.put("402", ErrorCase.setReason("402 Global",
                (reason, context) -> new ApiException(reason, context)));
        GLOBAL_ERROR_CASES.put("403", ErrorCase.setReason("403 Global",
                (reason, context) -> new ApiException(reason, context)));
        GLOBAL_ERROR_CASES.put("404", ErrorCase.setReason("404 Global",
                (reason, context) -> new ApiException(reason, context)));
        GLOBAL_ERROR_CASES.put("412", ErrorCase.setReason("Precondition Failed",
                (reason, context) -> new NestedModelException(reason, context)));
        GLOBAL_ERROR_CASES.put("450", ErrorCase.setReason("caught global exception",
                (reason, context) -> new CustomErrorResponseException(reason, context)));
        GLOBAL_ERROR_CASES.put("452", ErrorCase.setReason("global exception with string",
                (reason, context) -> new ExceptionWithStringException(reason, context)));
        GLOBAL_ERROR_CASES.put("453", ErrorCase.setReason("boolean in global exception",
                (reason, context) -> new ExceptionWithBooleanException(reason, context)));
        GLOBAL_ERROR_CASES.put("454", ErrorCase.setReason("dynamic in global exception",
                (reason, context) -> new ExceptionWithDynamicException(reason, context)));
        GLOBAL_ERROR_CASES.put("455", ErrorCase.setReason("uuid in global exception",
                (reason, context) -> new ExceptionWithUUIDException(reason, context)));
        GLOBAL_ERROR_CASES.put("456", ErrorCase.setReason("date in global exception",
                (reason, context) -> new ExceptionWithDateException(reason, context)));
        GLOBAL_ERROR_CASES.put("457", ErrorCase.setReason("number in global  exception",
                (reason, context) -> new ExceptionWithNumberException(reason, context)));
        GLOBAL_ERROR_CASES.put("458", ErrorCase.setReason("long in global exception",
                (reason, context) -> new ExceptionWithLongException(reason, context)));
        GLOBAL_ERROR_CASES.put("459", ErrorCase.setReason("precision in global  exception",
                (reason, context) -> new ExceptionWithPrecisionException(reason, context)));
        GLOBAL_ERROR_CASES.put("460", ErrorCase.setReason("rfc3339 in global exception",
                (reason, context) -> new ExceptionWithRfc3339DateTimeException(reason, context)));
        GLOBAL_ERROR_CASES.put("461", ErrorCase.setReason("unix time stamp in global exception",
                (reason, context) -> new UnixTimeStampException(reason, context)));
        GLOBAL_ERROR_CASES.put("462", ErrorCase.setReason("rfc1123 in global exception",
                (reason, context) -> new Rfc1123Exception(reason, context)));
        GLOBAL_ERROR_CASES.put("463", ErrorCase.setReason("boolean in model as global exception",
                (reason, context) -> new SendBooleanInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("464", ErrorCase.setReason("rfc3339 in model as global exception",
                (reason, context) -> new SendRfc3339InModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("465", ErrorCase.setReason("rfc1123 in model as global exception",
                (reason, context) -> new SendRfc1123InModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("466", ErrorCase.setReason("unix time stamp in model as global exception",
                (reason, context) -> new SendUnixTimeStampInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("467", ErrorCase.setReason("send date in model as global exception",
                (reason, context) -> new SendDateInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("468", ErrorCase.setReason("send dynamic in model as global exception",
                (reason, context) -> new SendDynamicInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("469", ErrorCase.setReason("send string in model as global exception",
                (reason, context) -> new SendStringInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("470", ErrorCase.setReason("send long in model as global exception",
                (reason, context) -> new SendLongInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("471", ErrorCase.setReason("send number in model as global exception",
                (reason, context) -> new SendNumberInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("472", ErrorCase.setReason("send precision in model as global exception",
                (reason, context) -> new SendPrecisionInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("473", ErrorCase.setReason("send uuid in model as global exception",
                (reason, context) -> new SendUuidInModelAsException(reason, context)));
        GLOBAL_ERROR_CASES.put("500", ErrorCase.setReason("500 Global",
                (reason, context) -> new GlobalTestException(reason, context)));
        GLOBAL_ERROR_CASES.put(ErrorCase.DEFAULT, ErrorCase.setReason("Invalid response.",
                (reason, context) -> new GlobalTestException(reason, context)));
    }

    protected BaseController(GlobalConfiguration globalConfig) {
        this.globalConfig = globalConfig;
    }

    /**
     * Get httpCallback associated with this controller.
     * @return HttpCallback
     */
    public HttpCallback getHttpCallback() {
        return (HttpCallback) globalConfig.getHttpCallback();
    }
    
    /**
     * Shared instance of the Http client.
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return globalConfig.getHttpClient();
    }

    /**
     * Instance of the Global Configuration
     * @return The instance of the global configuration 
     */
    protected GlobalConfiguration getGlobalConfiguration() {
        return globalConfig;
    }
}
