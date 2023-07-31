package org.example.entity.notifyObject.Face;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaceObjectList {
    @JsonProperty( "FaceObject")
    List<FaceObject> FaceObject;
}
