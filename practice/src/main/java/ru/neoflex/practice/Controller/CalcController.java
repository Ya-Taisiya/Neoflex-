package ru.neoflex.practice.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.entity.CalcuLaTor;
import ru.neoflex.practice.repository.CalcuLaTorRepository;

import java.util.List;
@RestController
public class CalcController {
    @Autowired
    private CalcuLaTorRepository calcuLaTorRepository;
    private CalcuLaTor calcuLaTor;
    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        calcuLaTor = new CalcuLaTor(a + b);
        calcuLaTorRepository.save (calcuLaTor);
        return a + b;
    }


    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        calcuLaTor = new CalcuLaTor(a - b);
        calcuLaTorRepository.save (calcuLaTor);
        return a - b;
    }
    @GetMapping("/cocacola")
    public List <CalcuLaTor> getAllCalculations(){
        return calcuLaTorRepository.findAll();
    }
}
