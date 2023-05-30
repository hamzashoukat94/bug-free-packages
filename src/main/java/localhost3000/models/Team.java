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
 * Team to be used.
 */
public enum Team {
    CODEGEN,

    CGAAS,

    UX,

    QA;


    private static TreeMap<String, Team> valueMap = new TreeMap<>();
    private String value;

    static {
        CODEGEN.value = "codegen";
        CGAAS.value = "cgaas";
        UX.value = "ux";
        QA.value = "qa";

        valueMap.put("codegen", CODEGEN);
        valueMap.put("cgaas", CGAAS);
        valueMap.put("ux", UX);
        valueMap.put("qa", QA);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Team fromString(String toConvert) {
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
     * Convert list of Team values to list of string values.
     * @param toConvert The list of Team values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Team> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Team enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 