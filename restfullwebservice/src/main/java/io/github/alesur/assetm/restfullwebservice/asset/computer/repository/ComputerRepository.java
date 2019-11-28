package io.github.alesur.assetm.restfullwebservice.asset.computer.repository;


import io.github.alesur.assetm.restfullwebservice.asset.computer.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Long> {



}
