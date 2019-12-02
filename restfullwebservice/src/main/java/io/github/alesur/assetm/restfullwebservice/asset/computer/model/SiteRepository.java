package io.github.alesur.assetm.restfullwebservice.asset.computer.model;

import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Integer> {

    Site findBySiteCode(String siteCode);

}
