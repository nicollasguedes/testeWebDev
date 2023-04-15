package com.catolica.teste.dto.pessoa;

import com.catolica.teste.model.PessoaModel;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaResponseDTO {

    private UUID id;
    private String name;
    private String cellphone;
    private boolean active;

    public static PessoaResponseDTO convertToDto(PessoaModel pessoa){
        return new PessoaResponseDTO(pessoa.getId(),
                pessoa.getName(),
                pessoa.getCellphone(),
                pessoa.isActive());
    }
}
