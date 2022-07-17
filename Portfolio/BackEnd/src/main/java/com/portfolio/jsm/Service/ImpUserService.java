package com.portfolio.jsm.Service;

import com.portfolio.jsm.Entity.User;
import com.portfolio.jsm.Interface.IUserService;
import com.portfolio.jsm.Repository.IUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUserService implements IUserService {

    @Autowired
    IUserRepository iUserRepository;

    @Override
    public List<User> getUser() {
        List<User> user = iUserRepository.findAll();
        return user;
    }

    @Override
    public void saveUser(User user) {
        iUserRepository.save(user);

    }

    @Override
    public void deleteUser(long id) {
         iUserRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        User user = iUserRepository.findById(id).orElse(null);
         return user;
    }

}
