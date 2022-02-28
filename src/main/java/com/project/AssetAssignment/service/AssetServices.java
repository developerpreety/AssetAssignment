package com.project.AssetAssignment.service;

import com.project.AssetAssignment.entity.Asset;
import com.project.AssetAssignment.exception.AssetNotFoundException;
import com.project.AssetAssignment.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssetServices {
    @Autowired
    private AssetRepository assetRepository;
    public Asset saveAsset(Asset asset){
        return assetRepository.save(asset);
    }
    public List<Asset> saveAssets(List<Asset> asset){
        return assetRepository.saveAll(asset);
    }
    public Asset getAssetById(Long id){
        if(id==0)
            throw new AssetNotFoundException();
        return assetRepository.findById(id).orElseThrow(null);
    }
    public List<Asset> getAssets(){
        return assetRepository.findAll();
    }
    public String deleteAssetById(Long id){
        if(id==0)
            throw new AssetNotFoundException();
          assetRepository.deleteById(id);
          return "Asset removed!!" + id;
    }
    public String deleteAssetByName(Asset asset){
        assetRepository.deleteByName(asset);
        return "Asset removed!!!!";
    }
    public Asset updateAsset(Asset asset){
        Asset existingAsset=assetRepository.findById(asset.getId()).orElseThrow(null);
        existingAsset.setName(asset.getName());
        existingAsset.setDescription(asset.getDescription());
        return assetRepository.save(existingAsset);
    }
}
