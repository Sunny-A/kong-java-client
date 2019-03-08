package com.github.vaibhavsinha.kong.model.plugin.authentication.jwt;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class JwtConfig {

    @JsonProperty("key_claim_name")
    String keyClaimName;
    @JsonProperty("anonymous")
    String anonymous;
    @JsonProperty("claims_to_verify")
    List<String> claimsToVerify;
    @JsonProperty("uri_param_names")
    List<String> uriParamNames;
    @JsonProperty("secret_is_base64")
    Boolean secretIsBase64;
}
