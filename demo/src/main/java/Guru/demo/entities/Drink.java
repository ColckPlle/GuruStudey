package Guru.demo.entities;

import Guru.demo.model.DrinkStyle;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Drink {
    @Id
    @GeneratedValue(generator = "Long")
    private Long id;

    private String drinkName;
    private Long price;

    private DrinkStyle drinkStyle;

    @ManyToOne
    private Company company;
    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}
