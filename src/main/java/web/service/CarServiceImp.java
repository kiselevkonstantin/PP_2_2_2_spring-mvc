package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    public CarDAO carDAO = new CarDAOImp();

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
