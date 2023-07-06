package com.algaworks.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.ConvidadosModel;

public interface Convidados extends JpaRepository<ConvidadosModel, Long> {

}
