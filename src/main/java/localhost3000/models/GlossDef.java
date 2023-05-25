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
 * This is a model class for GlossDef type.
 */
public class GlossDef
        extends BaseModel {
    private String para;
    private List<String> glossSeeAlso;

    /**
     * Default constructor.
     */
    public GlossDef() {
    }

    /**
     * Initialization constructor.
     * @param  para  String value for para.
     * @param  glossSeeAlso  List of String value for glossSeeAlso.
     */
    public GlossDef(
            String para,
            List<String> glossSeeAlso) {
        this.para = para;
        this.glossSeeAlso = glossSeeAlso;
    }

    /**
     * Getter for Para.
     * @return Returns the String
     */
    @JsonGetter("para")
    public String getPara() {
        return para;
    }

    /**
     * Setter for Para.
     * @param para Value for String
     */
    @JsonSetter("para")
    public void setPara(String para) {
        this.para = para;
    }

    /**
     * Getter for GlossSeeAlso.
     * @return Returns the List of String
     */
    @JsonGetter("GlossSeeAlso")
    public List<String> getGlossSeeAlso() {
        return glossSeeAlso;
    }

    /**
     * Setter for GlossSeeAlso.
     * @param glossSeeAlso Value for List of String
     */
    @JsonSetter("GlossSeeAlso")
    public void setGlossSeeAlso(List<String> glossSeeAlso) {
        this.glossSeeAlso = glossSeeAlso;
    }

    /**
     * Converts this GlossDef into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GlossDef [" + "para=" + para + ", glossSeeAlso=" + glossSeeAlso
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GlossDef.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GlossDef.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(para, glossSeeAlso);
        return builder;
    }

    /**
     * Class to build instances of {@link GlossDef}.
     */
    public static class Builder {
        private String para;
        private List<String> glossSeeAlso;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  para  String value for para.
         * @param  glossSeeAlso  List of String value for glossSeeAlso.
         */
        public Builder(String para, List<String> glossSeeAlso) {
            this.para = para;
            this.glossSeeAlso = glossSeeAlso;
        }

        /**
         * Setter for para.
         * @param  para  String value for para.
         * @return Builder
         */
        public Builder para(String para) {
            this.para = para;
            return this;
        }

        /**
         * Setter for glossSeeAlso.
         * @param  glossSeeAlso  List of String value for glossSeeAlso.
         * @return Builder
         */
        public Builder glossSeeAlso(List<String> glossSeeAlso) {
            this.glossSeeAlso = glossSeeAlso;
            return this;
        }

        /**
         * Builds a new {@link GlossDef} object using the set fields.
         * @return {@link GlossDef}
         */
        public GlossDef build() {
            return new GlossDef(para, glossSeeAlso);
        }
    }
}
