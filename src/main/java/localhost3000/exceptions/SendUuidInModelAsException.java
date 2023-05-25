/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddUuidInGlobalException;

/**
 * This is a model class for SendUuidInModelAsException type.
 */
public class SendUuidInModelAsException extends ApiException {
    private static final long serialVersionUID = -12513657257688445L;
    private AddUuidInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendUuidInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddUuidInGlobalException
     */
    @JsonGetter("body")
    public AddUuidInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddUuidInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddUuidInGlobalException body) {
        this.body = body;
    }
}
