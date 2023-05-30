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
 * SuiteCode to be used.
 */
public enum SuiteCode {
    HEARTS,

    SPADES,

    CLUBS,

    DIAMONDS;


    private static TreeMap<Integer, SuiteCode> valueMap = new TreeMap<>();
    private Integer value;

    static {
        HEARTS.value = 1;
        SPADES.value = 2;
        CLUBS.value = 3;
        DIAMONDS.value = 4;

        valueMap.put(1, HEARTS);
        valueMap.put(2, SPADES);
        valueMap.put(3, CLUBS);
        valueMap.put(4, DIAMONDS);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SuiteCode fromInteger(Integer toConvert) {
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
     * Convert list of SuiteCode values to list of integer values.
     * @param toConvert The list of SuiteCode values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<SuiteCode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (SuiteCode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 