package com.epam.yoke.event.model.rq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Body for create notify event")
public class NotifyEventBody {

    @Schema(required = true, description = "Requested eventId")
    private String eventId;

    @Schema(description = "Event description")
    private String description;
}
