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
 * This is a model class for Glossary type.
 */
public class Glossary
        extends BaseModel {
    private String title;
    private GlossDiv glossDiv;

    /**
     * Default constructor.
     */
    public Glossary() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  glossDiv  GlossDiv value for glossDiv.
     */
    public Glossary(
            String title,
            GlossDiv glossDiv) {
        this.title = title;
        this.glossDiv = glossDiv;
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
     * Getter for GlossDiv.
     * @return Returns the GlossDiv
     */
    @JsonGetter("GlossDiv")
    public GlossDiv getGlossDiv() {
        return glossDiv;
    }

    /**
     * Setter for GlossDiv.
     * @param glossDiv Value for GlossDiv
     */
    @JsonSetter("GlossDiv")
    public void setGlossDiv(GlossDiv glossDiv) {
        this.glossDiv = glossDiv;
    }

    /**
     * Converts this Glossary into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Glossary [" + "title=" + title + ", glossDiv=" + glossDiv
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Glossary.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Glossary.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, glossDiv);
        return builder;
    }

    /**
     * Class to build instances of {@link Glossary}.
     */
    public static class Builder {
        private String title;
        private GlossDiv glossDiv;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  glossDiv  GlossDiv value for glossDiv.
         */
        public Builder(String title, GlossDiv glossDiv) {
            this.title = title;
            this.glossDiv = glossDiv;
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
         * Setter for glossDiv.
         * @param  glossDiv  GlossDiv value for glossDiv.
         * @return Builder
         */
        public Builder glossDiv(GlossDiv glossDiv) {
            this.glossDiv = glossDiv;
            return this;
        }

        /**
         * Builds a new {@link Glossary} object using the set fields.
         * @return {@link Glossary}
         */
        public Glossary build() {
            return new Glossary(title, glossDiv);
        }
    }
}
