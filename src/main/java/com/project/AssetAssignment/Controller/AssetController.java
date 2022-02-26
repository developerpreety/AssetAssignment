package com.project.AssetAssignment.Controller;

import com.project.AssetAssignment.Entities.Asset;
import com.project.AssetAssignment.Services.AssetServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {
    @Autowired
    private AssetServices assetServices;
    Logger log= LoggerFactory.getLogger(AssetController.class);

    @GetMapping("/assets")
    public List<Asset> getAsset(){
        log.trace("Print all assets");
        return assetServices.getAssets();
    }
    @GetMapping("/asset/{id}")
    public Asset getAssetById(@PathVariable Long id){
        log.trace("Print asset by ID");
        return assetServices.getAssetById(id);
    }
    @PostMapping("/asset")
    public Asset saveAsset(@RequestBody Asset asset){
        log.trace("Add new Asset");
        return assetServices.saveAsset(asset);
    }
    @PostMapping("/assets")
    public List<Asset> saveAllAsset(@RequestBody List<Asset> assets){
        log.trace("Add Assets");
        return assetServices.saveAssets(assets);
    }
    @PutMapping("/asset")
    public Asset update(@RequestBody Asset asset){
        log.trace("Update an asset");
        return assetServices.updateAsset(asset);
    }
    @DeleteMapping("/asset")
    public String delete(@RequestBody Asset asset){
        log.trace("Delete an asset");
        return assetServices.deleteAssetByName(asset);
    }
    @DeleteMapping("/asset/{id}")
    public String deleteById(@PathVariable Long id){
        log.trace("Delete asset by ID");
        return assetServices.deleteAssetById(id);
    }
}
