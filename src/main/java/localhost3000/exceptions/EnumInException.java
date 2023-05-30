/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import localhost3000.models.ParamFormat;
import localhost3000.models.Type;

/**
 * This is a model class for EnumInException type.
 */
public class EnumInException extends ApiException {
    private static final long serialVersionUID = 3241059343471950650L;
    private ParamFormat param;
    private Type type;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EnumInException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Param.
     * @return Returns the ParamFormat
     */
    @JsonGetter("param")
    public ParamFormat getParam() {
        return this.param;
    }

    /**
     * Setter for Param.
     * @param param Value for ParamFormat
     */
    @JsonSetter("param")
    private void setParam(ParamFormat param) {
        this.param = param;
    }

    /**
     * Getter for Type.
     * @return Returns the Type
     */
    @JsonGetter("type")
    public Type getType() {
        return this.type;
    }

    /**
     * Setter for Type.
     * @param type Value for Type
     */
    @JsonSetter("type")
    private void setType(Type type) {
        this.type = type;
    }
}
