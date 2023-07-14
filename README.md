
# Getting Started with BATester

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.apimatic</groupId>
  <artifactId>first-package-sdk</artifactId>
  <version>1.1.1</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.apimatic/first-package-sdk/1.1.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project BATesterLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum.HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
BATesterClient client = new BATesterClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .environment(Environment.TESTING)
    .port("80")
    .suites(SuiteCodeEnum.HEARTS)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## Authorization

This API uses `Basic Authentication`.

## List of APIs

* [API](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/controllers/api.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-callback-interface.md)
* [Headers](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/headers.md)
* [ApiException](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.1.1/doc/http-client-configuration-builder.md)

