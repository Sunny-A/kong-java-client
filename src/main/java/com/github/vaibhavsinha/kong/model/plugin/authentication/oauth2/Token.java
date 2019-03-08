package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
public class Token {

    @JsonProperty("id")
    private String id;
    @JsonProperty("credential_id")
    private String credentialId;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("expires_in")
    private Long expiresIn;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("authenticated_userid")
    private String authenticatedUserid;
}
