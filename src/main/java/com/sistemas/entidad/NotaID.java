package com.sistemas.entidad;

import java.io.Serializable;

import lombok.Data;

@Data
public class NotaID  implements Serializable{
	private Long alumno;
	private Long curso;
	
	public NotaID() {
		
	}
	
	public NotaID(Long alumno, Long curso) {
		super();
		this.alumno = alumno;
		this.curso = curso;
	}

}
