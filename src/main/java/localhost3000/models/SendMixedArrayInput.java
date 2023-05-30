/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import localhost3000.utilities.FileWrapper;

/**
 * This is a model class for SendMixedArrayInput type.
 */
public class SendMixedArrayInput {
    private FileWrapper file;
    private List<Integer> integers;
    private List<Employee> models;
    private List<String> strings;

    /**
     * Default constructor.
     */
    public SendMixedArrayInput() {
    }

    /**
     * Initialization constructor.
     * @param  file  FileWrapper value for file.
     * @param  integers  List of Integer value for integers.
     * @param  models  List of Employee value for models.
     * @param  strings  List of String value for strings.
     */
    public SendMixedArrayInput(
            FileWrapper file,
            List<Integer> integers,
            List<Employee> models,
            List<String> strings) {
        this.file = file;
        this.integers = integers;
        this.models = models;
        this.strings = strings;
    }

    /**
     * Getter for File.
     * @return Returns the FileWrapper
     */
    @JsonGetter("file")
    public FileWrapper getFile() {
        return file;
    }

    /**
     * Setter for File.
     * @param file Value for FileWrapper
     */
    @JsonSetter("file")
    public void setFile(FileWrapper file) {
        this.file = file;
    }

    /**
     * Getter for Integers.
     * @return Returns the List of Integer
     */
    @JsonGetter("integers")
    public List<Integer> getIntegers() {
        return integers;
    }

    /**
     * Setter for Integers.
     * @param integers Value for List of Integer
     */
    @JsonSetter("integers")
    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    /**
     * Getter for Models.
     * @return Returns the List of Employee
     */
    @JsonGetter("models")
    public List<Employee> getModels() {
        return models;
    }

    /**
     * Setter for Models.
     * @param models Value for List of Employee
     */
    @JsonSetter("models")
    public void setModels(List<Employee> models) {
        this.models = models;
    }

    /**
     * Getter for Strings.
     * @return Returns the List of String
     */
    @JsonGetter("strings")
    public List<String> getStrings() {
        return strings;
    }

    /**
     * Setter for Strings.
     * @param strings Value for List of String
     */
    @JsonSetter("strings")
    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    /**
     * Converts this SendMixedArrayInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendMixedArrayInput [" + "file=" + file + ", integers=" + integers + ", models="
                + models + ", strings=" + strings + "]";
    }

    /**
     * Builds a new {@link SendMixedArrayInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendMixedArrayInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(file, integers, models, strings);
        return builder;
    }

    /**
     * Class to build instances of {@link SendMixedArrayInput}.
     */
    public static class Builder {
        private FileWrapper file;
        private List<Integer> integers;
        private List<Employee> models;
        private List<String> strings;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  file  FileWrapper value for file.
         * @param  integers  List of Integer value for integers.
         * @param  models  List of Employee value for models.
         * @param  strings  List of String value for strings.
         */
        public Builder(FileWrapper file, List<Integer> integers, List<Employee> models,
                List<String> strings) {
            this.file = file;
            this.integers = integers;
            this.models = models;
            this.strings = strings;
        }

        /**
         * Setter for file.
         * @param  file  FileWrapper value for file.
         * @return Builder
         */
        public Builder file(FileWrapper file) {
            this.file = file;
            return this;
        }

        /**
         * Setter for integers.
         * @param  integers  List of Integer value for integers.
         * @return Builder
         */
        public Builder integers(List<Integer> integers) {
            this.integers = integers;
            return this;
        }

        /**
         * Setter for models.
         * @param  models  List of Employee value for models.
         * @return Builder
         */
        public Builder models(List<Employee> models) {
            this.models = models;
            return this;
        }

        /**
         * Setter for strings.
         * @param  strings  List of String value for strings.
         * @return Builder
         */
        public Builder strings(List<String> strings) {
            this.strings = strings;
            return this;
        }

        /**
         * Builds a new {@link SendMixedArrayInput} object using the set fields.
         * @return {@link SendMixedArrayInput}
         */
        public SendMixedArrayInput build() {
            return new SendMixedArrayInput(file, integers, models, strings);
        }
    }
}
