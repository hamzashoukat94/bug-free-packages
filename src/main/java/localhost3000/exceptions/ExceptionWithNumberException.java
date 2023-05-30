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
 * This is a model class for ExceptionWithNumberException type.
 */
public class ExceptionWithNumberException extends ApiException {
    private static final long serialVersionUID = -6634103589050296194L;
    private int value;
    private Integer value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithNumberException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the int
     */
    @JsonGetter("value")
    public int getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for int
     */
    @JsonSetter("value")
    private void setValue(int value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Integer
     */
    @JsonGetter("value1")
    public Integer getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Integer
     */
    @JsonSetter("value1")
    private void setValue1(Integer value1) {
        this.value1 = value1;
    }
}
