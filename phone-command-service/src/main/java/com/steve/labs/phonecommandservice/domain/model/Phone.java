package com.steve.labs.phonecommandservice.domain.model;

import com.steve.labs.phonecommandservice.domain.command.PhoneCommand;
import io.eventuate.Event;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Phone extends ReflectiveMutableCommandProcessingAggregate<Phone, PhoneCommand> {

  private String id;
  private String model;
  private String make;

  @Override
  public List<Event> processCommand(PhoneCommand phoneCommand) {
    return null;
  }

  @Override
  public Phone applyEvent(Event event) {
    return null;
  }

}
