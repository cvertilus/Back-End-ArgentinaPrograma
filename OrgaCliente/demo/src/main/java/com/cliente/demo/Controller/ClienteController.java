package com.cliente.demo.Controller;

import com.cliente.demo.Model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos del cliente :"+ cli.getNombre() +
                "   Apellido: " + cli.getApellido());
    }

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listaClientes= new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"zlatan","Ibra"));
        listaClientes.add(new Cliente(2L,"Messi","Ibra"));
        listaClientes.add(new Cliente(3L,"kaka","Ibra"));
        return listaClientes;
    }
    @GetMapping("/cliente/Obtener")
    ResponseEntity<List<Cliente>> ObtnerClientes(){
        List<Cliente> listaClientes= new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"zlatan","Ibra"));
        listaClientes.add(new Cliente(2L,"Messi","Ibra"));
        listaClientes.add(new Cliente(3L,"kaka","Ibra"));
        return new ResponseEntity<>(listaClientes, HttpStatus.OK);
    }
}
