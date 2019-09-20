package com.insignia.manager.repository;

import com.insignia.manager.model.Address;
import com.insignia.manager.model.Name;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends CrudRepository<Name, Long> {
}
