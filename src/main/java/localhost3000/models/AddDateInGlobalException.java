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
 * This is a model class for AddDateInGlobalException type.
 */
public class AddDateInGlobalException
        extends BaseModel {
    private LocalDate value;
    private LocalDate value1;

    /**
     * Default constructor.
     */
    public AddDateInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  value  LocalDate value for value.
     * @param  value1  LocalDate value for value1.
     */
    public AddDateInGlobalException(
            LocalDate value,
            LocalDate value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the LocalDate
     */
    @JsonGetter("value")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for LocalDate
     */
    @JsonSetter("value")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setValue(LocalDate value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the LocalDate
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for LocalDate
     */
    @JsonSetter("value1")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setValue1(LocalDate value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddDateInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddDateInGlobalException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddDateInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddDateInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddDateInGlobalException}.
     */
    public static class Builder {
        private LocalDate value;
        private LocalDate value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  LocalDate value for value.
         */
        public Builder(LocalDate value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  LocalDate value for value.
         * @return Builder
         */
        public Builder value(LocalDate value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  LocalDate value for value1.
         * @return Builder
         */
        public Builder value1(LocalDate value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddDateInGlobalException} object using the set fields.
         * @return {@link AddDateInGlobalException}
         */
        public AddDateInGlobalException build() {
            return new AddDateInGlobalException(value, value1);
        }
    }
}
