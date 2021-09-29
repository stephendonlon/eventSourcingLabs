package com.steve.labs.phoneService.service;

import com.steve.labs.phoneService.domain.Phone;
import com.steve.labs.phoneService.repository.PhoneReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PhoneServiceImpl implements PhoneService {

  private final PhoneReactiveRepository phoneReactiveRepository;

  public PhoneServiceImpl(PhoneReactiveRepository phoneReactiveRepository) {
    this.phoneReactiveRepository = phoneReactiveRepository;
  }

  @Override
  public Mono<Phone> findById(String id) {
    return phoneReactiveRepository.findById(id);
  }

  @Override
  public Flux<Phone> findAll() {
    return phoneReactiveRepository.findAll();
  }

  @Override
  public Mono<Phone> save(Phone phone) {
    return phoneReactiveRepository.save(phone);
  }

}
