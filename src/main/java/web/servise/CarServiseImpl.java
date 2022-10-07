package web.servise;

import org.springframework.stereotype.Service;
import web.carDAO.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarServise{
    private final CarDao carDao;

    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> cars(int count) {
        return carDao.cars(count);
    }
}
