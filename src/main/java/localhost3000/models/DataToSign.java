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
 * This is a model class for DataToSign type.
 */
public class DataToSign
        extends BaseModel {
    private String fileName;
    private boolean convertToPDF;

    /**
     * Default constructor.
     */
    public DataToSign() {
    }

    /**
     * Initialization constructor.
     * @param  fileName  String value for fileName.
     * @param  convertToPDF  boolean value for convertToPDF.
     */
    public DataToSign(
            String fileName,
            boolean convertToPDF) {
        this.fileName = fileName;
        this.convertToPDF = convertToPDF;
    }

    /**
     * Getter for FileName.
     * @return Returns the String
     */
    @JsonGetter("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for FileName.
     * @param fileName Value for String
     */
    @JsonSetter("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Getter for ConvertToPDF.
     * @return Returns the boolean
     */
    @JsonGetter("convertToPDF")
    public boolean getConvertToPDF() {
        return convertToPDF;
    }

    /**
     * Setter for ConvertToPDF.
     * @param convertToPDF Value for boolean
     */
    @JsonSetter("convertToPDF")
    public void setConvertToPDF(boolean convertToPDF) {
        this.convertToPDF = convertToPDF;
    }

    /**
     * Converts this DataToSign into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DataToSign [" + "fileName=" + fileName + ", convertToPDF=" + convertToPDF
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DataToSign.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DataToSign.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(fileName, convertToPDF);
        return builder;
    }

    /**
     * Class to build instances of {@link DataToSign}.
     */
    public static class Builder {
        private String fileName;
        private boolean convertToPDF;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  fileName  String value for fileName.
         * @param  convertToPDF  boolean value for convertToPDF.
         */
        public Builder(String fileName, boolean convertToPDF) {
            this.fileName = fileName;
            this.convertToPDF = convertToPDF;
        }

        /**
         * Setter for fileName.
         * @param  fileName  String value for fileName.
         * @return Builder
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * Setter for convertToPDF.
         * @param  convertToPDF  boolean value for convertToPDF.
         * @return Builder
         */
        public Builder convertToPDF(boolean convertToPDF) {
            this.convertToPDF = convertToPDF;
            return this;
        }

        /**
         * Builds a new {@link DataToSign} object using the set fields.
         * @return {@link DataToSign}
         */
        public DataToSign build() {
            return new DataToSign(fileName, convertToPDF);
        }
    }
}
