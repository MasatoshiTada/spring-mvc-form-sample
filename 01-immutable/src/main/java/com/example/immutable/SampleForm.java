package com.example.immutable;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SampleForm {

    @NotBlank
    private String message;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public SampleForm(String message, LocalDate birthday) {
        this.message = message;
        this.birthday = birthday;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
