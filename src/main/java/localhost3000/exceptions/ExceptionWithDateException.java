/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.coreinterfaces.http.Context;
import java.time.LocalDate;
import localhost3000.DateTimeHelper;

/**
 * This is a model class for ExceptionWithDateException type.
 */
public class ExceptionWithDateException extends ApiException {
    private static final long serialVersionUID = -2071147539150790614L;
    private LocalDate value;
    private LocalDate value1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ExceptionWithDateException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Value.
     * @return Returns the LocalDate
     */
    @JsonGetter("value")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getValue() {
        return this.value;
    }

    /**
     * Setter for Value.
     * @param value Value for LocalDate
     */
    @JsonSetter("value")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    private void setValue(LocalDate value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the LocalDate
     */
    @JsonGetter("value1")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getValue1() {
        return this.value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for LocalDate
     */
    @JsonSetter("value1")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    private void setValue1(LocalDate value1) {
        this.value1 = value1;
    }
}
