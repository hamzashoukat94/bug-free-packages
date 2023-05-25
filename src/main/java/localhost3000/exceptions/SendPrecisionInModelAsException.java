/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddPrecisionInException;

/**
 * This is a model class for SendPrecisionInModelAsException type.
 */
public class SendPrecisionInModelAsException extends ApiException {
    private static final long serialVersionUID = 116015934824516652L;
    private AddPrecisionInException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendPrecisionInModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddPrecisionInException
     */
    @JsonGetter("body")
    public AddPrecisionInException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddPrecisionInException
     */
    @JsonSetter("body")
    private void setBody(AddPrecisionInException body) {
        this.body = body;
    }
}
