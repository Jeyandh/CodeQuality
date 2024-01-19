package com.cms.DAO;

import org.springframework.data.repository.CrudRepository;

import com.cms.BEAN.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer>{

}
