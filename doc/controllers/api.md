# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`


# Get Basic Auth Test

```java
CompletableFuture<String> getBasicAuthTestAsync()
```

## Response Type

`String`

## Example Usage

```java
aPIController.getBasicAuthTestAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

