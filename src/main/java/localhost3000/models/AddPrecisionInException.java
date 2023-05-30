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
 * This is a model class for AddPrecisionInException type.
 */
public class AddPrecisionInException
        extends BaseModel {
    private double value;
    private Double value1;

    /**
     * Default constructor.
     */
    public AddPrecisionInException() {
    }

    /**
     * Initialization constructor.
     * @param  value  double value for value.
     * @param  value1  Double value for value1.
     */
    public AddPrecisionInException(
            double value,
            Double value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the double
     */
    @JsonGetter("value")
    public double getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for double
     */
    @JsonSetter("value")
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the Double
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for Double
     */
    @JsonSetter("value1")
    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddPrecisionInException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddPrecisionInException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddPrecisionInException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddPrecisionInException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddPrecisionInException}.
     */
    public static class Builder {
        private double value;
        private Double value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  double value for value.
         */
        public Builder(double value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  double value for value.
         * @return Builder
         */
        public Builder value(double value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  Double value for value1.
         * @return Builder
         */
        public Builder value1(Double value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddPrecisionInException} object using the set fields.
         * @return {@link AddPrecisionInException}
         */
        public AddPrecisionInException build() {
            return new AddPrecisionInException(value, value1);
        }
    }
}
