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
 * This is a model class for AddDynamicInException type.
 */
public class AddDynamicInException
        extends BaseModel {
    private Object value;
    private Object value1;

    /**
     * Default constructor.
     */
    public AddDynamicInException() {
    }

    /**
     * Initialization constructor.
     * @param  value  Object value for value.
     * @param  value1  Object value for value1.
     */
    public AddDynamicInException(
            Object value,
            Object value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the Object
     */
    @JsonGetter("value")
    public Object getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for Object
     */
    @JsonSetter("value")
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Object
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Object
     */
    @JsonSetter("value1")
    public void setValue1(Object value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddDynamicInException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddDynamicInException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddDynamicInException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddDynamicInException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddDynamicInException}.
     */
    public static class Builder {
        private Object value;
        private Object value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  Object value for value.
         */
        public Builder(Object value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  Object value for value.
         * @return Builder
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  Object value for value1.
         * @return Builder
         */
        public Builder value1(Object value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddDynamicInException} object using the set fields.
         * @return {@link AddDynamicInException}
         */
        public AddDynamicInException build() {
            return new AddDynamicInException(value, value1);
        }
    }
}
