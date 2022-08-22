package com.portfolio.jsm.Repository;

import com.portfolio.jsm.Entity.HardSoftSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RHardSoftSkills extends JpaRepository<HardSoftSkills, Integer> {
    public Optional<HardSoftSkills> findByNombreHSS(String nombreHSS);
    public boolean existsByNombreHSS(String nombreHSS);
}



