
# Inner Complex Type

## Structure

`InnerComplexType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StringType` | `String` | Required | - | String getStringType() | setStringType(String stringType) |
| `BooleanType` | `boolean` | Required | - | boolean getBooleanType() | setBooleanType(boolean booleanType) |
| `DateTimeType` | `LocalDateTime` | Required | - | LocalDateTime getDateTimeType() | setDateTimeType(LocalDateTime dateTimeType) |
| `DateType` | `LocalDate` | Required | - | LocalDate getDateType() | setDateType(LocalDate dateType) |
| `UuidType` | `UUID` | Required | - | UUID getUuidType() | setUuidType(UUID uuidType) |
| `LongType` | `long` | Required | - | long getLongType() | setLongType(long longType) |
| `PrecisionType` | `double` | Required | - | double getPrecisionType() | setPrecisionType(double precisionType) |
| `ObjectType` | `Object` | Required | - | Object getObjectType() | setObjectType(Object objectType) |
| `StringListType` | `List<String>` | Required | - | List<String> getStringListType() | setStringListType(List<String> stringListType) |

## Example (as JSON)

```json
{
  "stringType": "stringType2",
  "booleanType": false,
  "dateTimeType": "2016-03-13T12:52:32.123Z",
  "dateType": "2016-03-13",
  "uuidType": "000006ce-0000-0000-0000-000000000000",
  "longType": 232,
  "precisionType": 143.22,
  "objectType": {
    "key1": "val1",
    "key2": "val2"
  },
  "stringListType": [
    "stringListType6",
    "stringListType7"
  ]
}
```

