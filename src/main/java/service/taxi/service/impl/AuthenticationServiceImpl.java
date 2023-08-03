package service.taxi.service.impl;

import service.taxi.exception.AuthenticationException;
import service.taxi.lib.Inject;
import service.taxi.lib.Service;
import service.taxi.model.Driver;
import service.taxi.service.AuthenticationService;
import service.taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Driver driver = driverService.findByLogin(login);
        if (driver.getPassword().equals(password)) {
            return driver;
        }
        throw new AuthenticationException("Login or password was incorrect");
    }
}
