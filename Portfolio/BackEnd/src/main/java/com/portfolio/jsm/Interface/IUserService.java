package com.portfolio.jsm.Interface;

import com.portfolio.jsm.Entity.User;
import java.util.List;

public interface IUserService {

    // Taer una lista user
    public List<User> getUser();

    //Guardar un objeto de user
    public void saveUser(User user);

    //Eliminar un User por id
    public void deleteUser(long id);

    //Buscar persona por id
    public User finUser(Long id);

}
