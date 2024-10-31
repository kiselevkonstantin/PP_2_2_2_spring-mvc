package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDAOImp implements CarDAO {

    public List<Car> carsList = Arrays.asList(new Car("Tesla", 2024, 80000),
            new Car("Tesla", 2023, 70000),
            new Car("Tesla", 2022, 60000),
            new Car("Tesla", 2021, 50000),
            new Car("Tesla", 2020, 40000),
            new Car("Tesla", 2020, 40000),
            new Car("Tesla", 2020, 40000),
            new Car("Tesla", 2020, 40000),
            new Car("Tesla", 2020, 40000),
            new Car("Tesla", 2019, 30000));

    @Override
    public List<Car> getCars(int count) {
        return count < 5 ? carsList.subList(0, count) : carsList;
    }
}
