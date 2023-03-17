package Guru.demo.controller;

import Guru.demo.entities.Company;
import Guru.demo.entities.Drink;
import Guru.demo.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    public ResponseEntity  listCompany(){
        companyService.listCompany();
        return new ResponseEntity<>(HttpStatus.CONTINUE);
    }
    @GetMapping("/{id}")
    public Company getCompanyByName (@PathVariable("name") String name){
        Company company = companyService.findCompanyByName(name).get();
        return company;
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") Long id){
        this.companyService.deleteById(id);
    }

    @GetMapping("/list")
    public List<Company> list(Model model, @RequestParam( defaultValue = "0") int page){
        return this.companyService.listCompany();
    }


}
