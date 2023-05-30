
# Antianginal

## Structure

`Antianginal`

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
  "name": "nitroglycerin",
  "strength": "0.4 mg Sublingual Tab",
  "dose": "1 tab",
  "route": "SL",
  "sig": "q15min PRN",
  "pillCount": "#30",
  "refills": "Refill 1"
}
```

