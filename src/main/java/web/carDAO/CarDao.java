package web.carDAO;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> cars(int count);

}
