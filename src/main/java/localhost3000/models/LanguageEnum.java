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
 * LanguageEnum to be used.
 */
public enum LanguageEnum {
    EN,

    DZ,

    NL;


    private static TreeMap<String, LanguageEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        EN.value = "EN";
        DZ.value = "DZ";
        NL.value = "NL";

        valueMap.put("EN", EN);
        valueMap.put("DZ", DZ);
        valueMap.put("NL", NL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LanguageEnum fromString(String toConvert) {
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
     * Convert list of LanguageEnum values to list of string values.
     * @param toConvert The list of LanguageEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LanguageEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LanguageEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 