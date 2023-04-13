package com.example.jvm.multdatasource;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-29 17:13
 **/
@Mapper
@DS("slave")
public interface AssetMapper extends BaseMapper<SourceDetailDO> {
    List<SourceDetailDO> getSourceDetailDO();
}
