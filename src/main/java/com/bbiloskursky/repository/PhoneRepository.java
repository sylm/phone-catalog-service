package com.bbiloskursky.repository;

import com.bbiloskursky.model.Phone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PhoneRepository extends MongoRepository<Phone, String> {
    List<Phone> findByIdIn(Collection ids);
}
