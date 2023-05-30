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
 * This is a model class for GlossDiv type.
 */
public class GlossDiv
        extends BaseModel {
    private String title;
    private GlossList glossList;

    /**
     * Default constructor.
     */
    public GlossDiv() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  glossList  GlossList value for glossList.
     */
    public GlossDiv(
            String title,
            GlossList glossList) {
        this.title = title;
        this.glossList = glossList;
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
     * Getter for GlossList.
     * @return Returns the GlossList
     */
    @JsonGetter("GlossList")
    public GlossList getGlossList() {
        return glossList;
    }

    /**
     * Setter for GlossList.
     * @param glossList Value for GlossList
     */
    @JsonSetter("GlossList")
    public void setGlossList(GlossList glossList) {
        this.glossList = glossList;
    }

    /**
     * Converts this GlossDiv into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GlossDiv [" + "title=" + title + ", glossList=" + glossList
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GlossDiv.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GlossDiv.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, glossList);
        return builder;
    }

    /**
     * Class to build instances of {@link GlossDiv}.
     */
    public static class Builder {
        private String title;
        private GlossList glossList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  glossList  GlossList value for glossList.
         */
        public Builder(String title, GlossList glossList) {
            this.title = title;
            this.glossList = glossList;
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
         * Setter for glossList.
         * @param  glossList  GlossList value for glossList.
         * @return Builder
         */
        public Builder glossList(GlossList glossList) {
            this.glossList = glossList;
            return this;
        }

        /**
         * Builds a new {@link GlossDiv} object using the set fields.
         * @return {@link GlossDiv}
         */
        public GlossDiv build() {
            return new GlossDiv(title, glossList);
        }
    }
}
