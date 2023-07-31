package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    RegisterObject registerObject;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class RegisterObject{
        String DeviceID;
    }
}
