package com.github.vaibhavsinha.kong.model.plugin.authentication.hmac;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class HmacAuthConfig {

    @JsonProperty("hide_credentials")
    Boolean hideCredentials;
    @JsonProperty("anonymous")
    String anonymous;
    @JsonProperty("clock_skew")
    Integer clockSkew;
}
