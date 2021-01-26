package prashant.chat.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import prashant.chat.dtos.InputMessageDto;
import prashant.chat.dtos.OutputMessageDto;

import java.time.LocalDateTime;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessageDto send(final InputMessageDto inputMessageDto) {

        return OutputMessageDto.builder()
                .name(inputMessageDto.getName())
                .message(inputMessageDto.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();
    }

}
