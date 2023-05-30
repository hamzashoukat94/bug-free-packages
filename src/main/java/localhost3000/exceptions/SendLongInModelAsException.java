/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddLongInGlobalException;

/**
 * This is a model class for SendLongInModelAsException type.
 */
public class SendLongInModelAsException extends ApiException {
    private static final long serialVersionUID = 91395927946384059L;
    private AddLongInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendLongInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddLongInGlobalException
     */
    @JsonGetter("body")
    public AddLongInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddLongInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddLongInGlobalException body) {
        this.body = body;
    }
}
