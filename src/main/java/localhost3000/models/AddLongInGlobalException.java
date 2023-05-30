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
 * This is a model class for AddLongInGlobalException type.
 */
public class AddLongInGlobalException
        extends BaseModel {
    private long value;
    private Long value1;

    /**
     * Default constructor.
     */
    public AddLongInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  value  long value for value.
     * @param  value1  Long value for value1.
     */
    public AddLongInGlobalException(
            long value,
            Long value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the long
     */
    @JsonGetter("value")
    public long getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for long
     */
    @JsonSetter("value")
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Long
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Long
     */
    @JsonSetter("value1")
    public void setValue1(Long value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddLongInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddLongInGlobalException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddLongInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddLongInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddLongInGlobalException}.
     */
    public static class Builder {
        private long value;
        private Long value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  long value for value.
         */
        public Builder(long value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  long value for value.
         * @return Builder
         */
        public Builder value(long value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  Long value for value1.
         * @return Builder
         */
        public Builder value1(Long value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddLongInGlobalException} object using the set fields.
         * @return {@link AddLongInGlobalException}
         */
        public AddLongInGlobalException build() {
            return new AddLongInGlobalException(value, value1);
        }
    }
}
