package com.epam.yoke.event.model.rq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Body for create event")
public class EventBody {

    @NotNull(message = "Date is mandatory")
    @Schema(required = true, description = "Requested date")
    private Date date;

    @NotNull(message = "Capacity is mandatory")
    @Schema(required = true, description = "Requested capacity")
    private Integer capacity;

    @NotNull(message = "Slot is mandatory")
    @Schema(required = true, description = "Requested slot")
    private Integer slot;

    @NotNull(message = "LocationId is mandatory")
    @Schema(required = true, description = "Requested locationId")
    private Long locationId;

    @Schema(description = "Event description")
    private String description;
}
