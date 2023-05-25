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
 * This is a model class for Validate type.
 */
public class Validate
        extends BaseModel {
    private String field;
    private String name;
    private String address;

    /**
     * Default constructor.
     */
    public Validate() {
    }

    /**
     * Initialization constructor.
     * @param  field  String value for field.
     * @param  name  String value for name.
     * @param  address  String value for address.
     */
    public Validate(
            String field,
            String name,
            String address) {
        this.field = field;
        this.name = name;
        this.address = address;
    }

    /**
     * Getter for Field.
     * @return Returns the String
     */
    @JsonGetter("field")
    public String getField() {
        return field;
    }

    /**
     * Setter for Field.
     * @param field Value for String
     */
    @JsonSetter("field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Address.
     * @return Returns the String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Converts this Validate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Validate [" + "field=" + field + ", name=" + name + ", address=" + address
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Validate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Validate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(field, name)
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Validate}.
     */
    public static class Builder {
        private String field;
        private String name;
        private String address;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  field  String value for field.
         * @param  name  String value for name.
         */
        public Builder(String field, String name) {
            this.field = field;
            this.name = name;
        }

        /**
         * Setter for field.
         * @param  field  String value for field.
         * @return Builder
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Validate} object using the set fields.
         * @return {@link Validate}
         */
        public Validate build() {
            return new Validate(field, name, address);
        }
    }
}
