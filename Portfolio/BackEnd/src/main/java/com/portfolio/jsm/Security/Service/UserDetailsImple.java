
package com.portfolio.jsm.Security.Service;

import com.portfolio.jsm.Security.Entity.Usuario;
import com.portfolio.jsm.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImple implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsusario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
     
    
    
}
