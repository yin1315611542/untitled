package org.example.entity.subscribe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeListObject {
  @JsonProperty("SubscribeObject" )
  List<SubscribeObject> subscribeObject;
}
