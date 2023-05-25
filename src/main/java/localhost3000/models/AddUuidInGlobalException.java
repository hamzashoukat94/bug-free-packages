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
import java.util.UUID;

/**
 * This is a model class for AddUuidInGlobalException type.
 */
public class AddUuidInGlobalException
        extends BaseModel {
    private UUID value;
    private UUID value1;

    /**
     * Default constructor.
     */
    public AddUuidInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  value  UUID value for value.
     * @param  value1  UUID value for value1.
     */
    public AddUuidInGlobalException(
            UUID value,
            UUID value1) {
        this.value = value;
        this.value1 = value1;
    }

    /**
     * Getter for Value.
     * @return Returns the UUID
     */
    @JsonGetter("value")
    public UUID getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for UUID
     */
    @JsonSetter("value")
    public void setValue(UUID value) {
        this.value = value;
    }

    /**
     * Getter for Value1.
     * @return Returns the UUID
     */
    @JsonGetter("value1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getValue1() {
        return value1;
    }

    /**
     * Setter for Value1.
     * @param value1 Value for UUID
     */
    @JsonSetter("value1")
    public void setValue1(UUID value1) {
        this.value1 = value1;
    }

    /**
     * Converts this AddUuidInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddUuidInGlobalException [" + "value=" + value + ", value1=" + value1
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddUuidInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddUuidInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value)
                .value1(getValue1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddUuidInGlobalException}.
     */
    public static class Builder {
        private UUID value;
        private UUID value1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  UUID value for value.
         */
        public Builder(UUID value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  UUID value for value.
         * @return Builder
         */
        public Builder value(UUID value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for value1.
         * @param  value1  UUID value for value1.
         * @return Builder
         */
        public Builder value1(UUID value1) {
            this.value1 = value1;
            return this;
        }

        /**
         * Builds a new {@link AddUuidInGlobalException} object using the set fields.
         * @return {@link AddUuidInGlobalException}
         */
        public AddUuidInGlobalException build() {
            return new AddUuidInGlobalException(value, value1);
        }
    }
}
