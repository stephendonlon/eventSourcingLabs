package com.steve.labs.phonecommandservice.service;

import com.steve.labs.phonecommandservice.domain.dto.PhoneInfo;
import com.steve.labs.phonecommandservice.domain.model.Phone;
import io.eventuate.EntityWithIdAndVersion;
import java.util.concurrent.CompletableFuture;

public interface PhoneService {

  CompletableFuture<EntityWithIdAndVersion<Phone>> createPhone(PhoneInfo phoneInfo);

}
