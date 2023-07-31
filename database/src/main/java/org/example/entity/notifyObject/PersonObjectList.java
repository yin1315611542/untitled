package org.example.entity.notifyObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 通知人脸集合对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonObjectList {
    @JsonProperty( "PersonObject")
    List<PersonObject> PersonObject;

}
