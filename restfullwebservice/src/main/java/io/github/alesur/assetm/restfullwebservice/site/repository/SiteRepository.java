package io.github.alesur.assetm.restfullwebservice.site.repository;

import io.github.alesur.assetm.restfullwebservice.site.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
}
