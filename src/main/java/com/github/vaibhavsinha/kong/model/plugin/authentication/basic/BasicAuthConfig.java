package com.github.vaibhavsinha.kong.model.plugin.authentication.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class BasicAuthConfig {

    @JsonProperty("hide_credentials")
    Boolean hideCredentials;
    @JsonProperty("anonymous")
    String anonymous;
}
