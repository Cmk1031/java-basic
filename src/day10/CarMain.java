package day10;

import day10.dao.CarDAO;
import day10.dto.CarDTO;
import day10.dto.Tire;

public class CarMain {
    public static void main(String[] args) {
        CarDTO car1 = new CarDTO();
        Tire tire = new Tire();
        tire.setModel("한국타이어");
        CarDTO car2 = new CarDTO("캐스퍼", tire);
        CarDAO carDAO = new CarDAO(car2);
        carDAO.insert();
        carDAO.delete();
        carDAO.select();
        carDAO.update();
    }
}
