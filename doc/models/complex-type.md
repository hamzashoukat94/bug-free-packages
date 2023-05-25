
# Complex Type

## Structure

`ComplexType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NumberListType` | `List<Integer>` | Required | - | List<Integer> getNumberListType() | setNumberListType(List<Integer> numberListType) |
| `NumberMapType` | `Map<String, Integer>` | Required | - | Map<String, Integer> getNumberMapType() | setNumberMapType(Map<String, Integer> numberMapType) |
| `InnerComplexType` | [`InnerComplexType`](../../doc/models/inner-complex-type.md) | Required | - | InnerComplexType getInnerComplexType() | setInnerComplexType(InnerComplexType innerComplexType) |
| `InnerComplexListType` | [`List<InnerComplexType>`](../../doc/models/inner-complex-type.md) | Required | - | List<InnerComplexType> getInnerComplexListType() | setInnerComplexListType(List<InnerComplexType> innerComplexListType) |

## Example (as JSON)

```json
{
  "numberListType": [
    152
  ],
  "numberMapType": {
    "key0": 69,
    "key1": 70
  },
  "innerComplexType": {
    "stringType": "stringType8",
    "booleanType": false,
    "dateTimeType": "2016-03-13T12:52:32.123Z",
    "dateType": "2016-03-13",
    "uuidType": "00001742-0000-0000-0000-000000000000",
    "longType": 40,
    "precisionType": 8.18,
    "objectType": {
      "key1": "val1",
      "key2": "val2"
    },
    "stringListType": [
      "stringListType8"
    ]
  },
  "innerComplexListType": [
    {
      "stringType": "stringType6",
      "booleanType": false,
      "dateTimeType": "2016-03-13T12:52:32.123Z",
      "dateType": "2016-03-13",
      "uuidType": "00001cea-0000-0000-0000-000000000000",
      "longType": 160,
      "precisionType": 234.66,
      "objectType": {
        "key1": "val1",
        "key2": "val2"
      },
      "stringListType": [
        "stringListType6",
        "stringListType7",
        "stringListType8"
      ]
    }
  ]
}
```

