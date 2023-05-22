// <copyright file="BodyParamsControllerTest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Threading.Tasks;
    using APIMatic.Core.Utilities;
    using Newtonsoft.Json.Converters;
    using NUnit.Framework;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Controllers;
    using TestForDatetimeInModel.Standard.Exceptions;
    using TestForDatetimeInModel.Standard.Http.Client;
    using TestForDatetimeInModel.Standard.Http.Response;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// BodyParamsControllerTest.
    /// </summary>
    [TestFixture]
    public class BodyParamsControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private BodyParamsController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.BodyParamsController;
        }

        /// <summary>
        /// TestSendRfc3339DateTime.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendRfc3339DateTime()
        {
            // Parameters for the API call
            DateTime datetime = DateTime.ParseExact("1994-02-13T14:01:54.9571247Z", "yyyy'-'MM'-'dd'T'HH':'mm':'ss.FFFFFFFK", CultureInfo.InvariantCulture, DateTimeStyles.RoundtripKind);

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc3339DateTimeAsync(datetime);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendRfc1123DateTime.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendRfc1123DateTime()
        {
            // Parameters for the API call
            DateTime datetime = DateTime.ParseExact("Sun, 06 Nov 1994 08:49:37 GMT", "r", CultureInfo.InvariantCulture, DateTimeStyles.RoundtripKind);

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc1123DateTimeAsync(datetime);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendUnixDateTime.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendUnixDateTime()
        {
            // Parameters for the API call
            DateTime datetime = new DateTime(1970, 1, 1, 0, 0, 0, DateTimeKind.Utc).AddSeconds(double.Parse("1484719381"));

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendUnixDateTimeAsync(datetime);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendRfc3339DateTimeArray.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendRfc3339DateTimeArray()
        {
            // Parameters for the API call
            List<DateTime> datetimes = ApiHelper.JsonDeserialize<List<DateTime>>("[\"1994-02-13T14:01:54.9571247Z\",\"1994-02-13T14:01:54.9571247Z\"]", new IsoDateTimeConverter());

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc3339DateTimeArrayAsync(datetimes);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendRfc1123DateTimeArray.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendRfc1123DateTimeArray()
        {
            // Parameters for the API call
            List<DateTime> datetimes = ApiHelper.JsonDeserialize<List<DateTime>>("[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]", new CustomDateTimeConverter("r"));

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc1123DateTimeArrayAsync(datetimes);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendUnixDateTimeArray.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendUnixDateTimeArray()
        {
            // Parameters for the API call
            List<DateTime> datetimes = ApiHelper.JsonDeserialize<List<DateTime>>("[1484719381,1484719381]", new TestForDatetimeInModel.Standard.Utilities.UnixDateTimeConverter());

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendUnixDateTimeArrayAsync(datetimes);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestRfc1123DateTimeInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc1123DateTimeInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.Rfc1123DateTime body = ApiHelper.JsonDeserialize<Standard.Models.Rfc1123DateTime>("{\"dateTime\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc1123DateTimeInBodyAsModelAsync(body);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestRfc3339DateTimeInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc3339DateTimeInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.DateTimeModel data = ApiHelper.JsonDeserialize<Standard.Models.DateTimeModel>("{\"dateTime\":\"1994-02-13T14:01:54.9571247Z\"}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc3339DateTimeInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");
            Assert.IsTrue(
                    TestHelper.IsJsonObjectProperSubsetOf(
                    "{\"passed\":true}",
                    TestHelper.ConvertStreamToString(HttpCallBack.Response.RawBody),
                    true,
                    true,
                    false),
                    "Response body should have matching keys");
        }

        /// <summary>
        /// TestSendUnixDateTimeInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestSendUnixDateTimeInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.UnixDateTime body = ApiHelper.JsonDeserialize<Standard.Models.UnixDateTime>("{\"dateTime\":1484719381}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendUnixDateTimeInBodyAsModelAsync(body);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestRfc3339DateTimeArrayInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc3339DateTimeArrayInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.Rfc3339DateTimeArray data = ApiHelper.JsonDeserialize<Standard.Models.Rfc3339DateTimeArray>("{\"dateTime\":[\"1994-02-13T14:01:54.9571247Z\",\"1994-02-13T14:01:54.9571247Z\"]}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc3339DateTimeArrayInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestUnixDateTimeArrayInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestUnixDateTimeArrayInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.UnixDateTimeArray data = ApiHelper.JsonDeserialize<Standard.Models.UnixDateTimeArray>("{\"dateTime\":[1484719381,1484719381]}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendUnixDateTimeArrayInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestRfc3339DateTimeMapInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc3339DateTimeMapInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.Rfc3339DateTimeMap data = ApiHelper.JsonDeserialize<Standard.Models.Rfc3339DateTimeMap>("{\"dateTime\":{\"key\":\"1994-02-13T14:01:54.9571247Z\"}}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc3339DateTimeMapInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestRfc1123DateTimeMapInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc1123DateTimeMapInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.Rfc1123DateTimeMap data = ApiHelper.JsonDeserialize<Standard.Models.Rfc1123DateTimeMap>("{\"dateTime\":{\"key\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc1123DateTimeMapInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestUnixDateTimeMapInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestUnixDateTimeMapInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.UnixDateTimeMap data = ApiHelper.JsonDeserialize<Standard.Models.UnixDateTimeMap>("{\"dateTime\":{\"key\":1484719381}}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendUnixDateTimeMapInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }

        /// <summary>
        /// TestRfc1123DateTimeArrayInBodyAsModel.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestRfc1123DateTimeArrayInBodyAsModel()
        {
            // Parameters for the API call
            Standard.Models.Rfc1123DateTimeArray data = ApiHelper.JsonDeserialize<Standard.Models.Rfc1123DateTimeArray>("{\"dateTime\":[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]}");

            // Perform API call
            Standard.Models.ServerResponse result = null;
            try
            {
                result = await this.controller.CreateSendRfc1123DateTimeArrayInBodyAsModelAsync(data);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, HttpCallBack.Response.StatusCode, "Status should be 200");
        }
    }
}