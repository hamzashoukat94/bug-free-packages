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
import java.time.LocalDateTime;
import localhost3000.DateTimeHelper;

/**
 * This is a model class for UnixTimeStampException type.
 */
public class UnixTimeStampException extends ApiException {
    private static final long serialVersionUID = -3973115553600265962L;
    private LocalDateTime dateTime;
    private LocalDateTime dateTime1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public UnixTimeStampException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for DateTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime")
    @JsonSerialize(using = DateTimeHelper.UnixTimestampSerializer.class)
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for LocalDateTime
     */
    @JsonSetter("dateTime")
    @JsonDeserialize(using = DateTimeHelper.UnixTimestampDeserializer.class)
    private void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime1.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime1")
    @JsonSerialize(using = DateTimeHelper.UnixTimestampSerializer.class)
    public LocalDateTime getDateTime1() {
        return this.dateTime1;
    }

    /**
     * Setter for DateTime1.
     * @param dateTime1 Value for LocalDateTime
     */
    @JsonSetter("dateTime1")
    @JsonDeserialize(using = DateTimeHelper.UnixTimestampDeserializer.class)
    private void setDateTime1(LocalDateTime dateTime1) {
        this.dateTime1 = dateTime1;
    }
}
