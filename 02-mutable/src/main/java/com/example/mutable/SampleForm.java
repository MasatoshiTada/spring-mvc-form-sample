package com.example.mutable;

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

    public String getMessage() {
        return message;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
