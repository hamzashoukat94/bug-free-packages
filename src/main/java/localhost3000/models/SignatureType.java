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
 * This is a model class for SignatureType type.
 */
public class SignatureType
        extends BaseModel {
    private String mechanism;
    private boolean onEacceptUseHandWrittenSignature;

    /**
     * Default constructor.
     */
    public SignatureType() {
    }

    /**
     * Initialization constructor.
     * @param  mechanism  String value for mechanism.
     * @param  onEacceptUseHandWrittenSignature  boolean value for onEacceptUseHandWrittenSignature.
     */
    public SignatureType(
            String mechanism,
            boolean onEacceptUseHandWrittenSignature) {
        this.mechanism = mechanism;
        this.onEacceptUseHandWrittenSignature = onEacceptUseHandWrittenSignature;
    }

    /**
     * Getter for Mechanism.
     * @return Returns the String
     */
    @JsonGetter("mechanism")
    public String getMechanism() {
        return mechanism;
    }

    /**
     * Setter for Mechanism.
     * @param mechanism Value for String
     */
    @JsonSetter("mechanism")
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * Getter for OnEacceptUseHandWrittenSignature.
     * @return Returns the boolean
     */
    @JsonGetter("onEacceptUseHandWrittenSignature")
    public boolean getOnEacceptUseHandWrittenSignature() {
        return onEacceptUseHandWrittenSignature;
    }

    /**
     * Setter for OnEacceptUseHandWrittenSignature.
     * @param onEacceptUseHandWrittenSignature Value for boolean
     */
    @JsonSetter("onEacceptUseHandWrittenSignature")
    public void setOnEacceptUseHandWrittenSignature(boolean onEacceptUseHandWrittenSignature) {
        this.onEacceptUseHandWrittenSignature = onEacceptUseHandWrittenSignature;
    }

    /**
     * Converts this SignatureType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SignatureType [" + "mechanism=" + mechanism + ", onEacceptUseHandWrittenSignature="
                + onEacceptUseHandWrittenSignature + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SignatureType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SignatureType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mechanism, onEacceptUseHandWrittenSignature);
        return builder;
    }

    /**
     * Class to build instances of {@link SignatureType}.
     */
    public static class Builder {
        private String mechanism;
        private boolean onEacceptUseHandWrittenSignature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mechanism  String value for mechanism.
         * @param  onEacceptUseHandWrittenSignature  boolean value for
         *         onEacceptUseHandWrittenSignature.
         */
        public Builder(String mechanism, boolean onEacceptUseHandWrittenSignature) {
            this.mechanism = mechanism;
            this.onEacceptUseHandWrittenSignature = onEacceptUseHandWrittenSignature;
        }

        /**
         * Setter for mechanism.
         * @param  mechanism  String value for mechanism.
         * @return Builder
         */
        public Builder mechanism(String mechanism) {
            this.mechanism = mechanism;
            return this;
        }

        /**
         * Setter for onEacceptUseHandWrittenSignature.
         * @param  onEacceptUseHandWrittenSignature  boolean value for
         *         onEacceptUseHandWrittenSignature.
         * @return Builder
         */
        public Builder onEacceptUseHandWrittenSignature(
                boolean onEacceptUseHandWrittenSignature) {
            this.onEacceptUseHandWrittenSignature = onEacceptUseHandWrittenSignature;
            return this;
        }

        /**
         * Builds a new {@link SignatureType} object using the set fields.
         * @return {@link SignatureType}
         */
        public SignatureType build() {
            return new SignatureType(mechanism, onEacceptUseHandWrittenSignature);
        }
    }
}
