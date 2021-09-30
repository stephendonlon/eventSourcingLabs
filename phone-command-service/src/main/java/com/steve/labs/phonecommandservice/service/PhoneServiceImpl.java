package com.steve.labs.phonecommandservice.service;

import com.steve.labs.phonecommandservice.domain.command.CreatePhoneCommand;
import com.steve.labs.phonecommandservice.domain.dto.PhoneInfo;
import com.steve.labs.phonecommandservice.domain.model.Phone;
import com.steve.labs.phonecommandservice.domain.command.PhoneCommand;
import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.AggregateRepository;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {

  private final AggregateRepository<Phone, PhoneCommand> phoneRepository;

  public PhoneServiceImpl(
      AggregateRepository<Phone, PhoneCommand> phoneRepository) {
    this.phoneRepository = phoneRepository;
  }

  public CompletableFuture<EntityWithIdAndVersion<Phone>> createPhone(PhoneInfo phoneInfo) {
      return phoneRepository.save(new CreatePhoneCommand(phoneInfo));
  }

}
