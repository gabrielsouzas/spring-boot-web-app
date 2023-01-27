package com.webapplication.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.webapplication.springbootwebapp.models.Convidado;
import com.webapplication.springbootwebapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
