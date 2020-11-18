package ru.serj.app.ws.ui.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpdateUserDetailsRequestModel {
    @NotNull
    @Size(min = 2)
    private String firstName;

    @NotNull
    private String lastName;
}
