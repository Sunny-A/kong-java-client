package com.github.vaibhavsinha.kong.model.plugin.trafficcontrol.ratelimiting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

/**
 * Created by vaibhav on 17/06/17.
 */
@Data
public class RateLimitingConfig {

    @JsonProperty("second")
    Integer second;
    @JsonProperty("minute")
    Integer minute;
    @JsonProperty("hour")
    Integer hour;
    @JsonProperty("day")
    Integer day;
    @JsonProperty("month")
    Integer month;
    @JsonProperty("year")
    Integer year;
    @JsonProperty("limit_by")
    LimitBy limitBy;
    @JsonProperty("policy")
    Policy policy;
    @JsonProperty("fault_tolerant")
    Boolean faultTolerant;
    @JsonProperty("redis_host")
    String redisHost;
    @JsonProperty("redis_port")
    Integer redisPort;
    @JsonProperty("redis_password")
    String redisPassword;
    @JsonProperty("redis_timeout")
    Integer redisTimeout;
    @JsonProperty("redis_database")
    Integer redisDatabase;

    public enum Policy {
        local, cluster, redis
    }

    public enum LimitBy {
        consumer, credential, ip
    }
}
