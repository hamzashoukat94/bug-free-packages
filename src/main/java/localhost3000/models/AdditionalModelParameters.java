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
 * This is a model class for AdditionalModelParameters type.
 */
public class AdditionalModelParameters
        extends BaseModel {
    private String name;
    private String field;
    private String address;
    private Job job;

    /**
     * Default constructor.
     */
    public AdditionalModelParameters() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  field  String value for field.
     * @param  address  String value for address.
     * @param  job  Job value for job.
     */
    public AdditionalModelParameters(
            String name,
            String field,
            String address,
            Job job) {
        this.name = name;
        this.field = field;
        this.address = address;
        this.job = job;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Field.
     * @return Returns the String
     */
    @JsonGetter("field")
    public String getField() {
        return field;
    }

    /**
     * Setter for Field.
     * @param field Value for String
     */
    @JsonSetter("field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Getter for Address.
     * @return Returns the String
     */
    @JsonGetter("address")
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for Job.
     * @return Returns the Job
     */
    @JsonGetter("Job")
    public Job getJob() {
        return job;
    }

    /**
     * Setter for Job.
     * @param job Value for Job
     */
    @JsonSetter("Job")
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * Converts this AdditionalModelParameters into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdditionalModelParameters [" + "name=" + name + ", field=" + field + ", address="
                + address + ", job=" + job + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link AdditionalModelParameters.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AdditionalModelParameters.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, field, address, job);
        return builder;
    }

    /**
     * Class to build instances of {@link AdditionalModelParameters}.
     */
    public static class Builder {
        private String name;
        private String field;
        private String address;
        private Job job;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  field  String value for field.
         * @param  address  String value for address.
         * @param  job  Job value for job.
         */
        public Builder(String name, String field, String address, Job job) {
            this.name = name;
            this.field = field;
            this.address = address;
            this.job = job;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for field.
         * @param  field  String value for field.
         * @return Builder
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for job.
         * @param  job  Job value for job.
         * @return Builder
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * Builds a new {@link AdditionalModelParameters} object using the set fields.
         * @return {@link AdditionalModelParameters}
         */
        public AdditionalModelParameters build() {
            return new AdditionalModelParameters(name, field, address, job);
        }
    }
}
