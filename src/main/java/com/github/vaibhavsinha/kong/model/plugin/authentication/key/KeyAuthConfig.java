package com.github.vaibhavsinha.kong.model.plugin.authentication.key;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class KeyAuthConfig {

    @JsonProperty("hide_credentials")
    Boolean hideCredentials;
    @JsonProperty("anonymous")
    String anonymous;
    @JsonProperty("key_names")
    List<String> keyNames;
    @JsonProperty("key_in_body")
    Boolean keyInBody;
}
