package com.project.AssetAssignment.Services;

import com.project.AssetAssignment.Entities.Asset;
import com.project.AssetAssignment.Repository.AssetRepository;
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
        return assetRepository.findById(id).orElseThrow(null);
    }
    public List<Asset> getAssets(){
        return assetRepository.findAll();
    }
    public String deleteAssetById(Long id){
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
