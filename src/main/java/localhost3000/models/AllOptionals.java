/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for AllOptionals type.
 */
public class AllOptionals
        extends StringAsOptional {
    private OptionalNullable<Integer> id;
    private List<NumberAsOptional> optionalNumbers;
    private LongAsOptional optionalLong;
    private PrecisionAsOptional optionalPrecision;

    /**
     * Default constructor.
     */
    public AllOptionals() {
        super();
    }

    /**
     * Initialization constructor.
     * @param  string  String value for string.
     * @param  id  Integer value for id.
     * @param  optionalNumbers  List of NumberAsOptional value for optionalNumbers.
     * @param  optionalLong  LongAsOptional value for optionalLong.
     * @param  optionalPrecision  PrecisionAsOptional value for optionalPrecision.
     */
    public AllOptionals(
            String string,
            Integer id,
            List<NumberAsOptional> optionalNumbers,
            LongAsOptional optionalLong,
            PrecisionAsOptional optionalPrecision) {
        super(string);
        this.id = OptionalNullable.of(id);
        this.optionalNumbers = optionalNumbers;
        this.optionalLong = optionalLong;
        this.optionalPrecision = optionalPrecision;
    }

    /**
     * Internal initialization constructor.
     */
    protected AllOptionals(String string, OptionalNullable<Integer> id,
            List<NumberAsOptional> optionalNumbers, LongAsOptional optionalLong,
            PrecisionAsOptional optionalPrecision) {
        super(string);
        this.id = id;
        this.optionalNumbers = optionalNumbers;
        this.optionalLong = optionalLong;
        this.optionalPrecision = optionalPrecision;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    public Integer getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Getter for OptionalNumbers.
     * @return Returns the List of NumberAsOptional
     */
    @JsonGetter("optionalNumbers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<NumberAsOptional> getOptionalNumbers() {
        return optionalNumbers;
    }

    /**
     * Setter for OptionalNumbers.
     * @param optionalNumbers Value for List of NumberAsOptional
     */
    @JsonSetter("optionalNumbers")
    public void setOptionalNumbers(List<NumberAsOptional> optionalNumbers) {
        this.optionalNumbers = optionalNumbers;
    }

    /**
     * Getter for OptionalLong.
     * @return Returns the LongAsOptional
     */
    @JsonGetter("optionalLong")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LongAsOptional getOptionalLong() {
        return optionalLong;
    }

    /**
     * Setter for OptionalLong.
     * @param optionalLong Value for LongAsOptional
     */
    @JsonSetter("optionalLong")
    public void setOptionalLong(LongAsOptional optionalLong) {
        this.optionalLong = optionalLong;
    }

    /**
     * Getter for OptionalPrecision.
     * @return Returns the PrecisionAsOptional
     */
    @JsonGetter("optionalPrecision")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrecisionAsOptional getOptionalPrecision() {
        return optionalPrecision;
    }

    /**
     * Setter for OptionalPrecision.
     * @param optionalPrecision Value for PrecisionAsOptional
     */
    @JsonSetter("optionalPrecision")
    public void setOptionalPrecision(PrecisionAsOptional optionalPrecision) {
        this.optionalPrecision = optionalPrecision;
    }

    /**
     * Converts this AllOptionals into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllOptionals [" + "id=" + id + ", optionalNumbers=" + optionalNumbers
                + ", optionalLong=" + optionalLong + ", optionalPrecision=" + optionalPrecision
                + ", string=" + getMString() + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link AllOptionals.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllOptionals.Builder} object
     */
    public Builder toAllOptionalsBuilder() {
        Builder builder = new Builder()
                .optionalNumbers(getOptionalNumbers())
                .optionalLong(getOptionalLong())
                .optionalPrecision(getOptionalPrecision())
                .string(getMString());
        builder.id = internalGetId();
        return builder;
    }

    /**
     * Class to build instances of {@link AllOptionals}.
     */
    public static class Builder {
        private String string;
        private OptionalNullable<Integer> id;
        private List<NumberAsOptional> optionalNumbers;
        private LongAsOptional optionalLong;
        private PrecisionAsOptional optionalPrecision;



        /**
         * Setter for string.
         * @param  string  String value for string.
         * @return Builder
         */
        public Builder string(String string) {
            this.string = string;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for optionalNumbers.
         * @param  optionalNumbers  List of NumberAsOptional value for optionalNumbers.
         * @return Builder
         */
        public Builder optionalNumbers(List<NumberAsOptional> optionalNumbers) {
            this.optionalNumbers = optionalNumbers;
            return this;
        }

        /**
         * Setter for optionalLong.
         * @param  optionalLong  LongAsOptional value for optionalLong.
         * @return Builder
         */
        public Builder optionalLong(LongAsOptional optionalLong) {
            this.optionalLong = optionalLong;
            return this;
        }

        /**
         * Setter for optionalPrecision.
         * @param  optionalPrecision  PrecisionAsOptional value for optionalPrecision.
         * @return Builder
         */
        public Builder optionalPrecision(PrecisionAsOptional optionalPrecision) {
            this.optionalPrecision = optionalPrecision;
            return this;
        }

        /**
         * Builds a new {@link AllOptionals} object using the set fields.
         * @return {@link AllOptionals}
         */
        public AllOptionals build() {
            return new AllOptionals(string, id, optionalNumbers, optionalLong, optionalPrecision);
        }
    }
}
