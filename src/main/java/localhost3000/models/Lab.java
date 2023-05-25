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
 * This is a model class for Lab type.
 */
public class Lab
        extends BaseModel {
    private String name;
    private String time;
    private String location;

    /**
     * Default constructor.
     */
    public Lab() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  time  String value for time.
     * @param  location  String value for location.
     */
    public Lab(
            String name,
            String time,
            String location) {
        this.name = name;
        this.time = time;
        this.location = location;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Time.
     * @return Returns the String
     */
    @JsonGetter("time")
    public String getTime() {
        return time;
    }

    /**
     * Setter for Time.
     * @param time Value for String
     */
    @JsonSetter("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Getter for Location.
     * @return Returns the String
     */
    @JsonGetter("location")
    public String getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * @param location Value for String
     */
    @JsonSetter("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Converts this Lab into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Lab [" + "name=" + name + ", time=" + time + ", location=" + location
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Lab.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Lab.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, time, location);
        return builder;
    }

    /**
     * Class to build instances of {@link Lab}.
     */
    public static class Builder {
        private String name;
        private String time;
        private String location;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  time  String value for time.
         * @param  location  String value for location.
         */
        public Builder(String name, String time, String location) {
            this.name = name;
            this.time = time;
            this.location = location;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for time.
         * @param  time  String value for time.
         * @return Builder
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Setter for location.
         * @param  location  String value for location.
         * @return Builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Builds a new {@link Lab} object using the set fields.
         * @return {@link Lab}
         */
        public Lab build() {
            return new Lab(name, time, location);
        }
    }
}
