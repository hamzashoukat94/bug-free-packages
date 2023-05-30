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
 * This is a model class for ContactDetails type.
 */
public class ContactDetails
        extends BaseModel {
    private String email;
    private String url;

    /**
     * Default constructor.
     */
    public ContactDetails() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  url  String value for url.
     */
    public ContactDetails(
            String email,
            String url) {
        this.email = email;
        this.url = url;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this ContactDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ContactDetails [" + "email=" + email + ", url=" + url + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ContactDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ContactDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(email, url);
        return builder;
    }

    /**
     * Class to build instances of {@link ContactDetails}.
     */
    public static class Builder {
        private String email;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  email  String value for email.
         * @param  url  String value for url.
         */
        public Builder(String email, String url) {
            this.email = email;
            this.url = url;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link ContactDetails} object using the set fields.
         * @return {@link ContactDetails}
         */
        public ContactDetails build() {
            return new ContactDetails(email, url);
        }
    }
}
