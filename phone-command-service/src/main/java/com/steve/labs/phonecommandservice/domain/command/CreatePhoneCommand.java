package com.steve.labs.phonecommandservice.domain.command;

import com.steve.labs.phonecommandservice.domain.dto.PhoneInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
@ToString
public class CreatePhoneCommand implements PhoneCommand {

  PhoneInfo phoneInfo;

}
