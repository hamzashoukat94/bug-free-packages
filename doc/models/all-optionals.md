
# All Optionals

## Structure

`AllOptionals`

## Inherits From

[`StringAsOptional`](../../doc/models/string-as-optional.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `OptionalNumbers` | [`List<NumberAsOptional>`](../../doc/models/number-as-optional.md) | Optional | - | List<NumberAsOptional> getOptionalNumbers() | setOptionalNumbers(List<NumberAsOptional> optionalNumbers) |
| `OptionalLong` | [`LongAsOptional`](../../doc/models/long-as-optional.md) | Optional | - | LongAsOptional getOptionalLong() | setOptionalLong(LongAsOptional optionalLong) |
| `OptionalPrecision` | [`PrecisionAsOptional`](../../doc/models/precision-as-optional.md) | Optional | - | PrecisionAsOptional getOptionalPrecision() | setOptionalPrecision(PrecisionAsOptional optionalPrecision) |

## Example (as JSON)

```json
{
  "string": "test",
  "id": 234,
  "optionalNumbers": [
    {
      "number": 34
    },
    {
      "number": 33
    },
    {
      "number": 32
    }
  ],
  "optionalLong": {
    "long": 176
  },
  "optionalPrecision": {
    "precision": 16.0
  }
}
```

