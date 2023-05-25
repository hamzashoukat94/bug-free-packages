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
 * This is a model class for UuidAsOptional type.
 */
public class UuidAsOptional
        extends BaseModel {
    private UUID uuid;

    /**
     * Default constructor.
     */
    public UuidAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  uuid  UUID value for uuid.
     */
    public UuidAsOptional(
            UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * Getter for Uuid.
     * @return Returns the UUID
     */
    @JsonGetter("uuid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Setter for Uuid.
     * @param uuid Value for UUID
     */
    @JsonSetter("uuid")
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * Converts this UuidAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UuidAsOptional [" + "uuid=" + uuid + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UuidAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UuidAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uuid(getUuid());
        return builder;
    }

    /**
     * Class to build instances of {@link UuidAsOptional}.
     */
    public static class Builder {
        private UUID uuid;



        /**
         * Setter for uuid.
         * @param  uuid  UUID value for uuid.
         * @return Builder
         */
        public Builder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * Builds a new {@link UuidAsOptional} object using the set fields.
         * @return {@link UuidAsOptional}
         */
        public UuidAsOptional build() {
            return new UuidAsOptional(uuid);
        }
    }
}
