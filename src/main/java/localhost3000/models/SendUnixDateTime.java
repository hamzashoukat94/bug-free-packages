/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SendUnixDateTime type.
 */
public class SendUnixDateTime
        extends BaseModel {
    private UnixDateTime dateTime;

    /**
     * Default constructor.
     */
    public SendUnixDateTime() {
    }

    /**
     * Initialization constructor.
     * @param  dateTime  UnixDateTime value for dateTime.
     */
    public SendUnixDateTime(
            UnixDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime.
     * @return Returns the UnixDateTime
     */
    @JsonGetter("dateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnixDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for UnixDateTime
     */
    @JsonSetter("dateTime")
    public void setDateTime(UnixDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Converts this SendUnixDateTime into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendUnixDateTime [" + "dateTime=" + dateTime + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SendUnixDateTime.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendUnixDateTime.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateTime(getDateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link SendUnixDateTime}.
     */
    public static class Builder {
        private UnixDateTime dateTime;



        /**
         * Setter for dateTime.
         * @param  dateTime  UnixDateTime value for dateTime.
         * @return Builder
         */
        public Builder dateTime(UnixDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        /**
         * Builds a new {@link SendUnixDateTime} object using the set fields.
         * @return {@link SendUnixDateTime}
         */
        public SendUnixDateTime build() {
            return new SendUnixDateTime(dateTime);
        }
    }
}
