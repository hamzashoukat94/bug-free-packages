# -*- coding: utf-8 -*-

"""
swaggerpetstore

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from swaggerpetstore.api_helper import APIHelper


class OAuthToken(object):

    """Implementation of the 'OAuthToken' model.

    OAuth 2 Authorization endpoint response

    Attributes:
        access_token (str): Access token
        token_type (str): Type of access token
        expires_in (long|int): Time in seconds before the access token
            expires
        scope (str): List of scopes granted This is a space-delimited list of
            strings.
        expiry (long|int): Time of token expiry as unix timestamp (UTC)
        refresh_token (str): Refresh token Used to get a new access token when
            it expires.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "access_token": 'access_token',
        "token_type": 'token_type',
        "expires_in": 'expires_in',
        "scope": 'scope',
        "expiry": 'expiry',
        "refresh_token": 'refresh_token'
    }

    _optionals = [
        'expires_in',
        'scope',
        'expiry',
        'refresh_token',
    ]

    def __init__(self,
                 access_token=None,
                 token_type=None,
                 expires_in=APIHelper.SKIP,
                 scope=APIHelper.SKIP,
                 expiry=APIHelper.SKIP,
                 refresh_token=APIHelper.SKIP):
        """Constructor for the OAuthToken class"""

        # Initialize members of the class
        self.access_token = access_token 
        self.token_type = token_type 
        if expires_in is not APIHelper.SKIP:
            self.expires_in = expires_in 
        if scope is not APIHelper.SKIP:
            self.scope = scope 
        if expiry is not APIHelper.SKIP:
            self.expiry = expiry 
        if refresh_token is not APIHelper.SKIP:
            self.refresh_token = refresh_token 

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        access_token = dictionary.get("access_token") if dictionary.get("access_token") else None
        token_type = dictionary.get("token_type") if dictionary.get("token_type") else None
        expires_in = dictionary.get("expires_in") if dictionary.get("expires_in") else APIHelper.SKIP
        scope = dictionary.get("scope") if dictionary.get("scope") else APIHelper.SKIP
        expiry = dictionary.get("expiry") if dictionary.get("expiry") else APIHelper.SKIP
        refresh_token = dictionary.get("refresh_token") if dictionary.get("refresh_token") else APIHelper.SKIP
        # Return an object of this model
        return cls(access_token,
                   token_type,
                   expires_in,
                   scope,
                   expiry,
                   refresh_token)
