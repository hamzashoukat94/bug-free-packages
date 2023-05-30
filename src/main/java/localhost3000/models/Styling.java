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
 * This is a model class for Styling type.
 */
public class Styling
        extends BaseModel {
    private String colorTheme;
    private String spinner;

    /**
     * Default constructor.
     */
    public Styling() {
    }

    /**
     * Initialization constructor.
     * @param  colorTheme  String value for colorTheme.
     * @param  spinner  String value for spinner.
     */
    public Styling(
            String colorTheme,
            String spinner) {
        this.colorTheme = colorTheme;
        this.spinner = spinner;
    }

    /**
     * Getter for ColorTheme.
     * @return Returns the String
     */
    @JsonGetter("colorTheme")
    public String getColorTheme() {
        return colorTheme;
    }

    /**
     * Setter for ColorTheme.
     * @param colorTheme Value for String
     */
    @JsonSetter("colorTheme")
    public void setColorTheme(String colorTheme) {
        this.colorTheme = colorTheme;
    }

    /**
     * Getter for Spinner.
     * @return Returns the String
     */
    @JsonGetter("spinner")
    public String getSpinner() {
        return spinner;
    }

    /**
     * Setter for Spinner.
     * @param spinner Value for String
     */
    @JsonSetter("spinner")
    public void setSpinner(String spinner) {
        this.spinner = spinner;
    }

    /**
     * Converts this Styling into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Styling [" + "colorTheme=" + colorTheme + ", spinner=" + spinner
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Styling.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Styling.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(colorTheme, spinner);
        return builder;
    }

    /**
     * Class to build instances of {@link Styling}.
     */
    public static class Builder {
        private String colorTheme;
        private String spinner;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  colorTheme  String value for colorTheme.
         * @param  spinner  String value for spinner.
         */
        public Builder(String colorTheme, String spinner) {
            this.colorTheme = colorTheme;
            this.spinner = spinner;
        }

        /**
         * Setter for colorTheme.
         * @param  colorTheme  String value for colorTheme.
         * @return Builder
         */
        public Builder colorTheme(String colorTheme) {
            this.colorTheme = colorTheme;
            return this;
        }

        /**
         * Setter for spinner.
         * @param  spinner  String value for spinner.
         * @return Builder
         */
        public Builder spinner(String spinner) {
            this.spinner = spinner;
            return this;
        }

        /**
         * Builds a new {@link Styling} object using the set fields.
         * @return {@link Styling}
         */
        public Styling build() {
            return new Styling(colorTheme, spinner);
        }
    }
}
