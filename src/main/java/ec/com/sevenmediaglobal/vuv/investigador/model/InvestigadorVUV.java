package ec.com.sevenmediaglobal.vuv.investigador.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Immutable
@Table(name = "investigador_vuv")
public class InvestigadorVUV {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "nombres_completos")
    private String nombresCompletos;

    @Column(name = "genero")
    private String genero;

    @Column(name = "etnia")
    private String etnia;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "codigo_area_celular")
    private Integer codigoAreaCelular;

    @Column(name = "celular")
    private String celular;

    @Column(name = "codigo_area_telefono")
    private Integer codigoAreaTelefono;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;

    @Column(name = "organizacion")
    private String organizacion;

    @Column(name = "registro")
    private String registro;

    @Column(name = "estado")
    private String estado;

    @Column(name = "status")
    private String status;

    @Column(name = "username")
    private String username;

}