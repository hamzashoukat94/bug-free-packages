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
 * This is a model class for GlossEntry type.
 */
public class GlossEntry
        extends BaseModel {
    private String iD;
    private String sortAs;
    private String glossTerm;
    private String acronym;
    private String abbrev;
    private GlossDef glossDef;
    private String glossSee;

    /**
     * Default constructor.
     */
    public GlossEntry() {
    }

    /**
     * Initialization constructor.
     * @param  iD  String value for iD.
     * @param  sortAs  String value for sortAs.
     * @param  glossTerm  String value for glossTerm.
     * @param  acronym  String value for acronym.
     * @param  abbrev  String value for abbrev.
     * @param  glossDef  GlossDef value for glossDef.
     * @param  glossSee  String value for glossSee.
     */
    public GlossEntry(
            String iD,
            String sortAs,
            String glossTerm,
            String acronym,
            String abbrev,
            GlossDef glossDef,
            String glossSee) {
        this.iD = iD;
        this.sortAs = sortAs;
        this.glossTerm = glossTerm;
        this.acronym = acronym;
        this.abbrev = abbrev;
        this.glossDef = glossDef;
        this.glossSee = glossSee;
    }

    /**
     * Getter for ID.
     * @return Returns the String
     */
    @JsonGetter("ID")
    public String getID() {
        return iD;
    }

    /**
     * Setter for ID.
     * @param iD Value for String
     */
    @JsonSetter("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * Getter for SortAs.
     * @return Returns the String
     */
    @JsonGetter("SortAs")
    public String getSortAs() {
        return sortAs;
    }

    /**
     * Setter for SortAs.
     * @param sortAs Value for String
     */
    @JsonSetter("SortAs")
    public void setSortAs(String sortAs) {
        this.sortAs = sortAs;
    }

    /**
     * Getter for GlossTerm.
     * @return Returns the String
     */
    @JsonGetter("GlossTerm")
    public String getGlossTerm() {
        return glossTerm;
    }

    /**
     * Setter for GlossTerm.
     * @param glossTerm Value for String
     */
    @JsonSetter("GlossTerm")
    public void setGlossTerm(String glossTerm) {
        this.glossTerm = glossTerm;
    }

    /**
     * Getter for Acronym.
     * @return Returns the String
     */
    @JsonGetter("Acronym")
    public String getAcronym() {
        return acronym;
    }

    /**
     * Setter for Acronym.
     * @param acronym Value for String
     */
    @JsonSetter("Acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    /**
     * Getter for Abbrev.
     * @return Returns the String
     */
    @JsonGetter("Abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * Setter for Abbrev.
     * @param abbrev Value for String
     */
    @JsonSetter("Abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    /**
     * Getter for GlossDef.
     * @return Returns the GlossDef
     */
    @JsonGetter("GlossDef")
    public GlossDef getGlossDef() {
        return glossDef;
    }

    /**
     * Setter for GlossDef.
     * @param glossDef Value for GlossDef
     */
    @JsonSetter("GlossDef")
    public void setGlossDef(GlossDef glossDef) {
        this.glossDef = glossDef;
    }

    /**
     * Getter for GlossSee.
     * @return Returns the String
     */
    @JsonGetter("GlossSee")
    public String getGlossSee() {
        return glossSee;
    }

    /**
     * Setter for GlossSee.
     * @param glossSee Value for String
     */
    @JsonSetter("GlossSee")
    public void setGlossSee(String glossSee) {
        this.glossSee = glossSee;
    }

    /**
     * Converts this GlossEntry into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GlossEntry [" + "iD=" + iD + ", sortAs=" + sortAs + ", glossTerm=" + glossTerm
                + ", acronym=" + acronym + ", abbrev=" + abbrev + ", glossDef=" + glossDef
                + ", glossSee=" + glossSee + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link GlossEntry.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GlossEntry.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(iD, sortAs, glossTerm, acronym, abbrev, glossDef, glossSee);
        return builder;
    }

    /**
     * Class to build instances of {@link GlossEntry}.
     */
    public static class Builder {
        private String iD;
        private String sortAs;
        private String glossTerm;
        private String acronym;
        private String abbrev;
        private GlossDef glossDef;
        private String glossSee;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  iD  String value for iD.
         * @param  sortAs  String value for sortAs.
         * @param  glossTerm  String value for glossTerm.
         * @param  acronym  String value for acronym.
         * @param  abbrev  String value for abbrev.
         * @param  glossDef  GlossDef value for glossDef.
         * @param  glossSee  String value for glossSee.
         */
        public Builder(String iD, String sortAs, String glossTerm, String acronym, String abbrev,
                GlossDef glossDef, String glossSee) {
            this.iD = iD;
            this.sortAs = sortAs;
            this.glossTerm = glossTerm;
            this.acronym = acronym;
            this.abbrev = abbrev;
            this.glossDef = glossDef;
            this.glossSee = glossSee;
        }

        /**
         * Setter for iD.
         * @param  iD  String value for iD.
         * @return Builder
         */
        public Builder iD(String iD) {
            this.iD = iD;
            return this;
        }

        /**
         * Setter for sortAs.
         * @param  sortAs  String value for sortAs.
         * @return Builder
         */
        public Builder sortAs(String sortAs) {
            this.sortAs = sortAs;
            return this;
        }

        /**
         * Setter for glossTerm.
         * @param  glossTerm  String value for glossTerm.
         * @return Builder
         */
        public Builder glossTerm(String glossTerm) {
            this.glossTerm = glossTerm;
            return this;
        }

        /**
         * Setter for acronym.
         * @param  acronym  String value for acronym.
         * @return Builder
         */
        public Builder acronym(String acronym) {
            this.acronym = acronym;
            return this;
        }

        /**
         * Setter for abbrev.
         * @param  abbrev  String value for abbrev.
         * @return Builder
         */
        public Builder abbrev(String abbrev) {
            this.abbrev = abbrev;
            return this;
        }

        /**
         * Setter for glossDef.
         * @param  glossDef  GlossDef value for glossDef.
         * @return Builder
         */
        public Builder glossDef(GlossDef glossDef) {
            this.glossDef = glossDef;
            return this;
        }

        /**
         * Setter for glossSee.
         * @param  glossSee  String value for glossSee.
         * @return Builder
         */
        public Builder glossSee(String glossSee) {
            this.glossSee = glossSee;
            return this;
        }

        /**
         * Builds a new {@link GlossEntry} object using the set fields.
         * @return {@link GlossEntry}
         */
        public GlossEntry build() {
            return new GlossEntry(iD, sortAs, glossTerm, acronym, abbrev, glossDef, glossSee);
        }
    }
}
