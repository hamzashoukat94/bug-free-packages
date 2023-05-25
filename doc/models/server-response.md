
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Passed` | `boolean` | Required | - | boolean getPassed() | setPassed(boolean passed) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `Input` | `Map<String, Object>` | Optional | - | Map<String, Object> getInput() | setInput(Map<String, Object> input) |

## Example (as JSON)

```json
{
  "passed": false,
  "Message": "Message6",
  "input": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    },
    "key1": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

