
# Getting Started with Test for Datetime in Model

## Introduction

this description is used for validating the behavior of date-time implementation in java.

## Install the Package

Install the gem from the command line:

```ruby
gem install date-time-beta-package-sdk -v 1.0.1
```

Or add the gem to your Gemfile and run `bundle`:

```ruby
gem 'date-time-beta-package-sdk', '1.0.1'
```

For additional gem details, see the [RubyGems page for the date-time-beta-package-sdk gem](https://rubygems.org/gems/date-time-beta-package-sdk/versions/1.0.1).

## Test the SDK

To run the tests, navigate to the root directory of the SDK in your terminal and execute the following command:

```
rake
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `'80'` |
| `suites` | `SuiteCodeEnum` | *Default*: `SuiteCodeEnum::HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `connection` | `Faraday::Connection` | The Faraday connection object passed by the SDK user for making requests |
| `adapter` | `Faraday::Adapter` | The Faraday adapter object passed by the SDK user for performing http requests |
| `timeout` | `Float` | The value to use for connection timeout. <br> **Default: 60** |
| `max_retries` | `Integer` | The number of times to retry an endpoint call if it fails. <br> **Default: 0** |
| `retry_interval` | `Float` | Pause in seconds between retries. <br> **Default: 1** |
| `backoff_factor` | `Float` | The amount to multiply each successive retry's interval amount by in order to provide backoff. <br> **Default: 2** |
| `retry_statuses` | `Array` | A list of HTTP statuses to retry. <br> **Default: [408, 413, 429, 500, 502, 503, 504, 521, 522, 524]** |
| `retry_methods` | `Array` | A list of HTTP methods to retry. <br> **Default: %i[get put]** |
| `http_callback` | `HttpCallBack` | The Http CallBack allows defining callables for pre and post API calls. |

The API client can be initialized as follows:

```ruby
client = TestForDatetimeInModel::Client.new(
  environment: Environment::TESTING,
  port: '80',
  suites: SuiteCodeEnum::HEARTS
)
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
* [HttpResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-response.md)
* [HttpRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.1/doc/http-request.md)

