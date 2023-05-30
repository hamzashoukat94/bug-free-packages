/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ExceptionWithBooleanException type.
 */
public class ExceptionWithBooleanException extends ApiException {
    private static final long serialVersionUID = -8699700973331842602L;
    private boolean value;
    private Boolean value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithBooleanException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the boolean
     */
    @JsonGetter("value")
    public boolean getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for boolean
     */
    @JsonSetter("value")
    private void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Boolean
     */
    @JsonGetter("value1")
    public Boolean getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Boolean
     */
    @JsonSetter("value1")
    private void setValue1(Boolean value1) {
        this.value1 = value1;
    }
}
