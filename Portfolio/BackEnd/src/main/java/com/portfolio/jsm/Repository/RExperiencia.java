package com.portfolio.jsm.Repository;

import com.portfolio.jsm.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {

    public Optional<Experiencia> findByNombreE(String nomString);

    public boolean existsByNombreE(String nombreE);

}
