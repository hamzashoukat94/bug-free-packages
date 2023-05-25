/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddStringInGlobalException;

/**
 * This is a model class for SendStringInModelAsException type.
 */
public class SendStringInModelAsException extends ApiException {
    private static final long serialVersionUID = -37213780920065267L;
    private AddStringInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendStringInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddStringInGlobalException
     */
    @JsonGetter("body")
    public AddStringInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddStringInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddStringInGlobalException body) {
        this.body = body;
    }
}
