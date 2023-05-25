# Body Params

```java
BodyParamsController bodyParamsController = client.getBodyParamsController();
```

## Class Name

`BodyParamsController`

## Methods

* [Send Delete Plain Text](../../doc/controllers/body-params.md#send-delete-plain-text)
* [Send Delete Body](../../doc/controllers/body-params.md#send-delete-body)
* [Send Date Array](../../doc/controllers/body-params.md#send-date-array)
* [Send Date](../../doc/controllers/body-params.md#send-date)
* [Send Unix Date Time](../../doc/controllers/body-params.md#send-unix-date-time)
* [Send Rfc 1123 Date Time](../../doc/controllers/body-params.md#send-rfc-1123-date-time)
* [Send Rfc 3339 Date Time](../../doc/controllers/body-params.md#send-rfc-3339-date-time)
* [Send Unix Date Time Array](../../doc/controllers/body-params.md#send-unix-date-time-array)
* [Send Rfc 1123 Date Time Array](../../doc/controllers/body-params.md#send-rfc-1123-date-time-array)
* [Send Rfc 3339 Date Time Array](../../doc/controllers/body-params.md#send-rfc-3339-date-time-array)
* [Send String Array](../../doc/controllers/body-params.md#send-string-array)
* [Update String](../../doc/controllers/body-params.md#update-string)
* [Send Integer Array](../../doc/controllers/body-params.md#send-integer-array)
* [Wrap Body in Object](../../doc/controllers/body-params.md#wrap-body-in-object)
* [Additional Model Parameters](../../doc/controllers/body-params.md#additional-model-parameters)
* [Validate Required Parameter](../../doc/controllers/body-params.md#validate-required-parameter)
* [Additional Model Parameters 1](../../doc/controllers/body-params.md#additional-model-parameters-1)
* [Send Model](../../doc/controllers/body-params.md#send-model)
* [Send Model Array](../../doc/controllers/body-params.md#send-model-array)
* [Send Model Map](../../doc/controllers/body-params.md#send-model-map)
* [Send Dynamic](../../doc/controllers/body-params.md#send-dynamic)
* [Send String](../../doc/controllers/body-params.md#send-string)
* [Send String Enum Array](../../doc/controllers/body-params.md#send-string-enum-array)
* [Send Integer Enum Array](../../doc/controllers/body-params.md#send-integer-enum-array)
* [Update Model](../../doc/controllers/body-params.md#update-model)
* [Send Delete Body With Model](../../doc/controllers/body-params.md#send-delete-body-with-model)
* [Send Delete Body With Model Array](../../doc/controllers/body-params.md#send-delete-body-with-model-array)
* [Update Model Array](../../doc/controllers/body-params.md#update-model-array)
* [Update String 1](../../doc/controllers/body-params.md#update-string-1)
* [Update String Array](../../doc/controllers/body-params.md#update-string-array)
* [Send String With New Line](../../doc/controllers/body-params.md#send-string-with-new-line)
* [Send String With R](../../doc/controllers/body-params.md#send-string-with-r)
* [Send String in Body With R N](../../doc/controllers/body-params.md#send-string-in-body-with-r-n)
* [Send Optional Unix Date Time in Body](../../doc/controllers/body-params.md#send-optional-unix-date-time-in-body)
* [Send Optional Rfc 1123 in Body](../../doc/controllers/body-params.md#send-optional-rfc-1123-in-body)
* [Send Datetime Optional in Endpoint](../../doc/controllers/body-params.md#send-datetime-optional-in-endpoint)
* [Send Optional Unix Time Stamp in Model Body](../../doc/controllers/body-params.md#send-optional-unix-time-stamp-in-model-body)
* [Send Optional Unix Time Stamp in Nested Model Body](../../doc/controllers/body-params.md#send-optional-unix-time-stamp-in-nested-model-body)
* [Send Rfc 1123 Date Time in Nested Model](../../doc/controllers/body-params.md#send-rfc-1123-date-time-in-nested-model)
* [Send Rfc 1123 Date Time in Model](../../doc/controllers/body-params.md#send-rfc-1123-date-time-in-model)
* [Send Optional Datetime in Model](../../doc/controllers/body-params.md#send-optional-datetime-in-model)
* [Send Rfc 339 Date Time in Nested Models](../../doc/controllers/body-params.md#send-rfc-339-date-time-in-nested-models)
* [Uuid as Optional](../../doc/controllers/body-params.md#uuid-as-optional)
* [Boolean as Optional](../../doc/controllers/body-params.md#boolean-as-optional)
* [Date as Optional](../../doc/controllers/body-params.md#date-as-optional)
* [Dynamic as Optional](../../doc/controllers/body-params.md#dynamic-as-optional)
* [All Optionals](../../doc/controllers/body-params.md#all-optionals)
* [String as Optional](../../doc/controllers/body-params.md#string-as-optional)
* [Precision as Optional](../../doc/controllers/body-params.md#precision-as-optional)
* [Long as Optional](../../doc/controllers/body-params.md#long-as-optional)
* [Send Number as Optional](../../doc/controllers/body-params.md#send-number-as-optional)


# Send Delete Plain Text

```java
CompletableFuture<ServerResponse> sendDeletePlainTextAsync(
    final String textString)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `textString` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String textString = "textString2";

bodyParamsController.sendDeletePlainTextAsync(textString).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Body

```java
CompletableFuture<ServerResponse> sendDeleteBodyAsync(
    final DeleteBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeleteBody`](../../doc/models/delete-body.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DeleteBody body = new DeleteBody.Builder(
    "name6",
    "field0"
)
.build();

bodyParamsController.sendDeleteBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Date Array

```java
CompletableFuture<ServerResponse> sendDateArrayAsync(
    final List<LocalDate> dates)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `List<LocalDate>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = Arrays.asList(
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromSimpleDate("2016-03-13")
);

bodyParamsController.sendDateArrayAsync(dates).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Date

```java
CompletableFuture<ServerResponse> sendDateAsync(
    final LocalDate date)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `date` | `LocalDate` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDate date = DateTimeHelper.fromSimpleDate("2016-03-13");

bodyParamsController.sendDateAsync(date).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Unix Date Time

```java
CompletableFuture<ServerResponse> sendUnixDateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromUnixTimestamp(1480809600L);

bodyParamsController.sendUnixDateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 1123 Date Time

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

bodyParamsController.sendRfc1123DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 3339 Date Time

```java
CompletableFuture<ServerResponse> sendRfc3339DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z");

bodyParamsController.sendRfc3339DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Unix Date Time Array

```java
CompletableFuture<ServerResponse> sendUnixDateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L)
);

bodyParamsController.sendUnixDateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 1123 Date Time Array

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT")
);

bodyParamsController.sendRfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 3339 Date Time Array

```java
CompletableFuture<ServerResponse> sendRfc3339DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
);

bodyParamsController.sendRfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String Array

sends a string body param

```java
CompletableFuture<ServerResponse> sendStringArrayAsync(
    final List<String> sarray)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sarray` | `List<String>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> sarray = Arrays.asList(
    "sarray8",
    "sarray9"
);

bodyParamsController.sendStringArrayAsync(sarray).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update String

```java
CompletableFuture<ServerResponse> updateStringAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.updateStringAsync(value).thenAccept(result -> {
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
CompletableFuture<ServerResponse> sendIntegerArrayAsync(
    final List<Integer> integers)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `integers` | `List<Integer>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = Arrays.asList(
    45,
    46,
    47
);

bodyParamsController.sendIntegerArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Wrap Body in Object

```java
CompletableFuture<ServerResponse> wrapBodyInObjectAsync(
    final String field,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `field` | `String` | Body, Required | - |
| `name` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String field = "field6";
String name = "name0";

bodyParamsController.wrapBodyInObjectAsync(field, name).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Additional Model Parameters

```java
CompletableFuture<ServerResponse> additionalModelParametersAsync(
    final AdditionalModelParameters model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`AdditionalModelParameters`](../../doc/models/additional-model-parameters.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
AdditionalModelParameters model = new AdditionalModelParameters.Builder(
    "name2",
    "field4",
    "address8",
    new Job.Builder(
        "company8"
    )
    .build()
)
.build();

bodyParamsController.additionalModelParametersAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Validate Required Parameter

```java
CompletableFuture<ServerResponse> validateRequiredParameterAsync(
    final Validate model,
    final String option)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Validate`](../../doc/models/validate.md) | Body, Required | - |
| `option` | `String` | Query, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Validate model = new Validate.Builder(
    "field4",
    "name2"
)
.build();


bodyParamsController.validateRequiredParameterAsync(model, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Additional Model Parameters 1

```java
CompletableFuture<ServerResponse> additionalModelParameters1Async(
    final AdditionalModelParameters model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`AdditionalModelParameters`](../../doc/models/additional-model-parameters.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
AdditionalModelParameters model = new AdditionalModelParameters.Builder(
    "name2",
    "field4",
    "address8",
    new Job.Builder(
        "company8"
    )
    .build()
)
.build();

bodyParamsController.additionalModelParameters1Async(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Model

```java
CompletableFuture<ServerResponse> sendModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee.Builder(
    "address8",
    186L,
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    "name2",
    "uid2",
    "department8",
    Arrays.asList(
        new Person.Builder(
            "address5",
            237L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name9",
            "uid9"
        )
        .personType("Per")
        .build()
    ),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    Days.TUESDAY,
    240,
    Arrays.asList(
        Days.THURSDAY,
        Days.WEDNESDAY_,
        Days.TUESDAY
    ),
    new Person.Builder(
        "address6",
        158L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name0",
        "uid0"
    )
    .personType("Per")
    .build()
)
.personType("Empl")
.build();

bodyParamsController.sendModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Model Array

```java
CompletableFuture<ServerResponse> sendModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = Arrays.asList(
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department6",
        Arrays.asList(
            new Person.Builder(
                "address9",
                49L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name3",
                "uid3"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address1",
                51L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name5",
                "uid5"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.WEDNESDAY_,
        84,
        Arrays.asList(
            Days.SUNDAY
        ),
        new Person.Builder(
            "address0",
            154L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name4",
            "uid4"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build(),
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department7",
        Arrays.asList(
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.THURSDAY,
        85,
        Arrays.asList(
            Days.MONDAY,
            Days.TUESDAY
        ),
        new Person.Builder(
            "address1",
            155L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name5",
            "uid5"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build()
);

bodyParamsController.sendModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Model Map

```java
CompletableFuture<ServerResponse> sendModelMapAsync(
    final Map<String, Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`Map<String, Employee>`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Map<String, Employee> models = new LinkedHashMap<String, Employee>() {{
    put("key0", new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department6",
        Arrays.asList(
            new Person.Builder(
                "address9",
                49L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name3",
                "uid3"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address1",
                51L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name5",
                "uid5"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.WEDNESDAY_,
        84,
        Arrays.asList(
            Days.SUNDAY
        ),
        new Person.Builder(
            "address0",
            154L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name4",
            "uid4"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build());
    put("key1", new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department7",
        Arrays.asList(
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.THURSDAY,
        85,
        Arrays.asList(
            Days.MONDAY,
            Days.TUESDAY
        ),
        new Person.Builder(
            "address1",
            155L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name5",
            "uid5"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build());
}};

bodyParamsController.sendModelMapAsync(models).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Dynamic

```java
CompletableFuture<ServerResponse> sendDynamicAsync(
    final Object dynamic)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dynamic` | `Object` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Object dynamic = ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

bodyParamsController.sendDynamicAsync(dynamic).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String

```java
CompletableFuture<ServerResponse> sendStringAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.sendStringAsync(value).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String Enum Array

```java
CompletableFuture<ServerResponse> sendStringEnumArrayAsync(
    final List<Days> days)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `days` | [`List<Days>`](../../doc/models/days.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Days> days = Arrays.asList(
    Days.SUNDAY,
    Days.MONDAY,
    Days.TUESDAY
);

bodyParamsController.sendStringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Integer Enum Array

```java
CompletableFuture<ServerResponse> sendIntegerEnumArrayAsync(
    final List<SuiteCode> suites)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `suites` | [`List<SuiteCode>`](../../doc/models/suite-code.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = Arrays.asList(
    SuiteCode.HEARTS,
    SuiteCode.SPADES,
    SuiteCode.CLUBS
);

bodyParamsController.sendIntegerEnumArrayAsync(suites).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Model

```java
CompletableFuture<ServerResponse> updateModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee.Builder(
    "address8",
    186L,
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    "name2",
    "uid2",
    "department8",
    Arrays.asList(
        new Person.Builder(
            "address5",
            237L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name9",
            "uid9"
        )
        .personType("Per")
        .build()
    ),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    Days.TUESDAY,
    240,
    Arrays.asList(
        Days.THURSDAY,
        Days.WEDNESDAY_,
        Days.TUESDAY
    ),
    new Person.Builder(
        "address6",
        158L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name0",
        "uid0"
    )
    .personType("Per")
    .build()
)
.personType("Empl")
.build();

bodyParamsController.updateModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Body With Model

```java
CompletableFuture<ServerResponse> sendDeleteBodyWithModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee.Builder(
    "address8",
    186L,
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    "name2",
    "uid2",
    "department8",
    Arrays.asList(
        new Person.Builder(
            "address5",
            237L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name9",
            "uid9"
        )
        .personType("Per")
        .build()
    ),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    Days.TUESDAY,
    240,
    Arrays.asList(
        Days.THURSDAY,
        Days.WEDNESDAY_,
        Days.TUESDAY
    ),
    new Person.Builder(
        "address6",
        158L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name0",
        "uid0"
    )
    .personType("Per")
    .build()
)
.personType("Empl")
.build();

bodyParamsController.sendDeleteBodyWithModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Body With Model Array

```java
CompletableFuture<ServerResponse> sendDeleteBodyWithModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = Arrays.asList(
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department6",
        Arrays.asList(
            new Person.Builder(
                "address9",
                49L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name3",
                "uid3"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address1",
                51L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name5",
                "uid5"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.WEDNESDAY_,
        84,
        Arrays.asList(
            Days.SUNDAY
        ),
        new Person.Builder(
            "address0",
            154L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name4",
            "uid4"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build(),
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department7",
        Arrays.asList(
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.THURSDAY,
        85,
        Arrays.asList(
            Days.MONDAY,
            Days.TUESDAY
        ),
        new Person.Builder(
            "address1",
            155L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name5",
            "uid5"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build()
);

bodyParamsController.sendDeleteBodyWithModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Model Array

```java
CompletableFuture<ServerResponse> updateModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = Arrays.asList(
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department6",
        Arrays.asList(
            new Person.Builder(
                "address9",
                49L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name3",
                "uid3"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build(),
            new Person.Builder(
                "address1",
                51L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name5",
                "uid5"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.WEDNESDAY_,
        84,
        Arrays.asList(
            Days.SUNDAY
        ),
        new Person.Builder(
            "address0",
            154L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name4",
            "uid4"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build(),
    new Employee.Builder(
        "address0",
        82L,
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        "name4",
        "uid4",
        "department7",
        Arrays.asList(
            new Person.Builder(
                "address0",
                50L,
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                "name4",
                "uid4"
            )
            .personType("Per")
            .build()
        ),
        DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
        Days.THURSDAY,
        85,
        Arrays.asList(
            Days.MONDAY,
            Days.TUESDAY
        ),
        new Person.Builder(
            "address1",
            155L,
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            "name5",
            "uid5"
        )
        .personType("Per")
        .build()
    )
    .personType("Empl")
    .build()
);

bodyParamsController.updateModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update String 1

```java
CompletableFuture<ServerResponse> updateString1Async(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.updateString1Async(value).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update String Array

```java
CompletableFuture<ServerResponse> updateStringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> strings = Arrays.asList(
    "strings5"
);

bodyParamsController.updateStringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String With New Line

```java
CompletableFuture<ServerResponse> sendStringWithNewLineAsync(
    final TestNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestNstringEncoding`](../../doc/models/test-nstring-encoding.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestNstringEncoding body = new TestNstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

bodyParamsController.sendStringWithNewLineAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String With R

```java
CompletableFuture<ServerResponse> sendStringWithRAsync(
    final TestRstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRstringEncoding`](../../doc/models/test-rstring-encoding.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestRstringEncoding body = new TestRstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

bodyParamsController.sendStringWithRAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String in Body With R N

```java
CompletableFuture<ServerResponse> sendStringInBodyWithRNAsync(
    final TestRNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRNstringEncoding`](../../doc/models/test-r-nstring-encoding.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestRNstringEncoding body = new TestRNstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

bodyParamsController.sendStringInBodyWithRNAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Optional Unix Date Time in Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixDateTimeInBodyAsync(
    final LocalDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | `LocalDateTime` | Body, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = DateTimeHelper.fromUnixTimestamp(1484719381L);

bodyParamsController.sendOptionalUnixDateTimeInBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Optional Rfc 1123 in Body

```java
CompletableFuture<ServerResponse> sendOptionalRfc1123InBodyAsync(
    final LocalDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `LocalDateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

bodyParamsController.sendOptionalRfc1123InBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Datetime Optional in Endpoint

```java
CompletableFuture<ServerResponse> sendDatetimeOptionalInEndpointAsync(
    final LocalDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `LocalDateTime` | Body, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc8601DateTime("02/13/1994 14:01:54");

bodyParamsController.sendDatetimeOptionalInEndpointAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Optional Unix Time Stamp in Model Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInModelBodyAsync(
    final UnixDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
UnixDateTime dateTime = new UnixDateTime.Builder()
    .dateTime(DateTimeHelper.fromUnixTimestamp(1484719381L))
    .build();

bodyParamsController.sendOptionalUnixTimeStampInModelBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Optional Unix Time Stamp in Nested Model Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInNestedModelBodyAsync(
    final SendUnixDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`SendUnixDateTime`](../../doc/models/send-unix-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendUnixDateTime dateTime = new SendUnixDateTime.Builder()
    .dateTime(new UnixDateTime.Builder()
        .dateTime(DateTimeHelper.fromUnixTimestamp(1484719381L))
        .build())
    .build();

bodyParamsController.sendOptionalUnixTimeStampInNestedModelBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 1123 Date Time in Nested Model

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeInNestedModelAsync(
    final SendRfc1123DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SendRfc1123DateTime`](../../doc/models/send-rfc-1123-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendRfc1123DateTime body = new SendRfc1123DateTime.Builder()
    .dateTime(new ModelWithOptionalRfc1123DateTime.Builder()
        .dateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"))
        .build())
    .build();

bodyParamsController.sendRfc1123DateTimeInNestedModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 1123 Date Time in Model

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeInModelAsync(
    final ModelWithOptionalRfc1123DateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`ModelWithOptionalRfc1123DateTime`](../../doc/models/model-with-optional-rfc-1123-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc1123DateTime dateTime = new ModelWithOptionalRfc1123DateTime.Builder()
    .dateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"))
    .build();

bodyParamsController.sendRfc1123DateTimeInModelAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Optional Datetime in Model

```java
CompletableFuture<ServerResponse> sendOptionalDatetimeInModelAsync(
    final ModelWithOptionalRfc3339DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithOptionalRfc3339DateTime`](../../doc/models/model-with-optional-rfc-3339-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc3339DateTime body = new ModelWithOptionalRfc3339DateTime.Builder()
    .dateTime(DateTimeHelper.fromRfc8601DateTime("1994-02-13T14:01:54.9571247Z"))
    .build();

bodyParamsController.sendOptionalDatetimeInModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Rfc 339 Date Time in Nested Models

```java
CompletableFuture<ServerResponse> sendRfc339DateTimeInNestedModelsAsync(
    final SendRfc339DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SendRfc339DateTime`](../../doc/models/send-rfc-339-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendRfc339DateTime body = new SendRfc339DateTime.Builder()
    .dateTime(new ModelWithOptionalRfc3339DateTime.Builder()
        .dateTime(DateTimeHelper.fromRfc8601DateTime("1994-02-13T14:01:54.9571247Z"))
        .build())
    .build();

bodyParamsController.sendRfc339DateTimeInNestedModelsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Uuid as Optional

```java
CompletableFuture<ServerResponse> uuidAsOptionalAsync(
    final UuidAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UuidAsOptional`](../../doc/models/uuid-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
UuidAsOptional body = new UuidAsOptional.Builder()
    .uuid(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"))
    .build();

bodyParamsController.uuidAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Boolean as Optional

```java
CompletableFuture<ServerResponse> booleanAsOptionalAsync(
    final BooleanAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BooleanAsOptional`](../../doc/models/boolean-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
BooleanAsOptional body = new BooleanAsOptional.Builder()
    .mBoolean(true)
    .build();

bodyParamsController.booleanAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Date as Optional

```java
CompletableFuture<ServerResponse> dateAsOptionalAsync(
    final DateAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DateAsOptional`](../../doc/models/date-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DateAsOptional body = new DateAsOptional.Builder()
    .date(DateTimeHelper.fromSimpleDate("1994-02-13"))
    .build();

bodyParamsController.dateAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Dynamic as Optional

```java
CompletableFuture<ServerResponse> dynamicAsOptionalAsync(
    final DynamicAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DynamicAsOptional`](../../doc/models/dynamic-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DynamicAsOptional body = new DynamicAsOptional.Builder()
    .dynamic(ApiHelper.deserialize("{\"dynamic\":\"test\"}"))
    .build();

bodyParamsController.dynamicAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# All Optionals

```java
CompletableFuture<ServerResponse> allOptionalsAsync(
    final AllOptionals body,
    final Optionals option)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AllOptionals`](../../doc/models/all-optionals.md) | Body, Required | - |
| `option` | [`Optionals`](../../doc/models/optionals.md) | Query, Optional | **Default**: `Optionals.EMPTYBODY` |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
AllOptionals body = new AllOptionals.Builder()
    .build();

Optionals option = Optionals.EMPTYBODY;

bodyParamsController.allOptionalsAsync(body, option).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# String as Optional

```java
CompletableFuture<ServerResponse> stringAsOptionalAsync(
    final StringAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`StringAsOptional`](../../doc/models/string-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
StringAsOptional body = new StringAsOptional.Builder()
    .string("test")
    .build();

bodyParamsController.stringAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Precision as Optional

```java
CompletableFuture<ServerResponse> precisionAsOptionalAsync(
    final PrecisionAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PrecisionAsOptional`](../../doc/models/precision-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
PrecisionAsOptional body = new PrecisionAsOptional.Builder()
    .precision(1.23)
    .build();

bodyParamsController.precisionAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Long as Optional

```java
CompletableFuture<ServerResponse> longAsOptionalAsync(
    final LongAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LongAsOptional`](../../doc/models/long-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LongAsOptional body = new LongAsOptional.Builder()
    .mLong(123123L)
    .build();

bodyParamsController.longAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Number as Optional

```java
CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
    final NumberAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NumberAsOptional`](../../doc/models/number-as-optional.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
NumberAsOptional body = new NumberAsOptional.Builder()
    .number(1)
    .build();

bodyParamsController.sendNumberAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

