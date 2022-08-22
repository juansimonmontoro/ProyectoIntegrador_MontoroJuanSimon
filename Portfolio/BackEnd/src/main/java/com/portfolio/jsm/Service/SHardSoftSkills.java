
package com.portfolio.jsm.Service;

import com.portfolio.jsm.Entity.HardSoftSkills;
import com.portfolio.jsm.Repository.RHardSoftSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHardSoftSkills {
    
    @Autowired
    RHardSoftSkills rHardSoftSkills;
    
    public List<HardSoftSkills> list() {
        return rHardSoftSkills.findAll();
    }

    public Optional<HardSoftSkills> getOne(int id) {
        return rHardSoftSkills.findById(id);
    }

    public Optional<HardSoftSkills> getByNombreHSS(String nombreHSS) {
        return rHardSoftSkills.findByNombreHSS(nombreHSS);
    }

    public void save(HardSoftSkills hss) {
        rHardSoftSkills.save(hss);
    }

    public void delete(int id) {
        rHardSoftSkills.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHardSoftSkills.existsById(id);
    }

    public boolean existsByNombreHSS(String nombreHSS) {
        return rHardSoftSkills.existsByNombreHSS(nombreHSS);
    }
    
}
