/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for EchoResponse type.
 */
public class EchoResponse
        extends BaseModel {
    private Map<String, Object> body;
    private Map<String, String> headers;
    private String method;
    private String path;
    private Map<String, QueryParameter> query;
    private Integer uploadCount;

    /**
     * Default constructor.
     */
    public EchoResponse() {
    }

    /**
     * Initialization constructor.
     * @param  body  Map of String, value for body.
     * @param  headers  Map of String, value for headers.
     * @param  method  String value for method.
     * @param  path  String value for path.
     * @param  query  Map of String, value for query.
     * @param  uploadCount  Integer value for uploadCount.
     */
    public EchoResponse(
            Map<String, Object> body,
            Map<String, String> headers,
            String method,
            String path,
            Map<String, QueryParameter> query,
            Integer uploadCount) {
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.path = path;
        this.query = query;
        this.uploadCount = uploadCount;
    }

    /**
     * Getter for Body.
     * @return Returns the Map of String, Object
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Object> getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for Map of String, Object
     */
    @JsonSetter("body")
    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    /**
     * Getter for Headers.
     * @return Returns the Map of String, String
     */
    @JsonGetter("headers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Setter for Headers.
     * @param headers Value for Map of String, String
     */
    @JsonSetter("headers")
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Getter for Method.
     * @return Returns the String
     */
    @JsonGetter("method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * @param method Value for String
     */
    @JsonSetter("method")
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Getter for Path.
     * relativePath
     * @return Returns the String
     */
    @JsonGetter("path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * relativePath
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Query.
     * @return Returns the Map of String, QueryParameter
     */
    @JsonGetter("query")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, QueryParameter> getQuery() {
        return query;
    }

    /**
     * Setter for Query.
     * @param query Value for Map of String, QueryParameter
     */
    @JsonSetter("query")
    public void setQuery(Map<String, QueryParameter> query) {
        this.query = query;
    }

    /**
     * Getter for UploadCount.
     * @return Returns the Integer
     */
    @JsonGetter("uploadCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUploadCount() {
        return uploadCount;
    }

    /**
     * Setter for UploadCount.
     * @param uploadCount Value for Integer
     */
    @JsonSetter("uploadCount")
    public void setUploadCount(Integer uploadCount) {
        this.uploadCount = uploadCount;
    }

    /**
     * Converts this EchoResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EchoResponse [" + "body=" + body + ", headers=" + headers + ", method=" + method
                + ", path=" + path + ", query=" + query + ", uploadCount=" + uploadCount
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link EchoResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EchoResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .body(getBody())
                .headers(getHeaders())
                .method(getMethod())
                .path(getPath())
                .query(getQuery())
                .uploadCount(getUploadCount());
        return builder;
    }

    /**
     * Class to build instances of {@link EchoResponse}.
     */
    public static class Builder {
        private Map<String, Object> body;
        private Map<String, String> headers;
        private String method;
        private String path;
        private Map<String, QueryParameter> query;
        private Integer uploadCount;



        /**
         * Setter for body.
         * @param  body  Map of String, value for body.
         * @return Builder
         */
        public Builder body(Map<String, Object> body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for headers.
         * @param  headers  Map of String, value for headers.
         * @return Builder
         */
        public Builder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Setter for method.
         * @param  method  String value for method.
         * @return Builder
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for query.
         * @param  query  Map of String, value for query.
         * @return Builder
         */
        public Builder query(Map<String, QueryParameter> query) {
            this.query = query;
            return this;
        }

        /**
         * Setter for uploadCount.
         * @param  uploadCount  Integer value for uploadCount.
         * @return Builder
         */
        public Builder uploadCount(Integer uploadCount) {
            this.uploadCount = uploadCount;
            return this;
        }

        /**
         * Builds a new {@link EchoResponse} object using the set fields.
         * @return {@link EchoResponse}
         */
        public EchoResponse build() {
            return new EchoResponse(body, headers, method, path, query, uploadCount);
        }
    }
}
