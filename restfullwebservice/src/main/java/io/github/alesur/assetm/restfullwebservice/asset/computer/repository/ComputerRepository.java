package io.github.alesur.assetm.restfullwebservice.asset.computer.repository;


import io.github.alesur.assetm.restfullwebservice.asset.computer.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends CrudRepository<Computer,Long> {

    Computer findByName(Object name);

}
