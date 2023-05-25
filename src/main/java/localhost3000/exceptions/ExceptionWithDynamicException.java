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
 * This is a model class for ExceptionWithDynamicException type.
 */
public class ExceptionWithDynamicException extends ApiException {
    private static final long serialVersionUID = 8519339989492287167L;
    private Object value;
    private Object value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithDynamicException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the Object
     */
    @JsonGetter("value")
    public Object getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for Object
     */
    @JsonSetter("value")
    private void setValue(Object value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Object
     */
    @JsonGetter("value1")
    public Object getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Object
     */
    @JsonSetter("value1")
    private void setValue1(Object value1) {
        this.value1 = value1;
    }
}
