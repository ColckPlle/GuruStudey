package Guru.demo.services;

import Guru.demo.entities.Company;
import Guru.demo.entities.Drink;
import Guru.demo.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;


    public List<Company> listCompany(){
        List<Company> list = companyRepository.findAll();
        return list;
    }


    public Company saveNewCompany(Company company){
        return companyRepository.save(company);
    }

    public Optional<Company> findCompanyByName(String name){
        return Optional.ofNullable(companyRepository.findByName(name).orElse(null));
    }

    public Boolean deleteById(Long id){
        if(companyRepository.existsById(id)){
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
