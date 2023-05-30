# Query Param

```java
QueryParamController queryParamController = client.getQueryParamController();
```

## Class Name

`QueryParamController`

## Methods

* [Optional Dynamic Query Param](../../doc/controllers/query-param.md#optional-dynamic-query-param)
* [Rfc 1123 Date Time Array](../../doc/controllers/query-param.md#rfc-1123-date-time-array)
* [No Params](../../doc/controllers/query-param.md#no-params)
* [String Enum Array](../../doc/controllers/query-param.md#string-enum-array)
* [Send Indexed Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-complex-type-in-query)
* [Rfc 1123 Date Time](../../doc/controllers/query-param.md#rfc-1123-date-time)
* [Rfc 3339 Date Time Array](../../doc/controllers/query-param.md#rfc-3339-date-time-array)
* [String Param](../../doc/controllers/query-param.md#string-param)
* [Number Array](../../doc/controllers/query-param.md#number-array)
* [Simple Query](../../doc/controllers/query-param.md#simple-query)
* [Send Indexed Map of Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-map-of-complex-type-in-query)
* [Url Param](../../doc/controllers/query-param.md#url-param)
* [Integer Enum Array](../../doc/controllers/query-param.md#integer-enum-array)
* [Date Array](../../doc/controllers/query-param.md#date-array)
* [Date](../../doc/controllers/query-param.md#date)
* [Unix Date Time Array](../../doc/controllers/query-param.md#unix-date-time-array)
* [Unix Date Time](../../doc/controllers/query-param.md#unix-date-time)
* [Rfc 3339 Date Time](../../doc/controllers/query-param.md#rfc-3339-date-time)
* [String Array](../../doc/controllers/query-param.md#string-array)
* [Multiple Params](../../doc/controllers/query-param.md#multiple-params)
* [Send Indexed List of Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-list-of-complex-type-in-query)


# Optional Dynamic Query Param

get optional dynamic query parameter

```java
CompletableFuture<ServerResponse> optionalDynamicQueryParamAsync(
    final String name,
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Required | - |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String name = "name0";

Map<String, Object> queryParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalQueryParams2\""));
}};

queryParamController.optionalDynamicQueryParamAsync(name, queryParameters).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rfc 1123 Date Time Array

```java
CompletableFuture<ServerResponse> rfc1123DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"),
    DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT")
);

queryParamController.rfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# No Params

```java
CompletableFuture<ServerResponse> noParamsAsync()
```

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
queryParamController.noParamsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# String Enum Array

```java
CompletableFuture<ServerResponse> stringEnumArrayAsync(
    final List<Days> days)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `days` | [`List<Days>`](../../doc/models/days.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Days> days = Arrays.asList(
    Days.SUNDAY,
    Days.MONDAY,
    Days.TUESDAY
);

queryParamController.stringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Indexed Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedComplexTypeInQueryAsync(
    final ComplexType complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`ComplexType`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ComplexType complexType = new ComplexType.Builder(
    Arrays.asList(
        232
    ),
    new LinkedHashMap<String, Integer>() {{
        put("key0", 149);
        put("key1", 150);
    }},
    new InnerComplexType.Builder(
        "stringType8",
        false,
        DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
        DateTimeHelper.fromSimpleDate("2016-03-13"),
        UUID.fromString("00001292-0000-0000-0000-000000000000"),
        120L,
        252.18,
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
        Arrays.asList(
            "stringListType8"
        )
    )
    .build(),
    Arrays.asList(
        new InnerComplexType.Builder(
            "stringType6",
            false,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            UUID.fromString("0000183a-0000-0000-0000-000000000000"),
            240L,
            222.66,
            ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
            Arrays.asList(
                "stringListType6",
                "stringListType7",
                "stringListType8"
            )
        )
        .build()
    )
)
.build();

queryParamController.sendIndexedComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rfc 1123 Date Time

```java
CompletableFuture<ServerResponse> rfc1123DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

queryParamController.rfc1123DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rfc 3339 Date Time Array

```java
CompletableFuture<ServerResponse> rfc3339DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
);

queryParamController.rfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# String Param

```java
CompletableFuture<ServerResponse> stringParamAsync(
    final String string)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `string` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String string = "string4";

queryParamController.stringParamAsync(string).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Number Array

```java
CompletableFuture<ServerResponse> numberArrayAsync(
    final List<Integer> integers)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `integers` | `List<Integer>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = Arrays.asList(
    45,
    46,
    47
);

queryParamController.numberArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Simple Query

```java
CompletableFuture<ServerResponse> simpleQueryAsync(
    final boolean mBoolean,
    final int number,
    final String string,
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mBoolean` | `boolean` | Query, Required | - |
| `number` | `int` | Query, Required | - |
| `string` | `String` | Query, Required | - |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
boolean mBoolean = false;
int number = 158;
String string = "string4";

Map<String, Object> queryParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalQueryParams2\""));
}};

queryParamController.simpleQueryAsync(mBoolean, number, string, queryParameters).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Indexed Map of Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedMapOfComplexTypeInQueryAsync(
    final Map<String, ComplexType> complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`Map<String, ComplexType>`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Map<String, ComplexType> complexType = new LinkedHashMap<String, ComplexType>() {{
    put("key0", new ComplexType.Builder(
        Arrays.asList(
            144
        ),
        new LinkedHashMap<String, Integer>() {{
            put("key0", 61);
            put("key1", 62);
        }},
        new InnerComplexType.Builder(
            "stringType8",
            false,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            UUID.fromString("0000103a-0000-0000-0000-000000000000"),
            32L,
            246.18,
            ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
            Arrays.asList(
                "stringListType8"
            )
        )
        .build(),
        Arrays.asList(
            new InnerComplexType.Builder(
                "stringType6",
                false,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                UUID.fromString("000015e2-0000-0000-0000-000000000000"),
                152L,
                216.66,
                ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
                Arrays.asList(
                    "stringListType6",
                    "stringListType7",
                    "stringListType8"
                )
            )
            .build()
        )
    )
    .build());
}};

queryParamController.sendIndexedMapOfComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Url Param

```java
CompletableFuture<ServerResponse> urlParamAsync(
    final String url)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `url` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String url = "url4";

queryParamController.urlParamAsync(url).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Integer Enum Array

```java
CompletableFuture<ServerResponse> integerEnumArrayAsync(
    final List<SuiteCode> suites)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `suites` | [`List<SuiteCode>`](../../doc/models/suite-code.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = Arrays.asList(
    SuiteCode.HEARTS,
    SuiteCode.SPADES,
    SuiteCode.CLUBS
);

queryParamController.integerEnumArrayAsync(suites).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Date Array

```java
CompletableFuture<ServerResponse> dateArrayAsync(
    final List<LocalDate> dates)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `List<LocalDate>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = Arrays.asList(
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromSimpleDate("2016-03-13")
);

queryParamController.dateArrayAsync(dates).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Date

```java
CompletableFuture<ServerResponse> dateAsync(
    final LocalDate date)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `date` | `LocalDate` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDate date = DateTimeHelper.fromSimpleDate("2016-03-13");

queryParamController.dateAsync(date).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Unix Date Time Array

```java
CompletableFuture<ServerResponse> unixDateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = Arrays.asList(
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L),
    DateTimeHelper.fromUnixTimestamp(1480809600L)
);

queryParamController.unixDateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Unix Date Time

```java
CompletableFuture<ServerResponse> unixDateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromUnixTimestamp(1480809600L);

queryParamController.unixDateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rfc 3339 Date Time

```java
CompletableFuture<ServerResponse> rfc3339DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z");

queryParamController.rfc3339DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# String Array

```java
CompletableFuture<ServerResponse> stringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> strings = Arrays.asList(
    "strings5"
);

queryParamController.stringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Multiple Params

```java
CompletableFuture<ServerResponse> multipleParamsAsync(
    final int number,
    final double precision,
    final String string,
    final String url)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `number` | `int` | Query, Required | - |
| `precision` | `double` | Query, Required | - |
| `string` | `String` | Query, Required | - |
| `url` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
int number = 158;
double precision = 112.04;
String string = "string4";
String url = "url4";

queryParamController.multipleParamsAsync(number, precision, string, url).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Send Indexed List of Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedListOfComplexTypeInQueryAsync(
    final List<ComplexType> complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`List<ComplexType>`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<ComplexType> complexType = Arrays.asList(
    new ComplexType.Builder(
        Arrays.asList(
            144
        ),
        new LinkedHashMap<String, Integer>() {{
            put("key0", 61);
            put("key1", 62);
        }},
        new InnerComplexType.Builder(
            "stringType8",
            false,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromSimpleDate("2016-03-13"),
            UUID.fromString("0000103a-0000-0000-0000-000000000000"),
            32L,
            246.18,
            ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
            Arrays.asList(
                "stringListType8"
            )
        )
        .build(),
        Arrays.asList(
            new InnerComplexType.Builder(
                "stringType6",
                false,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                DateTimeHelper.fromSimpleDate("2016-03-13"),
                UUID.fromString("000015e2-0000-0000-0000-000000000000"),
                152L,
                216.66,
                ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
                Arrays.asList(
                    "stringListType6",
                    "stringListType7",
                    "stringListType8"
                )
            )
            .build()
        )
    )
    .build()
);

queryParamController.sendIndexedListOfComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

