
# Gloss Def

## Structure

`GlossDef`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Para` | `String` | Required | - | String getPara() | setPara(String para) |
| `GlossSeeAlso` | `List<String>` | Required | - | List<String> getGlossSeeAlso() | setGlossSeeAlso(List<String> glossSeeAlso) |

## Example (as JSON)

```json
{
  "para": "A meta-markup language, used to create markup languages such as DocBook.",
  "GlossSeeAlso": [
    "GML",
    "XML"
  ]
}
```

