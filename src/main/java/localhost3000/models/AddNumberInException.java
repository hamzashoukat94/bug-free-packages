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
 * This is a model class for AddNumberInException type.
 */
public class AddNumberInException
        extends BaseModel {
    private int value;
    private Integer value1;

    /**
     * Default constructor.
     */
    public AddNumberInException() {
    }

    /**
     * Initialization constructor.
     * @param  value  int value for value.
     * @param  value1  Integer value for value1.
     */
    public AddNumberInException(
            int value,
            Integer value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the int
     */
    @JsonGetter("value")
    public int getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for int
     */
    @JsonSetter("value")
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Integer
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Integer
     */
    @JsonSetter("value1")
    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddNumberInException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddNumberInException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddNumberInException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddNumberInException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddNumberInException}.
     */
    public static class Builder {
        private int value;
        private Integer value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  int value for value.
         */
        public Builder(int value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  int value for value.
         * @return Builder
         */
        public Builder value(int value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  Integer value for value1.
         * @return Builder
         */
        public Builder value1(Integer value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddNumberInException} object using the set fields.
         * @return {@link AddNumberInException}
         */
        public AddNumberInException build() {
            return new AddNumberInException(value, value1);
        }
    }
}
