package service.taxi.dao;

import java.util.List;
import service.taxi.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
