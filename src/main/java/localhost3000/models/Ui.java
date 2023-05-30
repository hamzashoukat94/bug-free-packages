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
 * This is a model class for Ui type.
 */
public class Ui
        extends BaseModel {
    private Dialogs dialogs;
    private LanguageEnum language;
    private Styling styling;

    /**
     * Default constructor.
     */
    public Ui() {
    }

    /**
     * Initialization constructor.
     * @param  dialogs  Dialogs value for dialogs.
     * @param  language  LanguageEnum value for language.
     * @param  styling  Styling value for styling.
     */
    public Ui(
            Dialogs dialogs,
            LanguageEnum language,
            Styling styling) {
        this.dialogs = dialogs;
        this.language = language;
        this.styling = styling;
    }

    /**
     * Getter for Dialogs.
     * @return Returns the Dialogs
     */
    @JsonGetter("dialogs")
    public Dialogs getDialogs() {
        return dialogs;
    }

    /**
     * Setter for Dialogs.
     * @param dialogs Value for Dialogs
     */
    @JsonSetter("dialogs")
    public void setDialogs(Dialogs dialogs) {
        this.dialogs = dialogs;
    }

    /**
     * Getter for Language.
     * @return Returns the LanguageEnum
     */
    @JsonGetter("language")
    public LanguageEnum getLanguage() {
        return language;
    }

    /**
     * Setter for Language.
     * @param language Value for LanguageEnum
     */
    @JsonSetter("language")
    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    /**
     * Getter for Styling.
     * @return Returns the Styling
     */
    @JsonGetter("styling")
    public Styling getStyling() {
        return styling;
    }

    /**
     * Setter for Styling.
     * @param styling Value for Styling
     */
    @JsonSetter("styling")
    public void setStyling(Styling styling) {
        this.styling = styling;
    }

    /**
     * Converts this Ui into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Ui [" + "dialogs=" + dialogs + ", language=" + language + ", styling=" + styling
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Ui.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Ui.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dialogs, language, styling);
        return builder;
    }

    /**
     * Class to build instances of {@link Ui}.
     */
    public static class Builder {
        private Dialogs dialogs;
        private LanguageEnum language;
        private Styling styling;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dialogs  Dialogs value for dialogs.
         * @param  language  LanguageEnum value for language.
         * @param  styling  Styling value for styling.
         */
        public Builder(Dialogs dialogs, LanguageEnum language, Styling styling) {
            this.dialogs = dialogs;
            this.language = language;
            this.styling = styling;
        }

        /**
         * Setter for dialogs.
         * @param  dialogs  Dialogs value for dialogs.
         * @return Builder
         */
        public Builder dialogs(Dialogs dialogs) {
            this.dialogs = dialogs;
            return this;
        }

        /**
         * Setter for language.
         * @param  language  LanguageEnum value for language.
         * @return Builder
         */
        public Builder language(LanguageEnum language) {
            this.language = language;
            return this;
        }

        /**
         * Setter for styling.
         * @param  styling  Styling value for styling.
         * @return Builder
         */
        public Builder styling(Styling styling) {
            this.styling = styling;
            return this;
        }

        /**
         * Builds a new {@link Ui} object using the set fields.
         * @return {@link Ui}
         */
        public Ui build() {
            return new Ui(dialogs, language, styling);
        }
    }
}
