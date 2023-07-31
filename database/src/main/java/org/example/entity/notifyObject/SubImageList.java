package org.example.entity.notifyObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 图像列表对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubImageList {
    List<SubImageInfoObject> SubImageInfoObject;
}
