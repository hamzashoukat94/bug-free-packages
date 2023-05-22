
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `Port` | `string` | *Default*: `"80"` |
| `Suites` | `Models.SuiteCodeEnum` | *Default*: `SuiteCodeEnum.Hearts` |
| `Environment` | Environment | The API environment. <br> **Default: `Environment.Testing`** |
| `Timeout` | `TimeSpan` | Http client timeout.<br>*Default*: `TimeSpan.FromSeconds(100)` |

The API client can be initialized as follows:

```csharp
TestForDatetimeInModel.Standard.TestForDatetimeInModelClient client = new TestForDatetimeInModel.Standard.TestForDatetimeInModelClient.Builder()
    .Environment(TestForDatetimeInModel.Standard.Environment.Testing)
    .Port("80")
    .Suites(SuiteCodeEnum.Hearts)
    .Build();
```

## Test for Datetime in ModelClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description |
|  --- | --- |
| BodyParamsController | Gets BodyParamsController controller. |
| FormParamsController | Gets FormParamsController controller. |

### Properties

| Name | Description | Type |
|  --- | --- | --- |
| HttpClientConfiguration | Gets the configuration of the Http Client associated with this client. | [`IHttpClientConfiguration`](http-client-configuration.md) |
| Timeout | Http client timeout. | `TimeSpan` |
| Environment | Current API environment. | `Environment` |
| Port | Port value. | `string` |
| Suites | Suites value. | `Models.SuiteCodeEnum` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `GetBaseUri(Server alias = Server.Default)` | Gets the URL for a particular alias in the current environment and appends it with template parameters. | `string` |
| `ToBuilder()` | Creates an object of the Test for Datetime in ModelClient using the values provided for the builder. | `Builder` |

## Test for Datetime in ModelClient Builder Class

Class to build instances of Test for Datetime in ModelClient.

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `HttpClientConfiguration(Action<`[`HttpClientConfiguration.Builder`](http-client-configuration-builder.md)`> action)` | Gets the configuration of the Http Client associated with this client. | `Builder` |
| `Timeout(TimeSpan timeout)` | Http client timeout. | `Builder` |
| `Environment(Environment environment)` | Current API environment. | `Builder` |
| `Port(string port)` | Port value. | `Builder` |
| `Suites(Models.SuiteCodeEnum suites)` | Suites value. | `Builder` |

