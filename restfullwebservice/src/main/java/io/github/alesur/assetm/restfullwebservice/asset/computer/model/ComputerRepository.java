package io.github.alesur.assetm.restfullwebservice.asset.computer.model;


import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ComputerRepository extends JpaRepository<Computer,Integer> {

    List<Computer> findAllBySiteId(int siteId);
    List<Computer> findAll();

}
