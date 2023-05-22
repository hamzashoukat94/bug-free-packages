<?php

declare(strict_types=1);

/*
 * TestForDatetimeInModelLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace TestForDatetimeInModelLib\Models;

use stdClass;
use TestForDatetimeInModelLib\Utils\DateTimeHelper;

class Rfc3339DateTimeArray implements \JsonSerializable
{
    /**
     * @var \DateTime[]
     */
    private $dateTime;

    /**
     * @param \DateTime[] $dateTime
     */
    public function __construct(array $dateTime)
    {
        $this->dateTime = $dateTime;
    }

    /**
     * Returns Date Time.
     *
     * @return \DateTime[]
     */
    public function getDateTime(): array
    {
        return $this->dateTime;
    }

    /**
     * Sets Date Time.
     *
     * @required
     * @maps dateTime
     * @factory \TestForDatetimeInModelLib\Utils\DateTimeHelper::fromRfc3339DateTimeArray
     *
     * @param \DateTime[] $dateTime
     */
    public function setDateTime(array $dateTime): void
    {
        $this->dateTime = $dateTime;
    }

    /**
     * Encode this object to JSON
     *
     * @param bool $asArrayWhenEmpty Whether to serialize this model as an array whenever no fields
     *        are set. (default: false)
     *
     * @return array|stdClass
     */
    #[\ReturnTypeWillChange] // @phan-suppress-current-line PhanUndeclaredClassAttribute for (php < 8.1)
    public function jsonSerialize(bool $asArrayWhenEmpty = false)
    {
        $json = [];
        $json['dateTime'] = DateTimeHelper::toRfc3339DateTimeArray($this->dateTime);

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
