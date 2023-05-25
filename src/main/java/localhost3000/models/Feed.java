/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for Feed type.
 */
public class Feed
        extends BaseModel {
    private String feedUrl;
    private String title;
    private String link;
    private String author;
    private String description;
    private String type;
    private List<Entry> entries;

    /**
     * Default constructor.
     */
    public Feed() {
    }

    /**
     * Initialization constructor.
     * @param  feedUrl  String value for feedUrl.
     * @param  title  String value for title.
     * @param  link  String value for link.
     * @param  author  String value for author.
     * @param  description  String value for description.
     * @param  type  String value for type.
     * @param  entries  List of Entry value for entries.
     */
    public Feed(
            String feedUrl,
            String title,
            String link,
            String author,
            String description,
            String type,
            List<Entry> entries) {
        this.feedUrl = feedUrl;
        this.title = title;
        this.link = link;
        this.author = author;
        this.description = description;
        this.type = type;
        this.entries = entries;
    }

    /**
     * Getter for FeedUrl.
     * @return Returns the String
     */
    @JsonGetter("feedUrl")
    public String getFeedUrl() {
        return feedUrl;
    }

    /**
     * Setter for FeedUrl.
     * @param feedUrl Value for String
     */
    @JsonSetter("feedUrl")
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Link.
     * @return Returns the String
     */
    @JsonGetter("link")
    public String getLink() {
        return link;
    }

    /**
     * Setter for Link.
     * @param link Value for String
     */
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Getter for Author.
     * @return Returns the String
     */
    @JsonGetter("author")
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for String
     */
    @JsonSetter("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Entries.
     * @return Returns the List of Entry
     */
    @JsonGetter("entries")
    public List<Entry> getEntries() {
        return entries;
    }

    /**
     * Setter for Entries.
     * @param entries Value for List of Entry
     */
    @JsonSetter("entries")
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    /**
     * Converts this Feed into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Feed [" + "feedUrl=" + feedUrl + ", title=" + title + ", link=" + link + ", author="
                + author + ", description=" + description + ", type=" + type + ", entries="
                + entries + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Feed.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Feed.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feedUrl, title, link, author, description, type, entries);
        return builder;
    }

    /**
     * Class to build instances of {@link Feed}.
     */
    public static class Builder {
        private String feedUrl;
        private String title;
        private String link;
        private String author;
        private String description;
        private String type;
        private List<Entry> entries;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feedUrl  String value for feedUrl.
         * @param  title  String value for title.
         * @param  link  String value for link.
         * @param  author  String value for author.
         * @param  description  String value for description.
         * @param  type  String value for type.
         * @param  entries  List of Entry value for entries.
         */
        public Builder(String feedUrl, String title, String link, String author, String description,
                String type, List<Entry> entries) {
            this.feedUrl = feedUrl;
            this.title = title;
            this.link = link;
            this.author = author;
            this.description = description;
            this.type = type;
            this.entries = entries;
        }

        /**
         * Setter for feedUrl.
         * @param  feedUrl  String value for feedUrl.
         * @return Builder
         */
        public Builder feedUrl(String feedUrl) {
            this.feedUrl = feedUrl;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for link.
         * @param  link  String value for link.
         * @return Builder
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  String value for author.
         * @return Builder
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for entries.
         * @param  entries  List of Entry value for entries.
         * @return Builder
         */
        public Builder entries(List<Entry> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * Builds a new {@link Feed} object using the set fields.
         * @return {@link Feed}
         */
        public Feed build() {
            return new Feed(feedUrl, title, link, author, description, type, entries);
        }
    }
}
