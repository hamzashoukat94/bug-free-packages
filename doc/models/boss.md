
# Boss

Testing circular reference.

## Structure

`Boss`

## Inherits From

[`Employee`](../../doc/models/employee.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PromotedAt` | `LocalDateTime` | Required | - | LocalDateTime getPromotedAt() | setPromotedAt(LocalDateTime promotedAt) |
| `Assistant` | [`Employee`](../../doc/models/employee.md) | Required | - | Employee getAssistant() | setAssistant(Employee assistant) |

## Example (as JSON)

```json
{
  "address": "address0",
  "age": 170,
  "birthday": "2016-03-13",
  "birthtime": "2016-03-13T12:52:32.123Z",
  "name": "name4",
  "uid": "uid4",
  "personType": "Boss",
  "department": "department6",
  "dependents": [
    {
      "address": "address7",
      "age": 221,
      "birthday": "2016-03-13",
      "birthtime": "2016-03-13T12:52:32.123Z",
      "name": "name1",
      "uid": "uid1",
      "personType": "Per"
    },
    {
      "address": "address8",
      "age": 222,
      "birthday": "2016-03-13",
      "birthtime": "2016-03-13T12:52:32.123Z",
      "name": "name2",
      "uid": "uid2",
      "personType": "Per"
    },
    {
      "address": "address9",
      "age": 223,
      "birthday": "2016-03-13",
      "birthtime": "2016-03-13T12:52:32.123Z",
      "name": "name3",
      "uid": "uid3",
      "personType": "Per"
    }
  ],
  "hiredAt": "Mon, 15 Jun 2009 20:45:30 GMT",
  "joiningDay": "Saturday",
  "salary": 0,
  "workingDays": [
    "Wednesday"
  ],
  "boss": {
    "address": "address8",
    "age": 70,
    "birthday": "2016-03-13",
    "birthtime": "2016-03-13T12:52:32.123Z",
    "name": "name2",
    "uid": "uid2",
    "personType": "Per"
  },
  "promotedAt": 1480809600,
  "assistant": {
    "address": "address2",
    "age": 228,
    "birthday": "2016-03-13",
    "birthtime": "2016-03-13T12:52:32.123Z",
    "name": "name6",
    "uid": "uid6",
    "personType": "Empl",
    "department": "department4",
    "dependents": [
      {
        "address": "address9",
        "age": 23,
        "birthday": "2016-03-13",
        "birthtime": "2016-03-13T12:52:32.123Z",
        "name": "name3",
        "uid": "uid3",
        "personType": "Per"
      },
      {
        "address": "address0",
        "age": 24,
        "birthday": "2016-03-13",
        "birthtime": "2016-03-13T12:52:32.123Z",
        "name": "name4",
        "uid": "uid4",
        "personType": "Per"
      },
      {
        "address": "address1",
        "age": 25,
        "birthday": "2016-03-13",
        "birthtime": "2016-03-13T12:52:32.123Z",
        "name": "name5",
        "uid": "uid5",
        "personType": "Per"
      }
    ],
    "hiredAt": "Mon, 15 Jun 2009 20:45:30 GMT",
    "joiningDay": "Wednesday",
    "salary": 198,
    "workingDays": [
      "Sunday"
    ],
    "boss": {
      "address": "address0",
      "age": 128,
      "birthday": "2016-03-13",
      "birthtime": "2016-03-13T12:52:32.123Z",
      "name": "name4",
      "uid": "uid4",
      "personType": "Per"
    }
  }
}
```

