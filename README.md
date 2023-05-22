
# Getting Started with Test for Datetime in Model

## Introduction

this description is used for validating the behavior of date-time implementation in java.

## Install the Package

If you are building with .NET CLI tools then you can also use the following command:

```bash
dotnet add package DatetimebetapackageSDK --version 1.0.1
```

You can also view the package at:
https://www.nuget.org/packages/DatetimebetapackageSDK/1.0.1

## Test the SDK

The generated SDK also contain one or more Tests, which are contained in the Tests project. In order to invoke these test cases, you will need `NUnit 3.0 Test Adapter Extension` for Visual Studio. Once the SDK is complied, the test cases should appear in the Test Explorer window. Here, you can click `Run All` to execute these test cases.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/client.md)

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## List of APIs

* [Body Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/controllers/body-params.md)
* [Form Params](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/controllers/form-params.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-context.md)
* [HttpClientConfiguration](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-client-configuration.md)
* [HttpClientConfiguration Builder](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-client-configuration-builder.md)
* [IAuthManager](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/i-auth-manager.md)
* [ApiException](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/api-exception.md)

