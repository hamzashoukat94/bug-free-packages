# Body Params

```ts
const bodyParamsController = new BodyParamsController(client);
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

```ts
async createSendRfc3339DateTime(
  datetime: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `string` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = '02/13/1994 14:01:54';

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc3339DateTime(datetime);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 1123 Date Time

```ts
async createSendRfc1123DateTime(
  datetime: string,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `string` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = 'Sun, 06 Nov 1994 08:49:37 GMT';

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc1123DateTime(datetime);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Unix Date Time

```ts
async createSendUnixDateTime(
  datetime: number,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `number` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = 1484719381;

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendUnixDateTime(datetime);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 3339 Date Time Array

```ts
async createSendRfc3339DateTimeArray(
  datetimes: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `string[]` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetimes: string[] = [
  '1994-02-13T14:01:54.9571247Z',
  '1994-02-13T14:01:54.9571247Z'
];

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc3339DateTimeArray(datetimes);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 1123 Date Time Array

```ts
async createSendRfc1123DateTimeArray(
  datetimes: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `string[]` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetimes: string[] = [
  'Sun, 06 Nov 1994 08:49:37 GMT',
  'Sun, 06 Nov 1994 08:49:37 GMT'
];

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc1123DateTimeArray(datetimes);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Unix Date Time Array

```ts
async createSendUnixDateTimeArray(
  datetimes: number[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `number[]` | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetimes: number[] = [
  1484719381,
  1484719381
];

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendUnixDateTimeArray(datetimes);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 1123 Date Time in Body as Model

```ts
async createSendRfc1123DateTimeInBodyAsModel(
  body: Rfc1123DateTime,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: Rfc1123DateTime = {
  dateTime: 'Sun, 06 Nov 1994 08:49:37 GMT'
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc1123DateTimeInBodyAsModel(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 3339 Date Time in Body as Model

```ts
async createSendRfc3339DateTimeInBodyAsModel(
  data: DateTimeModel,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: DateTimeModel = {
  dateTime: '1994-02-13T14:01:54.9571247Z'
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc3339DateTimeInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Unix Date Time in Body as Model

```ts
async createSendUnixDateTimeInBodyAsModel(
  body: UnixDateTime,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: UnixDateTime = {
  dateTime: 1484719381
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendUnixDateTimeInBodyAsModel(body);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 3339 Date Time Array in Body as Model

```ts
async createSendRfc3339DateTimeArrayInBodyAsModel(
  data: Rfc3339DateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: Rfc3339DateTimeArray = {
  dateTime: [
    '1994-02-13T14:01:54.9571247Z',
    '1994-02-13T14:01:54.9571247Z'
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc3339DateTimeArrayInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Unix Date Time Array in Body as Model

```ts
async createSendUnixDateTimeArrayInBodyAsModel(
  data: UnixDateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: UnixDateTimeArray = {
  dateTime: [
    1484719381,
    1484719381
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendUnixDateTimeArrayInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 3339 Date Time Map in Body as Model

```ts
async createSendRfc3339DateTimeMapInBodyAsModel(
  data: Rfc3339DateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: Rfc3339DateTimeMap = {
  dateTime: {
    'key0': '2016-03-13T12:52:32.123Z',
    'key1': '2016-03-13T12:52:32.123Z',
    'key2': '2016-03-13T12:52:32.123Z'
  }
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc3339DateTimeMapInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 1123 Date Time Map in Body as Model

```ts
async createSendRfc1123DateTimeMapInBodyAsModel(
  data: Rfc1123DateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: Rfc1123DateTimeMap = {
  dateTime: {
    'key0': 'Mon, 15 Jun 2009 20:45:30 GMT',
    'key1': 'Mon, 15 Jun 2009 20:45:30 GMT',
    'key2': 'Mon, 15 Jun 2009 20:45:30 GMT'
  }
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc1123DateTimeMapInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Unix Date Time Map in Body as Model

```ts
async createSendUnixDateTimeMapInBodyAsModel(
  data: UnixDateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: UnixDateTimeMap = {
  dateTime: {
    'key': 1484719381
  }
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendUnixDateTimeMapInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```


# Create Send Rfc 1123 Date Time Array in Body as Model

```ts
async createSendRfc1123DateTimeArrayInBodyAsModel(
  data: Rfc1123DateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `data` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Body, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const data: Rfc1123DateTimeArray = {
  dateTime: [
    'Sun, 06 Nov 1994 08:49:37 GMT',
    'Sun, 06 Nov 1994 08:49:37 GMT'
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await bodyParamsController.createSendRfc1123DateTimeArrayInBodyAsModel(data);
  // Get more response info...
  // const { statusCode, headers } = httpResponse;
  }
} catch(error) {
  if (error instanceof ApiError) {
    const errors = error as ApiError;
    // const { statusCode, headers } = error;
  }
}
```

