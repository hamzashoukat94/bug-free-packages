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
 * This is a model class for RedirectSettings type.
 */
public class RedirectSettings
        extends BaseModel {
    private String redirectMode;

    /**
     * Default constructor.
     */
    public RedirectSettings() {
    }

    /**
     * Initialization constructor.
     * @param  redirectMode  String value for redirectMode.
     */
    public RedirectSettings(
            String redirectMode) {
        this.redirectMode = redirectMode;
    }

    /**
     * Getter for RedirectMode.
     * @return Returns the String
     */
    @JsonGetter("redirectMode")
    public String getRedirectMode() {
        return redirectMode;
    }

    /**
     * Setter for RedirectMode.
     * @param redirectMode Value for String
     */
    @JsonSetter("redirectMode")
    public void setRedirectMode(String redirectMode) {
        this.redirectMode = redirectMode;
    }

    /**
     * Converts this RedirectSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RedirectSettings [" + "redirectMode=" + redirectMode + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RedirectSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RedirectSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(redirectMode);
        return builder;
    }

    /**
     * Class to build instances of {@link RedirectSettings}.
     */
    public static class Builder {
        private String redirectMode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  redirectMode  String value for redirectMode.
         */
        public Builder(String redirectMode) {
            this.redirectMode = redirectMode;
        }

        /**
         * Setter for redirectMode.
         * @param  redirectMode  String value for redirectMode.
         * @return Builder
         */
        public Builder redirectMode(String redirectMode) {
            this.redirectMode = redirectMode;
            return this;
        }

        /**
         * Builds a new {@link RedirectSettings} object using the set fields.
         * @return {@link RedirectSettings}
         */
        public RedirectSettings build() {
            return new RedirectSettings(redirectMode);
        }
    }
}
