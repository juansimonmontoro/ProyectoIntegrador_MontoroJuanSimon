package com.portfolio.jsm.Controller;

import com.portfolio.jsm.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.jsm.Interface.IPersonaService;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona se creo correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona se elimino correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String NuevoNombre,
            @RequestParam("apellido") String NuevoApellido,
            @RequestParam("img") String NuevaImg) {
        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(NuevoNombre);
        persona.setApellido(NuevoApellido);
        persona.setImg(NuevaImg);

        ipersonaService.savePersona(persona);
        return persona;
    }

    @GetMapping("/personas/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long)6);
    }

}
