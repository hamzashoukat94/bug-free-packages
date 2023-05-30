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
 * This is a model class for Entry type.
 */
public class Entry
        extends BaseModel {
    private String title;
    private String link;
    private String author;
    private String publishedDate;
    private String contentSnippet;
    private String content;
    private List<String> categories;

    /**
     * Default constructor.
     */
    public Entry() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  link  String value for link.
     * @param  author  String value for author.
     * @param  publishedDate  String value for publishedDate.
     * @param  contentSnippet  String value for contentSnippet.
     * @param  content  String value for content.
     * @param  categories  List of String value for categories.
     */
    public Entry(
            String title,
            String link,
            String author,
            String publishedDate,
            String contentSnippet,
            String content,
            List<String> categories) {
        this.title = title;
        this.link = link;
        this.author = author;
        this.publishedDate = publishedDate;
        this.contentSnippet = contentSnippet;
        this.content = content;
        this.categories = categories;
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
     * Getter for PublishedDate.
     * @return Returns the String
     */
    @JsonGetter("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * Setter for PublishedDate.
     * @param publishedDate Value for String
     */
    @JsonSetter("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * Getter for ContentSnippet.
     * @return Returns the String
     */
    @JsonGetter("contentSnippet")
    public String getContentSnippet() {
        return contentSnippet;
    }

    /**
     * Setter for ContentSnippet.
     * @param contentSnippet Value for String
     */
    @JsonSetter("contentSnippet")
    public void setContentSnippet(String contentSnippet) {
        this.contentSnippet = contentSnippet;
    }

    /**
     * Getter for Content.
     * @return Returns the String
     */
    @JsonGetter("content")
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for Categories.
     * @return Returns the List of String
     */
    @JsonGetter("categories")
    public List<String> getCategories() {
        return categories;
    }

    /**
     * Setter for Categories.
     * @param categories Value for List of String
     */
    @JsonSetter("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * Converts this Entry into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Entry [" + "title=" + title + ", link=" + link + ", author=" + author
                + ", publishedDate=" + publishedDate + ", contentSnippet=" + contentSnippet
                + ", content=" + content + ", categories=" + categories + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Entry.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Entry.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, link, author, publishedDate, contentSnippet, content,
                categories);
        return builder;
    }

    /**
     * Class to build instances of {@link Entry}.
     */
    public static class Builder {
        private String title;
        private String link;
        private String author;
        private String publishedDate;
        private String contentSnippet;
        private String content;
        private List<String> categories;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  link  String value for link.
         * @param  author  String value for author.
         * @param  publishedDate  String value for publishedDate.
         * @param  contentSnippet  String value for contentSnippet.
         * @param  content  String value for content.
         * @param  categories  List of String value for categories.
         */
        public Builder(String title, String link, String author, String publishedDate,
                String contentSnippet, String content, List<String> categories) {
            this.title = title;
            this.link = link;
            this.author = author;
            this.publishedDate = publishedDate;
            this.contentSnippet = contentSnippet;
            this.content = content;
            this.categories = categories;
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
         * Setter for publishedDate.
         * @param  publishedDate  String value for publishedDate.
         * @return Builder
         */
        public Builder publishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
            return this;
        }

        /**
         * Setter for contentSnippet.
         * @param  contentSnippet  String value for contentSnippet.
         * @return Builder
         */
        public Builder contentSnippet(String contentSnippet) {
            this.contentSnippet = contentSnippet;
            return this;
        }

        /**
         * Setter for content.
         * @param  content  String value for content.
         * @return Builder
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Setter for categories.
         * @param  categories  List of String value for categories.
         * @return Builder
         */
        public Builder categories(List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Builds a new {@link Entry} object using the set fields.
         * @return {@link Entry}
         */
        public Entry build() {
            return new Entry(title, link, author, publishedDate, contentSnippet, content,
                    categories);
        }
    }
}
