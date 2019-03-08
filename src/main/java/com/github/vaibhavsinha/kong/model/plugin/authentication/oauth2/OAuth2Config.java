package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class OAuth2Config {

    @JsonProperty("hide_credentials")
    Boolean hideCredentials;
    @JsonProperty("anonymous")
    String anonymous;
    @JsonProperty("scopes")
    List<String> scopes;
    @JsonProperty("mandatory_scope")
    Boolean mandatoryScope;
    @JsonProperty("token_expiration")
    Integer tokenExpiration;
    @JsonProperty("enable_authorization_code")
    Boolean enableAuthorizationCode;
    @JsonProperty("enable_client_credentials")
    Boolean enableClientCredentials;
    @JsonProperty("enable_implicit_grant")
    Boolean enableImplicitGrant;
    @JsonProperty("enable_password_grant")
    Boolean enablePasswordGrant;
    @JsonProperty("accept_http_if_already_terminated")
    Boolean acceptHttpIfAlreadyTerminated;
}
