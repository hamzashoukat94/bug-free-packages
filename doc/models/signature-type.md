
# Signature Type

## Structure

`SignatureType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mechanism` | `String` | Required | - | String getMechanism() | setMechanism(String mechanism) |
| `OnEacceptUseHandWrittenSignature` | `boolean` | Required | - | boolean getOnEacceptUseHandWrittenSignature() | setOnEacceptUseHandWrittenSignature(boolean onEacceptUseHandWrittenSignature) |

## Example (as JSON)

```json
{
  "mechanism": "pkisignature",
  "onEacceptUseHandWrittenSignature": false
}
```

