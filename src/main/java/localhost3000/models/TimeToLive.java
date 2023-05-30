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
 * This is a model class for TimeToLive type.
 */
public class TimeToLive
        extends BaseModel {
    private String deadline;
    private int deleteAfterHours;

    /**
     * Default constructor.
     */
    public TimeToLive() {
    }

    /**
     * Initialization constructor.
     * @param  deadline  String value for deadline.
     * @param  deleteAfterHours  int value for deleteAfterHours.
     */
    public TimeToLive(
            String deadline,
            int deleteAfterHours) {
        this.deadline = deadline;
        this.deleteAfterHours = deleteAfterHours;
    }

    /**
     * Getter for Deadline.
     * @return Returns the String
     */
    @JsonGetter("deadline")
    public String getDeadline() {
        return deadline;
    }

    /**
     * Setter for Deadline.
     * @param deadline Value for String
     */
    @JsonSetter("deadline")
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * Getter for DeleteAfterHours.
     * @return Returns the int
     */
    @JsonGetter("deleteAfterHours")
    public int getDeleteAfterHours() {
        return deleteAfterHours;
    }

    /**
     * Setter for DeleteAfterHours.
     * @param deleteAfterHours Value for int
     */
    @JsonSetter("deleteAfterHours")
    public void setDeleteAfterHours(int deleteAfterHours) {
        this.deleteAfterHours = deleteAfterHours;
    }

    /**
     * Converts this TimeToLive into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TimeToLive [" + "deadline=" + deadline + ", deleteAfterHours=" + deleteAfterHours
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TimeToLive.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TimeToLive.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deadline, deleteAfterHours);
        return builder;
    }

    /**
     * Class to build instances of {@link TimeToLive}.
     */
    public static class Builder {
        private String deadline;
        private int deleteAfterHours;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deadline  String value for deadline.
         * @param  deleteAfterHours  int value for deleteAfterHours.
         */
        public Builder(String deadline, int deleteAfterHours) {
            this.deadline = deadline;
            this.deleteAfterHours = deleteAfterHours;
        }

        /**
         * Setter for deadline.
         * @param  deadline  String value for deadline.
         * @return Builder
         */
        public Builder deadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        /**
         * Setter for deleteAfterHours.
         * @param  deleteAfterHours  int value for deleteAfterHours.
         * @return Builder
         */
        public Builder deleteAfterHours(int deleteAfterHours) {
            this.deleteAfterHours = deleteAfterHours;
            return this;
        }

        /**
         * Builds a new {@link TimeToLive} object using the set fields.
         * @return {@link TimeToLive}
         */
        public TimeToLive build() {
            return new TimeToLive(deadline, deleteAfterHours);
        }
    }
}
