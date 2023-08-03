package service.taxi.service;

import service.taxi.exception.AuthenticationException;
import service.taxi.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
