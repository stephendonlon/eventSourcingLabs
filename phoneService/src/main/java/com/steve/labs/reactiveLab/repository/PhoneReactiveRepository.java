package com.steve.labs.reactiveLab.repository;

import com.steve.labs.reactiveLab.domain.Phone;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneReactiveRepository extends ReactiveMongoRepository<Phone, String> {

}
