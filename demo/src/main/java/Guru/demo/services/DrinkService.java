package Guru.demo.services;

import Guru.demo.entities.Drink;
import Guru.demo.model.DrinkDTO;
import Guru.demo.repositories.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkRepository drinkRepository;

    public List<Drink> listDrink(){
        List<Drink> list = drinkRepository.findAll();
        return list;
    }


    public Drink saveNewDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public Optional<Drink> findDrinkByName(String name){
        return Optional.ofNullable(drinkRepository.findByDrinkName(name).orElse(null));
    }

    public Boolean deleteById(Long id){
        if(drinkRepository.existsById(id)){
            drinkRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
