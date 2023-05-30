
# Complex Object in Exception

## Structure

`ComplexObjectInException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | [`Complex3`](../../doc/models/complex-3.md) | Required | - | Complex3 getBody() | setBody(Complex3 body) |

## Example (as JSON)

```json
{
  "body": {
    "documentId": "documentId4",
    "signers": [
      {
        "id": "id8",
        "url": "url2",
        "links": [
          "links4"
        ],
        "externalSignerId": "externalSignerId2",
        "redirectSettings": {
          "redirectMode": "redirectMode2"
        },
        "signatureType": {
          "mechanism": "mechanism2",
          "onEacceptUseHandWrittenSignature": false
        },
        "ui": {
          "dialogs": {
            "before": {
              "useCheckBox": false,
              "title": "title6",
              "message": "message0"
            }
          },
          "language": "NL",
          "styling": {
            "colorTheme": "colorTheme8",
            "spinner": "spinner6"
          }
        },
        "tags": [
          "tags3",
          "tags4",
          "tags5"
        ],
        "order": 252,
        "required": false
      },
      {
        "id": "id9",
        "url": "url3",
        "links": [
          "links5",
          "links6"
        ],
        "externalSignerId": "externalSignerId3",
        "redirectSettings": {
          "redirectMode": "redirectMode3"
        },
        "signatureType": {
          "mechanism": "mechanism3",
          "onEacceptUseHandWrittenSignature": true
        },
        "ui": {
          "dialogs": {
            "before": {
              "useCheckBox": true,
              "title": "title7",
              "message": "message1"
            }
          },
          "language": "EN",
          "styling": {
            "colorTheme": "colorTheme9",
            "spinner": "spinner7"
          }
        },
        "tags": [
          "tags4"
        ],
        "order": 251,
        "required": true
      },
      {
        "id": "id0",
        "url": "url4",
        "links": [
          "links6",
          "links7",
          "links8"
        ],
        "externalSignerId": "externalSignerId4",
        "redirectSettings": {
          "redirectMode": "redirectMode4"
        },
        "signatureType": {
          "mechanism": "mechanism4",
          "onEacceptUseHandWrittenSignature": false
        },
        "ui": {
          "dialogs": {
            "before": {
              "useCheckBox": false,
              "title": "title8",
              "message": "message2"
            }
          },
          "language": "DZ",
          "styling": {
            "colorTheme": "colorTheme0",
            "spinner": "spinner8"
          }
        },
        "tags": [
          "tags5",
          "tags6"
        ],
        "order": 250,
        "required": false
      }
    ],
    "status": {
      "documentStatus": "documentStatus6",
      "completedPackages": [
        "completedPackages8",
        "completedPackages9"
      ],
      "attachmentPackages": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "title": "title8",
    "description": "description4",
    "externalId": "externalId8",
    "dataToSign": {
      "fileName": "fileName2",
      "convertToPDF": false
    },
    "contactDetails": {
      "email": "email2",
      "url": "url8"
    },
    "advanced": {
      "tags": [
        "tags1"
      ],
      "attachments": 62,
      "requiredSignatures": 26,
      "getSocialSecurityNumber": false,
      "timeToLive": {
        "deadline": "deadline8",
        "deleteAfterHours": 28
      }
    }
  }
}
```

