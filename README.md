
# Getting Started with Test for Datetime in Model

## Introduction

this description is used for validating the behavior of date-time implementation in java.

## Install the Package

The package is compatible with Python versions `3 >=3.7, <= 3.11`.
Install the package from PyPi using the following pip command:

```python
pip install date-time-beta-package-sdk==1.0.0
```

You can also view the package at:
https://pypi.python.org/pypi/date-time-beta-package-sdk/1.0.0

## Test the SDK

You can test the generated SDK and the server with test cases. `unittest` is used as the testing framework and `pytest` is used as the test runner. You can run the tests as follows:

Navigate to the root directory of the SDK and run the following commands

```
pip install -r test-requirements.txt
pytest
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `string` | *Default*: `'80'` |
| `suites` | `SuiteCodeEnum` | *Default*: `1` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `http_client_instance` | `HttpClient` | The Http Client passed from the sdk user for making requests |
| `override_http_client_configuration` | `bool` | The value which determines to override properties of the passed Http Client from the sdk user |
| `http_call_back` | `HttpCallBack` | The callback value that is invoked before and after an HTTP call is made to an endpoint |
| `timeout` | `float` | The value to use for connection timeout. <br> **Default: 60** |
| `max_retries` | `int` | The number of times to retry an endpoint call if it fails. <br> **Default: 0** |
| `backoff_factor` | `float` | A backoff factor to apply between attempts after the second try. <br> **Default: 2** |
| `retry_statuses` | `Array of int` | The http statuses on which retry is to be done. <br> **Default: [408, 413, 429, 500, 502, 503, 504, 521, 522, 524]** |
| `retry_methods` | `Array of string` | The http methods on which retry is to be done. <br> **Default: ['GET', 'PUT']** |

The API client can be initialized as follows:

```python
from testfordatetimeinmodel.testfordatetimeinmodel_client import TestfordatetimeinmodelClient
from testfordatetimeinmodel.configuration import Environment

client = TestfordatetimeinmodelClient()
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

* [Utility Classes](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/utility-classes.md)
* [HttpResponse](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/http-response.md)
* [HttpRequest](https://www.github.com/hamzashoukat94/bug-free-packages/tree/1.0.0/doc/http-request.md)

