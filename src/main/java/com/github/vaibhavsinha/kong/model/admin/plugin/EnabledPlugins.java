package com.github.vaibhavsinha.kong.model.admin.plugin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 14/06/17.
 */
@Data
public class EnabledPlugins {
    @JsonProperty("enabled_plugins")
    List<String> enabledPlugins;
}
