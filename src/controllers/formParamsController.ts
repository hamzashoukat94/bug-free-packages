/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { DateTimeModel, dateTimeModelSchema } from '../models/dateTimeModel';
import {
  Rfc1123DateTime,
  rfc1123DateTimeSchema,
} from '../models/rfc1123DateTime';
import {
  Rfc1123DateTimeArray,
  rfc1123DateTimeArraySchema,
} from '../models/rfc1123DateTimeArray';
import {
  Rfc1123DateTimeMap,
  rfc1123DateTimeMapSchema,
} from '../models/rfc1123DateTimeMap';
import {
  Rfc3339DateTimeArray,
  rfc3339DateTimeArraySchema,
} from '../models/rfc3339DateTimeArray';
import {
  Rfc3339DateTimeMap,
  rfc3339DateTimeMapSchema,
} from '../models/rfc3339DateTimeMap';
import { ServerResponse, serverResponseSchema } from '../models/serverResponse';
import { UnixDateTime, unixDateTimeSchema } from '../models/unixDateTime';
import {
  UnixDateTimeArray,
  unixDateTimeArraySchema,
} from '../models/unixDateTimeArray';
import {
  UnixDateTimeMap,
  unixDateTimeMapSchema,
} from '../models/unixDateTimeMap';
import { array, number, string } from '../schema';
import { BaseController } from './baseController';

export class FormParamsController extends BaseController {
  /**
   * @param dates
   * @return Response from the API call
   */
  async createSendDateArray(
    dates: string[],
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/date');
    const mapped = req.prepareArgs({ dates: [dates, array(string())] });
    req.query('array', 'true');
    req.form({
      dates: mapped.dates,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetimes
   * @return Response from the API call
   */
  async createSendRfc3339DateTimeArray(
    datetimes: string[],
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc3339datetime');
    const mapped = req.prepareArgs({ datetimes: [datetimes, array(string())] });
    req.query('array', 'true');
    req.form({
      datetimes: mapped.datetimes,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetimes
   * @return Response from the API call
   */
  async createSendRfc1123DateTimeArray(
    datetimes: string[],
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc1123datetime');
    const mapped = req.prepareArgs({ datetimes: [datetimes, array(string())] });
    req.query('array', 'true');
    req.form({
      datetimes: mapped.datetimes,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetimes
   * @return Response from the API call
   */
  async createSendUnixDateTimeArray(
    datetimes: number[],
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/unixdatetime');
    const mapped = req.prepareArgs({ datetimes: [datetimes, array(number())] });
    req.query('array', 'true');
    req.form({
      datetimes: mapped.datetimes,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetime
   * @return Response from the API call
   */
  async createSendRfc1123DateTime(
    datetime: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc1123datetime');
    const mapped = req.prepareArgs({ datetime: [datetime, string()] });
    req.form({
      datetime: mapped.datetime,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetime
   * @return Response from the API call
   */
  async createSendRfc3339DateTime(
    datetime: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc3339datetime');
    const mapped = req.prepareArgs({ datetime: [datetime, string()] });
    req.form({
      datetime: mapped.datetime,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param datetime
   * @return Response from the API call
   */
  async createSendUnixDateTime(
    datetime: number,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/unixdatetime');
    const mapped = req.prepareArgs({ datetime: [datetime, number()] });
    req.form({
      datetime: mapped.datetime,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc1123DateTimeInFormAsModel(
    body: Rfc1123DateTime,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc1123DateTimeInModel');
    const mapped = req.prepareArgs({ body: [body, rfc1123DateTimeSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc3339DateTimeInFormAsModel(
    body: DateTimeModel,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/dateTimeInModel');
    const mapped = req.prepareArgs({ body: [body, dateTimeModelSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendUnixDateTimeInFormAsModel(
    body: UnixDateTime,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/unixDateTimeInModel');
    const mapped = req.prepareArgs({ body: [body, unixDateTimeSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc3339DateTimeArrayInFormAsModel(
    body: Rfc3339DateTimeArray,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc3339DateTimeArrayAsModel');
    const mapped = req.prepareArgs({
      body: [body, rfc3339DateTimeArraySchema],
    });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc1123DateTimeArrayInFormAsModel(
    body: Rfc1123DateTimeArray,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc1123DateTimeArrayAsModel');
    const mapped = req.prepareArgs({
      body: [body, rfc1123DateTimeArraySchema],
    });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendUnixDateTimeArrayInFormAsModel(
    body: UnixDateTimeArray,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/unixDateTimeArrayAsModel');
    const mapped = req.prepareArgs({ body: [body, unixDateTimeArraySchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendUnixDateTimeMapInFormAsModel(
    body: UnixDateTimeMap,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/unixDateTimeMapAsModel');
    const mapped = req.prepareArgs({ body: [body, unixDateTimeMapSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc3339DateTimeMapInFormAsModel(
    body: Rfc3339DateTimeMap,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc3339DateTimeMapAsModel');
    const mapped = req.prepareArgs({ body: [body, rfc3339DateTimeMapSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }

  /**
   * @param body
   * @return Response from the API call
   */
  async createSendRfc1123DateTimeMapInFormAsModel(
    body: Rfc1123DateTimeMap,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<ServerResponse>> {
    const req = this.createRequest('POST', '/form/rfc1123DateTimeMapAsModel');
    const mapped = req.prepareArgs({ body: [body, rfc1123DateTimeMapSchema] });
    req.form({
      body: mapped.body,
    });
    return req.callAsJson(serverResponseSchema, requestOptions);
  }
}