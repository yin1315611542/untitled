package org.example.entity.notifyObject.Tollgate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TollgateObjectList {
    @JsonProperty("TollgateObject")
    List<TollgateObject> TollgateObject;
}
