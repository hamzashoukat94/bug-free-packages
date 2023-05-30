/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for LocalTestException type.
 */
public class LocalTestException extends GlobalTestException {
    private static final long serialVersionUID = -5536586566115938266L;
    private String secretMessageForEndpoint;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public LocalTestException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for SecretMessageForEndpoint.
     * Represents the specific endpoint info
     * @return Returns the String
     */
    @JsonGetter("SecretMessageForEndpoint")
    public String getSecretMessageForEndpoint() {
        return this.secretMessageForEndpoint;
    }

    /**
     * Setter for SecretMessageForEndpoint.
     * Represents the specific endpoint info
     * @param secretMessageForEndpoint Value for String
     */
    @JsonSetter("SecretMessageForEndpoint")
    private void setSecretMessageForEndpoint(String secretMessageForEndpoint) {
        this.secretMessageForEndpoint = secretMessageForEndpoint;
    }
}
