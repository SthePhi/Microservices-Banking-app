package com.insignia.officer.repository;

import com.insignia.officer.model.OfficerModel;
import org.springframework.data.repository.CrudRepository;

public interface OfficerRepository extends CrudRepository<OfficerModel, Integer>
{
    void deleteByEmploymentID(int employmentID);
}
