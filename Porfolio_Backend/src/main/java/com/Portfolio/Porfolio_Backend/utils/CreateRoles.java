package com.Portfolio.Porfolio_Backend.utils;

import com.Portfolio.Porfolio_Backend.Security.Enums.RolNombre;
import com.Portfolio.Porfolio_Backend.Security.Model.Rol;
import com.Portfolio.Porfolio_Backend.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    RolService rolService;
    @Override
    public void run(String... args) throws Exception {
        Rol admin = new Rol(RolNombre.ADMIN);
        Rol user = new Rol(RolNombre.USER);
        rolService.guardarRol(admin);
        rolService.guardarRol(user);


    }
}
