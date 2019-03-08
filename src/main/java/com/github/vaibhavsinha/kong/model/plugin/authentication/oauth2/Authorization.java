package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
public class Authorization {

    @JsonProperty("id")
    private String id;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("response_type")
    private String responseType;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("provision_key")
    private String provisionKey;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("authenticated_userid")
    private String authenticatedUserid;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
}
