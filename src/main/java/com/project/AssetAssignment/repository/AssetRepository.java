package com.project.AssetAssignment.repository;

import com.project.AssetAssignment.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset,Long> {


    void deleteByName(Asset asset);
}
