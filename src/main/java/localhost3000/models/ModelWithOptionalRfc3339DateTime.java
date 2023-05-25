/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import localhost3000.DateTimeHelper;

/**
 * This is a model class for ModelWithOptionalRfc3339DateTime type.
 */
public class ModelWithOptionalRfc3339DateTime
        extends BaseModel {
    private LocalDateTime dateTime;

    /**
     * Default constructor.
     */
    public ModelWithOptionalRfc3339DateTime() {
    }

    /**
     * Initialization constructor.
     * @param  dateTime  LocalDateTime value for dateTime.
     */
    public ModelWithOptionalRfc3339DateTime(
            LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for LocalDateTime
     */
    @JsonSetter("dateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Converts this ModelWithOptionalRfc3339DateTime into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ModelWithOptionalRfc3339DateTime [" + "dateTime=" + dateTime
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ModelWithOptionalRfc3339DateTime.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ModelWithOptionalRfc3339DateTime.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateTime(getDateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link ModelWithOptionalRfc3339DateTime}.
     */
    public static class Builder {
        private LocalDateTime dateTime;



        /**
         * Setter for dateTime.
         * @param  dateTime  LocalDateTime value for dateTime.
         * @return Builder
         */
        public Builder dateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        /**
         * Builds a new {@link ModelWithOptionalRfc3339DateTime} object using the set fields.
         * @return {@link ModelWithOptionalRfc3339DateTime}
         */
        public ModelWithOptionalRfc3339DateTime build() {
            return new ModelWithOptionalRfc3339DateTime(dateTime);
        }
    }
}
