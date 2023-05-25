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
 * This is a model class for AddBooleanInGlobalException type.
 */
public class AddBooleanInGlobalException
        extends BaseModel {
    private boolean value;
    private Boolean value1;

    /**
     * Default constructor.
     */
    public AddBooleanInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  value  boolean value for value.
     * @param  value1  Boolean value for value1.
     */
    public AddBooleanInGlobalException(
            boolean value,
            Boolean value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the boolean
     */
    @JsonGetter("value")
    public boolean getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for boolean
     */
    @JsonSetter("value")
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Boolean
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Boolean
     */
    @JsonSetter("value1")
    public void setValue1(Boolean value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddBooleanInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddBooleanInGlobalException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddBooleanInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddBooleanInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddBooleanInGlobalException}.
     */
    public static class Builder {
        private boolean value;
        private Boolean value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  boolean value for value.
         */
        public Builder(boolean value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  boolean value for value.
         * @return Builder
         */
        public Builder value(boolean value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  Boolean value for value1.
         * @return Builder
         */
        public Builder value1(Boolean value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddBooleanInGlobalException} object using the set fields.
         * @return {@link AddBooleanInGlobalException}
         */
        public AddBooleanInGlobalException build() {
            return new AddBooleanInGlobalException(value, value1);
        }
    }
}
