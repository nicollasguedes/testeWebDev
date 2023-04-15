package com.catolica.teste.dto.pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaRequestDTO {

    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String name;//""

    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String cellphone;

    @NotNull(message = "O campo active não pode ser nulo!")
    private boolean active;
}
