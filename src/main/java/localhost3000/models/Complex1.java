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
 * This is a model class for Complex1 type.
 */
public class Complex1
        extends BaseModel {
    private List<Medication> medications;
    private List<Lab> labs;
    private List<Imaging> imaging;

    /**
     * Default constructor.
     */
    public Complex1() {
    }

    /**
     * Initialization constructor.
     * @param  medications  List of Medication value for medications.
     * @param  labs  List of Lab value for labs.
     * @param  imaging  List of Imaging value for imaging.
     */
    public Complex1(
            List<Medication> medications,
            List<Lab> labs,
            List<Imaging> imaging) {
        this.medications = medications;
        this.labs = labs;
        this.imaging = imaging;
    }

    /**
     * Getter for Medications.
     * @return Returns the List of Medication
     */
    @JsonGetter("medications")
    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Setter for Medications.
     * @param medications Value for List of Medication
     */
    @JsonSetter("medications")
    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    /**
     * Getter for Labs.
     * @return Returns the List of Lab
     */
    @JsonGetter("labs")
    public List<Lab> getLabs() {
        return labs;
    }

    /**
     * Setter for Labs.
     * @param labs Value for List of Lab
     */
    @JsonSetter("labs")
    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }

    /**
     * Getter for Imaging.
     * @return Returns the List of Imaging
     */
    @JsonGetter("imaging")
    public List<Imaging> getImaging() {
        return imaging;
    }

    /**
     * Setter for Imaging.
     * @param imaging Value for List of Imaging
     */
    @JsonSetter("imaging")
    public void setImaging(List<Imaging> imaging) {
        this.imaging = imaging;
    }

    /**
     * Converts this Complex1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Complex1 [" + "medications=" + medications + ", labs=" + labs + ", imaging="
                + imaging + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Complex1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Complex1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(medications, labs, imaging);
        return builder;
    }

    /**
     * Class to build instances of {@link Complex1}.
     */
    public static class Builder {
        private List<Medication> medications;
        private List<Lab> labs;
        private List<Imaging> imaging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  medications  List of Medication value for medications.
         * @param  labs  List of Lab value for labs.
         * @param  imaging  List of Imaging value for imaging.
         */
        public Builder(List<Medication> medications, List<Lab> labs, List<Imaging> imaging) {
            this.medications = medications;
            this.labs = labs;
            this.imaging = imaging;
        }

        /**
         * Setter for medications.
         * @param  medications  List of Medication value for medications.
         * @return Builder
         */
        public Builder medications(List<Medication> medications) {
            this.medications = medications;
            return this;
        }

        /**
         * Setter for labs.
         * @param  labs  List of Lab value for labs.
         * @return Builder
         */
        public Builder labs(List<Lab> labs) {
            this.labs = labs;
            return this;
        }

        /**
         * Setter for imaging.
         * @param  imaging  List of Imaging value for imaging.
         * @return Builder
         */
        public Builder imaging(List<Imaging> imaging) {
            this.imaging = imaging;
            return this;
        }

        /**
         * Builds a new {@link Complex1} object using the set fields.
         * @return {@link Complex1}
         */
        public Complex1 build() {
            return new Complex1(medications, labs, imaging);
        }
    }
}
