
# Anticoagulant

## Structure

`Anticoagulant`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Strength` | `String` | Required | - | String getStrength() | setStrength(String strength) |
| `Dose` | `String` | Required | - | String getDose() | setDose(String dose) |
| `Route` | `String` | Required | - | String getRoute() | setRoute(String route) |
| `Sig` | `String` | Required | - | String getSig() | setSig(String sig) |
| `PillCount` | `String` | Required | - | String getPillCount() | setPillCount(String pillCount) |
| `Refills` | `String` | Required | - | String getRefills() | setRefills(String refills) |

## Example (as JSON)

```json
{
  "name": "warfarin sodium",
  "strength": "3 mg Tab",
  "dose": "1 tab",
  "route": "PO",
  "sig": "daily",
  "pillCount": "#90",
  "refills": "Refill 3"
}
```

