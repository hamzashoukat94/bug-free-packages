# Echo

```java
EchoController echoController = client.getEchoController();
```

## Class Name

`EchoController`

## Methods

* [Query Echo](../../doc/controllers/echo.md#query-echo)
* [Json Echo](../../doc/controllers/echo.md#json-echo)
* [Form Echo](../../doc/controllers/echo.md#form-echo)


# Query Echo

```java
CompletableFuture<EchoResponse> queryEchoAsync(
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`EchoResponse`](../../doc/models/echo-response.md)

## Example Usage

```java
Map<String, Object> queryParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalQueryParams2\""));
}};

echoController.queryEchoAsync(queryParameters).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Json Echo

Echo's back the request

```java
CompletableFuture<DynamicResponse> jsonEchoAsync(
    final Object input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | `Object` | Body, Required | - |

## Response Type

`DynamicResponse`

## Example Usage

```java
Object input = ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

echoController.jsonEchoAsync(input).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Form Echo

Sends the request including any form params as JSON

```java
CompletableFuture<DynamicResponse> formEchoAsync(
    final Object input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | `Object` | Form, Required | - |

## Response Type

`DynamicResponse`

## Example Usage

```java
Object input = ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

echoController.formEchoAsync(input).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

