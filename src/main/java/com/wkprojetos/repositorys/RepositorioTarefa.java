package com.wkprojetos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wkprojetos.models.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{

}
