// <copyright file="BodyParamsController.cs" company="APIMatic">
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
    /// BodyParamsController.
    /// </summary>
    public class BodyParamsController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BodyParamsController"/> class.
        /// </summary>
        internal BodyParamsController(GlobalConfiguration globalConfiguration) : base(globalConfiguration) { }

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
                  .Setup(HttpMethod.Post, "/body/rfc3339datetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetime.ToString("yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK")))))
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
                  .Setup(HttpMethod.Post, "/body/rfc1123datetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetime.ToString("r")))))
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
                  .Setup(HttpMethod.Post, "/body/unixdatetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetime.ToUniversalTime().Subtract(new DateTime(1970, 1, 1)).TotalSeconds.ToString()))))
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
                  .Setup(HttpMethod.Post, "/body/rfc3339datetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetimes).Serializer(_value => CoreHelper.JsonSerialize(_value, new IsoDateTimeConverter())))
                      .Query(_query => _query.Setup("array", "true"))))
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
                  .Setup(HttpMethod.Post, "/body/rfc1123datetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetimes).Serializer(_value => CoreHelper.JsonSerialize(_value, new CustomDateTimeConverter("r"))))
                      .Query(_query => _query.Setup("array", "true"))))
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
                  .Setup(HttpMethod.Post, "/body/unixdatetime")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(datetimes).Serializer(_value => CoreHelper.JsonSerialize(_value, new TestForDatetimeInModel.Standard.Utilities.UnixDateTimeConverter())))
                      .Query(_query => _query.Setup("array", "true"))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 DateTime in body as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeInBodyAsModel(
                Models.Rfc1123DateTime body)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeInBodyAsModelAsync(body));

        /// <summary>
        /// send rfc1123 DateTime in body as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeInBodyAsModelAsync(
                Models.Rfc1123DateTime body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/rfc1123DateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 DateTime in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeInBodyAsModel(
                Models.DateTimeModel data)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeInBodyAsModelAsync(data));

        /// <summary>
        /// send rfc3339 DateTime in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeInBodyAsModelAsync(
                Models.DateTimeModel data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/dateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime in body as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeInBodyAsModel(
                Models.UnixDateTime body)
            => CoreHelper.RunTask(CreateSendUnixDateTimeInBodyAsModelAsync(body));

        /// <summary>
        /// send unix dateTime in body as model EndPoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeInBodyAsModelAsync(
                Models.UnixDateTime body,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/unixDateTimeInModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(body))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeArrayInBodyAsModel(
                Models.Rfc3339DateTimeArray data)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeArrayInBodyAsModelAsync(data));

        /// <summary>
        /// send rfc3339 dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeArrayInBodyAsModelAsync(
                Models.Rfc3339DateTimeArray data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/rfc3339DateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeArrayInBodyAsModel(
                Models.UnixDateTimeArray data)
            => CoreHelper.RunTask(CreateSendUnixDateTimeArrayInBodyAsModelAsync(data));

        /// <summary>
        /// send unix dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeArrayInBodyAsModelAsync(
                Models.UnixDateTimeArray data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/unixDateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc3339 dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc3339DateTimeMapInBodyAsModel(
                Models.Rfc3339DateTimeMap data)
            => CoreHelper.RunTask(CreateSendRfc3339DateTimeMapInBodyAsModelAsync(data));

        /// <summary>
        /// send rfc3339 dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc3339DateTimeMapInBodyAsModelAsync(
                Models.Rfc3339DateTimeMap data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/rfc3339DateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeMapInBodyAsModel(
                Models.Rfc1123DateTimeMap data)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeMapInBodyAsModelAsync(data));

        /// <summary>
        /// send rfc1123 dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeMapInBodyAsModelAsync(
                Models.Rfc1123DateTimeMap data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/rfc1123DateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send unix dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendUnixDateTimeMapInBodyAsModel(
                Models.UnixDateTimeMap data)
            => CoreHelper.RunTask(CreateSendUnixDateTimeMapInBodyAsModelAsync(data));

        /// <summary>
        /// send unix dateTime map in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendUnixDateTimeMapInBodyAsModelAsync(
                Models.UnixDateTimeMap data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/unixDateTimeMapAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);

        /// <summary>
        /// send rfc1123 dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public Models.ServerResponse CreateSendRfc1123DateTimeArrayInBodyAsModel(
                Models.Rfc1123DateTimeArray data)
            => CoreHelper.RunTask(CreateSendRfc1123DateTimeArrayInBodyAsModelAsync(data));

        /// <summary>
        /// send rfc1123 dateTime array in body as model EndPoint.
        /// </summary>
        /// <param name="data">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.ServerResponse response from the API call.</returns>
        public async Task<Models.ServerResponse> CreateSendRfc1123DateTimeArrayInBodyAsModelAsync(
                Models.Rfc1123DateTimeArray data,
                CancellationToken cancellationToken = default)
            => await CreateApiCall<Models.ServerResponse>()
              .RequestBuilder(_requestBuilder => _requestBuilder
                  .Setup(HttpMethod.Post, "/body/rfc1123DateTimeArrayAsModel")
                  .Parameters(_parameters => _parameters
                      .Body(_bodyParameter => _bodyParameter.Setup(data))))
              .ResponseHandler(_responseHandler => _responseHandler
                  .Deserializer(_response => ApiHelper.JsonDeserialize<Models.ServerResponse>(_response)))
              .ExecuteAsync(cancellationToken);
    }
}