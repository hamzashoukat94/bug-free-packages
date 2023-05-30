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
 * This is a model class for Dialogs type.
 */
public class Dialogs
        extends BaseModel {
    private Before before;

    /**
     * Default constructor.
     */
    public Dialogs() {
    }

    /**
     * Initialization constructor.
     * @param  before  Before value for before.
     */
    public Dialogs(
            Before before) {
        this.before = before;
    }

    /**
     * Getter for Before.
     * @return Returns the Before
     */
    @JsonGetter("before")
    public Before getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for Before
     */
    @JsonSetter("before")
    public void setBefore(Before before) {
        this.before = before;
    }

    /**
     * Converts this Dialogs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Dialogs [" + "before=" + before + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Dialogs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Dialogs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(before);
        return builder;
    }

    /**
     * Class to build instances of {@link Dialogs}.
     */
    public static class Builder {
        private Before before;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  before  Before value for before.
         */
        public Builder(Before before) {
            this.before = before;
        }

        /**
         * Setter for before.
         * @param  before  Before value for before.
         * @return Builder
         */
        public Builder before(Before before) {
            this.before = before;
            return this;
        }

        /**
         * Builds a new {@link Dialogs} object using the set fields.
         * @return {@link Dialogs}
         */
        public Dialogs build() {
            return new Dialogs(before);
        }
    }
}
