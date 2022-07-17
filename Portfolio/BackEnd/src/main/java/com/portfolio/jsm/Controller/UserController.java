package com.portfolio.jsm.Controller;

import com.portfolio.jsm.Entity.User;
import com.portfolio.jsm.Interface.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService iuserService;

    @GetMapping("users/traer")
    public List<User> getUser() {
        return iuserService.getUser();
    }

    @PostMapping("/users/crear")
    public String createUser(@RequestBody User user) {
        iuserService.saveUser(user);
        return "El Usario se creo correctamente";
    }

    @DeleteMapping("/users/borrar/{id}")
    public String deleUser(@PathVariable Long id) {
        iuserService.deleteUser(id);
        return "El usuario se elimino correctamente";
    }

    @PutMapping("/users/editar/{id}")
    public User editUser(@PathVariable Long id,
                         @RequestParam("nombre") String NuevoNombre,
                         @RequestParam("apellido") String NuevoApellido,
                         @RequestParam("img") String NuevaImg) {
        User user = iuserService.finUser(id);

        user.setNombre(NuevoNombre);
        user.setApellido(NuevoApellido);
        user.setImg(NuevaImg);

        iuserService.saveUser(user);
        return user;
    }

}
