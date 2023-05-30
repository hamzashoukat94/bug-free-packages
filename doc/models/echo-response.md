
# Echo Response

Raw http Request info

## Structure

`EchoResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `Map<String, Object>` | Optional | - | Map<String, Object> getBody() | setBody(Map<String, Object> body) |
| `Headers` | `Map<String, String>` | Optional | - | Map<String, String> getHeaders() | setHeaders(Map<String, String> headers) |
| `Method` | `String` | Optional | - | String getMethod() | setMethod(String method) |
| `Path` | `String` | Optional | relativePath | String getPath() | setPath(String path) |
| `Query` | [`Map<String, QueryParameter>`](../../doc/models/query-parameter.md) | Optional | - | Map<String, QueryParameter> getQuery() | setQuery(Map<String, QueryParameter> query) |
| `UploadCount` | `Integer` | Optional | - | Integer getUploadCount() | setUploadCount(Integer uploadCount) |

## Example (as JSON)

```json
{
  "body": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    },
    "key1": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "headers": {
    "key0": "headers3",
    "key1": "headers4"
  },
  "method": "method6",
  "path": "path6",
  "query": {
    "key0": {
      "key": "key5"
    },
    "key1": {
      "key": "key6"
    },
    "key2": {
      "key": "key7"
    }
  }
}
```

