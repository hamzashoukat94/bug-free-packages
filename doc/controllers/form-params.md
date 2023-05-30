# Form Params

```java
FormParamsController formParamsController = client.getFormParamsController();
```

## Class Name

`FormParamsController`

## Methods

* [Send Delete Form](../../doc/controllers/form-params.md#send-delete-form)
* [Send Date](../../doc/controllers/form-params.md#send-date)
* [Send Rfc 1123 Date Time](../../doc/controllers/form-params.md#send-rfc-1123-date-time)
* [Send Rfc 3339 Date Time](../../doc/controllers/form-params.md#send-rfc-3339-date-time)
* [Send Unix Date Time Array](../../doc/controllers/form-params.md#send-unix-date-time-array)
* [Send Optional Unix Date Time in Body](../../doc/controllers/form-params.md#send-optional-unix-date-time-in-body)
* [Date as Optional](../../doc/controllers/form-params.md#date-as-optional)
* [Precision as Optional](../../doc/controllers/form-params.md#precision-as-optional)
* [Send Long](../../doc/controllers/form-params.md#send-long)
* [Send String Array](../../doc/controllers/form-params.md#send-string-array)
* [Allow Dynamic Form Fields](../../doc/controllers/form-params.md#allow-dynamic-form-fields)
* [Send Model](../../doc/controllers/form-params.md#send-model)
* [Send Delete Form 1](../../doc/controllers/form-params.md#send-delete-form-1)
* [Update String With Form](../../doc/controllers/form-params.md#update-string-with-form)
* [Update String Array With Form](../../doc/controllers/form-params.md#update-string-array-with-form)
* [Send String in Form With R](../../doc/controllers/form-params.md#send-string-in-form-with-r)
* [All Optionals](../../doc/controllers/form-params.md#all-optionals)
* [Send Datetime Optional in Endpoint](../../doc/controllers/form-params.md#send-datetime-optional-in-endpoint)
* [Send Optional Datetime in Model](../../doc/controllers/form-params.md#send-optional-datetime-in-model)
* [Send Rfc 339 Date Time in Nested Models](../../doc/controllers/form-params.md#send-rfc-339-date-time-in-nested-models)
* [Uuid as Optional](../../doc/controllers/form-params.md#uuid-as-optional)
* [Boolean as Optional](../../doc/controllers/form-params.md#boolean-as-optional)
* [String as Optional](../../doc/controllers/form-params.md#string-as-optional)
* [Send Unix Date Time](../../doc/controllers/form-params.md#send-unix-date-time)
* [Send Rfc 1123 Date Time Array](../../doc/controllers/form-params.md#send-rfc-1123-date-time-array)
* [Send Integer Array](../../doc/controllers/form-params.md#send-integer-array)
* [Send Model Array](../../doc/controllers/form-params.md#send-model-array)
* [Send Multiple Files](../../doc/controllers/form-params.md#send-multiple-files)
* [Send Rfc 3339 Date Time Array](../../doc/controllers/form-params.md#send-rfc-3339-date-time-array)
* [Send Mixed Array](../../doc/controllers/form-params.md#send-mixed-array)
* [Send Delete Form With Model Array](../../doc/controllers/form-params.md#send-delete-form-with-model-array)
* [Send Integer Enum Array](../../doc/controllers/form-params.md#send-integer-enum-array)
* [Send String in Form With New Line](../../doc/controllers/form-params.md#send-string-in-form-with-new-line)
* [Send Optional Rfc 1123 in Body](../../doc/controllers/form-params.md#send-optional-rfc-1123-in-body)
* [Send Optional Unix Time Stamp in Nested Model Body](../../doc/controllers/form-params.md#send-optional-unix-time-stamp-in-nested-model-body)
* [Send Rfc 1123 Date Time in Model](../../doc/controllers/form-params.md#send-rfc-1123-date-time-in-model)
* [Send Number as Optional](../../doc/controllers/form-params.md#send-number-as-optional)
* [Send Delete Multipart](../../doc/controllers/form-params.md#send-delete-multipart)
* [Send Date Array](../../doc/controllers/form-params.md#send-date-array)
* [Send File](../../doc/controllers/form-params.md#send-file)
* [Send String](../../doc/controllers/form-params.md#send-string)
* [Update Model With Form](../../doc/controllers/form-params.md#update-model-with-form)
* [Update Model Array With Form](../../doc/controllers/form-params.md#update-model-array-with-form)
* [Send String Enum Array](../../doc/controllers/form-params.md#send-string-enum-array)
* [Send String in Form With R N](../../doc/controllers/form-params.md#send-string-in-form-with-r-n)
* [Send Optional Unix Time Stamp in Model Body](../../doc/controllers/form-params.md#send-optional-unix-time-stamp-in-model-body)
* [Send Rfc 1123 Date Time in Nested Model](../../doc/controllers/form-params.md#send-rfc-1123-date-time-in-nested-model)
* [Dynamic as Optional](../../doc/controllers/form-params.md#dynamic-as-optional)
* [Long as Optional](../../doc/controllers/form-params.md#long-as-optional)


# Send Delete Form

```java
CompletableFuture<ServerResponse> sendDeleteFormAsync(
    final DeleteBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeleteBody`](../../doc/models/delete-body.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DeleteBody body = new DeleteBody.Builder(
    "name6",
    "field0"
)
.build();

formParamsController.sendDeleteFormAsync(body).thenAccept(result -> {
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
| `date` | `LocalDate` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDate date = DateTimeHelper.fromSimpleDate("2016-03-13");

formParamsController.sendDateAsync(date).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

formParamsController.sendRfc1123DateTimeAsync(datetime).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z");

formParamsController.sendRfc3339DateTimeAsync(datetime).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L)
);

formParamsController.sendUnixDateTimeArrayAsync(datetimes).thenAccept(result -> {
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
| `dateTime` | `LocalDateTime` | Form, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = DateTimeHelper.fromUnixTimestamp(1484719381L);

formParamsController.sendOptionalUnixDateTimeInBodyAsync(dateTime).thenAccept(result -> {
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
| `body` | [`DateAsOptional`](../../doc/models/date-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DateAsOptional body = new DateAsOptional.Builder()
    .date(DateTimeHelper.fromSimpleDate("1994-02-13"))
    .build();

formParamsController.dateAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`PrecisionAsOptional`](../../doc/models/precision-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
PrecisionAsOptional body = new PrecisionAsOptional.Builder()
    .precision(1.23)
    .build();

formParamsController.precisionAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Long

```java
CompletableFuture<ServerResponse> sendLongAsync(
    final long value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `long` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
long value = 64L;

formParamsController.sendLongAsync(value).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String Array

```java
CompletableFuture<ServerResponse> sendStringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> strings = Arrays.asList(
    "strings5"
);

formParamsController.sendStringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Allow Dynamic Form Fields

```java
CompletableFuture<ServerResponse> allowDynamicFormFieldsAsync(
    final String name,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Form, Required | - |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String name = "name0";

Map<String, Object> fieldParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalFieldParams9\""));
}};

formParamsController.allowDynamicFormFieldsAsync(name, fieldParameters).thenAccept(result -> {
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
| `model` | [`Employee`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.sendModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Form 1

```java
CompletableFuture<ServerResponse> sendDeleteForm1Async(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.sendDeleteForm1Async(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update String With Form

```java
CompletableFuture<ServerResponse> updateStringWithFormAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

formParamsController.updateStringWithFormAsync(value).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update String Array With Form

```java
CompletableFuture<ServerResponse> updateStringArrayWithFormAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> strings = Arrays.asList(
    "strings5"
);

formParamsController.updateStringArrayWithFormAsync(strings).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String in Form With R

```java
CompletableFuture<ServerResponse> sendStringInFormWithRAsync(
    final TestRstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRstringEncoding`](../../doc/models/test-rstring-encoding.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestRstringEncoding body = new TestRstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

formParamsController.sendStringInFormWithRAsync(body).thenAccept(result -> {
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
    final AllOptionals model,
    final Optionals option)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`AllOptionals`](../../doc/models/all-optionals.md) | Form, Required | - |
| `option` | [`Optionals`](../../doc/models/optionals.md) | Form, Optional | **Default**: `Optionals.EMPTYBODY` |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
AllOptionals model = new AllOptionals.Builder()
    .build();

Optionals option = Optionals.EMPTYBODY;

formParamsController.allOptionalsAsync(model, option).thenAccept(result -> {
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
| `body` | `LocalDateTime` | Form, Optional | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc8601DateTime("02/13/1994 14:01:54");

formParamsController.sendDatetimeOptionalInEndpointAsync(body).thenAccept(result -> {
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
| `body` | [`ModelWithOptionalRfc3339DateTime`](../../doc/models/model-with-optional-rfc-3339-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc3339DateTime body = new ModelWithOptionalRfc3339DateTime.Builder()
    .dateTime(DateTimeHelper.fromRfc8601DateTime("1994-02-13T14:01:54.9571247Z"))
    .build();

formParamsController.sendOptionalDatetimeInModelAsync(body).thenAccept(result -> {
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
| `body` | [`SendRfc339DateTime`](../../doc/models/send-rfc-339-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendRfc339DateTime body = new SendRfc339DateTime.Builder()
    .dateTime(new ModelWithOptionalRfc3339DateTime.Builder()
        .dateTime(DateTimeHelper.fromRfc8601DateTime("1994-02-13T14:01:54.9571247Z"))
        .build())
    .build();

formParamsController.sendRfc339DateTimeInNestedModelsAsync(body).thenAccept(result -> {
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
| `body` | [`UuidAsOptional`](../../doc/models/uuid-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
UuidAsOptional body = new UuidAsOptional.Builder()
    .uuid(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"))
    .build();

formParamsController.uuidAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`BooleanAsOptional`](../../doc/models/boolean-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
BooleanAsOptional body = new BooleanAsOptional.Builder()
    .mBoolean(true)
    .build();

formParamsController.booleanAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`StringAsOptional`](../../doc/models/string-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
StringAsOptional body = new StringAsOptional.Builder()
    .string("test")
    .build();

formParamsController.stringAsOptionalAsync(body).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromUnixTimestamp(1480809600L);

formParamsController.sendUnixDateTimeAsync(datetime).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT")
);

formParamsController.sendRfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
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
| `integers` | `List<Integer>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = Arrays.asList(
    45,
    46,
    47
);

formParamsController.sendIntegerArrayAsync(integers).thenAccept(result -> {
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
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.sendModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Multiple Files

```java
CompletableFuture<ServerResponse> sendMultipleFilesAsync(
    final FileWrapper file,
    final FileWrapper file1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | - |
| `file1` | `FileWrapper` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");
FileWrapper file1 = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendMultipleFilesAsync(file, file1).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
);

formParamsController.sendRfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Mixed Array

Send a variety for form params. Returns file count and body params

```java
CompletableFuture<ServerResponse> sendMixedArrayAsync(
    final SendMixedArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | - |
| `integers` | `List<Integer>` | Form, Required | - |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Form, Required | - |
| `strings` | `List<String>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendMixedArrayInput sendMixedArrayInput = new SendMixedArrayInput.Builder(
    new FileWrapper(new File("dummy_file"), "optional-content-type"),
    Arrays.asList(
        45,
        46,
        47
    ),
    Arrays.asList(
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
    ),
    Arrays.asList(
        "strings5"
    )
)
.build();

formParamsController.sendMixedArrayAsync(sendMixedArrayInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Form With Model Array

```java
CompletableFuture<ServerResponse> sendDeleteFormWithModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.sendDeleteFormWithModelArrayAsync(models).thenAccept(result -> {
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
| `suites` | [`List<SuiteCode>`](../../doc/models/suite-code.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = Arrays.asList(
    SuiteCode.HEARTS,
    SuiteCode.SPADES,
    SuiteCode.CLUBS
);

formParamsController.sendIntegerEnumArrayAsync(suites).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String in Form With New Line

```java
CompletableFuture<ServerResponse> sendStringInFormWithNewLineAsync(
    final TestNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestNstringEncoding`](../../doc/models/test-nstring-encoding.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestNstringEncoding body = new TestNstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

formParamsController.sendStringInFormWithNewLineAsync(body).thenAccept(result -> {
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
| `body` | `LocalDateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

formParamsController.sendOptionalRfc1123InBodyAsync(body).thenAccept(result -> {
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
| `dateTime` | [`SendUnixDateTime`](../../doc/models/send-unix-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendUnixDateTime dateTime = new SendUnixDateTime.Builder()
    .dateTime(new UnixDateTime.Builder()
        .dateTime(DateTimeHelper.fromUnixTimestamp(1484719381L))
        .build())
    .build();

formParamsController.sendOptionalUnixTimeStampInNestedModelBodyAsync(dateTime).thenAccept(result -> {
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
| `dateTime` | [`ModelWithOptionalRfc1123DateTime`](../../doc/models/model-with-optional-rfc-1123-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc1123DateTime dateTime = new ModelWithOptionalRfc1123DateTime.Builder()
    .dateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"))
    .build();

formParamsController.sendRfc1123DateTimeInModelAsync(dateTime).thenAccept(result -> {
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
| `body` | [`NumberAsOptional`](../../doc/models/number-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
NumberAsOptional body = new NumberAsOptional.Builder()
    .number(1)
    .build();

formParamsController.sendNumberAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Delete Multipart

```java
CompletableFuture<ServerResponse> sendDeleteMultipartAsync(
    final FileWrapper file)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendDeleteMultipartAsync(file).thenAccept(result -> {
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
| `dates` | `List<LocalDate>` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = Arrays.asList(
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromSimpleDate("2016-03-13")
);

formParamsController.sendDateArrayAsync(dates).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send File

```java
CompletableFuture<ServerResponse> sendFileAsync(
    final FileWrapper file)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendFileAsync(file).thenAccept(result -> {
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
| `value` | `String` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

formParamsController.sendStringAsync(value).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Model With Form

```java
CompletableFuture<ServerResponse> updateModelWithFormAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.updateModelWithFormAsync(model).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Model Array With Form

```java
CompletableFuture<ServerResponse> updateModelArrayWithFormAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](../../doc/models/employee.md) | Form, Required | - |

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

formParamsController.updateModelArrayWithFormAsync(models).thenAccept(result -> {
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
| `days` | [`List<Days>`](../../doc/models/days.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Days> days = Arrays.asList(
    Days.SUNDAY,
    Days.MONDAY,
    Days.TUESDAY
);

formParamsController.sendStringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send String in Form With R N

```java
CompletableFuture<ServerResponse> sendStringInFormWithRNAsync(
    final TestRNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRNstringEncoding`](../../doc/models/test-r-nstring-encoding.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
TestRNstringEncoding body = new TestRNstringEncoding.Builder(
    "field0",
    "name6"
)
.build();

formParamsController.sendStringInFormWithRNAsync(body).thenAccept(result -> {
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
| `dateTime` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
UnixDateTime dateTime = new UnixDateTime.Builder()
    .dateTime(DateTimeHelper.fromUnixTimestamp(1484719381L))
    .build();

formParamsController.sendOptionalUnixTimeStampInModelBodyAsync(dateTime).thenAccept(result -> {
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
| `body` | [`SendRfc1123DateTime`](../../doc/models/send-rfc-1123-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
SendRfc1123DateTime body = new SendRfc1123DateTime.Builder()
    .dateTime(new ModelWithOptionalRfc1123DateTime.Builder()
        .dateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"))
        .build())
    .build();

formParamsController.sendRfc1123DateTimeInNestedModelAsync(body).thenAccept(result -> {
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
| `body` | [`DynamicAsOptional`](../../doc/models/dynamic-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
DynamicAsOptional body = new DynamicAsOptional.Builder()
    .dynamic(ApiHelper.deserialize("{\"dynamic\":\"test\"}"))
    .build();

formParamsController.dynamicAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`LongAsOptional`](../../doc/models/long-as-optional.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LongAsOptional body = new LongAsOptional.Builder()
    .mLong(123123L)
    .build();

formParamsController.longAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

