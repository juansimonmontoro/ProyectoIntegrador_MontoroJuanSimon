package com.portfolio.jsm.Interface;

import com.portfolio.jsm.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    // Taer una lista user
    public List<Persona> getPersona();

    //Guardar un objeto de user
    public void savePersona(Persona user);

    //Eliminar un User por id
    public void deletePersona(long id);

    //Buscar persona por id
    public Persona findPersona(Long id);

}
