package com.springSecurityImpl.springsecurity.repository;

import com.springSecurityImpl.springsecurity.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
