package com.sistemas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.entidad.Docente;
import com.sistemas.repositorio.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService{
	
	@Autowired
	private DocenteRepository docenteRepository;

	@Override
	public Docente agregar(Docente entidad) {
		return docenteRepository.save(entidad);
	}

	@Override
	public List<Docente> listarTodos() {
		return docenteRepository.findAll();
	}

	@Override
	public Docente buscar(Long id) {
		return docenteRepository.findById(id).orElse(null);

	}

	@Override
	public Docente actualizar(Docente entidad) {
		return docenteRepository.save(entidad);
	}

	@Override
	public void eliminar(Long id) {
		docenteRepository.deleteById(id);
		
	}

}
