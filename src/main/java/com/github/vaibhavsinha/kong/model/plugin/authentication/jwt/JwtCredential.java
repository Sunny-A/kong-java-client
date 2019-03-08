package com.github.vaibhavsinha.kong.model.plugin.authentication.jwt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 16/06/17.
 */
@Data
@NoArgsConstructor
public class JwtCredential {

    @JsonProperty("rsa_public_key")
    private String rsaPublicKey;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("key")
    private String key;
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("secret")
    private String secret;
}
