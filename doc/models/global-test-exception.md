
# Global Test Exception

To test specific global exceptions.

## Structure

`GlobalTestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServerMessage` | `String` | Required | Represents the server's exception message | String getServerMessage() | setServerMessage(String serverMessage) |
| `ServerCode` | `int` | Required | Represents the server's error code | int getServerCode() | setServerCode(int serverCode) |

## Example (as JSON)

```json
{
  "ServerMessage": "ServerMessage6",
  "ServerCode": 170
}
```

