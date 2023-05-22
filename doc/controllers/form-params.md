# Form Params

```csharp
FormParamsController formParamsController = client.FormParamsController;
```

## Class Name

`FormParamsController`

## Methods

* [Create Send Date Array](../../doc/controllers/form-params.md#create-send-date-array)
* [Create Send Rfc 3339 Date Time Array](../../doc/controllers/form-params.md#create-send-rfc-3339-date-time-array)
* [Create Send Rfc 1123 Date Time Array](../../doc/controllers/form-params.md#create-send-rfc-1123-date-time-array)
* [Create Send Unix Date Time Array](../../doc/controllers/form-params.md#create-send-unix-date-time-array)
* [Create Send Rfc 1123 Date Time](../../doc/controllers/form-params.md#create-send-rfc-1123-date-time)
* [Create Send Rfc 3339 Date Time](../../doc/controllers/form-params.md#create-send-rfc-3339-date-time)
* [Create Send Unix Date Time](../../doc/controllers/form-params.md#create-send-unix-date-time)
* [Create Send Rfc 1123 Date Time in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-1123-date-time-in-form-as-model)
* [Create Send Rfc 3339 Date Time in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-3339-date-time-in-form-as-model)
* [Create Send Unix Date Time in Form as Model](../../doc/controllers/form-params.md#create-send-unix-date-time-in-form-as-model)
* [Create Send Rfc 3339 Date Time Array in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-3339-date-time-array-in-form-as-model)
* [Create Send Rfc 1123 Date Time Array in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-1123-date-time-array-in-form-as-model)
* [Create Send Unix Date Time Array in Form as Model](../../doc/controllers/form-params.md#create-send-unix-date-time-array-in-form-as-model)
* [Create Send Unix Date Time Map in Form as Model](../../doc/controllers/form-params.md#create-send-unix-date-time-map-in-form-as-model)
* [Create Send Rfc 3339 Date Time Map in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-3339-date-time-map-in-form-as-model)
* [Create Send Rfc 1123 Date Time Map in Form as Model](../../doc/controllers/form-params.md#create-send-rfc-1123-date-time-map-in-form-as-model)


# Create Send Date Array

```csharp
CreateSendDateArrayAsync(
    List<DateTime> dates)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `List<DateTime>` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
List<DateTime> dates = new List<DateTime>
{
    DateTime.Parse("1994-02-13"),
    DateTime.Parse("1994-02-13"),
};

try
{
    ServerResponse result = await formParamsController.CreateSendDateArrayAsync(dates);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time Array

```csharp
CreateSendRfc3339DateTimeArrayAsync(
    List<DateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<DateTime>` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
List<DateTime> datetimes = new List<DateTime>
{
    DateTime.ParseExact(
        "1994-02-13T14:01:54.9571247Z",
        "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
    DateTime.ParseExact(
        "1994-02-13T14:01:54.9571247Z",
        "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc3339DateTimeArrayAsync(datetimes);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time Array

```csharp
CreateSendRfc1123DateTimeArrayAsync(
    List<DateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<DateTime>` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
List<DateTime> datetimes = new List<DateTime>
{
    DateTime.ParseExact(
        "Sun, 06 Nov 1994 08:49:37 GMT",
        "r",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
    DateTime.ParseExact(
        "Sun, 06 Nov 1994 08:49:37 GMT",
        "r",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc1123DateTimeArrayAsync(datetimes);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time Array

```csharp
CreateSendUnixDateTimeArrayAsync(
    List<DateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<DateTime>` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
List<DateTime> datetimes = new List<DateTime>
{
    new DateTime(
        1970,
        1,
        1,
        0,
        0,
        0,
        DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
    new DateTime(
        1970,
        1,
        1,
        0,
        0,
        0,
        DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
};

try
{
    ServerResponse result = await formParamsController.CreateSendUnixDateTimeArrayAsync(datetimes);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time

```csharp
CreateSendRfc1123DateTimeAsync(
    DateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
DateTime datetime = DateTime.ParseExact(
        "Sun, 06 Nov 1994 08:49:37 GMT",
        "r",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind);
try
{
    ServerResponse result = await formParamsController.CreateSendRfc1123DateTimeAsync(datetime);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time

```csharp
CreateSendRfc3339DateTimeAsync(
    DateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
DateTime datetime = DateTime.ParseExact(
        "02/13/1994 14:01:54",
        "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind);
try
{
    ServerResponse result = await formParamsController.CreateSendRfc3339DateTimeAsync(datetime);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time

```csharp
CreateSendUnixDateTimeAsync(
    DateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
DateTime datetime = new DateTime(
        1970,
        1,
        1,
        0,
        0,
        0,
        DateTimeKind.Utc).AddSeconds(double.Parse("1484719381"));
try
{
    ServerResponse result = await formParamsController.CreateSendUnixDateTimeAsync(datetime);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time in Form as Model

```csharp
CreateSendRfc1123DateTimeInFormAsModelAsync(
    Models.Rfc1123DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc1123DateTime body = new Rfc1123DateTime
{
    DateTime = DateTime.ParseExact(
        "Sun, 06 Nov 1994 08:49:37 GMT",
        "r",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc1123DateTimeInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time in Form as Model

```csharp
CreateSendRfc3339DateTimeInFormAsModelAsync(
    Models.DateTimeModel body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.DateTimeModel`](../../doc/models/date-time-model.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
DateTimeModel body = new DateTimeModel
{
    DateTime = DateTime.ParseExact(
        "1994-02-13T14:01:54.9571247Z",
        "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc3339DateTimeInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time in Form as Model

```csharp
CreateSendUnixDateTimeInFormAsModelAsync(
    Models.UnixDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.UnixDateTime`](../../doc/models/unix-date-time.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
UnixDateTime body = new UnixDateTime
{
    DateTime = new DateTime(
        1970,
        1,
        1,
        0,
        0,
        0,
        DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
};

try
{
    ServerResponse result = await formParamsController.CreateSendUnixDateTimeInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time Array in Form as Model

```csharp
CreateSendRfc3339DateTimeArrayInFormAsModelAsync(
    Models.Rfc3339DateTimeArray body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc3339DateTimeArray body = new Rfc3339DateTimeArray
{
    DateTime = new List<DateTime>
    {
        DateTime.ParseExact(
            "1994-02-13T14:01:54.9571247Z",
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        DateTime.ParseExact(
            "1994-02-13T14:01:54.9571247Z",
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc3339DateTimeArrayInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time Array in Form as Model

```csharp
CreateSendRfc1123DateTimeArrayInFormAsModelAsync(
    Models.Rfc1123DateTimeArray body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc1123DateTimeArray body = new Rfc1123DateTimeArray
{
    DateTime = new List<DateTime>
    {
        DateTime.ParseExact(
            "Sun, 06 Nov 1994 08:49:37 GMT",
            "r",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        DateTime.ParseExact(
            "Sun, 06 Nov 1994 08:49:37 GMT",
            "r",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc1123DateTimeArrayInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time Array in Form as Model

```csharp
CreateSendUnixDateTimeArrayInFormAsModelAsync(
    Models.UnixDateTimeArray body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
UnixDateTimeArray body = new UnixDateTimeArray
{
    DateTime = new List<DateTime>
    {
        new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
        new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
        new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendUnixDateTimeArrayInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time Map in Form as Model

```csharp
CreateSendUnixDateTimeMapInFormAsModelAsync(
    Models.UnixDateTimeMap body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
UnixDateTimeMap body = new UnixDateTimeMap
{
    DateTime = new Dictionary<string, DateTime>
    {
        ["key0"] = new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
        ["key1"] = new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
        ["key2"] = new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1480809600")),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendUnixDateTimeMapInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time Map in Form as Model

```csharp
CreateSendRfc3339DateTimeMapInFormAsModelAsync(
    Models.Rfc3339DateTimeMap body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc3339DateTimeMap body = new Rfc3339DateTimeMap
{
    DateTime = new Dictionary<string, DateTime>
    {
        ["key0"] = DateTime.ParseExact(
            "2016-03-13T12:52:32.123Z",
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        ["key1"] = DateTime.ParseExact(
            "2016-03-13T12:52:32.123Z",
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        ["key2"] = DateTime.ParseExact(
            "2016-03-13T12:52:32.123Z",
            "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc3339DateTimeMapInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time Map in Form as Model

```csharp
CreateSendRfc1123DateTimeMapInFormAsModelAsync(
    Models.Rfc1123DateTimeMap body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Form, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc1123DateTimeMap body = new Rfc1123DateTimeMap
{
    DateTime = new Dictionary<string, DateTime>
    {
        ["key0"] = DateTime.ParseExact(
            "Mon, 15 Jun 2009 20:45:30 GMT",
            "r",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        ["key1"] = DateTime.ParseExact(
            "Mon, 15 Jun 2009 20:45:30 GMT",
            "r",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
        ["key2"] = DateTime.ParseExact(
            "Mon, 15 Jun 2009 20:45:30 GMT",
            "r",
            provider: CultureInfo.InvariantCulture,
            DateTimeStyles.RoundtripKind),
    },
};

try
{
    ServerResponse result = await formParamsController.CreateSendRfc1123DateTimeMapInFormAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```

