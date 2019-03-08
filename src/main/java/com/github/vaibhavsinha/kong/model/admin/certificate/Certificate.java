package com.github.vaibhavsinha.kong.model.admin.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 14/06/17.
 */
@Data
public class Certificate {

    @JsonProperty("id")
    private String id;
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("key")
    private String key;
    @JsonProperty("snis")
    private List<String> snis;
    @JsonProperty("created_at")
    private Long createdAt;
}
