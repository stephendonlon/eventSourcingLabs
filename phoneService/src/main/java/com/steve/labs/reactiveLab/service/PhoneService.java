package com.steve.labs.reactiveLab.service;

import com.steve.labs.reactiveLab.domain.Phone;
import com.steve.labs.reactiveLab.repository.PhoneReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PhoneService {

  private final PhoneReactiveRepository phoneReactiveRepository;

  public PhoneService(PhoneReactiveRepository phoneReactiveRepository) {
    this.phoneReactiveRepository = phoneReactiveRepository;
  }

  public Mono<Phone> findById(String id) {
    return phoneReactiveRepository.findById(id);
  }

  public Flux<Phone> findAll() {
    return phoneReactiveRepository.findAll();
  }

  public Mono<Phone> save(Phone phone) {
    return phoneReactiveRepository.save(phone);
  }

}
