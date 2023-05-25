
# Additional Model Parameters

## Structure

`AdditionalModelParameters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Field` | `String` | Required | - | String getField() | setField(String field) |
| `Address` | `String` | Required | - | String getAddress() | setAddress(String address) |
| `Job` | [`Job`](../../doc/models/job.md) | Required | - | Job getJob() | setJob(Job job) |

## Example (as JSON)

```json
{
  "name": "name0",
  "field": "field6",
  "address": "address6",
  "Job": {
    "company": "company6"
  }
}
```

