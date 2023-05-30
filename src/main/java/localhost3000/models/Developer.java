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
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This is a model class for Developer type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "company",
        defaultImpl = Developer.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class Developer
        extends EmployeeComp {
    private String team;
    private String designation;
    private String role;

    /**
     * Default constructor.
     */
    public Developer() {
        super();
        setCompany("developer");
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  address  String value for address.
     * @param  cellNumber  String value for cellNumber.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  id  String value for id.
     * @param  team  String value for team.
     * @param  designation  String value for designation.
     * @param  role  String value for role.
     * @param  company  String value for company.
     */
    public Developer(
            String companyName,
            String address,
            String cellNumber,
            String firstName,
            String lastName,
            String id,
            String team,
            String designation,
            String role,
            String company) {
        super(companyName, address, cellNumber, firstName, lastName, id, company);
        this.team = team;
        this.designation = designation;
        this.role = role;
    }

    /**
     * Getter for Team.
     * @return Returns the String
     */
    @JsonGetter("team")
    public String getTeam() {
        return team;
    }

    /**
     * Setter for Team.
     * @param team Value for String
     */
    @JsonSetter("team")
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Getter for Designation.
     * @return Returns the String
     */
    @JsonGetter("designation")
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter for Designation.
     * @param designation Value for String
     */
    @JsonSetter("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Getter for Role.
     * @return Returns the String
     */
    @JsonGetter("role")
    public String getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * @param role Value for String
     */
    @JsonSetter("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Converts this Developer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Developer [" + "team=" + team + ", designation=" + designation + ", role=" + role
                + ", companyName=" + getCompanyName() + ", address=" + getAddress()
                + ", cellNumber=" + getCellNumber() + ", firstName=" + getFirstName()
                + ", lastName=" + getLastName() + ", id=" + getId() + ", company=" + getCompany()
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Developer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Developer.Builder} object
     */
    public Builder toDeveloperBuilder() {
        Builder builder = new Builder(getCompanyName(), getAddress(), getCellNumber(),
                getFirstName(), getLastName(), getId(), team, designation, role)
                .company(getCompany());
        return builder;
    }

    /**
     * Class to build instances of {@link Developer}.
     */
    public static class Builder {
        private String companyName;
        private String address;
        private String cellNumber;
        private String firstName;
        private String lastName;
        private String id;
        private String team;
        private String designation;
        private String role;
        private String company = "developer";

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
         * @param  team  String value for team.
         * @param  designation  String value for designation.
         * @param  role  String value for role.
         */
        public Builder(String companyName, String address, String cellNumber, String firstName,
                String lastName, String id, String team, String designation, String role) {
            this.companyName = companyName;
            this.address = address;
            this.cellNumber = cellNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.team = team;
            this.designation = designation;
            this.role = role;
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
         * Setter for team.
         * @param  team  String value for team.
         * @return Builder
         */
        public Builder team(String team) {
            this.team = team;
            return this;
        }

        /**
         * Setter for designation.
         * @param  designation  String value for designation.
         * @return Builder
         */
        public Builder designation(String designation) {
            this.designation = designation;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  String value for role.
         * @return Builder
         */
        public Builder role(String role) {
            this.role = role;
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
         * Builds a new {@link Developer} object using the set fields.
         * @return {@link Developer}
         */
        public Developer build() {
            return new Developer(companyName, address, cellNumber, firstName, lastName, id, team,
                    designation, role, company);
        }
    }
}
