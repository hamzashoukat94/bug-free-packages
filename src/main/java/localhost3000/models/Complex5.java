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
 * This is a model class for Complex5 type.
 */
public class Complex5
        extends BaseModel {
    private ResponseData responseData;
    private String responseDetails;
    private int responseStatus;

    /**
     * Default constructor.
     */
    public Complex5() {
    }

    /**
     * Initialization constructor.
     * @param  responseData  ResponseData value for responseData.
     * @param  responseDetails  String value for responseDetails.
     * @param  responseStatus  int value for responseStatus.
     */
    public Complex5(
            ResponseData responseData,
            String responseDetails,
            int responseStatus) {
        this.responseData = responseData;
        this.responseDetails = responseDetails;
        this.responseStatus = responseStatus;
    }

    /**
     * Getter for ResponseData.
     * @return Returns the ResponseData
     */
    @JsonGetter("responseData")
    public ResponseData getResponseData() {
        return responseData;
    }

    /**
     * Setter for ResponseData.
     * @param responseData Value for ResponseData
     */
    @JsonSetter("responseData")
    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    /**
     * Getter for ResponseDetails.
     * @return Returns the String
     */
    @JsonGetter("responseDetails")
    public String getResponseDetails() {
        return responseDetails;
    }

    /**
     * Setter for ResponseDetails.
     * @param responseDetails Value for String
     */
    @JsonSetter("responseDetails")
    public void setResponseDetails(String responseDetails) {
        this.responseDetails = responseDetails;
    }

    /**
     * Getter for ResponseStatus.
     * @return Returns the int
     */
    @JsonGetter("responseStatus")
    public int getResponseStatus() {
        return responseStatus;
    }

    /**
     * Setter for ResponseStatus.
     * @param responseStatus Value for int
     */
    @JsonSetter("responseStatus")
    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * Converts this Complex5 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Complex5 [" + "responseData=" + responseData + ", responseDetails="
                + responseDetails + ", responseStatus=" + responseStatus + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Complex5.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Complex5.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(responseData, responseDetails, responseStatus);
        return builder;
    }

    /**
     * Class to build instances of {@link Complex5}.
     */
    public static class Builder {
        private ResponseData responseData;
        private String responseDetails;
        private int responseStatus;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  responseData  ResponseData value for responseData.
         * @param  responseDetails  String value for responseDetails.
         * @param  responseStatus  int value for responseStatus.
         */
        public Builder(ResponseData responseData, String responseDetails, int responseStatus) {
            this.responseData = responseData;
            this.responseDetails = responseDetails;
            this.responseStatus = responseStatus;
        }

        /**
         * Setter for responseData.
         * @param  responseData  ResponseData value for responseData.
         * @return Builder
         */
        public Builder responseData(ResponseData responseData) {
            this.responseData = responseData;
            return this;
        }

        /**
         * Setter for responseDetails.
         * @param  responseDetails  String value for responseDetails.
         * @return Builder
         */
        public Builder responseDetails(String responseDetails) {
            this.responseDetails = responseDetails;
            return this;
        }

        /**
         * Setter for responseStatus.
         * @param  responseStatus  int value for responseStatus.
         * @return Builder
         */
        public Builder responseStatus(int responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }

        /**
         * Builds a new {@link Complex5} object using the set fields.
         * @return {@link Complex5}
         */
        public Complex5 build() {
            return new Complex5(responseData, responseDetails, responseStatus);
        }
    }
}
