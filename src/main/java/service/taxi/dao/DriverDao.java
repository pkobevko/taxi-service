package service.taxi.dao;

import java.util.Optional;
import service.taxi.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
