/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.UUID;

/**
 * This is a model class for ExceptionWithUUIDException type.
 */
public class ExceptionWithUUIDException extends ApiException {
    private static final long serialVersionUID = 5243055965490975431L;
    private UUID value;
    private UUID value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithUUIDException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the UUID
     */
    @JsonGetter("value")
    public UUID getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for UUID
     */
    @JsonSetter("value")
    private void setValue(UUID value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the UUID
     */
    @JsonGetter("value1")
    public UUID getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for UUID
     */
    @JsonSetter("value1")
    private void setValue1(UUID value1) {
        this.value1 = value1;
    }
}
