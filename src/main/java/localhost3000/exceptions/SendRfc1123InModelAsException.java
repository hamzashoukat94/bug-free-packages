/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.AddRfc1123DatetimeInGlobalException;

/**
 * This is a model class for SendRfc1123InModelAsException type.
 */
public class SendRfc1123InModelAsException extends ApiException {
    private static final long serialVersionUID = -2844561739399746L;
    private AddRfc1123DatetimeInGlobalException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SendRfc1123InModelAsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddRfc1123DatetimeInGlobalException
     */
    @JsonGetter("body")
    public AddRfc1123DatetimeInGlobalException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddRfc1123DatetimeInGlobalException
     */
    @JsonSetter("body")
    private void setBody(AddRfc1123DatetimeInGlobalException body) {
        this.body = body;
    }
}
