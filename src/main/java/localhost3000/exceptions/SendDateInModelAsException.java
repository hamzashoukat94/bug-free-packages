/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddDateInGlobalException;

/**
 * This is a model class for SendDateInModelAsException type.
 */
public class SendDateInModelAsException extends ApiException {
    private static final long serialVersionUID = 129769845265604191L;
    private AddDateInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendDateInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddDateInGlobalException
     */
    @JsonGetter("body")
    public AddDateInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddDateInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddDateInGlobalException body) {
        this.body = body;
    }
}
