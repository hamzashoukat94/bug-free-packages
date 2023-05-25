/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import io.apimatic.core.types.http.response.Dynamic;
import io.apimatic.coreinterfaces.http.response.Response;
import localhost3000.http.Headers;

/**
 * Represents dynamic response returned by an API call.
 * Allows user to lazily parse the response as a primitive
 * or a more complex type using parse(). 
 */
public class DynamicResponse extends Dynamic {

    /**
     * Instantiate class.
     * @param responseBody The object of Response
     */
    public DynamicResponse(Response responseBody) {
        super(responseBody);
    }
    
    /**
     * Get response headers for the HTTP response.
     * @return Headers
     */
    public Headers getHeaders() {
        return (Headers) super.getHeaders();
    }

}
