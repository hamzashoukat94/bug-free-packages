<?php

declare(strict_types=1);

/*
 * TestForDatetimeInModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace TestForDatetimeInModelLib\Controllers;

use Core\Request\Parameters\FormParam;
use Core\Request\Parameters\QueryParam;
use CoreInterfaces\Core\Request\RequestMethod;
use TestForDatetimeInModelLib\Exceptions\ApiException;
use TestForDatetimeInModelLib\Models\DateTimeModel;
use TestForDatetimeInModelLib\Models\Rfc1123DateTime;
use TestForDatetimeInModelLib\Models\Rfc1123DateTimeArray;
use TestForDatetimeInModelLib\Models\Rfc1123DateTimeMap;
use TestForDatetimeInModelLib\Models\Rfc3339DateTimeArray;
use TestForDatetimeInModelLib\Models\Rfc3339DateTimeMap;
use TestForDatetimeInModelLib\Models\ServerResponse;
use TestForDatetimeInModelLib\Models\UnixDateTime;
use TestForDatetimeInModelLib\Models\UnixDateTimeArray;
use TestForDatetimeInModelLib\Models\UnixDateTimeMap;
use TestForDatetimeInModelLib\Utils\DateTimeHelper;

class FormParamsController extends BaseController
{
    /**
     * @param \DateTime[] $dates
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendDateArray(array $dates): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/date')
            ->parameters(
                QueryParam::init('array', true),
                FormParam::init('dates', $dates)->serializeBy([DateTimeHelper::class, 'toSimpleDateArray'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime[] $datetimes
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc3339DateTimeArray(array $datetimes): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc3339datetime')
            ->parameters(
                QueryParam::init('array', true),
                FormParam::init('datetimes', $datetimes)
                    ->serializeBy([DateTimeHelper::class, 'toRfc3339DateTimeArray'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime[] $datetimes
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc1123DateTimeArray(array $datetimes): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc1123datetime')
            ->parameters(
                QueryParam::init('array', true),
                FormParam::init('datetimes', $datetimes)
                    ->serializeBy([DateTimeHelper::class, 'toRfc1123DateTimeArray'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime[] $datetimes
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendUnixDateTimeArray(array $datetimes): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/unixdatetime')
            ->parameters(
                QueryParam::init('array', true),
                FormParam::init('datetimes', $datetimes)->serializeBy([DateTimeHelper::class, 'toUnixTimestampArray'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime $datetime
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc1123DateTime(\DateTime $datetime): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc1123datetime')
            ->parameters(
                FormParam::init('datetime', $datetime)->serializeBy([DateTimeHelper::class, 'toRfc1123DateTime'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime $datetime
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc3339DateTime(\DateTime $datetime): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc3339datetime')
            ->parameters(
                FormParam::init('datetime', $datetime)->serializeBy([DateTimeHelper::class, 'toRfc3339DateTime'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param \DateTime $datetime
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendUnixDateTime(\DateTime $datetime): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/unixdatetime')
            ->parameters(
                FormParam::init('datetime', $datetime)->serializeBy([DateTimeHelper::class, 'toUnixTimestamp'])
            );

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param Rfc1123DateTime $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc1123DateTimeInFormAsModel(Rfc1123DateTime $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc1123DateTimeInModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param DateTimeModel $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc3339DateTimeInFormAsModel(DateTimeModel $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/dateTimeInModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param UnixDateTime $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendUnixDateTimeInFormAsModel(UnixDateTime $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/unixDateTimeInModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param Rfc3339DateTimeArray $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc3339DateTimeArrayInFormAsModel(Rfc3339DateTimeArray $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc3339DateTimeArrayAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param Rfc1123DateTimeArray $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc1123DateTimeArrayInFormAsModel(Rfc1123DateTimeArray $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc1123DateTimeArrayAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param UnixDateTimeArray $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendUnixDateTimeArrayInFormAsModel(UnixDateTimeArray $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/unixDateTimeArrayAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param UnixDateTimeMap $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendUnixDateTimeMapInFormAsModel(UnixDateTimeMap $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/unixDateTimeMapAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param Rfc3339DateTimeMap $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc3339DateTimeMapInFormAsModel(Rfc3339DateTimeMap $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc3339DateTimeMapAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }

    /**
     * @param Rfc1123DateTimeMap $body
     *
     * @return ServerResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function createSendRfc1123DateTimeMapInFormAsModel(Rfc1123DateTimeMap $body): ServerResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::POST, '/form/rfc1123DateTimeMapAsModel')
            ->parameters(FormParam::init('body', $body));

        $_resHandler = $this->responseHandler()->type(ServerResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }
}
