# Body Params

```php
$bodyParamsController = $client->getBodyParamsController();
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

```php
function createSendRfc3339DateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromRfc3339DateTimeRequired('02/13/1994 14:01:54');

$result = $bodyParamsController->createSendRfc3339DateTime($datetime);
```


# Create Send Rfc 1123 Date Time

```php
function createSendRfc1123DateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromRfc1123DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT');

$result = $bodyParamsController->createSendRfc1123DateTime($datetime);
```


# Create Send Unix Date Time

```php
function createSendUnixDateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromUnixTimestampRequired('1484719381');

$result = $bodyParamsController->createSendUnixDateTime($datetime);
```


# Create Send Rfc 3339 Date Time Array

```php
function createSendRfc3339DateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z'),
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
];

$result = $bodyParamsController->createSendRfc3339DateTimeArray($datetimes);
```


# Create Send Rfc 1123 Date Time Array

```php
function createSendRfc1123DateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT'),
    DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
];

$result = $bodyParamsController->createSendRfc1123DateTimeArray($datetimes);
```


# Create Send Unix Date Time Array

```php
function createSendUnixDateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('1484719381'),
    DateTimeHelper::fromRfc3339DateTimeRequired('1484719381')
];

$result = $bodyParamsController->createSendUnixDateTimeArray($datetimes);
```


# Create Send Rfc 1123 Date Time in Body as Model

```php
function createSendRfc1123DateTimeInBodyAsModel(Rfc1123DateTime $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc1123DateTimeBuilder::init(
    DateTimeHelper::fromRfc1123DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
)->build();

$result = $bodyParamsController->createSendRfc1123DateTimeInBodyAsModel($body);
```


# Create Send Rfc 3339 Date Time in Body as Model

```php
function createSendRfc3339DateTimeInBodyAsModel(DateTimeModel $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = DateTimeModelBuilder::init(
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
)->build();

$result = $bodyParamsController->createSendRfc3339DateTimeInBodyAsModel($data);
```


# Create Send Unix Date Time in Body as Model

```php
function createSendUnixDateTimeInBodyAsModel(UnixDateTime $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = UnixDateTimeBuilder::init(
    DateTimeHelper::fromUnixTimestampRequired('1484719381')
)->build();

$result = $bodyParamsController->createSendUnixDateTimeInBodyAsModel($body);
```


# Create Send Rfc 3339 Date Time Array in Body as Model

```php
function createSendRfc3339DateTimeArrayInBodyAsModel(Rfc3339DateTimeArray $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = Rfc3339DateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z'),
        DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
    ]
)->build();

$result = $bodyParamsController->createSendRfc3339DateTimeArrayInBodyAsModel($data);
```


# Create Send Unix Date Time Array in Body as Model

```php
function createSendUnixDateTimeArrayInBodyAsModel(UnixDateTimeArray $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = UnixDateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('1484719381'),
        DateTimeHelper::fromRfc3339DateTimeRequired('1484719381')
    ]
)->build();

$result = $bodyParamsController->createSendUnixDateTimeArrayInBodyAsModel($data);
```


# Create Send Rfc 3339 Date Time Map in Body as Model

```php
function createSendRfc3339DateTimeMapInBodyAsModel(Rfc3339DateTimeMap $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = Rfc3339DateTimeMapBuilder::init(
    [
        'key0' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z'),
        'key1' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z'),
        'key2' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z')
    ]
)->build();

$result = $bodyParamsController->createSendRfc3339DateTimeMapInBodyAsModel($data);
```


# Create Send Rfc 1123 Date Time Map in Body as Model

```php
function createSendRfc1123DateTimeMapInBodyAsModel(Rfc1123DateTimeMap $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = Rfc1123DateTimeMapBuilder::init(
    [
        'key0' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT'),
        'key1' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT'),
        'key2' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT')
    ]
)->build();

$result = $bodyParamsController->createSendRfc1123DateTimeMapInBodyAsModel($data);
```


# Create Send Unix Date Time Map in Body as Model

```php
function createSendUnixDateTimeMapInBodyAsModel(UnixDateTimeMap $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = UnixDateTimeMapBuilder::init(
    [
        'key' => DateTimeHelper::fromRfc3339DateTimeRequired('1484719381')
    ]
)->build();

$result = $bodyParamsController->createSendUnixDateTimeMapInBodyAsModel($data);
```


# Create Send Rfc 1123 Date Time Array in Body as Model

```php
function createSendRfc1123DateTimeArrayInBodyAsModel(Rfc1123DateTimeArray $data): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$data = Rfc1123DateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT'),
        DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
    ]
)->build();

$result = $bodyParamsController->createSendRfc1123DateTimeArrayInBodyAsModel($data);
```

