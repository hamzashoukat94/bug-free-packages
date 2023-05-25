
# Custom Error Response Exception

## Structure

`CustomErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorDescription` | `String` | Required | - | String getErrorDescription() | setErrorDescription(String errorDescription) |
| `Caught` | `String` | Required | - | String getCaught() | setCaught(String caught) |
| `Exception` | `String` | Required | - | String getException() | setException(String exception) |
| `InnerException` | `String` | Required | - | String getInnerException() | setInnerException(String innerException) |

## Example (as JSON)

```json
{
  "error description": "error description6",
  "caught": "Error in CatchInner caused by calling the ThrowInner method.",
  "Exception": "In catch block of Main method.",
  "Inner Exception": "AppException: Exception in ThrowInner method."
}
```

