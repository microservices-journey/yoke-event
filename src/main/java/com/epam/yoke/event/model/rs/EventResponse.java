package com.epam.yoke.event.model.rs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Event response")
public class EventResponse {

    @Schema(required = true, description = "Event id")
    private Long id;

    @Schema(required = true, description = "Event date")
    private Date date;

    @Schema(required = true, description = "Event capacity")
    private Integer capacity;

    @Schema(required = true, description = "Event slot")
    private Integer slot;

    @Schema(required = true, description = "Event locationId")
    private Long locationId;

    @Schema(description = "Event description")
    private String description;
}
