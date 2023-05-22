# Body Params

```python
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

```python
def create_send_rfc_3339_date_time(self,
                                  datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetime = dateutil.parser.parse('02/13/1994 14:01:54')

result = body_params_controller.create_send_rfc_3339_date_time(datetime)
print(result)
```


# Create Send Rfc 1123 Date Time

```python
def create_send_rfc_1123_date_time(self,
                                  datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetime = APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime

result = body_params_controller.create_send_rfc_1123_date_time(datetime)
print(result)
```


# Create Send Unix Date Time

```python
def create_send_unix_date_time(self,
                              datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetime = dateutil.datetime.utcfromtimestamp(1484719381)

result = body_params_controller.create_send_unix_date_time(datetime)
print(result)
```


# Create Send Rfc 3339 Date Time Array

```python
def create_send_rfc_3339_date_time_array(self,
                                        datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List of datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetimes = [
    dateutil.parser.parse('1994-02-13T14:01:54.9571247Z'),
    dateutil.parser.parse('1994-02-13T14:01:54.9571247Z')
]

result = body_params_controller.create_send_rfc_3339_date_time_array(datetimes)
print(result)
```


# Create Send Rfc 1123 Date Time Array

```python
def create_send_rfc_1123_date_time_array(self,
                                        datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List of datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetimes = [
    APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime,
    APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime
]

result = body_params_controller.create_send_rfc_1123_date_time_array(datetimes)
print(result)
```


# Create Send Unix Date Time Array

```python
def create_send_unix_date_time_array(self,
                                    datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List of datetime` | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
datetimes = [
    dateutil.datetime.utcfromtimestamp(1484719381),
    dateutil.datetime.utcfromtimestamp(1484719381)
]

result = body_params_controller.create_send_unix_date_time_array(datetimes)
print(result)
```


# Create Send Rfc 1123 Date Time in Body as Model

```python
def create_send_rfc_1123_date_time_in_body_as_model(self,
                                                   body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
body = Rfc1123DateTime(
    date_time=APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime
)

result = body_params_controller.create_send_rfc_1123_date_time_in_body_as_model(body)
print(result)
```


# Create Send Rfc 3339 Date Time in Body as Model

```python
def create_send_rfc_3339_date_time_in_body_as_model(self,
                                                   data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = DateTimeModel(
    date_time=dateutil.parser.parse('1994-02-13T14:01:54.9571247Z')
)

result = body_params_controller.create_send_rfc_3339_date_time_in_body_as_model(data)
print(result)
```


# Create Send Unix Date Time in Body as Model

```python
def create_send_unix_date_time_in_body_as_model(self,
                                               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
body = UnixDateTime(
    date_time=dateutil.datetime.utcfromtimestamp(1484719381)
)

result = body_params_controller.create_send_unix_date_time_in_body_as_model(body)
print(result)
```


# Create Send Rfc 3339 Date Time Array in Body as Model

```python
def create_send_rfc_3339_date_time_array_in_body_as_model(self,
                                                         data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = Rfc3339DateTimeArray(
    date_time=[
        dateutil.parser.parse('1994-02-13T14:01:54.9571247Z'),
        dateutil.parser.parse('1994-02-13T14:01:54.9571247Z')
    ]
)

result = body_params_controller.create_send_rfc_3339_date_time_array_in_body_as_model(data)
print(result)
```


# Create Send Unix Date Time Array in Body as Model

```python
def create_send_unix_date_time_array_in_body_as_model(self,
                                                     data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = UnixDateTimeArray(
    date_time=[
        dateutil.datetime.utcfromtimestamp(1484719381),
        dateutil.datetime.utcfromtimestamp(1484719381)
    ]
)

result = body_params_controller.create_send_unix_date_time_array_in_body_as_model(data)
print(result)
```


# Create Send Rfc 3339 Date Time Map in Body as Model

```python
def create_send_rfc_3339_date_time_map_in_body_as_model(self,
                                                       data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = Rfc3339DateTimeMap(
    date_time={
        "key0": dateutil.parser.parse('2016-03-13T12:52:32.123Z'),
        "key1": dateutil.parser.parse('2016-03-13T12:52:32.123Z'),
        "key2": dateutil.parser.parse('2016-03-13T12:52:32.123Z')
    }
)

result = body_params_controller.create_send_rfc_3339_date_time_map_in_body_as_model(data)
print(result)
```


# Create Send Rfc 1123 Date Time Map in Body as Model

```python
def create_send_rfc_1123_date_time_map_in_body_as_model(self,
                                                       data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = Rfc1123DateTimeMap(
    date_time={
        "key0": APIHelper.HttpDateTime.from_value('Mon, 15 Jun 2009 20:45:30 GMT').datetime,
        "key1": APIHelper.HttpDateTime.from_value('Mon, 15 Jun 2009 20:45:30 GMT').datetime,
        "key2": APIHelper.HttpDateTime.from_value('Mon, 15 Jun 2009 20:45:30 GMT').datetime
    }
)

result = body_params_controller.create_send_rfc_1123_date_time_map_in_body_as_model(data)
print(result)
```


# Create Send Unix Date Time Map in Body as Model

```python
def create_send_unix_date_time_map_in_body_as_model(self,
                                                   data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = UnixDateTimeMap(
    date_time={
        "key": dateutil.datetime.utcfromtimestamp(1484719381)
    }
)

result = body_params_controller.create_send_unix_date_time_map_in_body_as_model(data)
print(result)
```


# Create Send Rfc 1123 Date Time Array in Body as Model

```python
def create_send_rfc_1123_date_time_array_in_body_as_model(self,
                                                         data)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```python
data = Rfc1123DateTimeArray(
    date_time=[
        APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime,
        APIHelper.HttpDateTime.from_value('Sun, 06 Nov 1994 08:49:37 GMT').datetime
    ]
)

result = body_params_controller.create_send_rfc_1123_date_time_array_in_body_as_model(data)
print(result)
```

