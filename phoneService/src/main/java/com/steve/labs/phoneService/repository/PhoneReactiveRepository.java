package com.steve.labs.phoneService.repository;

import com.steve.labs.phoneService.domain.Phone;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneReactiveRepository extends ReactiveMongoRepository<Phone, String> {

}
