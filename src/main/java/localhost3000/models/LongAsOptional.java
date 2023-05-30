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

/**
 * This is a model class for LongAsOptional type.
 */
public class LongAsOptional
        extends BaseModel {
    private Long mLong;

    /**
     * Default constructor.
     */
    public LongAsOptional() {
    }

    /**
     * Initialization constructor.
     * @param  mLong  Long value for mLong.
     */
    public LongAsOptional(
            Long mLong) {
        this.mLong = mLong;
    }

    /**
     * Getter for MLong.
     * @return Returns the Long
     */
    @JsonGetter("long")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getMLong() {
        return mLong;
    }

    /**
     * Setter for MLong.
     * @param mLong Value for Long
     */
    @JsonSetter("long")
    public void setMLong(Long mLong) {
        this.mLong = mLong;
    }

    /**
     * Converts this LongAsOptional into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LongAsOptional [" + "mLong=" + mLong + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link LongAsOptional.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LongAsOptional.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mLong(getMLong());
        return builder;
    }

    /**
     * Class to build instances of {@link LongAsOptional}.
     */
    public static class Builder {
        private Long mLong;



        /**
         * Setter for mLong.
         * @param  mLong  Long value for mLong.
         * @return Builder
         */
        public Builder mLong(Long mLong) {
            this.mLong = mLong;
            return this;
        }

        /**
         * Builds a new {@link LongAsOptional} object using the set fields.
         * @return {@link LongAsOptional}
         */
        public LongAsOptional build() {
            return new LongAsOptional(mLong);
        }
    }
}
