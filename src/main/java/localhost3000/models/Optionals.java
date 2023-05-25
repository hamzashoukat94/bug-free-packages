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
 * Optionals to be used.
 */
public enum Optionals {
    EMPTYBODY,

    BODYWITHEMPTYFIELDS,

    BODYWITHFIELDS;


    private static TreeMap<String, Optionals> valueMap = new TreeMap<>();
    private String value;

    static {
        EMPTYBODY.value = "empty";
        BODYWITHEMPTYFIELDS.value = "withEmptyFields";
        BODYWITHFIELDS.value = "withFields";

        valueMap.put("empty", EMPTYBODY);
        valueMap.put("withEmptyFields", BODYWITHEMPTYFIELDS);
        valueMap.put("withFields", BODYWITHFIELDS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Optionals fromString(String toConvert) {
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
     * Convert list of Optionals values to list of string values.
     * @param toConvert The list of Optionals values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Optionals> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Optionals enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 