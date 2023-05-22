# Form Params

```ts
const formParamsController = new FormParamsController(client);
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

```ts
async createSendDateArray(
  dates: string[],
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `string[]` | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const dates: string[] = [
  '1994-02-13',
  '1994-02-13'
];

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendDateArray(dates);
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
| `datetimes` | `string[]` | Form, Required | - |
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
    const { result,...httpResponse } = await formParamsController.createSendRfc3339DateTimeArray(datetimes);
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
| `datetimes` | `string[]` | Form, Required | - |
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
    const { result,...httpResponse } = await formParamsController.createSendRfc1123DateTimeArray(datetimes);
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
| `datetimes` | `number[]` | Form, Required | - |
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
    const { result,...httpResponse } = await formParamsController.createSendUnixDateTimeArray(datetimes);
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
| `datetime` | `string` | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = 'Sun, 06 Nov 1994 08:49:37 GMT';

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc1123DateTime(datetime);
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
| `datetime` | `string` | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = '02/13/1994 14:01:54';

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc3339DateTime(datetime);
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
| `datetime` | `number` | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const datetime = 1484719381;

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendUnixDateTime(datetime);
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


# Create Send Rfc 1123 Date Time in Form as Model

```ts
async createSendRfc1123DateTimeInFormAsModel(
  body: Rfc1123DateTime,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTime`](../../doc/models/rfc-1123-date-time.md) | Form, Required | - |
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
    const { result,...httpResponse } = await formParamsController.createSendRfc1123DateTimeInFormAsModel(body);
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


# Create Send Rfc 3339 Date Time in Form as Model

```ts
async createSendRfc3339DateTimeInFormAsModel(
  body: DateTimeModel,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DateTimeModel`](../../doc/models/date-time-model.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: DateTimeModel = {
  dateTime: '1994-02-13T14:01:54.9571247Z'
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc3339DateTimeInFormAsModel(body);
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


# Create Send Unix Date Time in Form as Model

```ts
async createSendUnixDateTimeInFormAsModel(
  body: UnixDateTime,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTime`](../../doc/models/unix-date-time.md) | Form, Required | - |
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
    const { result,...httpResponse } = await formParamsController.createSendUnixDateTimeInFormAsModel(body);
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


# Create Send Rfc 3339 Date Time Array in Form as Model

```ts
async createSendRfc3339DateTimeArrayInFormAsModel(
  body: Rfc3339DateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc3339DateTimeArray`](../../doc/models/rfc-3339-date-time-array.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: Rfc3339DateTimeArray = {
  dateTime: [
    '1994-02-13T14:01:54.9571247Z',
    '1994-02-13T14:01:54.9571247Z'
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc3339DateTimeArrayInFormAsModel(body);
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


# Create Send Rfc 1123 Date Time Array in Form as Model

```ts
async createSendRfc1123DateTimeArrayInFormAsModel(
  body: Rfc1123DateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTimeArray`](../../doc/models/rfc-1123-date-time-array.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: Rfc1123DateTimeArray = {
  dateTime: [
    'Sun, 06 Nov 1994 08:49:37 GMT',
    'Sun, 06 Nov 1994 08:49:37 GMT'
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc1123DateTimeArrayInFormAsModel(body);
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


# Create Send Unix Date Time Array in Form as Model

```ts
async createSendUnixDateTimeArrayInFormAsModel(
  body: UnixDateTimeArray,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTimeArray`](../../doc/models/unix-date-time-array.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: UnixDateTimeArray = {
  dateTime: [
    1480809600,
    1480809600,
    1480809600
  ]
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendUnixDateTimeArrayInFormAsModel(body);
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


# Create Send Unix Date Time Map in Form as Model

```ts
async createSendUnixDateTimeMapInFormAsModel(
  body: UnixDateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UnixDateTimeMap`](../../doc/models/unix-date-time-map.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: UnixDateTimeMap = {
  dateTime: {
    'key0': 1480809600,
    'key1': 1480809600,
    'key2': 1480809600
  }
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendUnixDateTimeMapInFormAsModel(body);
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


# Create Send Rfc 3339 Date Time Map in Form as Model

```ts
async createSendRfc3339DateTimeMapInFormAsModel(
  body: Rfc3339DateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc3339DateTimeMap`](../../doc/models/rfc-3339-date-time-map.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: Rfc3339DateTimeMap = {
  dateTime: {
    'key0': '2016-03-13T12:52:32.123Z',
    'key1': '2016-03-13T12:52:32.123Z',
    'key2': '2016-03-13T12:52:32.123Z'
  }
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc3339DateTimeMapInFormAsModel(body);
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


# Create Send Rfc 1123 Date Time Map in Form as Model

```ts
async createSendRfc1123DateTimeMapInFormAsModel(
  body: Rfc1123DateTimeMap,
  requestOptions?: RequestOptions
): Promise<ApiResponse<ServerResponse>>
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Rfc1123DateTimeMap`](../../doc/models/rfc-1123-date-time-map.md) | Form, Required | - |
| `requestOptions` | `RequestOptions \| undefined` | Optional | Pass additional request options. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```ts
const body: Rfc1123DateTimeMap = {
  dateTime: {
    'key0': 'Mon, 15 Jun 2009 20:45:30 GMT',
    'key1': 'Mon, 15 Jun 2009 20:45:30 GMT',
    'key2': 'Mon, 15 Jun 2009 20:45:30 GMT'
  }
};

try {
  async () => {
    const { result,...httpResponse } = await formParamsController.createSendRfc1123DateTimeMapInFormAsModel(body);
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

