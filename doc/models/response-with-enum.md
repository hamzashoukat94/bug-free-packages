
# Response With Enum

## Structure

`ResponseWithEnum`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ParamFormat` | [`ParamFormat`](../../doc/models/param-format.md) | Required | - | ParamFormat getParamFormat() | setParamFormat(ParamFormat paramFormat) |
| `Optional` | `boolean` | Required | - | boolean getOptional() | setOptional(boolean optional) |
| `Type` | [`Type`](../../doc/models/type.md) | Required | - | Type getType() | setType(Type type) |
| `Constant` | `boolean` | Required | - | boolean getConstant() | setConstant(boolean constant) |
| `IsArray` | `boolean` | Required | - | boolean getIsArray() | setIsArray(boolean isArray) |
| `IsStream` | `boolean` | Required | - | boolean getIsStream() | setIsStream(boolean isStream) |
| `IsAttribute` | `boolean` | Required | - | boolean getIsAttribute() | setIsAttribute(boolean isAttribute) |
| `IsMap` | `boolean` | Required | - | boolean getIsMap() | setIsMap(boolean isMap) |
| `Attributes` | [`Attributes`](../../doc/models/attributes.md) | Required | - | Attributes getAttributes() | setAttributes(Attributes attributes) |
| `Nullable` | `boolean` | Required | - | boolean getNullable() | setNullable(boolean nullable) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "paramFormat": "Template",
  "optional": false,
  "type": "Long",
  "constant": false,
  "isArray": false,
  "isStream": false,
  "isAttribute": false,
  "isMap": false,
  "attributes": {
    "exclusiveMaximum": false,
    "exclusiveMinimum": false,
    "id": "5a9fcb01caacc310dc6bab51"
  },
  "nullable": false,
  "id": "5a9fcb01caacc310dc6bab50",
  "name": "petId",
  "description": "ID of pet to update"
}
```

