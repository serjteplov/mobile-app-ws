package ru.serj.app.ws.userservice;

import ru.serj.app.ws.ui.model.request.UserDetailsRequestModel;
import ru.serj.app.ws.ui.model.response.UserRest;

public interface UserService {
    public UserRest createUser(UserDetailsRequestModel details);
}
