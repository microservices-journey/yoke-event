package com.epam.yoke.event.model.rs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Notify event response")
public class NotifyEventResponse {

    @Schema(required = true, description = "Requested eventId")
    private String eventId;

    @NotNull(message = "Emails is mandatory")
    @Schema(required = true, description = "Requested emails")
    private List<String> emails;

    @Schema(description = "Requested event description")
    private String description;
}
