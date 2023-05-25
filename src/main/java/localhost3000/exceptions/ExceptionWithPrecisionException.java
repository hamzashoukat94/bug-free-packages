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
 * This is a model class for ExceptionWithPrecisionException type.
 */
public class ExceptionWithPrecisionException extends ApiException {
    private static final long serialVersionUID = 1281764226756295592L;
    private double value;
    private Double value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithPrecisionException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the double
     */
    @JsonGetter("value")
    public double getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for double
     */
    @JsonSetter("value")
    private void setValue(double value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Double
     */
    @JsonGetter("value1")
    public Double getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Double
     */
    @JsonSetter("value1")
    private void setValue1(Double value1) {
        this.value1 = value1;
    }
}
