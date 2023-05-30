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
 * This is a model class for Medication type.
 */
public class Medication
        extends BaseModel {
    private List<AceInhibitor> aceInhibitors;
    private List<Antianginal> antianginal;
    private List<Anticoagulant> anticoagulants;
    private List<BetaBlocker> betaBlocker;
    private List<Diuretic> diuretic;
    private List<Mineral> mineral;

    /**
     * Default constructor.
     */
    public Medication() {
    }

    /**
     * Initialization constructor.
     * @param  aceInhibitors  List of AceInhibitor value for aceInhibitors.
     * @param  antianginal  List of Antianginal value for antianginal.
     * @param  anticoagulants  List of Anticoagulant value for anticoagulants.
     * @param  betaBlocker  List of BetaBlocker value for betaBlocker.
     * @param  diuretic  List of Diuretic value for diuretic.
     * @param  mineral  List of Mineral value for mineral.
     */
    public Medication(
            List<AceInhibitor> aceInhibitors,
            List<Antianginal> antianginal,
            List<Anticoagulant> anticoagulants,
            List<BetaBlocker> betaBlocker,
            List<Diuretic> diuretic,
            List<Mineral> mineral) {
        this.aceInhibitors = aceInhibitors;
        this.antianginal = antianginal;
        this.anticoagulants = anticoagulants;
        this.betaBlocker = betaBlocker;
        this.diuretic = diuretic;
        this.mineral = mineral;
    }

    /**
     * Getter for AceInhibitors.
     * @return Returns the List of AceInhibitor
     */
    @JsonGetter("aceInhibitors")
    public List<AceInhibitor> getAceInhibitors() {
        return aceInhibitors;
    }

    /**
     * Setter for AceInhibitors.
     * @param aceInhibitors Value for List of AceInhibitor
     */
    @JsonSetter("aceInhibitors")
    public void setAceInhibitors(List<AceInhibitor> aceInhibitors) {
        this.aceInhibitors = aceInhibitors;
    }

    /**
     * Getter for Antianginal.
     * @return Returns the List of Antianginal
     */
    @JsonGetter("antianginal")
    public List<Antianginal> getAntianginal() {
        return antianginal;
    }

    /**
     * Setter for Antianginal.
     * @param antianginal Value for List of Antianginal
     */
    @JsonSetter("antianginal")
    public void setAntianginal(List<Antianginal> antianginal) {
        this.antianginal = antianginal;
    }

    /**
     * Getter for Anticoagulants.
     * @return Returns the List of Anticoagulant
     */
    @JsonGetter("anticoagulants")
    public List<Anticoagulant> getAnticoagulants() {
        return anticoagulants;
    }

    /**
     * Setter for Anticoagulants.
     * @param anticoagulants Value for List of Anticoagulant
     */
    @JsonSetter("anticoagulants")
    public void setAnticoagulants(List<Anticoagulant> anticoagulants) {
        this.anticoagulants = anticoagulants;
    }

    /**
     * Getter for BetaBlocker.
     * @return Returns the List of BetaBlocker
     */
    @JsonGetter("betaBlocker")
    public List<BetaBlocker> getBetaBlocker() {
        return betaBlocker;
    }

    /**
     * Setter for BetaBlocker.
     * @param betaBlocker Value for List of BetaBlocker
     */
    @JsonSetter("betaBlocker")
    public void setBetaBlocker(List<BetaBlocker> betaBlocker) {
        this.betaBlocker = betaBlocker;
    }

    /**
     * Getter for Diuretic.
     * @return Returns the List of Diuretic
     */
    @JsonGetter("diuretic")
    public List<Diuretic> getDiuretic() {
        return diuretic;
    }

    /**
     * Setter for Diuretic.
     * @param diuretic Value for List of Diuretic
     */
    @JsonSetter("diuretic")
    public void setDiuretic(List<Diuretic> diuretic) {
        this.diuretic = diuretic;
    }

    /**
     * Getter for Mineral.
     * @return Returns the List of Mineral
     */
    @JsonGetter("mineral")
    public List<Mineral> getMineral() {
        return mineral;
    }

    /**
     * Setter for Mineral.
     * @param mineral Value for List of Mineral
     */
    @JsonSetter("mineral")
    public void setMineral(List<Mineral> mineral) {
        this.mineral = mineral;
    }

    /**
     * Converts this Medication into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Medication [" + "aceInhibitors=" + aceInhibitors + ", antianginal=" + antianginal
                + ", anticoagulants=" + anticoagulants + ", betaBlocker=" + betaBlocker
                + ", diuretic=" + diuretic + ", mineral=" + mineral + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Medication.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Medication.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(aceInhibitors, antianginal, anticoagulants, betaBlocker,
                diuretic, mineral);
        return builder;
    }

    /**
     * Class to build instances of {@link Medication}.
     */
    public static class Builder {
        private List<AceInhibitor> aceInhibitors;
        private List<Antianginal> antianginal;
        private List<Anticoagulant> anticoagulants;
        private List<BetaBlocker> betaBlocker;
        private List<Diuretic> diuretic;
        private List<Mineral> mineral;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  aceInhibitors  List of AceInhibitor value for aceInhibitors.
         * @param  antianginal  List of Antianginal value for antianginal.
         * @param  anticoagulants  List of Anticoagulant value for anticoagulants.
         * @param  betaBlocker  List of BetaBlocker value for betaBlocker.
         * @param  diuretic  List of Diuretic value for diuretic.
         * @param  mineral  List of Mineral value for mineral.
         */
        public Builder(List<AceInhibitor> aceInhibitors, List<Antianginal> antianginal,
                List<Anticoagulant> anticoagulants, List<BetaBlocker> betaBlocker,
                List<Diuretic> diuretic, List<Mineral> mineral) {
            this.aceInhibitors = aceInhibitors;
            this.antianginal = antianginal;
            this.anticoagulants = anticoagulants;
            this.betaBlocker = betaBlocker;
            this.diuretic = diuretic;
            this.mineral = mineral;
        }

        /**
         * Setter for aceInhibitors.
         * @param  aceInhibitors  List of AceInhibitor value for aceInhibitors.
         * @return Builder
         */
        public Builder aceInhibitors(List<AceInhibitor> aceInhibitors) {
            this.aceInhibitors = aceInhibitors;
            return this;
        }

        /**
         * Setter for antianginal.
         * @param  antianginal  List of Antianginal value for antianginal.
         * @return Builder
         */
        public Builder antianginal(List<Antianginal> antianginal) {
            this.antianginal = antianginal;
            return this;
        }

        /**
         * Setter for anticoagulants.
         * @param  anticoagulants  List of Anticoagulant value for anticoagulants.
         * @return Builder
         */
        public Builder anticoagulants(List<Anticoagulant> anticoagulants) {
            this.anticoagulants = anticoagulants;
            return this;
        }

        /**
         * Setter for betaBlocker.
         * @param  betaBlocker  List of BetaBlocker value for betaBlocker.
         * @return Builder
         */
        public Builder betaBlocker(List<BetaBlocker> betaBlocker) {
            this.betaBlocker = betaBlocker;
            return this;
        }

        /**
         * Setter for diuretic.
         * @param  diuretic  List of Diuretic value for diuretic.
         * @return Builder
         */
        public Builder diuretic(List<Diuretic> diuretic) {
            this.diuretic = diuretic;
            return this;
        }

        /**
         * Setter for mineral.
         * @param  mineral  List of Mineral value for mineral.
         * @return Builder
         */
        public Builder mineral(List<Mineral> mineral) {
            this.mineral = mineral;
            return this;
        }

        /**
         * Builds a new {@link Medication} object using the set fields.
         * @return {@link Medication}
         */
        public Medication build() {
            return new Medication(aceInhibitors, antianginal, anticoagulants, betaBlocker, diuretic,
                    mineral);
        }
    }
}
