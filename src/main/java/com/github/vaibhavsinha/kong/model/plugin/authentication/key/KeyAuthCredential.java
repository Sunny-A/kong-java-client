package com.github.vaibhavsinha.kong.model.plugin.authentication.key;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
@NoArgsConstructor
public class KeyAuthCredential {

    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("created_at")
    private Long createdAt;

    public KeyAuthCredential(String key) {
        this.key = key;
    }
}
