package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
public class Refresh {
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("grant_type")
    private String grantType = "refresh_token";
}
