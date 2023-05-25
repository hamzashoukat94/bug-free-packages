/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import localhost3000.controllers.BodyParamsController;
import localhost3000.controllers.EchoController;
import localhost3000.controllers.ErrorCodesController;
import localhost3000.controllers.FormParamsController;
import localhost3000.controllers.HeaderController;
import localhost3000.controllers.QueryParamController;
import localhost3000.controllers.QueryParamsController;
import localhost3000.controllers.ResponseTypesController;
import localhost3000.controllers.TemplateParamsController;

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface TesterClientInterface extends Configuration {
    
    /**
     * Provides access to ResponseTypes controller.
     * @return Returns the ResponseTypesController instance
     */
    ResponseTypesController getResponseTypesController();

    /**
     * Provides access to FormParams controller.
     * @return Returns the FormParamsController instance
     */
    FormParamsController getFormParamsController();

    /**
     * Provides access to BodyParams controller.
     * @return Returns the BodyParamsController instance
     */
    BodyParamsController getBodyParamsController();

    /**
     * Provides access to ErrorCodes controller.
     * @return Returns the ErrorCodesController instance
     */
    ErrorCodesController getErrorCodesController();

    /**
     * Provides access to QueryParam controller.
     * @return Returns the QueryParamController instance
     */
    QueryParamController getQueryParamController();

    /**
     * Provides access to Echo controller.
     * @return Returns the EchoController instance
     */
    EchoController getEchoController();

    /**
     * Provides access to Header controller.
     * @return Returns the HeaderController instance
     */
    HeaderController getHeaderController();

    /**
     * Provides access to TemplateParams controller.
     * @return Returns the TemplateParamsController instance
     */
    TemplateParamsController getTemplateParamsController();

    /**
     * Provides access to QueryParams controller.
     * @return Returns the QueryParamsController instance
     */
    QueryParamsController getQueryParamsController();

}