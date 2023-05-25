
# Status

## Structure

`Status`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentStatus` | `String` | Required | - | String getDocumentStatus() | setDocumentStatus(String documentStatus) |
| `CompletedPackages` | `List<String>` | Required | - | List<String> getCompletedPackages() | setCompletedPackages(List<String> completedPackages) |
| `AttachmentPackages` | `Object` | Required | - | Object getAttachmentPackages() | setAttachmentPackages(Object attachmentPackages) |

## Example (as JSON)

```json
{
  "documentStatus": "unsigned",
  "completedPackages": [],
  "attachmentPackages": {}
}
```

