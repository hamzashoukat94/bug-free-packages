/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.Complex3;

/**
 * This is a model class for ComplexObjectInException type.
 */
public class ComplexObjectInException extends ApiException {
    private static final long serialVersionUID = -62763254548431926L;
    private Complex3 body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ComplexObjectInException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the Complex3
     */
    @JsonGetter("body")
    public Complex3 getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for Complex3
     */
    @JsonSetter("body")
    private void setBody(Complex3 body) {
        this.body = body;
    }
}
