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
 * This is a model class for Antianginal type.
 */
public class Antianginal
        extends BaseModel {
    private String name;
    private String strength;
    private String dose;
    private String route;
    private String sig;
    private String pillCount;
    private String refills;

    /**
     * Default constructor.
     */
    public Antianginal() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  strength  String value for strength.
     * @param  dose  String value for dose.
     * @param  route  String value for route.
     * @param  sig  String value for sig.
     * @param  pillCount  String value for pillCount.
     * @param  refills  String value for refills.
     */
    public Antianginal(
            String name,
            String strength,
            String dose,
            String route,
            String sig,
            String pillCount,
            String refills) {
        this.name = name;
        this.strength = strength;
        this.dose = dose;
        this.route = route;
        this.sig = sig;
        this.pillCount = pillCount;
        this.refills = refills;
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
     * Getter for Strength.
     * @return Returns the String
     */
    @JsonGetter("strength")
    public String getStrength() {
        return strength;
    }

    /**
     * Setter for Strength.
     * @param strength Value for String
     */
    @JsonSetter("strength")
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Getter for Dose.
     * @return Returns the String
     */
    @JsonGetter("dose")
    public String getDose() {
        return dose;
    }

    /**
     * Setter for Dose.
     * @param dose Value for String
     */
    @JsonSetter("dose")
    public void setDose(String dose) {
        this.dose = dose;
    }

    /**
     * Getter for Route.
     * @return Returns the String
     */
    @JsonGetter("route")
    public String getRoute() {
        return route;
    }

    /**
     * Setter for Route.
     * @param route Value for String
     */
    @JsonSetter("route")
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * Getter for Sig.
     * @return Returns the String
     */
    @JsonGetter("sig")
    public String getSig() {
        return sig;
    }

    /**
     * Setter for Sig.
     * @param sig Value for String
     */
    @JsonSetter("sig")
    public void setSig(String sig) {
        this.sig = sig;
    }

    /**
     * Getter for PillCount.
     * @return Returns the String
     */
    @JsonGetter("pillCount")
    public String getPillCount() {
        return pillCount;
    }

    /**
     * Setter for PillCount.
     * @param pillCount Value for String
     */
    @JsonSetter("pillCount")
    public void setPillCount(String pillCount) {
        this.pillCount = pillCount;
    }

    /**
     * Getter for Refills.
     * @return Returns the String
     */
    @JsonGetter("refills")
    public String getRefills() {
        return refills;
    }

    /**
     * Setter for Refills.
     * @param refills Value for String
     */
    @JsonSetter("refills")
    public void setRefills(String refills) {
        this.refills = refills;
    }

    /**
     * Converts this Antianginal into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Antianginal [" + "name=" + name + ", strength=" + strength + ", dose=" + dose
                + ", route=" + route + ", sig=" + sig + ", pillCount=" + pillCount + ", refills="
                + refills + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Antianginal.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Antianginal.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, strength, dose, route, sig, pillCount, refills);
        return builder;
    }

    /**
     * Class to build instances of {@link Antianginal}.
     */
    public static class Builder {
        private String name;
        private String strength;
        private String dose;
        private String route;
        private String sig;
        private String pillCount;
        private String refills;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  strength  String value for strength.
         * @param  dose  String value for dose.
         * @param  route  String value for route.
         * @param  sig  String value for sig.
         * @param  pillCount  String value for pillCount.
         * @param  refills  String value for refills.
         */
        public Builder(String name, String strength, String dose, String route, String sig,
                String pillCount, String refills) {
            this.name = name;
            this.strength = strength;
            this.dose = dose;
            this.route = route;
            this.sig = sig;
            this.pillCount = pillCount;
            this.refills = refills;
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
         * Setter for strength.
         * @param  strength  String value for strength.
         * @return Builder
         */
        public Builder strength(String strength) {
            this.strength = strength;
            return this;
        }

        /**
         * Setter for dose.
         * @param  dose  String value for dose.
         * @return Builder
         */
        public Builder dose(String dose) {
            this.dose = dose;
            return this;
        }

        /**
         * Setter for route.
         * @param  route  String value for route.
         * @return Builder
         */
        public Builder route(String route) {
            this.route = route;
            return this;
        }

        /**
         * Setter for sig.
         * @param  sig  String value for sig.
         * @return Builder
         */
        public Builder sig(String sig) {
            this.sig = sig;
            return this;
        }

        /**
         * Setter for pillCount.
         * @param  pillCount  String value for pillCount.
         * @return Builder
         */
        public Builder pillCount(String pillCount) {
            this.pillCount = pillCount;
            return this;
        }

        /**
         * Setter for refills.
         * @param  refills  String value for refills.
         * @return Builder
         */
        public Builder refills(String refills) {
            this.refills = refills;
            return this;
        }

        /**
         * Builds a new {@link Antianginal} object using the set fields.
         * @return {@link Antianginal}
         */
        public Antianginal build() {
            return new Antianginal(name, strength, dose, route, sig, pillCount, refills);
        }
    }
}
