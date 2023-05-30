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
 * This is a model class for Signer type.
 */
public class Signer
        extends BaseModel {
    private String id;
    private String url;
    private List<String> links;
    private String externalSignerId;
    private RedirectSettings redirectSettings;
    private SignatureType signatureType;
    private Ui ui;
    private List<String> tags;
    private int order;
    private boolean required;

    /**
     * Default constructor.
     */
    public Signer() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  url  String value for url.
     * @param  links  List of String value for links.
     * @param  externalSignerId  String value for externalSignerId.
     * @param  redirectSettings  RedirectSettings value for redirectSettings.
     * @param  signatureType  SignatureType value for signatureType.
     * @param  ui  Ui value for ui.
     * @param  tags  List of String value for tags.
     * @param  order  int value for order.
     * @param  required  boolean value for required.
     */
    public Signer(
            String id,
            String url,
            List<String> links,
            String externalSignerId,
            RedirectSettings redirectSettings,
            SignatureType signatureType,
            Ui ui,
            List<String> tags,
            int order,
            boolean required) {
        this.id = id;
        this.url = url;
        this.links = links;
        this.externalSignerId = externalSignerId;
        this.redirectSettings = redirectSettings;
        this.signatureType = signatureType;
        this.ui = ui;
        this.tags = tags;
        this.order = order;
        this.required = required;
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
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Links.
     * @return Returns the List of String
     */
    @JsonGetter("links")
    public List<String> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for List of String
     */
    @JsonSetter("links")
    public void setLinks(List<String> links) {
        this.links = links;
    }

    /**
     * Getter for ExternalSignerId.
     * @return Returns the String
     */
    @JsonGetter("externalSignerId")
    public String getExternalSignerId() {
        return externalSignerId;
    }

    /**
     * Setter for ExternalSignerId.
     * @param externalSignerId Value for String
     */
    @JsonSetter("externalSignerId")
    public void setExternalSignerId(String externalSignerId) {
        this.externalSignerId = externalSignerId;
    }

    /**
     * Getter for RedirectSettings.
     * @return Returns the RedirectSettings
     */
    @JsonGetter("redirectSettings")
    public RedirectSettings getRedirectSettings() {
        return redirectSettings;
    }

    /**
     * Setter for RedirectSettings.
     * @param redirectSettings Value for RedirectSettings
     */
    @JsonSetter("redirectSettings")
    public void setRedirectSettings(RedirectSettings redirectSettings) {
        this.redirectSettings = redirectSettings;
    }

    /**
     * Getter for SignatureType.
     * @return Returns the SignatureType
     */
    @JsonGetter("signatureType")
    public SignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Setter for SignatureType.
     * @param signatureType Value for SignatureType
     */
    @JsonSetter("signatureType")
    public void setSignatureType(SignatureType signatureType) {
        this.signatureType = signatureType;
    }

    /**
     * Getter for Ui.
     * @return Returns the Ui
     */
    @JsonGetter("ui")
    public Ui getUi() {
        return ui;
    }

    /**
     * Setter for Ui.
     * @param ui Value for Ui
     */
    @JsonSetter("ui")
    public void setUi(Ui ui) {
        this.ui = ui;
    }

    /**
     * Getter for Tags.
     * @return Returns the List of String
     */
    @JsonGetter("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Getter for Order.
     * @return Returns the int
     */
    @JsonGetter("order")
    public int getOrder() {
        return order;
    }

    /**
     * Setter for Order.
     * @param order Value for int
     */
    @JsonSetter("order")
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Getter for Required.
     * @return Returns the boolean
     */
    @JsonGetter("required")
    public boolean getRequired() {
        return required;
    }

    /**
     * Setter for Required.
     * @param required Value for boolean
     */
    @JsonSetter("required")
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * Converts this Signer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Signer [" + "id=" + id + ", url=" + url + ", links=" + links + ", externalSignerId="
                + externalSignerId + ", redirectSettings=" + redirectSettings + ", signatureType="
                + signatureType + ", ui=" + ui + ", tags=" + tags + ", order=" + order
                + ", required=" + required + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Signer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Signer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, url, links, externalSignerId, redirectSettings,
                signatureType, ui, tags, order, required);
        return builder;
    }

    /**
     * Class to build instances of {@link Signer}.
     */
    public static class Builder {
        private String id;
        private String url;
        private List<String> links;
        private String externalSignerId;
        private RedirectSettings redirectSettings;
        private SignatureType signatureType;
        private Ui ui;
        private List<String> tags;
        private int order;
        private boolean required;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  url  String value for url.
         * @param  links  List of String value for links.
         * @param  externalSignerId  String value for externalSignerId.
         * @param  redirectSettings  RedirectSettings value for redirectSettings.
         * @param  signatureType  SignatureType value for signatureType.
         * @param  ui  Ui value for ui.
         * @param  tags  List of String value for tags.
         * @param  order  int value for order.
         * @param  required  boolean value for required.
         */
        public Builder(String id, String url, List<String> links, String externalSignerId,
                RedirectSettings redirectSettings, SignatureType signatureType, Ui ui,
                List<String> tags, int order, boolean required) {
            this.id = id;
            this.url = url;
            this.links = links;
            this.externalSignerId = externalSignerId;
            this.redirectSettings = redirectSettings;
            this.signatureType = signatureType;
            this.ui = ui;
            this.tags = tags;
            this.order = order;
            this.required = required;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of String value for links.
         * @return Builder
         */
        public Builder links(List<String> links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for externalSignerId.
         * @param  externalSignerId  String value for externalSignerId.
         * @return Builder
         */
        public Builder externalSignerId(String externalSignerId) {
            this.externalSignerId = externalSignerId;
            return this;
        }

        /**
         * Setter for redirectSettings.
         * @param  redirectSettings  RedirectSettings value for redirectSettings.
         * @return Builder
         */
        public Builder redirectSettings(RedirectSettings redirectSettings) {
            this.redirectSettings = redirectSettings;
            return this;
        }

        /**
         * Setter for signatureType.
         * @param  signatureType  SignatureType value for signatureType.
         * @return Builder
         */
        public Builder signatureType(SignatureType signatureType) {
            this.signatureType = signatureType;
            return this;
        }

        /**
         * Setter for ui.
         * @param  ui  Ui value for ui.
         * @return Builder
         */
        public Builder ui(Ui ui) {
            this.ui = ui;
            return this;
        }

        /**
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Setter for order.
         * @param  order  int value for order.
         * @return Builder
         */
        public Builder order(int order) {
            this.order = order;
            return this;
        }

        /**
         * Setter for required.
         * @param  required  boolean value for required.
         * @return Builder
         */
        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Builds a new {@link Signer} object using the set fields.
         * @return {@link Signer}
         */
        public Signer build() {
            return new Signer(id, url, links, externalSignerId, redirectSettings, signatureType, ui,
                    tags, order, required);
        }
    }
}
