
# Nested Model Exception

## Structure

`NestedModelException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServerMessage` | `String` | Required | - | String getServerMessage() | setServerMessage(String serverMessage) |
| `ServerCode` | `String` | Required | - | String getServerCode() | setServerCode(String serverCode) |
| `Model` | [`Validate`](../../doc/models/validate.md) | Required | - | Validate getModel() | setModel(Validate model) |

## Example (as JSON)

```json
{
  "ServerMessage": "ServerMessage6",
  "ServerCode": "ServerCode0",
  "model": {
    "field": "field4",
    "name": "name2",
    "address": "address8"
  }
}
```

