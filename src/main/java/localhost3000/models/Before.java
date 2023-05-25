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
 * This is a model class for Before type.
 */
public class Before
        extends BaseModel {
    private boolean useCheckBox;
    private String title;
    private String message;

    /**
     * Default constructor.
     */
    public Before() {
    }

    /**
     * Initialization constructor.
     * @param  useCheckBox  boolean value for useCheckBox.
     * @param  title  String value for title.
     * @param  message  String value for message.
     */
    public Before(
            boolean useCheckBox,
            String title,
            String message) {
        this.useCheckBox = useCheckBox;
        this.title = title;
        this.message = message;
    }

    /**
     * Getter for UseCheckBox.
     * @return Returns the boolean
     */
    @JsonGetter("useCheckBox")
    public boolean getUseCheckBox() {
        return useCheckBox;
    }

    /**
     * Setter for UseCheckBox.
     * @param useCheckBox Value for boolean
     */
    @JsonSetter("useCheckBox")
    public void setUseCheckBox(boolean useCheckBox) {
        this.useCheckBox = useCheckBox;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this Before into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Before [" + "useCheckBox=" + useCheckBox + ", title=" + title + ", message="
                + message + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Before.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Before.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(useCheckBox, title, message);
        return builder;
    }

    /**
     * Class to build instances of {@link Before}.
     */
    public static class Builder {
        private boolean useCheckBox;
        private String title;
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  useCheckBox  boolean value for useCheckBox.
         * @param  title  String value for title.
         * @param  message  String value for message.
         */
        public Builder(boolean useCheckBox, String title, String message) {
            this.useCheckBox = useCheckBox;
            this.title = title;
            this.message = message;
        }

        /**
         * Setter for useCheckBox.
         * @param  useCheckBox  boolean value for useCheckBox.
         * @return Builder
         */
        public Builder useCheckBox(boolean useCheckBox) {
            this.useCheckBox = useCheckBox;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link Before} object using the set fields.
         * @return {@link Before}
         */
        public Before build() {
            return new Before(useCheckBox, title, message);
        }
    }
}
