package service.taxi.service;

import service.taxi.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Driver findByLogin(String login);
}
