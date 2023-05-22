
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Passed` | `bool` | Required | - |
| `Message` | `string` | Optional | - |
| `Input` | `object` | Optional | - |

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

