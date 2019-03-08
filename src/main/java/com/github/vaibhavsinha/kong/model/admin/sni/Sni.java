package com.github.vaibhavsinha.kong.model.admin.sni;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by vaibhav on 13/06/17.
 */
@Data
public class Sni {
    @JsonProperty("ssl_certificate_id")
    private String sslCertificateId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_at")
    private Long createdAt;
}
