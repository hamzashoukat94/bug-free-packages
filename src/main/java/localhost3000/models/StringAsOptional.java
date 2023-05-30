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
 * This is a model class for StringAsOptional type.
 */
public class StringAsOptional
        extends BaseModel {
    private String string;

    /**
     * Default constructor.
     */
    public StringAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  string  String value for string.
     */
    public StringAsOptional(
            String string) {
        this.string = string;
    }

    /**
     * Getter for MString.
     * @return Returns the String
     */
    @JsonGetter("string")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMString() {
        return string;
    }

    /**
     * Setter for MString.
     * @param string Value for String
     */
    @JsonSetter("string")
    public void setMString(String string) {
        this.string = string;
    }

    /**
     * Converts this StringAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StringAsOptional [" + "string=" + string + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link StringAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StringAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .string(getMString());
        return builder;
    }

    /**
     * Class to build instances of {@link StringAsOptional}.
     */
    public static class Builder {
        private String string;



        /**
         * Setter for string.
         * @param  string  String value for string.
         * @return Builder
         */
        public Builder string(String string) {
            this.string = string;
            return this;
        }

        /**
         * Builds a new {@link StringAsOptional} object using the set fields.
         * @return {@link StringAsOptional}
         */
        public StringAsOptional build() {
            return new StringAsOptional(string);
        }
    }
}
