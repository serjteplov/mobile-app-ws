package ru.serj.app.ws.userservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.serj.app.ws.shared.Utils;
import ru.serj.app.ws.ui.model.request.UserDetailsRequestModel;
import ru.serj.app.ws.ui.model.response.UserRest;
import ru.serj.app.ws.userservice.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;


    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel details) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail(details.getEmail());
        returnValue.setFirstName(details.getFirstName());
        returnValue.setLastName(details.getLastName());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);
        if (users == null) {
            users = new HashMap<>();
        }
        users.put(userId, returnValue);

        return returnValue;
    }
}
