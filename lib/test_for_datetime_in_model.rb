# test_for_datetime_in_model
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
require 'json'
require 'apimatic_core_interfaces'
require 'apimatic_core'
require 'apimatic_faraday_client_adapter'
# rubocop:disable Style/MixinUsage
include CoreLibrary
# rubocop:enable Style/MixinUsage

require_relative 'test_for_datetime_in_model/api_helper'
require_relative 'test_for_datetime_in_model/client'

# Utilities
require_relative 'test_for_datetime_in_model/utilities/file_wrapper'
require_relative 'test_for_datetime_in_model/utilities/date_time_helper'

# Http
require_relative 'test_for_datetime_in_model/http/http_call_back'
require_relative 'test_for_datetime_in_model/http/http_method_enum'
require_relative 'test_for_datetime_in_model/http/http_request'
require_relative 'test_for_datetime_in_model/http/http_response'

# Models
require_relative 'test_for_datetime_in_model/models/base_model'
require_relative 'test_for_datetime_in_model/models/server_response'
require_relative 'test_for_datetime_in_model/models/unix_date_time'
require_relative 'test_for_datetime_in_model/models/rfc1123_date_time'
require_relative 'test_for_datetime_in_model/models/date_time_model'
require_relative 'test_for_datetime_in_model/models/unix_date_time_map'
require_relative 'test_for_datetime_in_model/models/rfc3339_date_time_map'
require_relative 'test_for_datetime_in_model/models/rfc1123_date_time_map'
require_relative 'test_for_datetime_in_model/models/unix_date_time_array'
require_relative 'test_for_datetime_in_model/models/rfc1123_date_time_array'
require_relative 'test_for_datetime_in_model/models/rfc3339_date_time_array'
require_relative 'test_for_datetime_in_model/models/suite_code_enum'

# Exceptions
require_relative 'test_for_datetime_in_model/exceptions/api_exception'

require_relative 'test_for_datetime_in_model/configuration'

# Controllers
require_relative 'test_for_datetime_in_model/controllers/base_controller'
require_relative 'test_for_datetime_in_model/controllers/body_params_controller'
require_relative 'test_for_datetime_in_model/controllers/form_params_controller'
