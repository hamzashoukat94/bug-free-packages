/**
 * Test for Datetime in ModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import {
  boolean,
  dict,
  object,
  optional,
  Schema,
  string,
  unknown,
} from '../schema';

export interface ServerResponse {
  passed: boolean;
  message?: string;
  input?: Record<string, unknown>;
}

export const serverResponseSchema: Schema<ServerResponse> = object({
  passed: ['passed', boolean()],
  message: ['Message', optional(string())],
  input: ['input', optional(dict(unknown()))],
});
