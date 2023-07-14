
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum.HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
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

## BATesterClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAPIController()` | Provides access to Client controller. | `APIController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getPort()` | port value. | `String` |
| `getSuites()` | suites value. | `SuiteCodeEnum` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

