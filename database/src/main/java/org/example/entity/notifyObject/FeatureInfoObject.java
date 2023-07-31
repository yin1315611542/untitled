package org.example.entity.notifyObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 特定厂商添加对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureInfoObject {
    String AlgorithmVersion; //算法版本,
    String FeatureData; //特征值数据,
    String Vendor; //海康威视
}
