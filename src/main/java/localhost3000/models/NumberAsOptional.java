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
 * This is a model class for NumberAsOptional type.
 */
public class NumberAsOptional
        extends BaseModel {
    private Integer number;

    /**
     * Default constructor.
     */
    public NumberAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  number  Integer value for number.
     */
    public NumberAsOptional(
            Integer number) {
        this.number = number;
    }

    /**
     * Getter for Number.
     * @return Returns the Integer
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for Integer
     */
    @JsonSetter("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Converts this NumberAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NumberAsOptional [" + "number=" + number + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link NumberAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NumberAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .number(getNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link NumberAsOptional}.
     */
    public static class Builder {
        private Integer number;



        /**
         * Setter for number.
         * @param  number  Integer value for number.
         * @return Builder
         */
        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        /**
         * Builds a new {@link NumberAsOptional} object using the set fields.
         * @return {@link NumberAsOptional}
         */
        public NumberAsOptional build() {
            return new NumberAsOptional(number);
        }
    }
}
