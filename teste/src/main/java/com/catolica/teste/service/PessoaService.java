package com.catolica.teste.service;

import com.catolica.teste.dto.pessoa.PessoaRequestDTO;
import com.catolica.teste.dto.pessoa.PessoaUpdateRequestDTO;
import com.catolica.teste.model.PessoaModel;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

    PessoaModel savePessoa(PessoaRequestDTO pessoaRequest);
    PessoaModel updatePessoa(PessoaUpdateRequestDTO pessoaRequest);
    PessoaModel switchPessoaFlag(UUID id);
    PessoaModel findPessoaById(UUID id);
    List<PessoaModel> findAllByName(PessoaUpdateRequestDTO pessoaRequest);

}
