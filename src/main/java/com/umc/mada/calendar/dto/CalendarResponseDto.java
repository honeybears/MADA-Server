package com.umc.mada.calendar.dto;

import lombok.*;
import org.joda.time.DateTime;

import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import org.joda.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalendarResponseDto {
   private Long calendarId;
   private String calendarName;
   private LocalDate startDate;
   private LocalDate endDate;
   private Character dday;
   private LocalTime startTime;
   private LocalTime endTime;
   private Character repeat;
   private String memo;
   private String color;
   private Integer repeatInfo;
   private boolean isExpired;
}
