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
 * This is a model class for DynamicAsOptional type.
 */
public class DynamicAsOptional
        extends BaseModel {
    private Object dynamic;

    /**
     * Default constructor.
     */
    public DynamicAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  dynamic  Object value for dynamic.
     */
    public DynamicAsOptional(
            Object dynamic) {
        this.dynamic = dynamic;
    }

    /**
     * Getter for Dynamic.
     * @return Returns the Object
     */
    @JsonGetter("dynamic")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDynamic() {
        return dynamic;
    }

    /**
     * Setter for Dynamic.
     * @param dynamic Value for Object
     */
    @JsonSetter("dynamic")
    public void setDynamic(Object dynamic) {
        this.dynamic = dynamic;
    }

    /**
     * Converts this DynamicAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DynamicAsOptional [" + "dynamic=" + dynamic + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DynamicAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DynamicAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dynamic(getDynamic());
        return builder;
    }

    /**
     * Class to build instances of {@link DynamicAsOptional}.
     */
    public static class Builder {
        private Object dynamic;



        /**
         * Setter for dynamic.
         * @param  dynamic  Object value for dynamic.
         * @return Builder
         */
        public Builder dynamic(Object dynamic) {
            this.dynamic = dynamic;
            return this;
        }

        /**
         * Builds a new {@link DynamicAsOptional} object using the set fields.
         * @return {@link DynamicAsOptional}
         */
        public DynamicAsOptional build() {
            return new DynamicAsOptional(dynamic);
        }
    }
}
