package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
