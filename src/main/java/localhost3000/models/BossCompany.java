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
 * This is a model class for BossCompany type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "company",
        defaultImpl = BossCompany.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class BossCompany
        extends Company {
    private String firstName;
    private String lastName;
    private String addressBoss;

    /**
     * Default constructor.
     */
    public BossCompany() {
        super();
        setCompany("boss_comp");
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  address  String value for address.
     * @param  cellNumber  String value for cellNumber.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  addressBoss  String value for addressBoss.
     * @param  company  String value for company.
     */
    public BossCompany(
            String companyName,
            String address,
            String cellNumber,
            String firstName,
            String lastName,
            String addressBoss,
            String company) {
        super(companyName, address, cellNumber, company);
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressBoss = addressBoss;
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
     * Getter for AddressBoss.
     * @return Returns the String
     */
    @JsonGetter("address_boss")
    public String getAddressBoss() {
        return addressBoss;
    }

    /**
     * Setter for AddressBoss.
     * @param addressBoss Value for String
     */
    @JsonSetter("address_boss")
    public void setAddressBoss(String addressBoss) {
        this.addressBoss = addressBoss;
    }

    /**
     * Converts this BossCompany into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BossCompany [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", addressBoss=" + addressBoss + ", companyName=" + getCompanyName()
                + ", address=" + getAddress() + ", cellNumber=" + getCellNumber() + ", company="
                + getCompany() + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BossCompany.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BossCompany.Builder} object
     */
    public Builder toBossCompanyBuilder() {
        Builder builder = new Builder(getCompanyName(), getAddress(), getCellNumber(), firstName,
                lastName, addressBoss)
                .company(getCompany());
        return builder;
    }

    /**
     * Class to build instances of {@link BossCompany}.
     */
    public static class Builder {
        private String companyName;
        private String address;
        private String cellNumber;
        private String firstName;
        private String lastName;
        private String addressBoss;
        private String company = "boss_comp";

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
         * @param  addressBoss  String value for addressBoss.
         */
        public Builder(String companyName, String address, String cellNumber, String firstName,
                String lastName, String addressBoss) {
            this.companyName = companyName;
            this.address = address;
            this.cellNumber = cellNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.addressBoss = addressBoss;
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
         * Setter for addressBoss.
         * @param  addressBoss  String value for addressBoss.
         * @return Builder
         */
        public Builder addressBoss(String addressBoss) {
            this.addressBoss = addressBoss;
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
         * Builds a new {@link BossCompany} object using the set fields.
         * @return {@link BossCompany}
         */
        public BossCompany build() {
            return new BossCompany(companyName, address, cellNumber, firstName, lastName,
                    addressBoss, company);
        }
    }
}
