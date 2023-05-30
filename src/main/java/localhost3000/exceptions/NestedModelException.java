/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.Validate;

/**
 * This is a model class for NestedModelException type.
 */
public class NestedModelException extends ApiException {
    private static final long serialVersionUID = -4774983474345298072L;
    private String serverMessage;
    private String serverCode;
    private Validate model;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public NestedModelException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ServerMessage.
     * @return Returns the String
     */
    @JsonGetter("ServerMessage")
    public String getServerMessage() {
        return this.serverMessage;
    }

    /**
     * Setter for ServerMessage.
     * @param serverMessage Value for String
     */
    @JsonSetter("ServerMessage")
    private void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    /**
     * Getter for ServerCode.
     * @return Returns the String
     */
    @JsonGetter("ServerCode")
    public String getServerCode() {
        return this.serverCode;
    }

    /**
     * Setter for ServerCode.
     * @param serverCode Value for String
     */
    @JsonSetter("ServerCode")
    private void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    /**
     * Getter for Model.
     * @return Returns the Validate
     */
    @JsonGetter("model")
    public Validate getModel() {
        return this.model;
    }

    /**
     * Setter for Model.
     * @param model Value for Validate
     */
    @JsonSetter("model")
    private void setModel(Validate model) {
        this.model = model;
    }
}
