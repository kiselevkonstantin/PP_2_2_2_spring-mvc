package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private CarDAO carDAO;

    public CarDAO getCarDAO() {
        return carDAO = new CarDAOImp();
    }

    @Override
    public List<Car> getCars(Integer count) {

        return getCarDAO().getCars(count);
    }
}
