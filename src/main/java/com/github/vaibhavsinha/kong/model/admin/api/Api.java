package com.github.vaibhavsinha.kong.model.admin.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 13/06/17.
 */
@Data
public class Api {
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("hosts")
    private List<String> hosts = null;
    @JsonProperty("http_if_terminated")
    private Boolean httpIfTerminated;
    @JsonProperty("https_only")
    private Boolean httpsOnly;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("preserve_host")
    private Boolean preserveHost;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("strip_uri")
    private Boolean stripUri;
    @JsonProperty("upstream_connect_timeout")
    private Integer upstreamConnectTimeout;
    @JsonProperty("upstream_read_timeout")
    private Integer upstreamReadTimeout;
    @JsonProperty("upstream_send_timeout")
    private Integer upstreamSendTimeout;
    @JsonProperty("upstream_url")
    private String upstreamUrl;
    @JsonProperty("uris")
     private Object  uris;
    @JsonProperty("methods")
     private Object methods;
}
