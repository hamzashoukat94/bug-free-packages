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
 * ParamFormat to be used.
 */
public enum ParamFormat {
    TEMPLATE,

    FORM,

    BODY,

    HEADER,

    QUERY;


    private static TreeMap<String, ParamFormat> valueMap = new TreeMap<>();
    private String value;

    static {
        TEMPLATE.value = "Template";
        FORM.value = "Form";
        BODY.value = "Body";
        HEADER.value = "Header";
        QUERY.value = "Query";

        valueMap.put("Template", TEMPLATE);
        valueMap.put("Form", FORM);
        valueMap.put("Body", BODY);
        valueMap.put("Header", HEADER);
        valueMap.put("Query", QUERY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ParamFormat fromString(String toConvert) {
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
     * Convert list of ParamFormat values to list of string values.
     * @param toConvert The list of ParamFormat values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ParamFormat> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ParamFormat enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 