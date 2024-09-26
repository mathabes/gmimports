package br.com.fiap.gmimports.cars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public String index(Model model) {
        var cars = carsService.findAll();
        model.addAttribute("cars", cars);
        return "index";
    }

}
