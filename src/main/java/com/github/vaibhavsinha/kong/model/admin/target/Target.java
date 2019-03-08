package com.github.vaibhavsinha.kong.model.admin.target;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 14/06/17.
 */
@Data
public class Target {

    @JsonProperty("id")
    private String id;
    @JsonProperty("target")
    private String target;
    @JsonProperty("weight")
    private Long weight;
    @JsonProperty("upstream_id")
    private String upstreamId;
    @JsonProperty("created_at")
    private Long createdAt;
}
