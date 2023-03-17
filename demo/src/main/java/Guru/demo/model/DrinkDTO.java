package Guru.demo.model;

import Guru.demo.entities.Company;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
public class DrinkDTO {
    private Long id;

    private String Name;
    private Long price;

    private DrinkStyle drinkStyle;

    private Set<Company> maker;
    private LocalDateTime createdDate;

    private LocalDateTime updateDate;
}
