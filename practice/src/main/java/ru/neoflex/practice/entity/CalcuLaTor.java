package ru.neoflex.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;
@Getter
@Entity
@Table(name = "CalcuLaTor")
public class CalcuLaTor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private int result;
    public CalcuLaTor(int result) {
        this.result = result;
    }
    public CalcuLaTor() {

    }
}
