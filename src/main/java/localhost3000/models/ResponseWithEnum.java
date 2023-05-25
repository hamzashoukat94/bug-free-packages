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
 * This is a model class for ResponseWithEnum type.
 */
public class ResponseWithEnum
        extends BaseModel {
    private ParamFormat paramFormat;
    private boolean optional;
    private Type type;
    private boolean constant;
    private boolean isArray;
    private boolean isStream;
    private boolean isAttribute;
    private boolean isMap;
    private Attributes attributes;
    private boolean nullable;
    private String id;
    private String name;
    private String description;

    /**
     * Default constructor.
     */
    public ResponseWithEnum() {
    }

    /**
     * Initialization constructor.
     * @param  paramFormat  ParamFormat value for paramFormat.
     * @param  optional  boolean value for optional.
     * @param  type  Type value for type.
     * @param  constant  boolean value for constant.
     * @param  isArray  boolean value for isArray.
     * @param  isStream  boolean value for isStream.
     * @param  isAttribute  boolean value for isAttribute.
     * @param  isMap  boolean value for isMap.
     * @param  attributes  Attributes value for attributes.
     * @param  nullable  boolean value for nullable.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  description  String value for description.
     */
    public ResponseWithEnum(
            ParamFormat paramFormat,
            boolean optional,
            Type type,
            boolean constant,
            boolean isArray,
            boolean isStream,
            boolean isAttribute,
            boolean isMap,
            Attributes attributes,
            boolean nullable,
            String id,
            String name,
            String description) {
        this.paramFormat = paramFormat;
        this.optional = optional;
        this.type = type;
        this.constant = constant;
        this.isArray = isArray;
        this.isStream = isStream;
        this.isAttribute = isAttribute;
        this.isMap = isMap;
        this.attributes = attributes;
        this.nullable = nullable;
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Getter for ParamFormat.
     * @return Returns the ParamFormat
     */
    @JsonGetter("paramFormat")
    public ParamFormat getParamFormat() {
        return paramFormat;
    }

    /**
     * Setter for ParamFormat.
     * @param paramFormat Value for ParamFormat
     */
    @JsonSetter("paramFormat")
    public void setParamFormat(ParamFormat paramFormat) {
        this.paramFormat = paramFormat;
    }

    /**
     * Getter for Optional.
     * @return Returns the boolean
     */
    @JsonGetter("optional")
    public boolean getOptional() {
        return optional;
    }

    /**
     * Setter for Optional.
     * @param optional Value for boolean
     */
    @JsonSetter("optional")
    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    /**
     * Getter for Type.
     * @return Returns the Type
     */
    @JsonGetter("type")
    public Type getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for Type
     */
    @JsonSetter("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Getter for Constant.
     * @return Returns the boolean
     */
    @JsonGetter("constant")
    public boolean getConstant() {
        return constant;
    }

    /**
     * Setter for Constant.
     * @param constant Value for boolean
     */
    @JsonSetter("constant")
    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    /**
     * Getter for IsArray.
     * @return Returns the boolean
     */
    @JsonGetter("isArray")
    public boolean getIsArray() {
        return isArray;
    }

    /**
     * Setter for IsArray.
     * @param isArray Value for boolean
     */
    @JsonSetter("isArray")
    public void setIsArray(boolean isArray) {
        this.isArray = isArray;
    }

    /**
     * Getter for IsStream.
     * @return Returns the boolean
     */
    @JsonGetter("isStream")
    public boolean getIsStream() {
        return isStream;
    }

    /**
     * Setter for IsStream.
     * @param isStream Value for boolean
     */
    @JsonSetter("isStream")
    public void setIsStream(boolean isStream) {
        this.isStream = isStream;
    }

    /**
     * Getter for IsAttribute.
     * @return Returns the boolean
     */
    @JsonGetter("isAttribute")
    public boolean getIsAttribute() {
        return isAttribute;
    }

    /**
     * Setter for IsAttribute.
     * @param isAttribute Value for boolean
     */
    @JsonSetter("isAttribute")
    public void setIsAttribute(boolean isAttribute) {
        this.isAttribute = isAttribute;
    }

    /**
     * Getter for IsMap.
     * @return Returns the boolean
     */
    @JsonGetter("isMap")
    public boolean getIsMap() {
        return isMap;
    }

    /**
     * Setter for IsMap.
     * @param isMap Value for boolean
     */
    @JsonSetter("isMap")
    public void setIsMap(boolean isMap) {
        this.isMap = isMap;
    }

    /**
     * Getter for Attributes.
     * @return Returns the Attributes
     */
    @JsonGetter("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * @param attributes Value for Attributes
     */
    @JsonSetter("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for Nullable.
     * @return Returns the boolean
     */
    @JsonGetter("nullable")
    public boolean getNullable() {
        return nullable;
    }

    /**
     * Setter for Nullable.
     * @param nullable Value for boolean
     */
    @JsonSetter("nullable")
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this ResponseWithEnum into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResponseWithEnum [" + "paramFormat=" + paramFormat + ", optional=" + optional
                + ", type=" + type + ", constant=" + constant + ", isArray=" + isArray
                + ", isStream=" + isStream + ", isAttribute=" + isAttribute + ", isMap=" + isMap
                + ", attributes=" + attributes + ", nullable=" + nullable + ", id=" + id + ", name="
                + name + ", description=" + description + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ResponseWithEnum.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResponseWithEnum.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paramFormat, optional, type, constant, isArray, isStream,
                isAttribute, isMap, attributes, nullable, id, name, description);
        return builder;
    }

    /**
     * Class to build instances of {@link ResponseWithEnum}.
     */
    public static class Builder {
        private ParamFormat paramFormat;
        private boolean optional;
        private Type type;
        private boolean constant;
        private boolean isArray;
        private boolean isStream;
        private boolean isAttribute;
        private boolean isMap;
        private Attributes attributes;
        private boolean nullable;
        private String id;
        private String name;
        private String description;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paramFormat  ParamFormat value for paramFormat.
         * @param  optional  boolean value for optional.
         * @param  type  Type value for type.
         * @param  constant  boolean value for constant.
         * @param  isArray  boolean value for isArray.
         * @param  isStream  boolean value for isStream.
         * @param  isAttribute  boolean value for isAttribute.
         * @param  isMap  boolean value for isMap.
         * @param  attributes  Attributes value for attributes.
         * @param  nullable  boolean value for nullable.
         * @param  id  String value for id.
         * @param  name  String value for name.
         * @param  description  String value for description.
         */
        public Builder(ParamFormat paramFormat, boolean optional, Type type, boolean constant,
                boolean isArray, boolean isStream, boolean isAttribute, boolean isMap,
                Attributes attributes, boolean nullable, String id, String name,
                String description) {
            this.paramFormat = paramFormat;
            this.optional = optional;
            this.type = type;
            this.constant = constant;
            this.isArray = isArray;
            this.isStream = isStream;
            this.isAttribute = isAttribute;
            this.isMap = isMap;
            this.attributes = attributes;
            this.nullable = nullable;
            this.id = id;
            this.name = name;
            this.description = description;
        }

        /**
         * Setter for paramFormat.
         * @param  paramFormat  ParamFormat value for paramFormat.
         * @return Builder
         */
        public Builder paramFormat(ParamFormat paramFormat) {
            this.paramFormat = paramFormat;
            return this;
        }

        /**
         * Setter for optional.
         * @param  optional  boolean value for optional.
         * @return Builder
         */
        public Builder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type value for type.
         * @return Builder
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for constant.
         * @param  constant  boolean value for constant.
         * @return Builder
         */
        public Builder constant(boolean constant) {
            this.constant = constant;
            return this;
        }

        /**
         * Setter for isArray.
         * @param  isArray  boolean value for isArray.
         * @return Builder
         */
        public Builder isArray(boolean isArray) {
            this.isArray = isArray;
            return this;
        }

        /**
         * Setter for isStream.
         * @param  isStream  boolean value for isStream.
         * @return Builder
         */
        public Builder isStream(boolean isStream) {
            this.isStream = isStream;
            return this;
        }

        /**
         * Setter for isAttribute.
         * @param  isAttribute  boolean value for isAttribute.
         * @return Builder
         */
        public Builder isAttribute(boolean isAttribute) {
            this.isAttribute = isAttribute;
            return this;
        }

        /**
         * Setter for isMap.
         * @param  isMap  boolean value for isMap.
         * @return Builder
         */
        public Builder isMap(boolean isMap) {
            this.isMap = isMap;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  Attributes value for attributes.
         * @return Builder
         */
        public Builder attributes(Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for nullable.
         * @param  nullable  boolean value for nullable.
         * @return Builder
         */
        public Builder nullable(boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ResponseWithEnum} object using the set fields.
         * @return {@link ResponseWithEnum}
         */
        public ResponseWithEnum build() {
            return new ResponseWithEnum(paramFormat, optional, type, constant, isArray, isStream,
                    isAttribute, isMap, attributes, nullable, id, name, description);
        }
    }
}
