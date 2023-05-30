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
 * This is a model class for Job type.
 */
public class Job
        extends BaseModel {
    private String company;

    /**
     * Default constructor.
     */
    public Job() {
    }

    /**
     * Initialization constructor.
     * @param  company  String value for company.
     */
    public Job(
            String company) {
        this.company = company;
    }

    /**
     * Getter for Company.
     * @return Returns the String
     */
    @JsonGetter("company")
    public String getCompany() {
        return company;
    }

    /**
     * Setter for Company.
     * @param company Value for String
     */
    @JsonSetter("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Converts this Job into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Job [" + "company=" + company + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Job.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Job.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(company);
        return builder;
    }

    /**
     * Class to build instances of {@link Job}.
     */
    public static class Builder {
        private String company;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  company  String value for company.
         */
        public Builder(String company) {
            this.company = company;
        }

        /**
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * Builds a new {@link Job} object using the set fields.
         * @return {@link Job}
         */
        public Job build() {
            return new Job(company);
        }
    }
}
