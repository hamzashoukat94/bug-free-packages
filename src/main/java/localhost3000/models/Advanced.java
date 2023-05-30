/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for Advanced type.
 */
public class Advanced
        extends BaseModel {
    private List<String> tags;
    private int attachments;
    private int requiredSignatures;
    private boolean getSocialSecurityNumber;
    private TimeToLive timeToLive;

    /**
     * Default constructor.
     */
    public Advanced() {
    }

    /**
     * Initialization constructor.
     * @param  tags  List of String value for tags.
     * @param  attachments  int value for attachments.
     * @param  requiredSignatures  int value for requiredSignatures.
     * @param  getSocialSecurityNumber  boolean value for getSocialSecurityNumber.
     * @param  timeToLive  TimeToLive value for timeToLive.
     */
    public Advanced(
            List<String> tags,
            int attachments,
            int requiredSignatures,
            boolean getSocialSecurityNumber,
            TimeToLive timeToLive) {
        this.tags = tags;
        this.attachments = attachments;
        this.requiredSignatures = requiredSignatures;
        this.getSocialSecurityNumber = getSocialSecurityNumber;
        this.timeToLive = timeToLive;
    }

    /**
     * Getter for Tags.
     * @return Returns the List of String
     */
    @JsonGetter("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Getter for Attachments.
     * @return Returns the int
     */
    @JsonGetter("attachments")
    public int getAttachments() {
        return attachments;
    }

    /**
     * Setter for Attachments.
     * @param attachments Value for int
     */
    @JsonSetter("attachments")
    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }

    /**
     * Getter for RequiredSignatures.
     * @return Returns the int
     */
    @JsonGetter("requiredSignatures")
    public int getRequiredSignatures() {
        return requiredSignatures;
    }

    /**
     * Setter for RequiredSignatures.
     * @param requiredSignatures Value for int
     */
    @JsonSetter("requiredSignatures")
    public void setRequiredSignatures(int requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    /**
     * Getter for GetSocialSecurityNumber.
     * @return Returns the boolean
     */
    @JsonGetter("getSocialSecurityNumber")
    public boolean getGetSocialSecurityNumber() {
        return getSocialSecurityNumber;
    }

    /**
     * Setter for GetSocialSecurityNumber.
     * @param getSocialSecurityNumber Value for boolean
     */
    @JsonSetter("getSocialSecurityNumber")
    public void setGetSocialSecurityNumber(boolean getSocialSecurityNumber) {
        this.getSocialSecurityNumber = getSocialSecurityNumber;
    }

    /**
     * Getter for TimeToLive.
     * @return Returns the TimeToLive
     */
    @JsonGetter("timeToLive")
    public TimeToLive getTimeToLive() {
        return timeToLive;
    }

    /**
     * Setter for TimeToLive.
     * @param timeToLive Value for TimeToLive
     */
    @JsonSetter("timeToLive")
    public void setTimeToLive(TimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * Converts this Advanced into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Advanced [" + "tags=" + tags + ", attachments=" + attachments
                + ", requiredSignatures=" + requiredSignatures + ", getSocialSecurityNumber="
                + getSocialSecurityNumber + ", timeToLive=" + timeToLive + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Advanced.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Advanced.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tags, attachments, requiredSignatures,
                getSocialSecurityNumber, timeToLive);
        return builder;
    }

    /**
     * Class to build instances of {@link Advanced}.
     */
    public static class Builder {
        private List<String> tags;
        private int attachments;
        private int requiredSignatures;
        private boolean getSocialSecurityNumber;
        private TimeToLive timeToLive;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tags  List of String value for tags.
         * @param  attachments  int value for attachments.
         * @param  requiredSignatures  int value for requiredSignatures.
         * @param  getSocialSecurityNumber  boolean value for getSocialSecurityNumber.
         * @param  timeToLive  TimeToLive value for timeToLive.
         */
        public Builder(List<String> tags, int attachments, int requiredSignatures,
                boolean getSocialSecurityNumber, TimeToLive timeToLive) {
            this.tags = tags;
            this.attachments = attachments;
            this.requiredSignatures = requiredSignatures;
            this.getSocialSecurityNumber = getSocialSecurityNumber;
            this.timeToLive = timeToLive;
        }

        /**
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Setter for attachments.
         * @param  attachments  int value for attachments.
         * @return Builder
         */
        public Builder attachments(int attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * Setter for requiredSignatures.
         * @param  requiredSignatures  int value for requiredSignatures.
         * @return Builder
         */
        public Builder requiredSignatures(int requiredSignatures) {
            this.requiredSignatures = requiredSignatures;
            return this;
        }

        /**
         * Setter for getSocialSecurityNumber.
         * @param  getSocialSecurityNumber  boolean value for getSocialSecurityNumber.
         * @return Builder
         */
        public Builder getSocialSecurityNumber(boolean getSocialSecurityNumber) {
            this.getSocialSecurityNumber = getSocialSecurityNumber;
            return this;
        }

        /**
         * Setter for timeToLive.
         * @param  timeToLive  TimeToLive value for timeToLive.
         * @return Builder
         */
        public Builder timeToLive(TimeToLive timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }

        /**
         * Builds a new {@link Advanced} object using the set fields.
         * @return {@link Advanced}
         */
        public Advanced build() {
            return new Advanced(tags, attachments, requiredSignatures, getSocialSecurityNumber,
                    timeToLive);
        }
    }
}
