package com.catolica.teste.repository;
import com.catolica.teste.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository extends JpaRepository<PessoaModel, UUID> {

    List<PessoaModel> findAllByName(String name);
}
