# -*- coding: utf-8 -*-

"""
testfordatetimeinmodel

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from testfordatetimeinmodel.api_helper import APIHelper
from testfordatetimeinmodel.configuration import Server
from testfordatetimeinmodel.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from testfordatetimeinmodel.http.http_method_enum import HttpMethodEnum
from testfordatetimeinmodel.models.server_response import ServerResponse


class BodyParamsController(BaseController):

    """A Controller to access Endpoints in the testfordatetimeinmodel API."""
    def __init__(self, config):
        super(BodyParamsController, self).__init__(config)

    def create_send_rfc_3339_date_time(self,
                                       datetime):
        """Does a POST request to /body/rfc3339datetime.

        TODO: type endpoint description here.

        Args:
            datetime (datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc3339datetime')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(APIHelper.when_defined(APIHelper.RFC3339DateTime, datetime)))
            .header_param(Parameter()
                          .key('content-type')
                          .value('text/plain; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(str)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_1123_date_time(self,
                                       datetime):
        """Does a POST request to /body/rfc1123datetime.

        TODO: type endpoint description here.

        Args:
            datetime (datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc1123datetime')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(APIHelper.when_defined(APIHelper.HttpDateTime, datetime)))
            .header_param(Parameter()
                          .key('content-type')
                          .value('text/plain; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(str)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_unix_date_time(self,
                                   datetime):
        """Does a POST request to /body/unixdatetime.

        TODO: type endpoint description here.

        Args:
            datetime (datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/unixdatetime')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(APIHelper.when_defined(APIHelper.UnixDateTime, datetime)))
            .header_param(Parameter()
                          .key('content-type')
                          .value('text/plain; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(str)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_3339_date_time_array(self,
                                             datetimes):
        """Does a POST request to /body/rfc3339datetime.

        TODO: type endpoint description here.

        Args:
            datetimes (list of datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc3339datetime')
            .http_method(HttpMethodEnum.POST)
            .query_param(Parameter()
                         .key('array')
                         .value(True))
            .body_param(Parameter()
                        .value([APIHelper.when_defined(APIHelper.RFC3339DateTime, element) for element in datetimes]))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_1123_date_time_array(self,
                                             datetimes):
        """Does a POST request to /body/rfc1123datetime.

        TODO: type endpoint description here.

        Args:
            datetimes (list of datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc1123datetime')
            .http_method(HttpMethodEnum.POST)
            .query_param(Parameter()
                         .key('array')
                         .value(True))
            .body_param(Parameter()
                        .value([APIHelper.when_defined(APIHelper.HttpDateTime, element) for element in datetimes]))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_unix_date_time_array(self,
                                         datetimes):
        """Does a POST request to /body/unixdatetime.

        TODO: type endpoint description here.

        Args:
            datetimes (list of datetime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/unixdatetime')
            .http_method(HttpMethodEnum.POST)
            .query_param(Parameter()
                         .key('array')
                         .value(True))
            .body_param(Parameter()
                        .value([APIHelper.when_defined(APIHelper.UnixDateTime, element) for element in datetimes]))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_1123_date_time_in_body_as_model(self,
                                                        body):
        """Does a POST request to /body/rfc1123DateTimeInModel.

        TODO: type endpoint description here.

        Args:
            body (Rfc1123DateTime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc1123DateTimeInModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(body))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_3339_date_time_in_body_as_model(self,
                                                        data):
        """Does a POST request to /body/dateTimeInModel.

        TODO: type endpoint description here.

        Args:
            data (DateTimeModel): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/dateTimeInModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_unix_date_time_in_body_as_model(self,
                                                    body):
        """Does a POST request to /body/unixDateTimeInModel.

        TODO: type endpoint description here.

        Args:
            body (UnixDateTime): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/unixDateTimeInModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(body))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_3339_date_time_array_in_body_as_model(self,
                                                              data):
        """Does a POST request to /body/rfc3339DateTimeArrayAsModel.

        TODO: type endpoint description here.

        Args:
            data (Rfc3339DateTimeArray): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc3339DateTimeArrayAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_unix_date_time_array_in_body_as_model(self,
                                                          data):
        """Does a POST request to /body/unixDateTimeArrayAsModel.

        TODO: type endpoint description here.

        Args:
            data (UnixDateTimeArray): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/unixDateTimeArrayAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_3339_date_time_map_in_body_as_model(self,
                                                            data):
        """Does a POST request to /body/rfc3339DateTimeMapAsModel.

        TODO: type endpoint description here.

        Args:
            data (Rfc3339DateTimeMap): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc3339DateTimeMapAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_1123_date_time_map_in_body_as_model(self,
                                                            data):
        """Does a POST request to /body/rfc1123DateTimeMapAsModel.

        TODO: type endpoint description here.

        Args:
            data (Rfc1123DateTimeMap): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc1123DateTimeMapAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_unix_date_time_map_in_body_as_model(self,
                                                        data):
        """Does a POST request to /body/unixDateTimeMapAsModel.

        TODO: type endpoint description here.

        Args:
            data (UnixDateTimeMap): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/unixDateTimeMapAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()

    def create_send_rfc_1123_date_time_array_in_body_as_model(self,
                                                              data):
        """Does a POST request to /body/rfc1123DateTimeArrayAsModel.

        TODO: type endpoint description here.

        Args:
            data (Rfc1123DateTimeArray): TODO: type description here.

        Returns:
            ServerResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/body/rfc1123DateTimeArrayAsModel')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(data))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ServerResponse.from_dictionary)
        ).execute()
