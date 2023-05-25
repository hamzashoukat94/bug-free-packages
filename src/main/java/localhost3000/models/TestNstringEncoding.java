/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for TestNstringEncoding type.
 */
public class TestNstringEncoding
        extends BaseModel {
    private String field;
    private String name;

    /**
     * Default constructor.
     */
    public TestNstringEncoding() {
    }

    /**
     * Initialization constructor.
     * @param  field  String value for field.
     * @param  name  String value for name.
     */
    public TestNstringEncoding(
            String field,
            String name) {
        this.field = field;
        this.name = name;
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
     * Converts this TestNstringEncoding into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TestNstringEncoding [" + "field=" + field + ", name=" + name
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TestNstringEncoding.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TestNstringEncoding.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(field, name);
        return builder;
    }

    /**
     * Class to build instances of {@link TestNstringEncoding}.
     */
    public static class Builder {
        private String field;
        private String name;

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
         * Builds a new {@link TestNstringEncoding} object using the set fields.
         * @return {@link TestNstringEncoding}
         */
        public TestNstringEncoding build() {
            return new TestNstringEncoding(field, name);
        }
    }
}
