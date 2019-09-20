package com.hostele.events.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.UUID;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue
    private UUID eventId;
    @NotNull
    private String userId;
    @NotNull
    private String nameOfEvent;
    private String detailsOfEvent;
    private int maximumNumberOfGuest;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dateTime;
    @NotNull
    private Currency currency;
    @NotNull
    private String address; //this address won't be shared with anyone until the host accept the request
}
