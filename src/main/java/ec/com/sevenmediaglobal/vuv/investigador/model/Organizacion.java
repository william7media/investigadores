package ec.com.sevenmediaglobal.vuv.investigador.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Immutable
@Table(name = "organizaciones")
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_organizacion", nullable = false, length = 765)
    private String nombre;

//    @Column(name = "tipo_organizacion")
//    private Integer tipoOrganizacion;
//
//    @Column(name = "sector")
//    private Integer sector;

}