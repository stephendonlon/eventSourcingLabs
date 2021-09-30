package com.steve.labs.phonecommandservice;

import com.steve.labs.phonecommandservice.domain.command.PhoneCommand;
import com.steve.labs.phonecommandservice.domain.model.Phone;
import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import io.eventuate.local.java.spring.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(EventuateDriverConfiguration.class)
public class PhoneCommandServiceConfiguration {

  @Bean
  public AggregateRepository<Phone, PhoneCommand> phoneRepository(
      EventuateAggregateStore eventStore) {
    return new AggregateRepository<>(Phone.class, eventStore);
  }

}
