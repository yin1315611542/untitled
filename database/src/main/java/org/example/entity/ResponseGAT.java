package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseGAT {
    @JsonProperty("ResponseStatusObject" )
    ResponseStatusObject ResponseStatusObject;
}
