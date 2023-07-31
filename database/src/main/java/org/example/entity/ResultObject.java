package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultObject {
    @JsonProperty("APEListObject")
    org.example.entity.notifyObject.Device.APEListObject APEListObject;
}
