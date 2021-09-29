package com.steve.labs.phoneService.service;

import com.steve.labs.phoneService.domain.Phone;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PhoneService {

  Mono<Phone> findById(String id);

  Flux<Phone> findAll();

  Mono<Phone> save(Phone phone);
}
