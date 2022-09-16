package com.algaworks.algalog.api.model;

import com.algaworks.algalog.domain.model.Entrega;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Ocorrencia {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Entrega entrega;

    private String descricao;
    private OffsetDateTime dataRegistro;
}
