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
 * This is a model class for SendRfc339DateTime type.
 */
public class SendRfc339DateTime
        extends BaseModel {
    private ModelWithOptionalRfc3339DateTime dateTime;

    /**
     * Default constructor.
     */
    public SendRfc339DateTime() {
    }

    /**
     * Initialization constructor.
     * @param  dateTime  ModelWithOptionalRfc3339DateTime value for dateTime.
     */
    public SendRfc339DateTime(
            ModelWithOptionalRfc3339DateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime.
     * @return Returns the ModelWithOptionalRfc3339DateTime
     */
    @JsonGetter("dateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ModelWithOptionalRfc3339DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for ModelWithOptionalRfc3339DateTime
     */
    @JsonSetter("dateTime")
    public void setDateTime(ModelWithOptionalRfc3339DateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Converts this SendRfc339DateTime into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendRfc339DateTime [" + "dateTime=" + dateTime + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SendRfc339DateTime.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendRfc339DateTime.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateTime(getDateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link SendRfc339DateTime}.
     */
    public static class Builder {
        private ModelWithOptionalRfc3339DateTime dateTime;



        /**
         * Setter for dateTime.
         * @param  dateTime  ModelWithOptionalRfc3339DateTime value for dateTime.
         * @return Builder
         */
        public Builder dateTime(ModelWithOptionalRfc3339DateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        /**
         * Builds a new {@link SendRfc339DateTime} object using the set fields.
         * @return {@link SendRfc339DateTime}
         */
        public SendRfc339DateTime build() {
            return new SendRfc339DateTime(dateTime);
        }
    }
}
