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
 * This is a model class for Attributes type.
 */
public class Attributes
        extends BaseModel {
    private boolean exclusiveMaximum;
    private boolean exclusiveMinimum;
    private String id;

    /**
     * Default constructor.
     */
    public Attributes() {
    }

    /**
     * Initialization constructor.
     * @param  exclusiveMaximum  boolean value for exclusiveMaximum.
     * @param  exclusiveMinimum  boolean value for exclusiveMinimum.
     * @param  id  String value for id.
     */
    public Attributes(
            boolean exclusiveMaximum,
            boolean exclusiveMinimum,
            String id) {
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.id = id;
    }

    /**
     * Getter for ExclusiveMaximum.
     * @return Returns the boolean
     */
    @JsonGetter("exclusiveMaximum")
    public boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    /**
     * Setter for ExclusiveMaximum.
     * @param exclusiveMaximum Value for boolean
     */
    @JsonSetter("exclusiveMaximum")
    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    /**
     * Getter for ExclusiveMinimum.
     * @return Returns the boolean
     */
    @JsonGetter("exclusiveMinimum")
    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    /**
     * Setter for ExclusiveMinimum.
     * @param exclusiveMinimum Value for boolean
     */
    @JsonSetter("exclusiveMinimum")
    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this Attributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Attributes [" + "exclusiveMaximum=" + exclusiveMaximum + ", exclusiveMinimum="
                + exclusiveMinimum + ", id=" + id + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Attributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Attributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(exclusiveMaximum, exclusiveMinimum, id);
        return builder;
    }

    /**
     * Class to build instances of {@link Attributes}.
     */
    public static class Builder {
        private boolean exclusiveMaximum;
        private boolean exclusiveMinimum;
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  exclusiveMaximum  boolean value for exclusiveMaximum.
         * @param  exclusiveMinimum  boolean value for exclusiveMinimum.
         * @param  id  String value for id.
         */
        public Builder(boolean exclusiveMaximum, boolean exclusiveMinimum, String id) {
            this.exclusiveMaximum = exclusiveMaximum;
            this.exclusiveMinimum = exclusiveMinimum;
            this.id = id;
        }

        /**
         * Setter for exclusiveMaximum.
         * @param  exclusiveMaximum  boolean value for exclusiveMaximum.
         * @return Builder
         */
        public Builder exclusiveMaximum(boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        /**
         * Setter for exclusiveMinimum.
         * @param  exclusiveMinimum  boolean value for exclusiveMinimum.
         * @return Builder
         */
        public Builder exclusiveMinimum(boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link Attributes} object using the set fields.
         * @return {@link Attributes}
         */
        public Attributes build() {
            return new Attributes(exclusiveMaximum, exclusiveMinimum, id);
        }
    }
}
