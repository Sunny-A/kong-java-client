package com.github.vaibhavsinha.kong.model.admin.plugin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

/**
 * Created by vaibhav on 13/06/17.
 */
@Data
public class Plugin {
    @JsonProperty("id")
    private String id;
    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("config")
    private Object config;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("created_at")
    private Long createdAt;
}
