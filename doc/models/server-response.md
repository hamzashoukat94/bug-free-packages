
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `passed` | `boolean` | Required | - |
| `message` | `string \| undefined` | Optional | - |
| `input` | `Record<string, unknown> \| undefined` | Optional | - |

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

