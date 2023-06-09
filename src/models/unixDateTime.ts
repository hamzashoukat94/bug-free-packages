/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { number, object, Schema } from '../schema';

export interface UnixDateTime {
  dateTime: number;
}

export const unixDateTimeSchema: Schema<UnixDateTime> = object({
  dateTime: ['dateTime', number()],
});
