# Form Params

```php
$formParamsController = $client->getFormParamsController();
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

```php
function createSendDateArray(array $dates): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `DateTime[]` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$dates = [
    DateTimeHelper::fromSimpleDateRequired('1994-02-13'),
    DateTimeHelper::fromSimpleDateRequired('1994-02-13')
];

$result = $formParamsController->createSendDateArray($dates);
```


# Create Send Rfc 3339 Date Time Array

```php
function createSendRfc3339DateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z'),
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
];

$result = $formParamsController->createSendRfc3339DateTimeArray($datetimes);
```


# Create Send Rfc 1123 Date Time Array

```php
function createSendRfc1123DateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT'),
    DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
];

$result = $formParamsController->createSendRfc1123DateTimeArray($datetimes);
```


# Create Send Unix Date Time Array

```php
function createSendUnixDateTimeArray(array $datetimes): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `DateTime[]` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetimes = [
    DateTimeHelper::fromRfc3339DateTimeRequired('1484719381'),
    DateTimeHelper::fromRfc3339DateTimeRequired('1484719381')
];

$result = $formParamsController->createSendUnixDateTimeArray($datetimes);
```


# Create Send Rfc 1123 Date Time

```php
function createSendRfc1123DateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromRfc1123DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT');

$result = $formParamsController->createSendRfc1123DateTime($datetime);
```


# Create Send Rfc 3339 Date Time

```php
function createSendRfc3339DateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromRfc3339DateTimeRequired('02/13/1994 14:01:54');

$result = $formParamsController->createSendRfc3339DateTime($datetime);
```


# Create Send Unix Date Time

```php
function createSendUnixDateTime(\DateTime $datetime): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$datetime = DateTimeHelper::fromUnixTimestampRequired('1484719381');

$result = $formParamsController->createSendUnixDateTime($datetime);
```


# Create Send Rfc 1123 Date Time in Form as Model

```php
function createSendRfc1123DateTimeInFormAsModel(Rfc1123DateTime $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc1123DateTimeBuilder::init(
    DateTimeHelper::fromRfc1123DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
)->build();

$result = $formParamsController->createSendRfc1123DateTimeInFormAsModel($body);
```


# Create Send Rfc 3339 Date Time in Form as Model

```php
function createSendRfc3339DateTimeInFormAsModel(DateTimeModel $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = DateTimeModelBuilder::init(
    DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
)->build();

$result = $formParamsController->createSendRfc3339DateTimeInFormAsModel($body);
```


# Create Send Unix Date Time in Form as Model

```php
function createSendUnixDateTimeInFormAsModel(UnixDateTime $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = UnixDateTimeBuilder::init(
    DateTimeHelper::fromUnixTimestampRequired('1484719381')
)->build();

$result = $formParamsController->createSendUnixDateTimeInFormAsModel($body);
```


# Create Send Rfc 3339 Date Time Array in Form as Model

```php
function createSendRfc3339DateTimeArrayInFormAsModel(Rfc3339DateTimeArray $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc3339DateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z'),
        DateTimeHelper::fromRfc3339DateTimeRequired('1994-02-13T14:01:54.9571247Z')
    ]
)->build();

$result = $formParamsController->createSendRfc3339DateTimeArrayInFormAsModel($body);
```


# Create Send Rfc 1123 Date Time Array in Form as Model

```php
function createSendRfc1123DateTimeArrayInFormAsModel(Rfc1123DateTimeArray $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc1123DateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT'),
        DateTimeHelper::fromRfc3339DateTimeRequired('Sun, 06 Nov 1994 08:49:37 GMT')
    ]
)->build();

$result = $formParamsController->createSendRfc1123DateTimeArrayInFormAsModel($body);
```


# Create Send Unix Date Time Array in Form as Model

```php
function createSendUnixDateTimeArrayInFormAsModel(UnixDateTimeArray $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = UnixDateTimeArrayBuilder::init(
    [
        DateTimeHelper::fromRfc3339DateTimeRequired('1480809600'),
        DateTimeHelper::fromRfc3339DateTimeRequired('1480809600'),
        DateTimeHelper::fromRfc3339DateTimeRequired('1480809600')
    ]
)->build();

$result = $formParamsController->createSendUnixDateTimeArrayInFormAsModel($body);
```


# Create Send Unix Date Time Map in Form as Model

```php
function createSendUnixDateTimeMapInFormAsModel(UnixDateTimeMap $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = UnixDateTimeMapBuilder::init(
    [
        'key0' => DateTimeHelper::fromRfc3339DateTimeRequired('1480809600'),
        'key1' => DateTimeHelper::fromRfc3339DateTimeRequired('1480809600'),
        'key2' => DateTimeHelper::fromRfc3339DateTimeRequired('1480809600')
    ]
)->build();

$result = $formParamsController->createSendUnixDateTimeMapInFormAsModel($body);
```


# Create Send Rfc 3339 Date Time Map in Form as Model

```php
function createSendRfc3339DateTimeMapInFormAsModel(Rfc3339DateTimeMap $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc3339DateTimeMapBuilder::init(
    [
        'key0' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z'),
        'key1' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z'),
        'key2' => DateTimeHelper::fromRfc3339DateTimeRequired('2016-03-13T12:52:32.123Z')
    ]
)->build();

$result = $formParamsController->createSendRfc3339DateTimeMapInFormAsModel($body);
```


# Create Send Rfc 1123 Date Time Map in Form as Model

```php
function createSendRfc1123DateTimeMapInFormAsModel(Rfc1123DateTimeMap $body): ServerResponse
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Form, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```php
$body = Rfc1123DateTimeMapBuilder::init(
    [
        'key0' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT'),
        'key1' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT'),
        'key2' => DateTimeHelper::fromRfc3339DateTimeRequired('Mon, 15 Jun 2009 20:45:30 GMT')
    ]
)->build();

$result = $formParamsController->createSendRfc1123DateTimeMapInFormAsModel($body);
```

