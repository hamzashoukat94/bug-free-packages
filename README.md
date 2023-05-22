
# Getting Started with Test for Datetime in Model

## Introduction

this description is used for validating the behavior of date-time implementation in java.

## Install the Package

Run the following command from your project directory to install the package from npm:

```ts
npm install date-time-beta-package-sdk@1.0.0
```

For additional package details, see the [Npm page for the date-time-beta-package-sdk@1.0.0  npm](https://www.npmjs.com/package/date-time-beta-package-sdk/v/1.0.0).

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `string` | *Default*: `'80'` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum.Hearts` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.Testing`** |
| `timeout` | `number` | Timeout for API calls.<br>*Default*: `0` |
| `httpClientOptions` | `Partial<HttpClientOptions>` | Stable configurable http client options. |
| `unstableHttpClientOptions` | `any` | Unstable configurable http client options. |

### HttpClientOptions

| Parameter | Type | Description |
|  --- | --- | --- |
| `timeout` | `number` | Timeout in milliseconds. |
| `httpAgent` | `any` | Custom http agent to be used when performing http requests. |
| `httpsAgent` | `any` | Custom https agent to be used when performing http requests. |
| `retryConfig` | `Partial<RetryConfiguration>` | Configurations to retry requests. |

### RetryConfiguration

| Parameter | Type | Description |
|  --- | --- | --- |
| `maxNumberOfRetries` | `number` | Maximum number of retries. <br> *Default*: `0` |
| `retryOnTimeout` | `boolean` | Whether to retry on request timeout. <br> *Default*: `true` |
| `retryInterval` | `number` | Interval before next retry. Used in calculation of wait time for next request in case of failure. <br> *Default*: `1` |
| `maximumRetryWaitTime` | `number` | Overall wait time for the requests getting retried. <br> *Default*: `0` |
| `backoffFactor` | `number` | Used in calculation of wait time for next request in case of failure. <br> *Default*: `2` |
| `httpStatusCodesToRetry` | `number[]` | Http status codes to retry against. <br> *Default*: `[408, 413, 429, 500, 502, 503, 504, 521, 522, 524]` |
| `httpMethodsToRetry` | `HttpMethod[]` | Http methods to retry against. <br> *Default*: `['GET', 'PUT']` |

The API client can be initialized as follows:

```ts
const client = new Client({
  timeout: 0,
  environment: Environment.Testing,
});
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## List of APIs

* [Body Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/controllers/body-params.md)
* [Form Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/controllers/form-params.md)

## Classes Documentation

* [ApiResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/api-response.md)
* [ApiError](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/api-error.md)

