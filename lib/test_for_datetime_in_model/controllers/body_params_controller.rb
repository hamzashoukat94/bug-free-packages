# test_for_datetime_in_model
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module TestForDatetimeInModel
  # BodyParamsController
  class BodyParamsController < BaseController
    # TODO: type endpoint description here
    # @param [DateTime] datetime Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc3339_date_time(datetime)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc3339datetime',
                                     Server::DEFAULT)
                   .body_param(new_parameter(datetime))
                   .header_param(new_parameter('text/plain; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.rfc3339 unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [DateTime] datetime Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc1123_date_time(datetime)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc1123datetime',
                                     Server::DEFAULT)
                   .body_param(new_parameter(datetime))
                   .header_param(new_parameter('text/plain; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.httpdate unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [DateTime] datetime Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_unix_date_time(datetime)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/unixdatetime',
                                     Server::DEFAULT)
                   .body_param(new_parameter(datetime))
                   .header_param(new_parameter('text/plain; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.to_time.utc.to_i.to_s unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [List of DateTime] datetimes Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc3339_date_time_array(datetimes)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc3339datetime',
                                     Server::DEFAULT)
                   .query_param(new_parameter(true, key: 'array'))
                   .body_param(new_parameter(datetimes))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.map(&:rfc3339).to_json unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [List of DateTime] datetimes Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc1123_date_time_array(datetimes)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc1123datetime',
                                     Server::DEFAULT)
                   .query_param(new_parameter(true, key: 'array'))
                   .body_param(new_parameter(datetimes))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.map(&:httpdate).to_json unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [List of DateTime] datetimes Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_unix_date_time_array(datetimes)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/unixdatetime',
                                     Server::DEFAULT)
                   .query_param(new_parameter(true, key: 'array'))
                   .body_param(new_parameter(datetimes))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param|
                     param.map { |element| element.to_time.utc.to_i }.to_json unless param.nil?
                   end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [Rfc1123DateTime] body Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc1123_date_time_in_body_as_model(body)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc1123DateTimeInModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(body))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [DateTimeModel] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc3339_date_time_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/dateTimeInModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [UnixDateTime] body Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_unix_date_time_in_body_as_model(body)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/unixDateTimeInModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(body))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [Rfc3339DateTimeArray] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc3339_date_time_array_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc3339DateTimeArrayAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [UnixDateTimeArray] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_unix_date_time_array_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/unixDateTimeArrayAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [Rfc3339DateTimeMap] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc3339_date_time_map_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc3339DateTimeMapAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [Rfc1123DateTimeMap] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc1123_date_time_map_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc1123DateTimeMapAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [UnixDateTimeMap] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_unix_date_time_map_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/unixDateTimeMapAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end

    # TODO: type endpoint description here
    # @param [Rfc1123DateTimeArray] data Required parameter: Example:
    # @return [ServerResponse] response from the API call
    def create_send_rfc1123_date_time_array_in_body_as_model(data)
      new_api_call_builder
        .request(new_request_builder(HttpMethodEnum::POST,
                                     '/body/rfc1123DateTimeArrayAsModel',
                                     Server::DEFAULT)
                   .body_param(new_parameter(data))
                   .header_param(new_parameter('application/json; charset=utf-8', key: 'content-type'))
                   .header_param(new_parameter('application/json', key: 'accept'))
                   .body_serializer(proc do |param| param.to_json unless param.nil? end))
        .response(new_response_handler
                   .deserializer(APIHelper.method(:custom_type_deserializer))
                   .deserialize_into(ServerResponse.method(:from_hash)))
        .execute
    end
  end
end
