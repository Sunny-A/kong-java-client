package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by vaibhav on 13/06/17.
 */
@Data
public class Upstream {

    @JsonProperty("id")
    private String id;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("name")
    private String name;
    @JsonProperty("orderlist")
    private List<Integer> orderList;
    @JsonProperty("created_at")
    private Long createdAt;
}
