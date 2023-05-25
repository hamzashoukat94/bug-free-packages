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
 * This is a model class for CustomErrorResponseException type.
 */
public class CustomErrorResponseException extends ApiException {
    private static final long serialVersionUID = 2092416372838823238L;
    private String errorDescription;
    private String caught;
    private String exception;
    private String innerException;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public CustomErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ErrorDescription.
     * @return Returns the String
     */
    @JsonGetter("error description")
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * Setter for ErrorDescription.
     * @param errorDescription Value for String
     */
    @JsonSetter("error description")
    private void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Getter for Caught.
     * @return Returns the String
     */
    @JsonGetter("caught")
    public String getCaught() {
        return this.caught;
    }

    /**
     * Setter for Caught.
     * @param caught Value for String
     */
    @JsonSetter("caught")
    private void setCaught(String caught) {
        this.caught = caught;
    }

    /**
     * Getter for Exception.
     * @return Returns the String
     */
    @JsonGetter("Exception")
    public String getException() {
        return this.exception;
    }

    /**
     * Setter for Exception.
     * @param exception Value for String
     */
    @JsonSetter("Exception")
    private void setException(String exception) {
        this.exception = exception;
    }

    /**
     * Getter for InnerException.
     * @return Returns the String
     */
    @JsonGetter("Inner Exception")
    public String getInnerException() {
        return this.innerException;
    }

    /**
     * Setter for InnerException.
     * @param innerException Value for String
     */
    @JsonSetter("Inner Exception")
    private void setInnerException(String innerException) {
        this.innerException = innerException;
    }
}
