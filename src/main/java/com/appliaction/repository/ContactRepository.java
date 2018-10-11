package com.appliaction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appliaction.bean.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
