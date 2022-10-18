package com.portfolio.jsm.Controller;
import com.portfolio.jsm.Dto.dtoHardSoftSkills;
import com.portfolio.jsm.Entity.HardSoftSkills;
import com.portfolio.jsm.Security.Controller.Mensaje;
import com.portfolio.jsm.Service.SHardSoftSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/exphss")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://jsmfrontend.web.app")

public class CHardSoftSkills {
    @Autowired
    SHardSoftSkills sHardSoftSkills;

    @GetMapping("/lista")
    public ResponseEntity<List<HardSoftSkills>> list() {
        List<HardSoftSkills> list = sHardSoftSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HardSoftSkills> getById(@PathVariable("id") int id) {
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        HardSoftSkills hardSoftSkills = sHardSoftSkills.getOne(id).get();
        return new ResponseEntity(hardSoftSkills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sHardSoftSkills.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHardSoftSkills dtohardSoftSkills) {
        if (StringUtils.isBlank(dtohardSoftSkills.getNombreHSS())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHardSoftSkills.existsByNombreHSS(dtohardSoftSkills.getNombreHSS())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        HardSoftSkills hardSoftSkills = new HardSoftSkills(
                //dtohardSoftSkills.getNombreHSS(), dtohardSoftSkills.getImgHSS()
                dtohardSoftSkills.getNombreHSS(), dtohardSoftSkills.getPorcentajeHSS(), dtohardSoftSkills.getImgHSS()

        );
        sHardSoftSkills.save(hardSoftSkills);
        return new ResponseEntity(new Mensaje("Habilidades agregada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHardSoftSkills dtohardSoftSkills) {
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (sHardSoftSkills.existsByNombreHSS(dtohardSoftSkills.getNombreHSS()) && sHardSoftSkills.getByNombreHSS(dtohardSoftSkills.getNombreHSS()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtohardSoftSkills.getNombreHSS())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        HardSoftSkills hardSoftSkills = sHardSoftSkills.getOne(id).get();

        hardSoftSkills.setNombreHSS(dtohardSoftSkills.getNombreHSS());
        hardSoftSkills.setPorcentajeHSS(dtohardSoftSkills.getPorcentajeHSS());
        //hardSoftSkills.setImgHSS(dtohardSoftSkills.getImgHSS());

        sHardSoftSkills.save(hardSoftSkills);

        return new ResponseEntity(new Mensaje("Habilidades actualizada"), HttpStatus.OK);
    }

}
