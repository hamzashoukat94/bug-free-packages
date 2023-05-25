
# Medication

## Structure

`Medication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AceInhibitors` | [`List<AceInhibitor>`](../../doc/models/ace-inhibitor.md) | Required | - | List<AceInhibitor> getAceInhibitors() | setAceInhibitors(List<AceInhibitor> aceInhibitors) |
| `Antianginal` | [`List<Antianginal>`](../../doc/models/antianginal.md) | Required | - | List<Antianginal> getAntianginal() | setAntianginal(List<Antianginal> antianginal) |
| `Anticoagulants` | [`List<Anticoagulant>`](../../doc/models/anticoagulant.md) | Required | - | List<Anticoagulant> getAnticoagulants() | setAnticoagulants(List<Anticoagulant> anticoagulants) |
| `BetaBlocker` | [`List<BetaBlocker>`](../../doc/models/beta-blocker.md) | Required | - | List<BetaBlocker> getBetaBlocker() | setBetaBlocker(List<BetaBlocker> betaBlocker) |
| `Diuretic` | [`List<Diuretic>`](../../doc/models/diuretic.md) | Required | - | List<Diuretic> getDiuretic() | setDiuretic(List<Diuretic> diuretic) |
| `Mineral` | [`List<Mineral>`](../../doc/models/mineral.md) | Required | - | List<Mineral> getMineral() | setMineral(List<Mineral> mineral) |

## Example (as JSON)

```json
{
  "aceInhibitors": [
    {
      "name": "lisinopril",
      "strength": "10 mg Tab",
      "dose": "1 tab",
      "route": "PO",
      "sig": "daily",
      "pillCount": "#90",
      "refills": "Refill 3"
    }
  ],
  "antianginal": [
    {
      "name": "nitroglycerin",
      "strength": "0.4 mg Sublingual Tab",
      "dose": "1 tab",
      "route": "SL",
      "sig": "q15min PRN",
      "pillCount": "#30",
      "refills": "Refill 1"
    }
  ],
  "anticoagulants": [
    {
      "name": "warfarin sodium",
      "strength": "3 mg Tab",
      "dose": "1 tab",
      "route": "PO",
      "sig": "daily",
      "pillCount": "#90",
      "refills": "Refill 3"
    }
  ],
  "betaBlocker": [
    {
      "name": "metoprolol tartrate",
      "strength": "25 mg Tab",
      "dose": "1 tab",
      "route": "PO",
      "sig": "daily",
      "pillCount": "#90",
      "refills": "Refill 3"
    }
  ],
  "diuretic": [
    {
      "name": "furosemide",
      "strength": "40 mg Tab",
      "dose": "1 tab",
      "route": "PO",
      "sig": "daily",
      "pillCount": "#90",
      "refills": "Refill 3"
    }
  ],
  "mineral": [
    {
      "name": "potassium chloride ER",
      "strength": "10 mEq Tab",
      "dose": "1 tab",
      "route": "PO",
      "sig": "daily",
      "pillCount": "#90",
      "refills": "Refill 3"
    }
  ]
}
```

