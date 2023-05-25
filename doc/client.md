
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCode` | *Default*: `SuiteCode.HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |

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

## TesterClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getResponseTypesController()` | Provides access to ResponseTypes controller. | `ResponseTypesController` |
| `getFormParamsController()` | Provides access to FormParams controller. | `FormParamsController` |
| `getBodyParamsController()` | Provides access to BodyParams controller. | `BodyParamsController` |
| `getErrorCodesController()` | Provides access to ErrorCodes controller. | `ErrorCodesController` |
| `getQueryParamController()` | Provides access to QueryParam controller. | `QueryParamController` |
| `getEchoController()` | Provides access to Echo controller. | `EchoController` |
| `getHeaderController()` | Provides access to Header controller. | `HeaderController` |
| `getTemplateParamsController()` | Provides access to TemplateParams controller. | `TemplateParamsController` |
| `getQueryParamsController()` | Provides access to QueryParams controller. | `QueryParamsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getPort()` | port value. | `String` |
| `getSuites()` | suites value. | `SuiteCode` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

