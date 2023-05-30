/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Type to be used.
 */
public enum Type {
    ENUM_LONG,

    NUMBER,

    PRECISION,

    ENUM_BOOLEAN,

    DATETIME,

    DATE,

    ENUM_STRING;


    private static TreeMap<String, Type> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_LONG.value = "Long";
        NUMBER.value = "Number";
        PRECISION.value = "Precision";
        ENUM_BOOLEAN.value = "Boolean";
        DATETIME.value = "DateTime";
        DATE.value = "Date";
        ENUM_STRING.value = "String";

        valueMap.put("Long", ENUM_LONG);
        valueMap.put("Number", NUMBER);
        valueMap.put("Precision", PRECISION);
        valueMap.put("Boolean", ENUM_BOOLEAN);
        valueMap.put("DateTime", DATETIME);
        valueMap.put("Date", DATE);
        valueMap.put("String", ENUM_STRING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Type values to list of string values.
     * @param toConvert The list of Type values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Type> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Type enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 