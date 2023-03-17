package Guru.demo.repositories;

import Guru.demo.entities.Company;
import Guru.demo.entities.Drink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Page<Company> findAllByMaker(String maker, Pageable pageable);

    Optional<Company> findByName(String name);
}
