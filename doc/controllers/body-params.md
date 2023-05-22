# Body Params

```csharp
BodyParamsController bodyParamsController = client.BodyParamsController;
```

## Class Name

`BodyParamsController`

## Methods

* [Create Send Rfc 3339 Date Time](../../doc/controllers/body-params.md#create-send-rfc-3339-date-time)
* [Create Send Rfc 1123 Date Time](../../doc/controllers/body-params.md#create-send-rfc-1123-date-time)
* [Create Send Unix Date Time](../../doc/controllers/body-params.md#create-send-unix-date-time)
* [Create Send Rfc 3339 Date Time Array](../../doc/controllers/body-params.md#create-send-rfc-3339-date-time-array)
* [Create Send Rfc 1123 Date Time Array](../../doc/controllers/body-params.md#create-send-rfc-1123-date-time-array)
* [Create Send Unix Date Time Array](../../doc/controllers/body-params.md#create-send-unix-date-time-array)
* [Create Send Rfc 1123 Date Time in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-1123-date-time-in-body-as-model)
* [Create Send Rfc 3339 Date Time in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-3339-date-time-in-body-as-model)
* [Create Send Unix Date Time in Body as Model](../../doc/controllers/body-params.md#create-send-unix-date-time-in-body-as-model)
* [Create Send Rfc 3339 Date Time Array in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-3339-date-time-array-in-body-as-model)
* [Create Send Unix Date Time Array in Body as Model](../../doc/controllers/body-params.md#create-send-unix-date-time-array-in-body-as-model)
* [Create Send Rfc 3339 Date Time Map in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-3339-date-time-map-in-body-as-model)
* [Create Send Rfc 1123 Date Time Map in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-1123-date-time-map-in-body-as-model)
* [Create Send Unix Date Time Map in Body as Model](../../doc/controllers/body-params.md#create-send-unix-date-time-map-in-body-as-model)
* [Create Send Rfc 1123 Date Time Array in Body as Model](../../doc/controllers/body-params.md#create-send-rfc-1123-date-time-array-in-body-as-model)


# Create Send Rfc 3339 Date Time

```csharp
CreateSendRfc3339DateTimeAsync(
    DateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendRfc3339DateTimeAsync(datetime);
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
| `datetime` | `DateTime` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendRfc1123DateTimeAsync(datetime);
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
| `datetime` | `DateTime` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendUnixDateTimeAsync(datetime);
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
| `datetimes` | `List<DateTime>` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendRfc3339DateTimeArrayAsync(datetimes);
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
| `datetimes` | `List<DateTime>` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendRfc1123DateTimeArrayAsync(datetimes);
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
| `datetimes` | `List<DateTime>` | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendUnixDateTimeArrayAsync(datetimes);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time in Body as Model

```csharp
CreateSendRfc1123DateTimeInBodyAsModelAsync(
    Models.Rfc1123DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendRfc1123DateTimeInBodyAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time in Body as Model

```csharp
CreateSendRfc3339DateTimeInBodyAsModelAsync(
    Models.DateTimeModel data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.DateTimeModel`](../../doc/models/date-time-model.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
DateTimeModel data = new DateTimeModel
{
    DateTime = DateTime.ParseExact(
        "1994-02-13T14:01:54.9571247Z",
        "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK",
        provider: CultureInfo.InvariantCulture,
        DateTimeStyles.RoundtripKind),
};

try
{
    ServerResponse result = await bodyParamsController.CreateSendRfc3339DateTimeInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time in Body as Model

```csharp
CreateSendUnixDateTimeInBodyAsModelAsync(
    Models.UnixDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Models.UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |

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
    ServerResponse result = await bodyParamsController.CreateSendUnixDateTimeInBodyAsModelAsync(body);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time Array in Body as Model

```csharp
CreateSendRfc3339DateTimeArrayInBodyAsModelAsync(
    Models.Rfc3339DateTimeArray data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc3339DateTimeArray data = new Rfc3339DateTimeArray
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
    ServerResponse result = await bodyParamsController.CreateSendRfc3339DateTimeArrayInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time Array in Body as Model

```csharp
CreateSendUnixDateTimeArrayInBodyAsModelAsync(
    Models.UnixDateTimeArray data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
UnixDateTimeArray data = new UnixDateTimeArray
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
            DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
        new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
    },
};

try
{
    ServerResponse result = await bodyParamsController.CreateSendUnixDateTimeArrayInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 3339 Date Time Map in Body as Model

```csharp
CreateSendRfc3339DateTimeMapInBodyAsModelAsync(
    Models.Rfc3339DateTimeMap data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc3339DateTimeMap data = new Rfc3339DateTimeMap
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
    ServerResponse result = await bodyParamsController.CreateSendRfc3339DateTimeMapInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time Map in Body as Model

```csharp
CreateSendRfc1123DateTimeMapInBodyAsModelAsync(
    Models.Rfc1123DateTimeMap data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc1123DateTimeMap data = new Rfc1123DateTimeMap
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
    ServerResponse result = await bodyParamsController.CreateSendRfc1123DateTimeMapInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Unix Date Time Map in Body as Model

```csharp
CreateSendUnixDateTimeMapInBodyAsModelAsync(
    Models.UnixDateTimeMap data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
UnixDateTimeMap data = new UnixDateTimeMap
{
    DateTime = new Dictionary<string, DateTime>
    {
        ["key"] = new DateTime(
            1970,
            1,
            1,
            0,
            0,
            0,
            DateTimeKind.Utc).AddSeconds(double.Parse("1484719381")),
    },
};

try
{
    ServerResponse result = await bodyParamsController.CreateSendUnixDateTimeMapInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```


# Create Send Rfc 1123 Date Time Array in Body as Model

```csharp
CreateSendRfc1123DateTimeArrayInBodyAsModelAsync(
    Models.Rfc1123DateTimeArray data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Models.Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Body, Required | - |

## Response Type

[`Task<Models.ServerResponse>`](../../doc/models/server-response.md)

## Example Usage

```csharp
Rfc1123DateTimeArray data = new Rfc1123DateTimeArray
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
    ServerResponse result = await bodyParamsController.CreateSendRfc1123DateTimeArrayInBodyAsModelAsync(data);
}
catch (ApiException e)
{
    // TODO: Handle exception here
    Console.WriteLine(e.Message);
}
```

