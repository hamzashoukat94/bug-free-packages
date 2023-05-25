/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for ServerResponse type.
 */
public class ServerResponse
        extends BaseModel {
    private boolean passed;
    private String message;
    private Map<String, Object> input;

    /**
     * Default constructor.
     */
    public ServerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  passed  boolean value for passed.
     * @param  message  String value for message.
     * @param  input  Map of String, value for input.
     */
    public ServerResponse(
            boolean passed,
            String message,
            Map<String, Object> input) {
        this.passed = passed;
        this.message = message;
        this.input = input;
    }

    /**
     * Getter for Passed.
     * @return Returns the boolean
     */
    @JsonGetter("passed")
    public boolean getPassed() {
        return passed;
    }

    /**
     * Setter for Passed.
     * @param passed Value for boolean
     */
    @JsonSetter("passed")
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("Message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Input.
     * @return Returns the Map of String, Object
     */
    @JsonGetter("input")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Object> getInput() {
        return input;
    }

    /**
     * Setter for Input.
     * @param input Value for Map of String, Object
     */
    @JsonSetter("input")
    public void setInput(Map<String, Object> input) {
        this.input = input;
    }

    /**
     * Converts this ServerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServerResponse [" + "passed=" + passed + ", message=" + message + ", input=" + input
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ServerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(passed)
                .message(getMessage())
                .input(getInput());
        return builder;
    }

    /**
     * Class to build instances of {@link ServerResponse}.
     */
    public static class Builder {
        private boolean passed;
        private String message;
        private Map<String, Object> input;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  passed  boolean value for passed.
         */
        public Builder(boolean passed) {
            this.passed = passed;
        }

        /**
         * Setter for passed.
         * @param  passed  boolean value for passed.
         * @return Builder
         */
        public Builder passed(boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for input.
         * @param  input  Map of String, value for input.
         * @return Builder
         */
        public Builder input(Map<String, Object> input) {
            this.input = input;
            return this;
        }

        /**
         * Builds a new {@link ServerResponse} object using the set fields.
         * @return {@link ServerResponse}
         */
        public ServerResponse build() {
            return new ServerResponse(passed, message, input);
        }
    }
}
