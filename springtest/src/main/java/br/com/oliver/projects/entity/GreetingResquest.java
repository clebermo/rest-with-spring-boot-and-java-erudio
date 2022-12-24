package br.com.oliver.projects.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class GreetingResquest {

    @JsonProperty("param")
    private String requestTest;

    @JsonProperty("param2")
    private String requestTest2;

    public String getRequestTest() {
        return requestTest;
    }

    public void setRequestTest(String requestTest) {
        this.requestTest = requestTest;
    }

    public String getRequestTest2() {
        return requestTest2;
    }

    public void setRequestTest2(String requestTest2) {
        this.requestTest2 = requestTest2;
    }
}
