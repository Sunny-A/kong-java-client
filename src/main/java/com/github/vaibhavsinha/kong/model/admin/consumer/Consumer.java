package com.github.vaibhavsinha.kong.model.admin.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 12/06/17.
 */
@Data
public class Consumer {
    String id;
    @JsonProperty("custom_id")
    String customId;
    @JsonProperty("created_at")
    Long createdAt;
    String username;
}
