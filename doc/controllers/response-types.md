# Response Types

```java
ResponseTypesController responseTypesController = client.getResponseTypesController();
```

## Class Name

`ResponseTypesController`

## Methods

* [Get Date Array](../../doc/controllers/response-types.md#get-date-array)
* [Get Date](../../doc/controllers/response-types.md#get-date)
* [Return Developer Model](../../doc/controllers/response-types.md#return-developer-model)
* [Return Complex 2 Object](../../doc/controllers/response-types.md#return-complex-2-object)
* [Get Int Enum](../../doc/controllers/response-types.md#get-int-enum)
* [Get Int Enum Array](../../doc/controllers/response-types.md#get-int-enum-array)
* [Get Binary](../../doc/controllers/response-types.md#get-binary)
* [Get Content Type Headers](../../doc/controllers/response-types.md#get-content-type-headers)
* [Return Employee Model](../../doc/controllers/response-types.md#return-employee-model)
* [Return Tester Model](../../doc/controllers/response-types.md#return-tester-model)
* [Get Long](../../doc/controllers/response-types.md#get-long)
* [Get Model Array](../../doc/controllers/response-types.md#get-model-array)
* [Get Precision](../../doc/controllers/response-types.md#get-precision)
* [Get Dynamic Array](../../doc/controllers/response-types.md#get-dynamic-array)
* [Get 1123 Date Time](../../doc/controllers/response-types.md#get-1123-date-time)
* [Get Unix Date Time](../../doc/controllers/response-types.md#get-unix-date-time)
* [Return Complex 1 Object](../../doc/controllers/response-types.md#return-complex-1-object)
* [Get Model](../../doc/controllers/response-types.md#get-model)
* [Get 3339 Datetime](../../doc/controllers/response-types.md#get-3339-datetime)
* [Get 3339 Datetime Array](../../doc/controllers/response-types.md#get-3339-datetime-array)
* [Get Boolean Array](../../doc/controllers/response-types.md#get-boolean-array)
* [Get Unix Date Time Array](../../doc/controllers/response-types.md#get-unix-date-time-array)
* [Return Company Model](../../doc/controllers/response-types.md#return-company-model)
* [Return Boss Model](../../doc/controllers/response-types.md#return-boss-model)
* [Return Response With Enums](../../doc/controllers/response-types.md#return-response-with-enums)
* [Return Complex 3 Object](../../doc/controllers/response-types.md#return-complex-3-object)
* [Get String Enum Array](../../doc/controllers/response-types.md#get-string-enum-array)
* [Get String Enum](../../doc/controllers/response-types.md#get-string-enum)
* [Get Integer](../../doc/controllers/response-types.md#get-integer)
* [Get Integer Array](../../doc/controllers/response-types.md#get-integer-array)
* [Get Dynamic](../../doc/controllers/response-types.md#get-dynamic)
* [Get Boolean](../../doc/controllers/response-types.md#get-boolean)
* [Get Headers](../../doc/controllers/response-types.md#get-headers)
* [Get 1123 Date Time Array](../../doc/controllers/response-types.md#get-1123-date-time-array)


# Get Date Array

```java
CompletableFuture<List<LocalDate>> getDateArrayAsync()
```

## Response Type

`List<LocalDate>`

## Example Usage

```java
responseTypesController.getDateArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Date

```java
CompletableFuture<LocalDate> getDateAsync()
```

## Response Type

`LocalDate`

## Example Usage

```java
responseTypesController.getDateAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Return Developer Model

```java
CompletableFuture<Developer> returnDeveloperModelAsync()
```

## Response Type

[`Developer`](../../doc/models/developer.md)

## Example Usage

```java
responseTypesController.returnDeveloperModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "company name": "APIMatic",
  "address": "nust",
  "cell number": "090078601",
  "first name": "Nauman",
  "last name": "Ali",
  "id": "123456",
  "team": "CORE",
  "designation": "Manager",
  "role": "Team Lead"
}
```


# Return Complex 2 Object

```java
CompletableFuture<Complex2> returnComplex2ObjectAsync()
```

## Response Type

[`Complex2`](../../doc/models/complex-2.md)

## Example Usage

```java
responseTypesController.returnComplex2ObjectAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "glossary": {
    "title": "example glossary",
    "GlossDiv": {
      "title": "S",
      "GlossList": {
        "GlossEntry": {
          "ID": "SGML",
          "SortAs": "SGML",
          "GlossTerm": "Standard Generalized Markup Language",
          "Acronym": "SGML",
          "Abbrev": "ISO 8879:1986",
          "GlossDef": {
            "para": "A meta-markup language, used to create markup languages such as DocBook.",
            "GlossSeeAlso": [
              "GML",
              "XML"
            ]
          },
          "GlossSee": "markup"
        }
      }
    }
  }
}
```


# Get Int Enum

```java
CompletableFuture<SuiteCode> getIntEnumAsync()
```

## Response Type

[`SuiteCode`](../../doc/models/suite-code.md)

## Example Usage

```java
responseTypesController.getIntEnumAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Int Enum Array

```java
CompletableFuture<List<SuiteCode>> getIntEnumArrayAsync()
```

## Response Type

[`List<SuiteCode>`](../../doc/models/suite-code.md)

## Example Usage

```java
responseTypesController.getIntEnumArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Binary

gets a binary object

```java
CompletableFuture<InputStream> getBinaryAsync()
```

## Response Type

`InputStream`

## Example Usage

```java
responseTypesController.getBinaryAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Content Type Headers

```java
CompletableFuture<Void> getContentTypeHeadersAsync()
```

## Response Type

`void`

## Example Usage

```java
responseTypesController.getContentTypeHeadersAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Return Employee Model

```java
CompletableFuture<EmployeeComp> returnEmployeeModelAsync()
```

## Response Type

[`EmployeeComp`](../../doc/models/employee-comp.md)

## Example Usage

```java
responseTypesController.returnEmployeeModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "company name": "APIMatic",
  "address": "nust",
  "cell number": "090078601",
  "first name": "Nauman",
  "last name": "Ali",
  "id": "123456"
}
```


# Return Tester Model

```java
CompletableFuture<SoftwareTester> returnTesterModelAsync()
```

## Response Type

[`SoftwareTester`](../../doc/models/software-tester.md)

## Example Usage

```java
responseTypesController.returnTesterModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "company name": "APIMatic",
  "address": "nust",
  "cell number": "090078601",
  "first name": "Muhammad",
  "last name": "Farhan",
  "id": "123456",
  "team": "Testing",
  "designation": "Tester",
  "role": "Testing"
}
```


# Get Long

```java
CompletableFuture<Long> getLongAsync()
```

## Server

`Server.ENUM_DEFAULT`

## Response Type

`long`

## Example Usage

```java
responseTypesController.getLongAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Model Array

```java
CompletableFuture<List<Person>> getModelArrayAsync()
```

## Response Type

[`List<Person>`](../../doc/models/person.md)

## Example Usage

```java
responseTypesController.getModelArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Precision

```java
CompletableFuture<Double> getPrecisionAsync()
```

## Response Type

`double`

## Example Usage

```java
responseTypesController.getPrecisionAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Dynamic Array

```java
CompletableFuture<DynamicResponse> getDynamicArrayAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
responseTypesController.getDynamicArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 1123 Date Time

```java
CompletableFuture<LocalDateTime> get1123DateTimeAsync()
```

## Response Type

`LocalDateTime`

## Example Usage

```java
responseTypesController.get1123DateTimeAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Unix Date Time

```java
CompletableFuture<LocalDateTime> getUnixDateTimeAsync()
```

## Response Type

`LocalDateTime`

## Example Usage

```java
responseTypesController.getUnixDateTimeAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Return Complex 1 Object

```java
CompletableFuture<Complex1> returnComplex1ObjectAsync()
```

## Response Type

[`Complex1`](../../doc/models/complex-1.md)

## Example Usage

```java
responseTypesController.returnComplex1ObjectAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "medications": [
    {
      "aceInhibitors": [
        {
          "name": "lisinopril",
          "strength": "10 mg Tab",
          "dose": "1 tab",
          "route": "PO",
          "sig": "daily",
          "pillCount": "#90",
          "refills": "Refill 3"
        }
      ],
      "antianginal": [
        {
          "name": "nitroglycerin",
          "strength": "0.4 mg Sublingual Tab",
          "dose": "1 tab",
          "route": "SL",
          "sig": "q15min PRN",
          "pillCount": "#30",
          "refills": "Refill 1"
        }
      ],
      "anticoagulants": [
        {
          "name": "warfarin sodium",
          "strength": "3 mg Tab",
          "dose": "1 tab",
          "route": "PO",
          "sig": "daily",
          "pillCount": "#90",
          "refills": "Refill 3"
        }
      ],
      "betaBlocker": [
        {
          "name": "metoprolol tartrate",
          "strength": "25 mg Tab",
          "dose": "1 tab",
          "route": "PO",
          "sig": "daily",
          "pillCount": "#90",
          "refills": "Refill 3"
        }
      ],
      "diuretic": [
        {
          "name": "furosemide",
          "strength": "40 mg Tab",
          "dose": "1 tab",
          "route": "PO",
          "sig": "daily",
          "pillCount": "#90",
          "refills": "Refill 3"
        }
      ],
      "mineral": [
        {
          "name": "potassium chloride ER",
          "strength": "10 mEq Tab",
          "dose": "1 tab",
          "route": "PO",
          "sig": "daily",
          "pillCount": "#90",
          "refills": "Refill 3"
        }
      ]
    }
  ],
  "labs": [
    {
      "name": "Arterial Blood Gas",
      "time": "Today",
      "location": "Main Hospital Lab"
    },
    {
      "name": "BMP",
      "time": "Today",
      "location": "Primary Care Clinic"
    },
    {
      "name": "BNP",
      "time": "3 Weeks",
      "location": "Primary Care Clinic"
    },
    {
      "name": "BUN",
      "time": "1 Year",
      "location": "Primary Care Clinic"
    },
    {
      "name": "Cardiac Enzymes",
      "time": "Today",
      "location": "Primary Care Clinic"
    },
    {
      "name": "CBC",
      "time": "1 Year",
      "location": "Primary Care Clinic"
    },
    {
      "name": "Creatinine",
      "time": "1 Year",
      "location": "Main Hospital Lab"
    },
    {
      "name": "Electrolyte Panel",
      "time": "1 Year",
      "location": "Primary Care Clinic"
    },
    {
      "name": "Glucose",
      "time": "1 Year",
      "location": "Main Hospital Lab"
    },
    {
      "name": "PT/INR",
      "time": "3 Weeks",
      "location": "Primary Care Clinic"
    },
    {
      "name": "PTT",
      "time": "3 Weeks",
      "location": "Coumadin Clinic"
    },
    {
      "name": "TSH",
      "time": "1 Year",
      "location": "Primary Care Clinic"
    }
  ],
  "imaging": [
    {
      "name": "Chest X-Ray",
      "time": "Today",
      "location": "Main Hospital Radiology"
    },
    {
      "name": "Chest X-Ray",
      "time": "Today",
      "location": "Main Hospital Radiology"
    },
    {
      "name": "Chest X-Ray",
      "time": "Today",
      "location": "Main Hospital Radiology"
    }
  ]
}
```


# Get Model

```java
CompletableFuture<Person> getModelAsync()
```

## Response Type

[`Person`](../../doc/models/person.md)

## Example Usage

```java
responseTypesController.getModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 3339 Datetime

```java
CompletableFuture<LocalDateTime> get3339DatetimeAsync()
```

## Response Type

`LocalDateTime`

## Example Usage

```java
responseTypesController.get3339DatetimeAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 3339 Datetime Array

```java
CompletableFuture<List<LocalDateTime>> get3339DatetimeArrayAsync()
```

## Response Type

`List<LocalDateTime>`

## Example Usage

```java
responseTypesController.get3339DatetimeArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Boolean Array

```java
CompletableFuture<List<Boolean>> getBooleanArrayAsync()
```

## Response Type

`List<Boolean>`

## Example Usage

```java
responseTypesController.getBooleanArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Unix Date Time Array

```java
CompletableFuture<List<LocalDateTime>> getUnixDateTimeArrayAsync()
```

## Response Type

`List<LocalDateTime>`

## Example Usage

```java
responseTypesController.getUnixDateTimeArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Return Company Model

```java
CompletableFuture<Company> returnCompanyModelAsync()
```

## Response Type

[`Company`](../../doc/models/company.md)

## Example Usage

```java
responseTypesController.returnCompanyModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "company name": "APIMatic",
  "address": "nust",
  "cell number": "090078601"
}
```


# Return Boss Model

```java
CompletableFuture<BossCompany> returnBossModelAsync()
```

## Response Type

[`BossCompany`](../../doc/models/boss-company.md)

## Example Usage

```java
responseTypesController.returnBossModelAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "company name": "APIMatic",
  "address": "nust",
  "cell number": "090078601",
  "first name": "Adeel",
  "last name": "Ali",
  "address_boss": "nust"
}
```


# Return Response With Enums

```java
CompletableFuture<ResponseWithEnum> returnResponseWithEnumsAsync()
```

## Response Type

[`ResponseWithEnum`](../../doc/models/response-with-enum.md)

## Example Usage

```java
responseTypesController.returnResponseWithEnumsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "paramFormat": "Template",
  "optional": false,
  "type": "Long",
  "constant": false,
  "isArray": false,
  "isStream": false,
  "isAttribute": false,
  "isMap": false,
  "attributes": {
    "exclusiveMaximum": false,
    "exclusiveMinimum": false,
    "id": "5a9fcb01caacc310dc6bab51"
  },
  "nullable": false,
  "id": "5a9fcb01caacc310dc6bab50",
  "name": "petId",
  "description": "ID of pet to update"
}
```


# Return Complex 3 Object

```java
CompletableFuture<Complex3> returnComplex3ObjectAsync()
```

## Response Type

[`Complex3`](../../doc/models/complex-3.md)

## Example Usage

```java
responseTypesController.returnComplex3ObjectAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "documentId": "099cceda-38a8-4b01-87b9-a8f2007675d6",
  "signers": [
    {
      "id": "1bef97d1-0704-4eb2-a490-a8f2007675db",
      "url": "https://sign-test.idfy.io/start?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJrdmVyc2lvbiI6IjdmNzhjNzNkMmQ1MjQzZWRiYjdiNDI0MmI2MDE1MWU4IiwiZG9jaWQiOiIwOTljY2VkYS0zOGE4LTRiMDEtODdiOS1hOGYyMDA3Njc1ZDYiLCJhaWQiOiJjMGNlMTQ2OC1hYzk0LTRiMzQtODc2ZS1hODg1MDBjMmI5YTEiLCJsZyI6ImVuIiwiZXJyIjpudWxsLCJpZnIiOmZhbHNlLCJ3Ym1zZyI6ZmFsc2UsInNmaWQiOiIxYmVmOTdkMS0wNzA0LTRlYjItYTQ5MC1hOGYyMDA3Njc1ZGIiLCJ1cmxleHAiOm51bGwsImF0aCI6bnVsbCwiZHQiOiJUZXN0IGRvY3VtZW50IiwidmYiOmZhbHNlLCJhbiI6IklkZnkgU0RLIGRlbW8iLCJ0aCI6IlBpbmsiLCJzcCI6IkN1YmVzIiwiZG9tIjpudWxsLCJyZGlyIjpmYWxzZSwidXQiOiJ3ZWIiLCJ1dHYiOm51bGwsInNtIjoidGVzdEB0ZXN0LmNvbSJ9.Dyy2RSeR6dmU8qxOEi-2gEX3Gg7wry6JhkZIWOuADDdu5jJWidQLcxfJn_qAHNpb",
      "links": [],
      "externalSignerId": "uoiahsd321982983jhrmnec2wsadm32",
      "redirectSettings": {
        "redirectMode": "donot_redirect"
      },
      "signatureType": {
        "mechanism": "pkisignature",
        "onEacceptUseHandWrittenSignature": false
      },
      "ui": {
        "dialogs": {
          "before": {
            "useCheckBox": false,
            "title": "Info",
            "message": "Please read the contract on the next pages carefully. Pay some extra attention to paragraph 5."
          }
        },
        "language": "EN",
        "styling": {
          "colorTheme": "Pink",
          "spinner": "Cubes"
        }
      },
      "tags": [],
      "order": 0,
      "required": false
    }
  ],
  "status": {
    "documentStatus": "unsigned",
    "completedPackages": [],
    "attachmentPackages": {}
  },
  "title": "Test document",
  "description": "This is an important document",
  "externalId": "ae7b9ca7-3839-4e0d-a070-9f14bffbbf55",
  "dataToSign": {
    "fileName": "sample.txt",
    "convertToPDF": false
  },
  "contactDetails": {
    "email": "test@test.com",
    "url": "https://idfy.io"
  },
  "advanced": {
    "tags": [
      "develop",
      "fun_with_documents"
    ],
    "attachments": 0,
    "requiredSignatures": 0,
    "getSocialSecurityNumber": false,
    "timeToLive": {
      "deadline": "2018-06-29T14:57:25Z",
      "deleteAfterHours": 1
    }
  }
}
```


# Get String Enum Array

```java
CompletableFuture<List<Days>> getStringEnumArrayAsync()
```

## Response Type

[`List<Days>`](../../doc/models/days.md)

## Example Usage

```java
responseTypesController.getStringEnumArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get String Enum

```java
CompletableFuture<Days> getStringEnumAsync()
```

## Response Type

[`Days`](../../doc/models/days.md)

## Example Usage

```java
responseTypesController.getStringEnumAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Integer

Gets a integer response

```java
CompletableFuture<Integer> getIntegerAsync()
```

## Response Type

`int`

## Example Usage

```java
responseTypesController.getIntegerAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Integer Array

Get an array of integers.

```java
CompletableFuture<List<Integer>> getIntegerArrayAsync()
```

## Response Type

`List<Integer>`

## Example Usage

```java
responseTypesController.getIntegerArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Dynamic

```java
CompletableFuture<DynamicResponse> getDynamicAsync()
```

## Response Type

`DynamicResponse`

## Example Usage

```java
responseTypesController.getDynamicAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Boolean

```java
CompletableFuture<Boolean> getBooleanAsync()
```

## Response Type

`boolean`

## Example Usage

```java
responseTypesController.getBooleanAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Headers

```java
CompletableFuture<Void> getHeadersAsync()
```

## Response Type

`void`

## Example Usage

```java
responseTypesController.getHeadersAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get 1123 Date Time Array

```java
CompletableFuture<List<LocalDateTime>> get1123DateTimeArrayAsync()
```

## Response Type

`List<LocalDateTime>`

## Example Usage

```java
responseTypesController.get1123DateTimeArrayAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

