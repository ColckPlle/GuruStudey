package Guru.demo.repositories;

import Guru.demo.entities.Drink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {


    Optional<Drink> findByDrinkName(String drinkName);


}
