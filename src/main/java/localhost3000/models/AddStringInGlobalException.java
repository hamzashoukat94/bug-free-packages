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
 * This is a model class for AddStringInGlobalException type.
 */
public class AddStringInGlobalException
        extends BaseModel {
    private String value;
    private String value1;

    /**
     * Default constructor.
     */
    public AddStringInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     * @param  value1  String value for value1.
     */
    public AddStringInGlobalException(
            String value,
            String value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the String
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for String
     */
    @JsonSetter("value1")
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddStringInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddStringInGlobalException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddStringInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddStringInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddStringInGlobalException}.
     */
    public static class Builder {
        private String value;
        private String value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  String value for value.
         */
        public Builder(String value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  String value for value1.
         * @return Builder
         */
        public Builder value1(String value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddStringInGlobalException} object using the set fields.
         * @return {@link AddStringInGlobalException}
         */
        public AddStringInGlobalException build() {
            return new AddStringInGlobalException(value, value1);
        }
    }
}
