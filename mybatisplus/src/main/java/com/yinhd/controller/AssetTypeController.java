package com.yinhd.controller;

import com.yinhd.ResultModel;
import com.yinhd.entity.AssetType;
import com.yinhd.service.AssetTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 资产类型 前端控制器
 * </p>
 *
 * @author yinhd
 * @since 2024-04-20 03:50:34
 */
@RequestMapping("/yinhd/asset-type")
@Api(tags = "资产类型")
@RestController
public class AssetTypeController {

    @Autowired
    AssetTypeService assetTypeService;

    @PostMapping(value = "/add")
    public ResultModel add(@RequestBody AssetType assetType) {
        assetTypeService.saveOne(assetType);
        return ResultModel.ok();
    }

    @GetMapping(value = "/find{id}")
    public ResultModel findOne(@PathVariable Long id) {
        assetTypeService.findOne(id);
        return ResultModel.ok();
    }

    @PutMapping(value = "/update")
    public ResultModel update(@RequestBody AssetType assetType) {
        assetTypeService.updateOne(assetType);
        return ResultModel.ok();
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResultModel delete(@PathVariable Long id) {
        assetTypeService.deleteOne(id);
        return ResultModel.ok();
    }
}
