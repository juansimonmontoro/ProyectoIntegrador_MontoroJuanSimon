package com.portfolio.jsm.Interface;

import com.portfolio.jsm.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    // Taer una lista personas
    public List<Persona> getPersona();

    //Guardar un objeto de personas
    public void savePersona(Persona persona);

    //Eliminar un personas por id
    public void deletePersona(long id);

    //Buscar persona por id
    public Persona findPersona(Long id);

}
