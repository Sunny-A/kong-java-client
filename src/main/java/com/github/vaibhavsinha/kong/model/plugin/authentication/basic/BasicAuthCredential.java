package com.github.vaibhavsinha.kong.model.plugin.authentication.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
@NoArgsConstructor
public class BasicAuthCredential {

    @JsonProperty("id")
    private String id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("created_at")
    private Long createdAt;

    public BasicAuthCredential(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
