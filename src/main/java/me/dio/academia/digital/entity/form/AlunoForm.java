package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoForm {

  @noBlank(message = "preencha o campo corretamente.")
  @Size(min = 3, max =50, message =  "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @noBlank(message = "preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' é invalido!")
  private String cpf;

  @noBlank(message = "preencha o campo corretamente.")
  @Size(min = 3, max =50, message =  "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @noBlank(message = "preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' é invalido!")
  private LocalDate dataDeNascimento;
}
