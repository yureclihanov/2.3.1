package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServise;

import java.util.Optional;

@Controller
public class CarController {

    private final CarServise carServise;

    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam("count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carServise.cars(count.orElse(0)));
        return "cars";
    }


}
