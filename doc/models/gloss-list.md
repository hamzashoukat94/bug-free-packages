
# Gloss List

## Structure

`GlossList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GlossEntry` | [`GlossEntry`](../../doc/models/gloss-entry.md) | Required | - | GlossEntry getGlossEntry() | setGlossEntry(GlossEntry glossEntry) |

## Example (as JSON)

```json
{
  "GlossEntry": {
    "ID": "SGML",
    "SortAs": "SGML",
    "GlossTerm": "Standard Generalized Markup Language",
    "Acronym": "SGML",
    "Abbrev": "ISO 8879:1986",
    "GlossDef": {
      "para": "A meta-markup language, used to create markup languages such as DocBook.",
      "GlossSeeAlso": [
        "GML",
        "XML"
      ]
    },
    "GlossSee": "markup"
  }
}
```

