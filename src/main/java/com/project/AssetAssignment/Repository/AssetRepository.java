package com.project.AssetAssignment.Repository;

import com.project.AssetAssignment.Entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset,Long> {


    void deleteByName(Asset asset);
}
