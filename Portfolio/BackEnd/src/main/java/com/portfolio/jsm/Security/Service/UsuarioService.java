package com.portfolio.jsm.Security.Service;

import com.portfolio.jsm.Security.Entity.Usuario;
import com.portfolio.jsm.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsusario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean exitsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
      public boolean exitsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
      
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
