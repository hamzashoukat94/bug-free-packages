# -*- coding: utf-8 -*-

"""
testfordatetimeinmodel

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from testfordatetimeinmodel.api_helper import APIHelper


class Rfc1123DateTime(object):

    """Implementation of the 'rfc1123 dateTime' model.

    TODO: type model description here.

    Attributes:
        date_time (datetime): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "date_time": 'dateTime'
    }

    def __init__(self,
                 date_time=None):
        """Constructor for the Rfc1123DateTime class"""

        # Initialize members of the class
        self.date_time = APIHelper.HttpDateTime(date_time) if date_time else None 

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

        date_time = APIHelper.HttpDateTime.from_value(dictionary.get("dateTime")).datetime if dictionary.get("dateTime") else None
        # Return an object of this model
        return cls(date_time)
