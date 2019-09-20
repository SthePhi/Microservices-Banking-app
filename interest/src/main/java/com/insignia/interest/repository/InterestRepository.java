package com.insignia.interest.repository;

import com.insignia.interest.model.Interest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestRepository extends CrudRepository <Interest, Long> {
}
