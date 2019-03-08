package com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 15/06/17.
 */
@Data
public class Redirect {
    @JsonProperty("redirect_uri")
    String redirectUri;
}
