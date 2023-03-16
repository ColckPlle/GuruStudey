package Guru.demo.repositories;

import Guru.demo.entities.Drink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {

    Page<Drink> findAllByMaker(String maker, Pageable pageable);
}
