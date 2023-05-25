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
 * This is a model class for Complex3 type.
 */
public class Complex3
        extends BaseModel {
    private String documentId;
    private List<Signer> signers;
    private Status status;
    private String title;
    private String description;
    private String externalId;
    private DataToSign dataToSign;
    private ContactDetails contactDetails;
    private Advanced advanced;

    /**
     * Default constructor.
     */
    public Complex3() {
    }

    /**
     * Initialization constructor.
     * @param  documentId  String value for documentId.
     * @param  signers  List of Signer value for signers.
     * @param  status  Status value for status.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  externalId  String value for externalId.
     * @param  dataToSign  DataToSign value for dataToSign.
     * @param  contactDetails  ContactDetails value for contactDetails.
     * @param  advanced  Advanced value for advanced.
     */
    public Complex3(
            String documentId,
            List<Signer> signers,
            Status status,
            String title,
            String description,
            String externalId,
            DataToSign dataToSign,
            ContactDetails contactDetails,
            Advanced advanced) {
        this.documentId = documentId;
        this.signers = signers;
        this.status = status;
        this.title = title;
        this.description = description;
        this.externalId = externalId;
        this.dataToSign = dataToSign;
        this.contactDetails = contactDetails;
        this.advanced = advanced;
    }

    /**
     * Getter for DocumentId.
     * @return Returns the String
     */
    @JsonGetter("documentId")
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Setter for DocumentId.
     * @param documentId Value for String
     */
    @JsonSetter("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Getter for Signers.
     * @return Returns the List of Signer
     */
    @JsonGetter("signers")
    public List<Signer> getSigners() {
        return signers;
    }

    /**
     * Setter for Signers.
     * @param signers Value for List of Signer
     */
    @JsonSetter("signers")
    public void setSigners(List<Signer> signers) {
        this.signers = signers;
    }

    /**
     * Getter for Status.
     * @return Returns the Status
     */
    @JsonGetter("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status
     */
    @JsonSetter("status")
    public void setStatus(Status status) {
        this.status = status;
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
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for ExternalId.
     * @return Returns the String
     */
    @JsonGetter("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Setter for ExternalId.
     * @param externalId Value for String
     */
    @JsonSetter("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for DataToSign.
     * @return Returns the DataToSign
     */
    @JsonGetter("dataToSign")
    public DataToSign getDataToSign() {
        return dataToSign;
    }

    /**
     * Setter for DataToSign.
     * @param dataToSign Value for DataToSign
     */
    @JsonSetter("dataToSign")
    public void setDataToSign(DataToSign dataToSign) {
        this.dataToSign = dataToSign;
    }

    /**
     * Getter for ContactDetails.
     * @return Returns the ContactDetails
     */
    @JsonGetter("contactDetails")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Setter for ContactDetails.
     * @param contactDetails Value for ContactDetails
     */
    @JsonSetter("contactDetails")
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     * Getter for Advanced.
     * @return Returns the Advanced
     */
    @JsonGetter("advanced")
    public Advanced getAdvanced() {
        return advanced;
    }

    /**
     * Setter for Advanced.
     * @param advanced Value for Advanced
     */
    @JsonSetter("advanced")
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
    }

    /**
     * Converts this Complex3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Complex3 [" + "documentId=" + documentId + ", signers=" + signers + ", status="
                + status + ", title=" + title + ", description=" + description + ", externalId="
                + externalId + ", dataToSign=" + dataToSign + ", contactDetails=" + contactDetails
                + ", advanced=" + advanced + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Complex3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Complex3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentId, signers, status, title, description, externalId,
                dataToSign, contactDetails, advanced);
        return builder;
    }

    /**
     * Class to build instances of {@link Complex3}.
     */
    public static class Builder {
        private String documentId;
        private List<Signer> signers;
        private Status status;
        private String title;
        private String description;
        private String externalId;
        private DataToSign dataToSign;
        private ContactDetails contactDetails;
        private Advanced advanced;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentId  String value for documentId.
         * @param  signers  List of Signer value for signers.
         * @param  status  Status value for status.
         * @param  title  String value for title.
         * @param  description  String value for description.
         * @param  externalId  String value for externalId.
         * @param  dataToSign  DataToSign value for dataToSign.
         * @param  contactDetails  ContactDetails value for contactDetails.
         * @param  advanced  Advanced value for advanced.
         */
        public Builder(String documentId, List<Signer> signers, Status status, String title,
                String description, String externalId, DataToSign dataToSign,
                ContactDetails contactDetails, Advanced advanced) {
            this.documentId = documentId;
            this.signers = signers;
            this.status = status;
            this.title = title;
            this.description = description;
            this.externalId = externalId;
            this.dataToSign = dataToSign;
            this.contactDetails = contactDetails;
            this.advanced = advanced;
        }

        /**
         * Setter for documentId.
         * @param  documentId  String value for documentId.
         * @return Builder
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * Setter for signers.
         * @param  signers  List of Signer value for signers.
         * @return Builder
         */
        public Builder signers(List<Signer> signers) {
            this.signers = signers;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status value for status.
         * @return Builder
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for externalId.
         * @param  externalId  String value for externalId.
         * @return Builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Setter for dataToSign.
         * @param  dataToSign  DataToSign value for dataToSign.
         * @return Builder
         */
        public Builder dataToSign(DataToSign dataToSign) {
            this.dataToSign = dataToSign;
            return this;
        }

        /**
         * Setter for contactDetails.
         * @param  contactDetails  ContactDetails value for contactDetails.
         * @return Builder
         */
        public Builder contactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        /**
         * Setter for advanced.
         * @param  advanced  Advanced value for advanced.
         * @return Builder
         */
        public Builder advanced(Advanced advanced) {
            this.advanced = advanced;
            return this;
        }

        /**
         * Builds a new {@link Complex3} object using the set fields.
         * @return {@link Complex3}
         */
        public Complex3 build() {
            return new Complex3(documentId, signers, status, title, description, externalId,
                    dataToSign, contactDetails, advanced);
        }
    }
}
