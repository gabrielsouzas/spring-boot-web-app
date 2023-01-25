package com.webapplication.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.webapplication.springbootwebapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
    
}
