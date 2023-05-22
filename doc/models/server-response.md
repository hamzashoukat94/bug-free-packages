
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `passed` | `bool` | Required | - | getPassed(): bool | setPassed(bool passed): void |
| `message` | `?string` | Optional | - | getMessage(): ?string | setMessage(?string message): void |
| `input` | `?array` | Optional | - | getInput(): ?array | setInput(?array input): void |

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

