/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddUnixTimeStampInGlobalException;

/**
 * This is a model class for SendUnixTimeStampInModelAsException type.
 */
public class SendUnixTimeStampInModelAsException extends ApiException {
    private static final long serialVersionUID = 112024755583354431L;
    private AddUnixTimeStampInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendUnixTimeStampInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddUnixTimeStampInGlobalException
     */
    @JsonGetter("body")
    public AddUnixTimeStampInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddUnixTimeStampInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddUnixTimeStampInGlobalException body) {
        this.body = body;
    }
}
