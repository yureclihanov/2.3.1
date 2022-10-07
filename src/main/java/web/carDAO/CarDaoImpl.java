package web.carDAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private int CAR_COUNT;

    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(++CAR_COUNT,"LADA", 1));
        car.add(new Car(++CAR_COUNT,"MERS", 2));
        car.add(new Car(++CAR_COUNT,"VOLVO", 3));
        car.add(new Car(++CAR_COUNT,"BMW", 4));
        car.add(new Car(++CAR_COUNT,"LADA", 5));
    }

    @Override
    public List<Car> cars(int count) {
        if (count == 0) {
            return car;
        }
        return car.stream().limit(count).collect(Collectors.toList());
    }

}
