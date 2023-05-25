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
 * This is a model class for ExceptionWithLongException type.
 */
public class ExceptionWithLongException extends ApiException {
    private static final long serialVersionUID = 8579058879588038344L;
    private long value;
    private Long value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithLongException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the long
     */
    @JsonGetter("value")
    public long getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for long
     */
    @JsonSetter("value")
    private void setValue(long value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Long
     */
    @JsonGetter("value1")
    public Long getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Long
     */
    @JsonSetter("value1")
    private void setValue1(Long value1) {
        this.value1 = value1;
    }
}
