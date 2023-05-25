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
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Company type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "company",
        defaultImpl = Company.class,
        visible = true)
@JsonSubTypes({
    @Type(value = BossCompany.class, name = "boss_comp"),
    @Type(value = EmployeeComp.class, name = "empl_comp"),
    @Type(value = SoftwareTester.class, name = "Software_Tester"),
    @Type(value = Developer.class, name = "developer")
})
@JsonInclude(Include.ALWAYS)
public class Company
        extends BaseModel {
    private String companyName;
    private String address;
    private String cellNumber;
    private String company;

    /**
     * Default constructor.
     */
    public Company() {
        setCompany("comp");
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  address  String value for address.
     * @param  cellNumber  String value for cellNumber.
     * @param  company  String value for company.
     */
    public Company(
            String companyName,
            String address,
            String cellNumber,
            String company) {
        this.companyName = companyName;
        this.address = address;
        this.cellNumber = cellNumber;
        this.company = company;
    }

    /**
     * Getter for CompanyName.
     * @return Returns the String
     */
    @JsonGetter("company name")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * @param companyName Value for String
     */
    @JsonSetter("company name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * Getter for CellNumber.
     * @return Returns the String
     */
    @JsonGetter("cell number")
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Setter for CellNumber.
     * @param cellNumber Value for String
     */
    @JsonSetter("cell number")
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    /**
     * Getter for Company.
     * @return Returns the String
     */
    @JsonGetter("company")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Company into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Company [" + "companyName=" + companyName + ", address=" + address + ", cellNumber="
                + cellNumber + ", company=" + company + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Company.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Company.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(companyName, address, cellNumber)
                .company(getCompany());
        return builder;
    }

    /**
     * Class to build instances of {@link Company}.
     */
    public static class Builder {
        private String companyName;
        private String address;
        private String cellNumber;
        private String company = "comp";

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
         */
        public Builder(String companyName, String address, String cellNumber) {
            this.companyName = companyName;
            this.address = address;
            this.cellNumber = cellNumber;
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
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * Builds a new {@link Company} object using the set fields.
         * @return {@link Company}
         */
        public Company build() {
            return new Company(companyName, address, cellNumber, company);
        }
    }
}
