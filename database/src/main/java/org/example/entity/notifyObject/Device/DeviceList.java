package org.example.entity.notifyObject.Device;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceList {
    @JsonProperty( "APEObject")
    List<APEObject> APEObject;
}
