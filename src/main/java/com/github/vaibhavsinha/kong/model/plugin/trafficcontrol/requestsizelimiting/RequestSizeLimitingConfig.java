package com.github.vaibhavsinha.kong.model.plugin.trafficcontrol.requestsizelimiting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 18/06/17.
 */
@Data
public class RequestSizeLimitingConfig {
    @JsonProperty("allowed_payload_size")
    Integer allowedPayloadSize;
}
