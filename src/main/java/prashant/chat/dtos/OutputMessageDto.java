package prashant.chat.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OutputMessageDto {

    private String name;
    private String message;
    private LocalDateTime localDateTime;
}
