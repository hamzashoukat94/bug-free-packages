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
 * This is a model class for QueryParameter type.
 */
public class QueryParameter
        extends BaseModel {
    private String key;

    /**
     * Default constructor.
     */
    public QueryParameter() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     */
    public QueryParameter(
            String key) {
        this.key = key;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Converts this QueryParameter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QueryParameter [" + "key=" + key + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link QueryParameter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QueryParameter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .key(getKey());
        return builder;
    }

    /**
     * Class to build instances of {@link QueryParameter}.
     */
    public static class Builder {
        private String key;



        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds a new {@link QueryParameter} object using the set fields.
         * @return {@link QueryParameter}
         */
        public QueryParameter build() {
            return new QueryParameter(key);
        }
    }
}
