/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, Schema, string } from '../schema';

export interface Rfc1123DateTime {
  dateTime: string;
}

export const rfc1123DateTimeSchema: Schema<Rfc1123DateTime> = object({
  dateTime: ['dateTime', string()],
});