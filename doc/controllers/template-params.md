# Template Params

```java
TemplateParamsController templateParamsController = client.getTemplateParamsController();
```

## Class Name

`TemplateParamsController`

## Methods

* [Send String Array](../../doc/controllers/template-params.md#send-string-array)
* [Send Integer Array](../../doc/controllers/template-params.md#send-integer-array)


# Send String Array

```java
CompletableFuture<EchoResponse> sendStringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Template, Required | - |

## Response Type

[`EchoResponse`](../../doc/models/echo-response.md)

## Example Usage

```java
List<String> strings = Arrays.asList(
    "strings5"
);

templateParamsController.sendStringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Integer Array

```java
CompletableFuture<EchoResponse> sendIntegerArrayAsync(
    final List<Integer> integers)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `integers` | `List<Integer>` | Template, Required | - |

## Response Type

[`EchoResponse`](../../doc/models/echo-response.md)

## Example Usage

```java
List<Integer> integers = Arrays.asList(
    45,
    46,
    47
);

templateParamsController.sendIntegerArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

