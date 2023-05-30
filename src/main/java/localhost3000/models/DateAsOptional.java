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
import java.time.LocalDate;
import localhost3000.DateTimeHelper;

/**
 * This is a model class for DateAsOptional type.
 */
public class DateAsOptional
        extends BaseModel {
    private LocalDate date;

    /**
     * Default constructor.
     */
    public DateAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  date  LocalDate value for date.
     */
    public DateAsOptional(
            LocalDate date) {
        this.date = date;
    }

    /**
     * Getter for Date.
     * @return Returns the LocalDate
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * @param date Value for LocalDate
     */
    @JsonSetter("date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Converts this DateAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DateAsOptional [" + "date=" + date + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DateAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DateAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .date(getDate());
        return builder;
    }

    /**
     * Class to build instances of {@link DateAsOptional}.
     */
    public static class Builder {
        private LocalDate date;



        /**
         * Setter for date.
         * @param  date  LocalDate value for date.
         * @return Builder
         */
        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        /**
         * Builds a new {@link DateAsOptional} object using the set fields.
         * @return {@link DateAsOptional}
         */
        public DateAsOptional build() {
            return new DateAsOptional(date);
        }
    }
}
