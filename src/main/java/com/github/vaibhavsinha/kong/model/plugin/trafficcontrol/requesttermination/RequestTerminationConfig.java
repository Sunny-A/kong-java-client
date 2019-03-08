package com.github.vaibhavsinha.kong.model.plugin.trafficcontrol.requesttermination;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 18/06/17.
 */
@Data
public class RequestTerminationConfig {
    @JsonProperty("status_code")
    Integer statusCode;
    @JsonProperty("message")
    String message;
    @JsonProperty("body")
    String body;
    @JsonProperty("content_type")
    String contentType;
}
