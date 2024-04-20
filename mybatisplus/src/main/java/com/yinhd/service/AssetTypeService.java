package com.yinhd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yinhd.entity.AssetType;

/**
 * <p>
 * 资产类型 服务类
 * </p>
 *
 * @author yinhd
 * @since 2024-04-20 03:50:34
 */
public interface AssetTypeService extends IService<AssetType> {

    AssetType findOne(Long id);

    AssetType saveOne(AssetType assetType);

    Long deleteOne(Long id);

    AssetType updateOne(AssetType assetType);

}
