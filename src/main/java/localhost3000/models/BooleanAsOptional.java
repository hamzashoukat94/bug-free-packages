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
 * This is a model class for BooleanAsOptional type.
 */
public class BooleanAsOptional
        extends BaseModel {
    private Boolean mBoolean;

    /**
     * Default constructor.
     */
    public BooleanAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  mBoolean  Boolean value for mBoolean.
     */
    public BooleanAsOptional(
            Boolean mBoolean) {
        this.mBoolean = mBoolean;
    }

    /**
     * Getter for MBoolean.
     * @return Returns the Boolean
     */
    @JsonGetter("boolean")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMBoolean() {
        return mBoolean;
    }

    /**
     * Setter for MBoolean.
     * @param mBoolean Value for Boolean
     */
    @JsonSetter("boolean")
    public void setMBoolean(Boolean mBoolean) {
        this.mBoolean = mBoolean;
    }

    /**
     * Converts this BooleanAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BooleanAsOptional [" + "mBoolean=" + mBoolean + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BooleanAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BooleanAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mBoolean(getMBoolean());
        return builder;
    }

    /**
     * Class to build instances of {@link BooleanAsOptional}.
     */
    public static class Builder {
        private Boolean mBoolean;



        /**
         * Setter for mBoolean.
         * @param  mBoolean  Boolean value for mBoolean.
         * @return Builder
         */
        public Builder mBoolean(Boolean mBoolean) {
            this.mBoolean = mBoolean;
            return this;
        }

        /**
         * Builds a new {@link BooleanAsOptional} object using the set fields.
         * @return {@link BooleanAsOptional}
         */
        public BooleanAsOptional build() {
            return new BooleanAsOptional(mBoolean);
        }
    }
}
