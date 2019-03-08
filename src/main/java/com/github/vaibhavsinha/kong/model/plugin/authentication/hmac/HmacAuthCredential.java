package com.github.vaibhavsinha.kong.model.plugin.authentication.hmac;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
@NoArgsConstructor
public class HmacAuthCredential {

    @JsonProperty("id")
    private String id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("created_at")
    private Long createdAt;

    public HmacAuthCredential(String username, String secret) {
        this.username = username;
        this.secret = secret;
    }
}
