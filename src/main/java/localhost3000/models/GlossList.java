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
 * This is a model class for GlossList type.
 */
public class GlossList
        extends BaseModel {
    private GlossEntry glossEntry;

    /**
     * Default constructor.
     */
    public GlossList() {
    }

    /**
     * Initialization constructor.
     * @param  glossEntry  GlossEntry value for glossEntry.
     */
    public GlossList(
            GlossEntry glossEntry) {
        this.glossEntry = glossEntry;
    }

    /**
     * Getter for GlossEntry.
     * @return Returns the GlossEntry
     */
    @JsonGetter("GlossEntry")
    public GlossEntry getGlossEntry() {
        return glossEntry;
    }

    /**
     * Setter for GlossEntry.
     * @param glossEntry Value for GlossEntry
     */
    @JsonSetter("GlossEntry")
    public void setGlossEntry(GlossEntry glossEntry) {
        this.glossEntry = glossEntry;
    }

    /**
     * Converts this GlossList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GlossList [" + "glossEntry=" + glossEntry + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GlossList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GlossList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(glossEntry);
        return builder;
    }

    /**
     * Class to build instances of {@link GlossList}.
     */
    public static class Builder {
        private GlossEntry glossEntry;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  glossEntry  GlossEntry value for glossEntry.
         */
        public Builder(GlossEntry glossEntry) {
            this.glossEntry = glossEntry;
        }

        /**
         * Setter for glossEntry.
         * @param  glossEntry  GlossEntry value for glossEntry.
         * @return Builder
         */
        public Builder glossEntry(GlossEntry glossEntry) {
            this.glossEntry = glossEntry;
            return this;
        }

        /**
         * Builds a new {@link GlossList} object using the set fields.
         * @return {@link GlossList}
         */
        public GlossList build() {
            return new GlossList(glossEntry);
        }
    }
}
