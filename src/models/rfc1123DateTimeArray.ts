/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, Schema, string } from '../schema';

export interface Rfc1123DateTimeArray {
  dateTime: string[];
}

export const rfc1123DateTimeArraySchema: Schema<Rfc1123DateTimeArray> = object({
  dateTime: ['dateTime', array(string())],
});
