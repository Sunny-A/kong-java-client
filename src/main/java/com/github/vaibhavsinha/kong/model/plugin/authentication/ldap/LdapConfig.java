package com.github.vaibhavsinha.kong.model.plugin.authentication.ldap;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class LdapConfig {

    @JsonProperty("hide_credentials")
    Boolean hideCredentials;
    @JsonProperty("anonymous")
    String anonymous;
    @JsonProperty("ldap_host")
    String ldapHost;
    @JsonProperty("ldap_port")
    Integer ldapPort;
    @JsonProperty("start_tls")
    Boolean startTls;
    @JsonProperty("base_dn")
    String baseDn;
    @JsonProperty("verify_ldap_host")
    Boolean verifyLdapHost;
    @JsonProperty("attribute")
    String attribute;
    @JsonProperty("cache_ttl")
    Integer cacheTtl;
    @JsonProperty("timeout")
    Integer timeout;
    @JsonProperty("keepalive")
    Integer keepalive;
}
