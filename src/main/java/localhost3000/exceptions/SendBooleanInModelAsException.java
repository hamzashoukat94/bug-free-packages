/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddBooleanInGlobalException;

/**
 * This is a model class for SendBooleanInModelAsException type.
 */
public class SendBooleanInModelAsException extends ApiException {
    private static final long serialVersionUID = -60021959769818347L;
    private AddBooleanInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendBooleanInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddBooleanInGlobalException
     */
    @JsonGetter("body")
    public AddBooleanInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddBooleanInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddBooleanInGlobalException body) {
        this.body = body;
    }
}
