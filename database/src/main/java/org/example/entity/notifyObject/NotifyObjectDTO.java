package org.example.entity.notifyObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotifyObjectDTO {
    @JsonProperty( "SubscribeNotificationListObject")
    SubscribeNotificationListObject SubscribeNotificationListObject;
}
