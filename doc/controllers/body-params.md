# Body Params

```ruby
body_params_controller = client.body_params
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

```ruby
def create_send_rfc3339_date_time(datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetime = DateTimeHelper.from_rfc3339('02/13/1994 14:01:54')

result = body_params_controller.create_send_rfc3339_date_time(datetime)
```


# Create Send Rfc 1123 Date Time

```ruby
def create_send_rfc1123_date_time(datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetime = DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT')

result = body_params_controller.create_send_rfc1123_date_time(datetime)
```


# Create Send Unix Date Time

```ruby
def create_send_unix_date_time(datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `DateTime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetime = DateTimeHelper.from_unix(1484719381)

result = body_params_controller.create_send_unix_date_time(datetime)
```


# Create Send Rfc 3339 Date Time Array

```ruby
def create_send_rfc3339_date_time_array(datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `Array<DateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetimes = [
  DateTimeHelper.from_rfc3339('1994-02-13T14:01:54.9571247Z'),
  DateTimeHelper.from_rfc3339('1994-02-13T14:01:54.9571247Z')
]

result = body_params_controller.create_send_rfc3339_date_time_array(datetimes)
```


# Create Send Rfc 1123 Date Time Array

```ruby
def create_send_rfc1123_date_time_array(datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `Array<DateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetimes = [
  DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT'),
  DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT')
]

result = body_params_controller.create_send_rfc1123_date_time_array(datetimes)
```


# Create Send Unix Date Time Array

```ruby
def create_send_unix_date_time_array(datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `Array<DateTime>` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
datetimes = [
  DateTimeHelper.from_unix(1484719381),
  DateTimeHelper.from_unix(1484719381)
]

result = body_params_controller.create_send_unix_date_time_array(datetimes)
```


# Create Send Rfc 1123 Date Time in Body as Model

```ruby
def create_send_rfc1123_date_time_in_body_as_model(body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
body = Rfc1123DateTime.new(
  DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT')
)

result = body_params_controller.create_send_rfc1123_date_time_in_body_as_model(body)
```


# Create Send Rfc 3339 Date Time in Body as Model

```ruby
def create_send_rfc3339_date_time_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = DateTimeModel.new(
  DateTimeHelper.from_rfc3339('1994-02-13T14:01:54.9571247Z')
)

result = body_params_controller.create_send_rfc3339_date_time_in_body_as_model(data)
```


# Create Send Unix Date Time in Body as Model

```ruby
def create_send_unix_date_time_in_body_as_model(body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
body = UnixDateTime.new(
  DateTimeHelper.from_unix(1484719381)
)

result = body_params_controller.create_send_unix_date_time_in_body_as_model(body)
```


# Create Send Rfc 3339 Date Time Array in Body as Model

```ruby
def create_send_rfc3339_date_time_array_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = Rfc3339DateTimeArray.new(
  [
    DateTimeHelper.from_rfc3339('1994-02-13T14:01:54.9571247Z'),
    DateTimeHelper.from_rfc3339('1994-02-13T14:01:54.9571247Z')
  ]
)

result = body_params_controller.create_send_rfc3339_date_time_array_in_body_as_model(data)
```


# Create Send Unix Date Time Array in Body as Model

```ruby
def create_send_unix_date_time_array_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = UnixDateTimeArray.new(
  [
    DateTimeHelper.from_unix(1484719381),
    DateTimeHelper.from_unix(1484719381)
  ]
)

result = body_params_controller.create_send_unix_date_time_array_in_body_as_model(data)
```


# Create Send Rfc 3339 Date Time Map in Body as Model

```ruby
def create_send_rfc3339_date_time_map_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = Rfc3339DateTimeMap.new(
  {
    'key0': DateTimeHelper.from_rfc3339('2016-03-13T12:52:32.123Z'),
    'key1': DateTimeHelper.from_rfc3339('2016-03-13T12:52:32.123Z'),
    'key2': DateTimeHelper.from_rfc3339('2016-03-13T12:52:32.123Z')
  }
)

result = body_params_controller.create_send_rfc3339_date_time_map_in_body_as_model(data)
```


# Create Send Rfc 1123 Date Time Map in Body as Model

```ruby
def create_send_rfc1123_date_time_map_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = Rfc1123DateTimeMap.new(
  {
    'key0': DateTimeHelper.from_rfc1123('Mon, 15 Jun 2009 20:45:30 GMT'),
    'key1': DateTimeHelper.from_rfc1123('Mon, 15 Jun 2009 20:45:30 GMT'),
    'key2': DateTimeHelper.from_rfc1123('Mon, 15 Jun 2009 20:45:30 GMT')
  }
)

result = body_params_controller.create_send_rfc1123_date_time_map_in_body_as_model(data)
```


# Create Send Unix Date Time Map in Body as Model

```ruby
def create_send_unix_date_time_map_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = UnixDateTimeMap.new(
  {
    'key': DateTimeHelper.from_unix(1484719381)
  }
)

result = body_params_controller.create_send_unix_date_time_map_in_body_as_model(data)
```


# Create Send Rfc 1123 Date Time Array in Body as Model

```ruby
def create_send_rfc1123_date_time_array_in_body_as_model(data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ruby
data = Rfc1123DateTimeArray.new(
  [
    DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT'),
    DateTimeHelper.from_rfc1123('Sun, 06 Nov 1994 08:49:37 GMT')
  ]
)

result = body_params_controller.create_send_rfc1123_date_time_array_in_body_as_model(data)
```

