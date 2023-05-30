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
 * TeamInteger to be used.
 */
public enum TeamInteger {
    CODEGEN,

    CGAAS,

    UX,

    QA;


    private static TreeMap<Integer, TeamInteger> valueMap = new TreeMap<>();
    private Integer value;

    static {
        CODEGEN.value = 1;
        CGAAS.value = 2;
        UX.value = 3;
        QA.value = 4;

        valueMap.put(1, CODEGEN);
        valueMap.put(2, CGAAS);
        valueMap.put(3, UX);
        valueMap.put(4, QA);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static TeamInteger fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
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
     * Convert list of TeamInteger values to list of integer values.
     * @param toConvert The list of TeamInteger values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<TeamInteger> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (TeamInteger enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 