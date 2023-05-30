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
 * This is a model class for Status type.
 */
public class Status
        extends BaseModel {
    private String documentStatus;
    private List<String> completedPackages;
    private Object attachmentPackages;

    /**
     * Default constructor.
     */
    public Status() {
    }

    /**
     * Initialization constructor.
     * @param  documentStatus  String value for documentStatus.
     * @param  completedPackages  List of String value for completedPackages.
     * @param  attachmentPackages  Object value for attachmentPackages.
     */
    public Status(
            String documentStatus,
            List<String> completedPackages,
            Object attachmentPackages) {
        this.documentStatus = documentStatus;
        this.completedPackages = completedPackages;
        this.attachmentPackages = attachmentPackages;
    }

    /**
     * Getter for DocumentStatus.
     * @return Returns the String
     */
    @JsonGetter("documentStatus")
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Setter for DocumentStatus.
     * @param documentStatus Value for String
     */
    @JsonSetter("documentStatus")
    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    /**
     * Getter for CompletedPackages.
     * @return Returns the List of String
     */
    @JsonGetter("completedPackages")
    public List<String> getCompletedPackages() {
        return completedPackages;
    }

    /**
     * Setter for CompletedPackages.
     * @param completedPackages Value for List of String
     */
    @JsonSetter("completedPackages")
    public void setCompletedPackages(List<String> completedPackages) {
        this.completedPackages = completedPackages;
    }

    /**
     * Getter for AttachmentPackages.
     * @return Returns the Object
     */
    @JsonGetter("attachmentPackages")
    public Object getAttachmentPackages() {
        return attachmentPackages;
    }

    /**
     * Setter for AttachmentPackages.
     * @param attachmentPackages Value for Object
     */
    @JsonSetter("attachmentPackages")
    public void setAttachmentPackages(Object attachmentPackages) {
        this.attachmentPackages = attachmentPackages;
    }

    /**
     * Converts this Status into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Status [" + "documentStatus=" + documentStatus + ", completedPackages="
                + completedPackages + ", attachmentPackages=" + attachmentPackages
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Status.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Status.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentStatus, completedPackages, attachmentPackages);
        return builder;
    }

    /**
     * Class to build instances of {@link Status}.
     */
    public static class Builder {
        private String documentStatus;
        private List<String> completedPackages;
        private Object attachmentPackages;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentStatus  String value for documentStatus.
         * @param  completedPackages  List of String value for completedPackages.
         * @param  attachmentPackages  Object value for attachmentPackages.
         */
        public Builder(String documentStatus, List<String> completedPackages,
                Object attachmentPackages) {
            this.documentStatus = documentStatus;
            this.completedPackages = completedPackages;
            this.attachmentPackages = attachmentPackages;
        }

        /**
         * Setter for documentStatus.
         * @param  documentStatus  String value for documentStatus.
         * @return Builder
         */
        public Builder documentStatus(String documentStatus) {
            this.documentStatus = documentStatus;
            return this;
        }

        /**
         * Setter for completedPackages.
         * @param  completedPackages  List of String value for completedPackages.
         * @return Builder
         */
        public Builder completedPackages(List<String> completedPackages) {
            this.completedPackages = completedPackages;
            return this;
        }

        /**
         * Setter for attachmentPackages.
         * @param  attachmentPackages  Object value for attachmentPackages.
         * @return Builder
         */
        public Builder attachmentPackages(Object attachmentPackages) {
            this.attachmentPackages = attachmentPackages;
            return this;
        }

        /**
         * Builds a new {@link Status} object using the set fields.
         * @return {@link Status}
         */
        public Status build() {
            return new Status(documentStatus, completedPackages, attachmentPackages);
        }
    }
}
