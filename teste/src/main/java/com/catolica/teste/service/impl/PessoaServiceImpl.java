package com.catolica.teste.service.impl;

import com.catolica.teste.dto.pessoa.PessoaRequestDTO;
import com.catolica.teste.dto.pessoa.PessoaUpdateRequestDTO;
import com.catolica.teste.model.PessoaModel;
import com.catolica.teste.service.PessoaService;

import java.util.List;
import java.util.UUID;

public class PessoaServiceImpl implements PessoaService {
    @Override
    public PessoaModel savePessoa(PessoaRequestDTO pessoaRequest) {
        return null;
    }

    @Override
    public PessoaModel updatePessoa(PessoaUpdateRequestDTO pessoaRequest) {
        return null;
    }

    @Override
    public PessoaModel switchPessoaFlag(UUID id) {
        return null;
    }

    @Override
    public PessoaModel findPessoaById(UUID id) {
        return null;
    }

    @Override
    public List<PessoaModel> findAllByName(PessoaUpdateRequestDTO pessoaRequest) {
        return null;
    }
}
