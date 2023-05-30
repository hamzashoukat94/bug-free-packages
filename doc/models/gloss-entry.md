
# Gloss Entry

## Structure

`GlossEntry`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ID` | `String` | Required | - | String getID() | setID(String iD) |
| `SortAs` | `String` | Required | - | String getSortAs() | setSortAs(String sortAs) |
| `GlossTerm` | `String` | Required | - | String getGlossTerm() | setGlossTerm(String glossTerm) |
| `Acronym` | `String` | Required | - | String getAcronym() | setAcronym(String acronym) |
| `Abbrev` | `String` | Required | - | String getAbbrev() | setAbbrev(String abbrev) |
| `GlossDef` | [`GlossDef`](../../doc/models/gloss-def.md) | Required | - | GlossDef getGlossDef() | setGlossDef(GlossDef glossDef) |
| `GlossSee` | `String` | Required | - | String getGlossSee() | setGlossSee(String glossSee) |

## Example (as JSON)

```json
{
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
```

