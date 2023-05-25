# Error Codes

```java
ErrorCodesController errorCodesController = client.getErrorCodesController();
```

## Class Name

`ErrorCodesController`

## Methods

* [Catch 412 Global Error](../../doc/controllers/error-codes.md#catch-412-global-error)
* [Get 501](../../doc/controllers/error-codes.md#get-501)
* [Get 400](../../doc/controllers/error-codes.md#get-400)
* [Get 500](../../doc/controllers/error-codes.md#get-500)
* [Get 401](../../doc/controllers/error-codes.md#get-401)
* [Receive Exception With Unixtimestamp Exception](../../doc/controllers/error-codes.md#receive-exception-with-unixtimestamp-exception)
* [Receive Exception With Rfc 1123 Datetime](../../doc/controllers/error-codes.md#receive-exception-with-rfc-1123-datetime)
* [Receive Exception With Rfc 3339 Datetime](../../doc/controllers/error-codes.md#receive-exception-with-rfc-3339-datetime)
* [Receive Endpoint Level Exception](../../doc/controllers/error-codes.md#receive-endpoint-level-exception)
* [Receive Global Level Exception](../../doc/controllers/error-codes.md#receive-global-level-exception)
* [Date in Exception](../../doc/controllers/error-codes.md#date-in-exception)
* [UUID in Exception](../../doc/controllers/error-codes.md#uuid-in-exception)
* [Dynamic in Exception](../../doc/controllers/error-codes.md#dynamic-in-exception)
* [Precision in Exception](../../doc/controllers/error-codes.md#precision-in-exception)
* [Boolean in Exception](../../doc/controllers/error-codes.md#boolean-in-exception)
* [Long in Exception](../../doc/controllers/error-codes.md#long-in-exception)
* [Number in Exception](../../doc/controllers/error-codes.md#number-in-exception)
* [Get Exception With String](../../doc/controllers/error-codes.md#get-exception-with-string)


# Catch 412 Global Error

```java
CompletableFuture<DynamicResponse> catch412GlobalErrorAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.catch412GlobalErrorAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 501

```java
CompletableFuture<DynamicResponse> get501Async()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.get501Async().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 501 | error 501 | [`NestedModelException`](../../doc/models/nested-model-exception.md) |


# Get 400

```java
CompletableFuture<DynamicResponse> get400Async()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.get400Async().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 500

```java
CompletableFuture<DynamicResponse> get500Async()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.get500Async().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 401

```java
CompletableFuture<DynamicResponse> get401Async()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.get401Async().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | 401 Local | [`LocalTestException`](../../doc/models/local-test-exception.md) |
| 421 | Default | [`LocalTestException`](../../doc/models/local-test-exception.md) |
| 431 | Default | [`LocalTestException`](../../doc/models/local-test-exception.md) |
| 432 | Default | [`LocalTestException`](../../doc/models/local-test-exception.md) |
| 441 | Default | [`LocalTestException`](../../doc/models/local-test-exception.md) |
| Default | Invalid response. | [`LocalTestException`](../../doc/models/local-test-exception.md) |


# Receive Exception With Unixtimestamp Exception

```java
CompletableFuture<DynamicResponse> receiveExceptionWithUnixtimestampExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.receiveExceptionWithUnixtimestampExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | unixtimestamp exception | [`UnixTimeStampException`](../../doc/models/unix-time-stamp-exception.md) |


# Receive Exception With Rfc 1123 Datetime

```java
CompletableFuture<DynamicResponse> receiveExceptionWithRfc1123DatetimeAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.receiveExceptionWithRfc1123DatetimeAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | Rfc1123 Exception | [`Rfc1123Exception`](../../doc/models/rfc-1123-exception.md) |


# Receive Exception With Rfc 3339 Datetime

```java
CompletableFuture<DynamicResponse> receiveExceptionWithRfc3339DatetimeAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.receiveExceptionWithRfc3339DatetimeAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | DateTime Exception | [`ExceptionWithRfc3339DateTimeException`](../../doc/models/exception-with-rfc-3339-date-time-exception.md) |


# Receive Endpoint Level Exception

```java
CompletableFuture<Complex5> receiveEndpointLevelExceptionAsync()
```

## Response Type

[`Complex5`](../../doc/models/complex-5.md)

## Example Usage

```java
errorCodesController.receiveEndpointLevelExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 451 | caught endpoint exception | [`CustomErrorResponseException`](../../doc/models/custom-error-response-exception.md) |


# Receive Global Level Exception

```java
CompletableFuture<Complex5> receiveGlobalLevelExceptionAsync()
```

## Response Type

[`Complex5`](../../doc/models/complex-5.md)

## Example Usage

```java
errorCodesController.receiveGlobalLevelExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Date in Exception

```java
CompletableFuture<DynamicResponse> dateInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.dateInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | date in exception | [`ExceptionWithDateException`](../../doc/models/exception-with-date-exception.md) |


# UUID in Exception

```java
CompletableFuture<DynamicResponse> uUIDInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.uUIDInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | uuid in exception | [`ExceptionWithUUIDException`](../../doc/models/exception-with-uuid-exception.md) |


# Dynamic in Exception

```java
CompletableFuture<DynamicResponse> dynamicInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.dynamicInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | dynamic in Exception | [`ExceptionWithDynamicException`](../../doc/models/exception-with-dynamic-exception.md) |


# Precision in Exception

```java
CompletableFuture<DynamicResponse> precisionInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.precisionInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | precision in Exception | [`ExceptionWithPrecisionException`](../../doc/models/exception-with-precision-exception.md) |


# Boolean in Exception

```java
CompletableFuture<DynamicResponse> booleanInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.booleanInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | Boolean in Exception | [`ExceptionWithBooleanException`](../../doc/models/exception-with-boolean-exception.md) |


# Long in Exception

```java
CompletableFuture<DynamicResponse> longInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.longInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | long in exception | [`ExceptionWithLongException`](../../doc/models/exception-with-long-exception.md) |


# Number in Exception

```java
CompletableFuture<DynamicResponse> numberInExceptionAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.numberInExceptionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | number in exception | [`ExceptionWithNumberException`](../../doc/models/exception-with-number-exception.md) |


# Get Exception With String

```java
CompletableFuture<DynamicResponse> getExceptionWithStringAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
errorCodesController.getExceptionWithStringAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 444 | exception with string | [`ExceptionWithStringException`](../../doc/models/exception-with-string-exception.md) |

