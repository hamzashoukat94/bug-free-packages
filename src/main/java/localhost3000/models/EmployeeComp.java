/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This is a model class for EmployeeComp type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "company",
        defaultImpl = EmployeeComp.class,
        visible = true)
@JsonSubTypes({
    @Type(value = Developer.class, name = "developer"),
    @Type(value = SoftwareTester.class, name = "Software_Tester")
})
@JsonInclude(Include.ALWAYS)
public class EmployeeComp
        extends Company {
    private String firstName;
    private String lastName;
    private String id;

    /**
     * Default constructor.
     */
    public EmployeeComp() {
        super();
        setCompany("empl_comp");
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  address  String value for address.
     * @param  cellNumber  String value for cellNumber.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  id  String value for id.
     * @param  company  String value for company.
     */
    public EmployeeComp(
            String companyName,
            String address,
            String cellNumber,
            String firstName,
            String lastName,
            String id,
            String company) {
        super(companyName, address, cellNumber, company);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("first name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("last name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("last name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this EmployeeComp into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EmployeeComp [" + "firstName=" + firstName + ", lastName=" + lastName + ", id=" + id
                + ", companyName=" + getCompanyName() + ", address=" + getAddress()
                + ", cellNumber=" + getCellNumber() + ", company=" + getCompany()
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link EmployeeComp.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EmployeeComp.Builder} object
     */
    public Builder toEmployeeCompBuilder() {
        Builder builder = new Builder(getCompanyName(), getAddress(), getCellNumber(), firstName,
                lastName, id)
                .company(getCompany());
        return builder;
    }

    /**
     * Class to build instances of {@link EmployeeComp}.
     */
    public static class Builder {
        private String companyName;
        private String address;
        private String cellNumber;
        private String firstName;
        private String lastName;
        private String id;
        private String company = "empl_comp";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  companyName  String value for companyName.
         * @param  address  String value for address.
         * @param  cellNumber  String value for cellNumber.
         * @param  firstName  String value for firstName.
         * @param  lastName  String value for lastName.
         * @param  id  String value for id.
         */
        public Builder(String companyName, String address, String cellNumber, String firstName,
                String lastName, String id) {
            this.companyName = companyName;
            this.address = address;
            this.cellNumber = cellNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
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
         * Setter for cellNumber.
         * @param  cellNumber  String value for cellNumber.
         * @return Builder
         */
        public Builder cellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
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
         * Builds a new {@link EmployeeComp} object using the set fields.
         * @return {@link EmployeeComp}
         */
        public EmployeeComp build() {
            return new EmployeeComp(companyName, address, cellNumber, firstName, lastName, id,
                    company);
        }
    }
}
