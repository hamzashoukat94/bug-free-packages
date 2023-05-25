
# Advanced

## Structure

`Advanced`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Tags` | `List<String>` | Required | - | List<String> getTags() | setTags(List<String> tags) |
| `Attachments` | `int` | Required | - | int getAttachments() | setAttachments(int attachments) |
| `RequiredSignatures` | `int` | Required | - | int getRequiredSignatures() | setRequiredSignatures(int requiredSignatures) |
| `GetSocialSecurityNumber` | `boolean` | Required | - | boolean getGetSocialSecurityNumber() | setGetSocialSecurityNumber(boolean getSocialSecurityNumber) |
| `TimeToLive` | [`TimeToLive`](../../doc/models/time-to-live.md) | Required | - | TimeToLive getTimeToLive() | setTimeToLive(TimeToLive timeToLive) |

## Example (as JSON)

```json
{
  "tags": [
    "develop",
    "fun_with_documents"
  ],
  "attachments": 0,
  "requiredSignatures": 0,
  "getSocialSecurityNumber": false,
  "timeToLive": {
    "deadline": "2018-06-29T14:57:25Z",
    "deleteAfterHours": 1
  }
}
```

