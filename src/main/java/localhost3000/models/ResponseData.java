/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ResponseData type.
 */
public class ResponseData
        extends BaseModel {
    private Feed feed;

    /**
     * Default constructor.
     */
    public ResponseData() {
    }

    /**
     * Initialization constructor.
     * @param  feed  Feed value for feed.
     */
    public ResponseData(
            Feed feed) {
        this.feed = feed;
    }

    /**
     * Getter for Feed.
     * @return Returns the Feed
     */
    @JsonGetter("feed")
    public Feed getFeed() {
        return feed;
    }

    /**
     * Setter for Feed.
     * @param feed Value for Feed
     */
    @JsonSetter("feed")
    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    /**
     * Converts this ResponseData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResponseData [" + "feed=" + feed + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ResponseData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResponseData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feed);
        return builder;
    }

    /**
     * Class to build instances of {@link ResponseData}.
     */
    public static class Builder {
        private Feed feed;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feed  Feed value for feed.
         */
        public Builder(Feed feed) {
            this.feed = feed;
        }

        /**
         * Setter for feed.
         * @param  feed  Feed value for feed.
         * @return Builder
         */
        public Builder feed(Feed feed) {
            this.feed = feed;
            return this;
        }

        /**
         * Builds a new {@link ResponseData} object using the set fields.
         * @return {@link ResponseData}
         */
        public ResponseData build() {
            return new ResponseData(feed);
        }
    }
}
