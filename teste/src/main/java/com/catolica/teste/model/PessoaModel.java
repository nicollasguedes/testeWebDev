package com.catolica.teste.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Convert(converter = UUID.class)
    private UUID id;

    private String name;

    private String cellphone;

    @Column(nullable = false, name = "active", columnDefinition = "boolean default false")
    private boolean active;
}
