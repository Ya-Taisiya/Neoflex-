package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.entity.CalcuLaTor;

@Repository
public interface CalcuLaTorRepository extends JpaRepository<CalcuLaTor, Integer> {
}
