
# Ui

## Structure

`Ui`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Dialogs` | [`Dialogs`](../../doc/models/dialogs.md) | Required | - | Dialogs getDialogs() | setDialogs(Dialogs dialogs) |
| `Language` | [`LanguageEnum`](../../doc/models/language-enum.md) | Required | - | LanguageEnum getLanguage() | setLanguage(LanguageEnum language) |
| `Styling` | [`Styling`](../../doc/models/styling.md) | Required | - | Styling getStyling() | setStyling(Styling styling) |

## Example (as JSON)

```json
{
  "dialogs": {
    "before": {
      "useCheckBox": false,
      "title": "Info",
      "message": "Please read the contract on the next pages carefully. Pay some extra attention to paragraph 5."
    }
  },
  "language": "EN",
  "styling": {
    "colorTheme": "Pink",
    "spinner": "Cubes"
  }
}
```

