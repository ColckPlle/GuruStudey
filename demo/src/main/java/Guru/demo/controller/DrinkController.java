package Guru.demo.controller;

import Guru.demo.entities.Company;
import Guru.demo.entities.Drink;
import Guru.demo.services.CompanyService;
import Guru.demo.services.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/drink")
public class DrinkController {
    private final DrinkService drinkService;

    public ResponseEntity  listCompany(){
        drinkService.listDrink();
        return new ResponseEntity<>(HttpStatus.CONTINUE);
    }
    @GetMapping("/{name}")
    public Drink getCompanyByName (@PathVariable("name") String name){
        Drink drink = drinkService.findDrinkByName(name).get();
        return drink;
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") Long id){
        this.drinkService.deleteById(id);
    }

    @GetMapping("/list")
    public List<Drink> list(Model model, @RequestParam( defaultValue = "0") int page){
        return this.drinkService.listDrink();
    }

}
