package br.com.letscode.controller;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class HelloWorldDTO {

    private String mensagem;
    private String username;
    private LocalDate data;
    private Integer idade;
}
