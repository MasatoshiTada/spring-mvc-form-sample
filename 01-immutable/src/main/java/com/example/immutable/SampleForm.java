package com.example.immutable;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SampleForm {

    @NotBlank
    private String message;

    @NotBlank
    private String additionalMessage;

    @NotNull
    private Integer number;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public SampleForm(String message, String additionalMessage, Integer number, LocalDate birthday) {
        this.message = message;
        this.additionalMessage = additionalMessage;
        this.number = number;
        this.birthday = birthday;
    }

    public String getMessage() {
        return message;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

}
