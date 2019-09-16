package com.insignia.customer.repository;

import com.insignia.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoy extends CrudRepository<Customer, Long> {
}
