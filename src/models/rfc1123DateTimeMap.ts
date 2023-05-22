/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { dict, object, Schema, string } from '../schema';

export interface Rfc1123DateTimeMap {
  dateTime: Record<string, string>;
}

export const rfc1123DateTimeMapSchema: Schema<Rfc1123DateTimeMap> = object({
  dateTime: ['dateTime', dict(string())],
});
