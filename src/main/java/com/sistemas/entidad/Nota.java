package com.sistemas.entidad;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@IdClass(NotaID.class)
@Table(name="notas")
@Data
public class Nota {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Alumno alumno;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(
			name = "idCUrso",
			referencedColumnName = "id",
			foreignKey = @ForeignKey(name = "fk_cursos_notas"),
			nullable = false)
	private Curso curso;
	
	private Double unidad1;
	private Double unidad2;
	private Double unidad3;
	
	

}