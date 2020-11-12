package ru.serj.app.ws.ui.model.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDetailsRequestModel {

    @NotNull
    @Size(min = 2)
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 8, max = 16)
    private String password;

}
