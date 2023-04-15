package com.catolica.teste.dto.pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PessoaUpdateRequestDTO {

    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String name;//""

    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String cellphone;

    @NotNull(message = "O campo active não pode ser nulo!")
    private boolean active;
}
