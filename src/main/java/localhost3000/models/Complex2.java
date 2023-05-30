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
 * This is a model class for Complex2 type.
 */
public class Complex2
        extends BaseModel {
    private Glossary glossary;

    /**
     * Default constructor.
     */
    public Complex2() {
    }

    /**
     * Initialization constructor.
     * @param  glossary  Glossary value for glossary.
     */
    public Complex2(
            Glossary glossary) {
        this.glossary = glossary;
    }

    /**
     * Getter for Glossary.
     * @return Returns the Glossary
     */
    @JsonGetter("glossary")
    public Glossary getGlossary() {
        return glossary;
    }

    /**
     * Setter for Glossary.
     * @param glossary Value for Glossary
     */
    @JsonSetter("glossary")
    public void setGlossary(Glossary glossary) {
        this.glossary = glossary;
    }

    /**
     * Converts this Complex2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Complex2 [" + "glossary=" + glossary + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Complex2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Complex2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(glossary);
        return builder;
    }

    /**
     * Class to build instances of {@link Complex2}.
     */
    public static class Builder {
        private Glossary glossary;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  glossary  Glossary value for glossary.
         */
        public Builder(Glossary glossary) {
            this.glossary = glossary;
        }

        /**
         * Setter for glossary.
         * @param  glossary  Glossary value for glossary.
         * @return Builder
         */
        public Builder glossary(Glossary glossary) {
            this.glossary = glossary;
            return this;
        }

        /**
         * Builds a new {@link Complex2} object using the set fields.
         * @return {@link Complex2}
         */
        public Complex2 build() {
            return new Complex2(glossary);
        }
    }
}
