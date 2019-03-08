package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
public class Application {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("redirect_uri")
    private List<String> redirectUri;
    @JsonProperty("created_at")
    private Long createdAt;

    public Application(String name, List<String> redirectUri, String clientId, String clientSecret) {
        this.name = name;
        this.redirectUri = redirectUri;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public Application(String name, List<String> redirectUri) {
        this(name, redirectUri, null, null);
    }
}
