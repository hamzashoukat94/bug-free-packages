/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddRfc3339DatetimeInGlobalException;

/**
 * This is a model class for SendRfc3339InModelAsException type.
 */
public class SendRfc3339InModelAsException extends ApiException {
    private static final long serialVersionUID = 70009036687506230L;
    private AddRfc3339DatetimeInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendRfc3339InModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddRfc3339DatetimeInGlobalException
     */
    @JsonGetter("body")
    public AddRfc3339DatetimeInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddRfc3339DatetimeInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddRfc3339DatetimeInGlobalException body) {
        this.body = body;
    }
}
