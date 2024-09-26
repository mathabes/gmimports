package br.com.fiap.gmimports.cars;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Cars {

    @Id
    UUID id;

    @NotBlank
    String marca;

    @NotBlank
    String modelo;

    @NotBlank
    double preco;

    String cor;

}
