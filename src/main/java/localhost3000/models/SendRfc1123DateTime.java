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
 * This is a model class for SendRfc1123DateTime type.
 */
public class SendRfc1123DateTime
        extends BaseModel {
    private ModelWithOptionalRfc1123DateTime dateTime;

    /**
     * Default constructor.
     */
    public SendRfc1123DateTime() {
    }

    /**
     * Initialization constructor.
     * @param  dateTime  ModelWithOptionalRfc1123DateTime value for dateTime.
     */
    public SendRfc1123DateTime(
            ModelWithOptionalRfc1123DateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime.
     * @return Returns the ModelWithOptionalRfc1123DateTime
     */
    @JsonGetter("dateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ModelWithOptionalRfc1123DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for ModelWithOptionalRfc1123DateTime
     */
    @JsonSetter("dateTime")
    public void setDateTime(ModelWithOptionalRfc1123DateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Converts this SendRfc1123DateTime into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendRfc1123DateTime [" + "dateTime=" + dateTime + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SendRfc1123DateTime.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendRfc1123DateTime.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateTime(getDateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link SendRfc1123DateTime}.
     */
    public static class Builder {
        private ModelWithOptionalRfc1123DateTime dateTime;



        /**
         * Setter for dateTime.
         * @param  dateTime  ModelWithOptionalRfc1123DateTime value for dateTime.
         * @return Builder
         */
        public Builder dateTime(ModelWithOptionalRfc1123DateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        /**
         * Builds a new {@link SendRfc1123DateTime} object using the set fields.
         * @return {@link SendRfc1123DateTime}
         */
        public SendRfc1123DateTime build() {
            return new SendRfc1123DateTime(dateTime);
        }
    }
}
