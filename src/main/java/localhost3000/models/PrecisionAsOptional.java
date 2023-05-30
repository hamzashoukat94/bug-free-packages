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
 * This is a model class for PrecisionAsOptional type.
 */
public class PrecisionAsOptional
        extends BaseModel {
    private Double precision;

    /**
     * Default constructor.
     */
    public PrecisionAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  precision  Double value for precision.
     */
    public PrecisionAsOptional(
            Double precision) {
        this.precision = precision;
    }

    /**
     * Getter for Precision.
     * @return Returns the Double
     */
    @JsonGetter("precision")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPrecision() {
        return precision;
    }

    /**
     * Setter for Precision.
     * @param precision Value for Double
     */
    @JsonSetter("precision")
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * Converts this PrecisionAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrecisionAsOptional [" + "precision=" + precision + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrecisionAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrecisionAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .precision(getPrecision());
        return builder;
    }

    /**
     * Class to build instances of {@link PrecisionAsOptional}.
     */
    public static class Builder {
        private Double precision;



        /**
         * Setter for precision.
         * @param  precision  Double value for precision.
         * @return Builder
         */
        public Builder precision(Double precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Builds a new {@link PrecisionAsOptional} object using the set fields.
         * @return {@link PrecisionAsOptional}
         */
        public PrecisionAsOptional build() {
            return new PrecisionAsOptional(precision);
        }
    }
}
