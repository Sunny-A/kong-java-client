package com.github.vaibhavsinha.kong.model.plugin.security.acl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by vaibhav on 18/06/17.
 */
@Data
@NoArgsConstructor
public class Acl {
    @JsonProperty("id")
    private String id;
    @JsonProperty("group")
    private String group;
    @JsonProperty("consumer_id")
    private String consumerId;
    @JsonProperty("created_at")
    private Long createdAt;

    public Acl(String group) {
        this.group = group;
    }
}
