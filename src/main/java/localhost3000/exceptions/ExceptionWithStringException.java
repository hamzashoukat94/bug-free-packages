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
 * This is a model class for ExceptionWithStringException type.
 */
public class ExceptionWithStringException extends ApiException {
    private static final long serialVersionUID = -2860675622925140835L;
    private String value;
    private String value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithStringException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    private void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the String
     */
    @JsonGetter("value1")
    public String getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for String
     */
    @JsonSetter("value1")
    private void setValue1(String value1) {
        this.value1 = value1;
    }
}
