package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseStatusObject {
    @JsonProperty( "Id")
    String Id;
    @JsonProperty( "StatusString")
    String StatusString;
    @JsonProperty( "LocalTime")
    String LocalTime;
    @JsonProperty( "RequestURL")
    String RequestURL;
    @JsonProperty( "StatusCode")
    Integer StatusCode;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getStatusString() {
        return StatusString;
    }

    public void setStatusString(String statusString) {
        StatusString = statusString;
    }

    public String getLocalTime() {
        return LocalTime;
    }

    public void setLocalTime(String localTime) {
        LocalTime = localTime;
    }

    public String getRequestURL() {
        return RequestURL;
    }

    public void setRequestURL(String requestURL) {
        RequestURL = requestURL;
    }

    public Integer getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(Integer statusCode) {
        StatusCode = statusCode;
    }
}
