/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddNumberInException;

/**
 * This is a model class for SendNumberInModelAsException type.
 */
public class SendNumberInModelAsException extends ApiException {
    private static final long serialVersionUID = -119420305422767110L;
    private AddNumberInException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendNumberInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddNumberInException
     */
    @JsonGetter("body")
    public AddNumberInException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddNumberInException
     */
    @JsonSetter("body")
    private void setBody(AddNumberInException body) {
        this.body = body;
    }
}
