package com.insignia.officer.repository;

import com.insignia.officer.model.OfficerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficerRepository extends JpaRepository<OfficerModel, Integer>
{
    void deleteByemploymentID();
}
