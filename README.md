
# Getting Started with Tester

## Introduction

Testing various
api
features

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.hamzashoukat94</groupId>
  <artifactId>test-package-publish-sdk</artifactId>
  <version>1.12.1</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.github.hamzashoukat94/test-package-publish-sdk/1.12.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project TesterLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCode` | *Default*: `SuiteCode.HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-client-configuration.md) | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
TesterClient client = new TesterClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.TESTING)
    .port("80")
    .suites(SuiteCode.HEARTS)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## API Errors

Here is the list of errors that the API might throw.

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Global | `ApiException` |
| 402 | 402 Global | `ApiException` |
| 403 | 403 Global | `ApiException` |
| 404 | 404 Global | `ApiException` |
| 412 | Precondition Failed | [`NestedModelException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/nested-model-exception.md) |
| 450 | caught global exception | [`CustomErrorResponseException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/custom-error-response-exception.md) |
| 452 | global exception with string | [`ExceptionWithStringException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-string-exception.md) |
| 453 | boolean in global exception | [`ExceptionWithBooleanException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-boolean-exception.md) |
| 454 | dynamic in global exception | [`ExceptionWithDynamicException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-dynamic-exception.md) |
| 455 | uuid in global exception | [`ExceptionWithUUIDException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-uuid-exception.md) |
| 456 | date in global exception | [`ExceptionWithDateException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-date-exception.md) |
| 457 | number in global  exception | [`ExceptionWithNumberException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-number-exception.md) |
| 458 | long in global exception | [`ExceptionWithLongException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-long-exception.md) |
| 459 | precision in global  exception | [`ExceptionWithPrecisionException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-precision-exception.md) |
| 460 | rfc3339 in global exception | [`ExceptionWithRfc3339DateTimeException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/exception-with-rfc-3339-date-time-exception.md) |
| 461 | unix time stamp in global exception | [`UnixTimeStampException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/unix-time-stamp-exception.md) |
| 462 | rfc1123 in global exception | [`Rfc1123Exception`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/rfc-1123-exception.md) |
| 463 | boolean in model as global exception | [`SendBooleanInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-boolean-in-model-as-exception.md) |
| 464 | rfc3339 in model as global exception | [`SendRfc3339InModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-rfc-3339-in-model-as-exception.md) |
| 465 | rfc1123 in model as global exception | [`SendRfc1123InModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-rfc-1123-in-model-as-exception.md) |
| 466 | unix time stamp in model as global exception | [`SendUnixTimeStampInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-unix-time-stamp-in-model-as-exception.md) |
| 467 | send date in model as global exception | [`SendDateInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-date-in-model-as-exception.md) |
| 468 | send dynamic in model as global exception | [`SendDynamicInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-dynamic-in-model-as-exception.md) |
| 469 | send string in model as global exception | [`SendStringInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-string-in-model-as-exception.md) |
| 470 | send long in model as global exception | [`SendLongInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-long-in-model-as-exception.md) |
| 471 | send number in model as global exception | [`SendNumberInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-number-in-model-as-exception.md) |
| 472 | send precision in model as global exception | [`SendPrecisionInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-precision-in-model-as-exception.md) |
| 473 | send uuid in model as global exception | [`SendUuidInModelAsException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/send-uuid-in-model-as-exception.md) |
| 500 | 500 Global | [`GlobalTestException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/global-test-exception.md) |
| Default | Invalid response. | [`GlobalTestException`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/models/global-test-exception.md) |

## List of APIs

* [Response Types](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/response-types.md)
* [Form Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/form-params.md)
* [Body Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/body-params.md)
* [Error Codes](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/error-codes.md)
* [Query Param](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/query-param.md)
* [Echo](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/echo.md)
* [Header](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/header.md)
* [Template Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/template-params.md)
* [Query Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/controllers/query-params.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-callback-interface.md)
* [Headers](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/headers.md)
* [ApiException](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.12.1/doc/http-client-configuration-builder.md)

