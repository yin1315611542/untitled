package org.example.entity.notifyObject.MotorVehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotorVehicleObjectList {
    @JsonProperty( "MotorVehicleObject")
    List<MotorVehicleObject> MotorVehicleObject;
}
