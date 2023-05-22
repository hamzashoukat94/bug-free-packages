// <copyright file="FormParamsController.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard.Controllers
{
    using System;
    using System.Collections.Generic;
    using System.Dynamic;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading;
    using System.Threading.Tasks;
    using APIMatic.Core;
    using APIMatic.Core.Types;
    using APIMatic.Core.Utilities;
    using APIMatic.Core.Utilities.Date.Xml;
    using Newtonsoft.Json.Converters;
    using System.Net.Http;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Http.Client;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// FormParamsController.
    /// </summary>
    public class FormParamsController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FormParamsController"/> class.
        /// </summary>
        internal FormParamsController(GlobalConfiguration globalConfiguration) : base(globalConfiguration) { }

        /// <summary>
        /// Send Date Array EndPoint.
        /// </summary>
        /// <param name="dates">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendDateArray(
                List<DateTime> dates)
            => CoreHelper.RunTask(CreateSendDateArrayAsync(dates));

        /// <summary>
        /// Send Date Array EndPoint.
        /// </summary>
        /// <param name="dates">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendDateArrayAsync(
                List<DateTime> dates,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/date")
                  .Parameters(_parameters => _parameters
                      .Query(_query => _query.Setup("array", "true"))
                      .Form(_form => _form.Setup("dates", dates.Select(x => x.ToString("yyyy'-'MM'-'dd")).ToList()))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send Rfc3339 DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeArray(
                List<DateTime> datetimes)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeArrayAsync(datetimes));

        /// <summary>
        /// Send Rfc3339 DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeArrayAsync(
                List<DateTime> datetimes,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc3339datetime")
                  .Parameters(_parameters => _parameters
                      .Query(_query => _query.Setup("array", "true"))
                      .Form(_form => _form.Setup("datetimes", datetimes.Select(x => x.ToString("yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK")).ToList()))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send Rfc1123 DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeArray(
                List<DateTime> datetimes)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeArrayAsync(datetimes));

        /// <summary>
        /// Send Rfc1123 DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeArrayAsync(
                List<DateTime> datetimes,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc1123datetime")
                  .Parameters(_parameters => _parameters
                      .Query(_query => _query.Setup("array", "true"))
                      .Form(_form => _form.Setup("datetimes", datetimes.Select(x => x.ToString("r")).ToList()))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send Unix DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeArray(
                List<DateTime> datetimes)
            => CoreHelper.RunTask(CreateSendUnixDateTimeArrayAsync(datetimes));

        /// <summary>
        /// Send Unix DateTime Array EndPoint.
        /// </summary>
        /// <param name="datetimes">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeArrayAsync(
                List<DateTime> datetimes,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/unixdatetime")
                  .Parameters(_parameters => _parameters
                      .Query(_query => _query.Setup("array", "true"))
                      .Form(_form => _form.Setup("datetimes", datetimes.Select(x => x.ToUniversalTime().Subtract(new DateTime(1970, 1, 1)).TotalSeconds).ToList()))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send Rfc1123 DateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTime(
                DateTime datetime)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeAsync(datetime));

        /// <summary>
        /// Send Rfc1123 DateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeAsync(
                DateTime datetime,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc1123datetime")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("datetime", datetime.ToString("r")))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send Rfc3339 DateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTime(
                DateTime datetime)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeAsync(datetime));

        /// <summary>
        /// Send Rfc3339 DateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeAsync(
                DateTime datetime,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc3339datetime")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("datetime", datetime.ToString("yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK")))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// Send UnixDateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTime(
                DateTime datetime)
            => CoreHelper.RunTask(CreateSendUnixDateTimeAsync(datetime));

        /// <summary>
        /// Send UnixDateTime EndPoint.
        /// </summary>
        /// <param name="datetime">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeAsync(
                DateTime datetime,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/unixdatetime")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("datetime", datetime.ToUniversalTime().Subtract(new DateTime(1970, 1, 1)).TotalSeconds))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 DateTime in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeInFormAsModel(
                Models.Rfc1123DateTime body)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeInFormAsModelAsync(body));

        /// <summary>
        /// send rfc1123 DateTime in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeInFormAsModelAsync(
                Models.Rfc1123DateTime body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc1123DateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 DateTime in Form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeInFormAsModel(
                Models.DateTimeModel body)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeInFormAsModelAsync(body));

        /// <summary>
        /// send rfc3339 DateTime in Form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeInFormAsModelAsync(
                Models.DateTimeModel body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/dateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeInFormAsModel(
                Models.UnixDateTime body)
            => CoreHelper.RunTask(CreateSendUnixDateTimeInFormAsModelAsync(body));

        /// <summary>
        /// send unix dateTime in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeInFormAsModelAsync(
                Models.UnixDateTime body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/unixDateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeArrayInFormAsModel(
                Models.Rfc3339DateTimeArray body)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeArrayInFormAsModelAsync(body));

        /// <summary>
        /// send rfc3339 dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeArrayInFormAsModelAsync(
                Models.Rfc3339DateTimeArray body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc3339DateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeArrayInFormAsModel(
                Models.Rfc1123DateTimeArray body)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeArrayInFormAsModelAsync(body));

        /// <summary>
        /// send rfc1123 dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeArrayInFormAsModelAsync(
                Models.Rfc1123DateTimeArray body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc1123DateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeArrayInFormAsModel(
                Models.UnixDateTimeArray body)
            => CoreHelper.RunTask(CreateSendUnixDateTimeArrayInFormAsModelAsync(body));

        /// <summary>
        /// send unix dateTime array in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeArrayInFormAsModelAsync(
                Models.UnixDateTimeArray body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/unixDateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeMapInFormAsModel(
                Models.UnixDateTimeMap body)
            => CoreHelper.RunTask(CreateSendUnixDateTimeMapInFormAsModelAsync(body));

        /// <summary>
        /// send unix dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeMapInFormAsModelAsync(
                Models.UnixDateTimeMap body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/unixDateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeMapInFormAsModel(
                Models.Rfc3339DateTimeMap body)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeMapInFormAsModelAsync(body));

        /// <summary>
        /// send rfc3339 dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeMapInFormAsModelAsync(
                Models.Rfc3339DateTimeMap body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc3339DateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeMapInFormAsModel(
                Models.Rfc1123DateTimeMap body)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeMapInFormAsModelAsync(body));

        /// <summary>
        /// send rfc1123 dateTime map in form as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeMapInFormAsModelAsync(
                Models.Rfc1123DateTimeMap body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/form/rfc1123DateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Form(_form => _form.Setup("body", body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);
    }
}