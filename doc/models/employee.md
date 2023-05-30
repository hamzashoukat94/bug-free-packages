
# Employee

## Structure

`Employee`

## Inherits From

[`Person`](../../doc/models/person.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Department` | `String` | Required | - | String getDepartment() | setDepartment(String department) |
| `Dependents` | [`List<Person>`](../../doc/models/person.md) | Required | - | List<Person> getDependents() | setDependents(List<Person> dependents) |
| `HiredAt` | `LocalDateTime` | Required | - | LocalDateTime getHiredAt() | setHiredAt(LocalDateTime hiredAt) |
| `JoiningDay` | [`Days`](../../doc/models/days.md) | Required | **Default**: `Days.MONDAY` | Days getJoiningDay() | setJoiningDay(Days joiningDay) |
| `Salary` | `int` | Required | - | int getSalary() | setSalary(int salary) |
| `WorkingDays` | [`List<Days>`](../../doc/models/days.md) | Required | - | List<Days> getWorkingDays() | setWorkingDays(List<Days> workingDays) |
| `Boss` | [`Person`](../../doc/models/person.md) | Required | - | Person getBoss() | setBoss(Person boss) |

## Example (as JSON)

```json
{
  "department": "department0",
  "dependents": [
    {
      "address": "address3",
      "age": 45,
      "birthday": "2016-03-13",
      "birthtime": "2016-03-13T12:52:32.123Z",
      "name": "name7",
      "uid": "uid7",
      "personType": "Per"
    }
  ],
  "hiredAt": "Mon, 15 Jun 2009 20:45:30 GMT",
  "joiningDay": "Monday",
  "salary": 176,
  "workingDays": [
    "Monday"
  ],
  "boss": {
    "address": "address8",
    "age": 94,
    "birthday": "2016-03-13",
    "birthtime": "2016-03-13T12:52:32.123Z",
    "name": "name2",
    "uid": "uid2",
    "personType": "Per"
  },
  "address": "address2",
  "age": 10,
  "birthday": "2016-03-13",
  "birthtime": "2016-03-13T12:52:32.123Z",
  "name": "name6",
  "uid": "uid6",
  "personType": "Empl"
}
```

