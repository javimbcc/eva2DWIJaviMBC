package exmn.hibernate.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exmn.hibernate.dao.AlumnoEva;
import exmn.hibernate.dao.AlumnoEvaImpl;

/*
 * Clase donde ejecutamos los metodos definidos anteriormente
 * En este caso para listar por evaluaciones e insertar datos
 */
@Component
public class ConsultasPostgreSQL {

	@Autowired
	private AlumnoEvaImpl aei;

	// Insertar datos
	@Transactional
	public void insertarDatos(AlumnoEva eva) {
		aei.insertarDatosAlumnoEv(eva);
	}

	// Listar todas las evaluaciones
	@Transactional
	public List<AlumnoEva> buscarTodasEvaluaciones() {
		return aei.buscarTodasLasEvaluaciones();
	}

	// Listar primera evaluacion
	public List<AlumnoEva> buscarEva1() {
		return aei.buscarEvaluacionUno();
	}

	// Listar segunda evaluacion
	public List<AlumnoEva> buscarEva2() {
		return aei.buscarEvaluacionDos();
	}

	// Listar tercera evaluacion
	public List<AlumnoEva> buscarEva3() {
		return aei.buscarEvaluacionTres();
	}
	
	//Buscar por cod alumnos
	
	public List<AlumnoEva> buscarPorCodAlumno(String codAlumn) {
		return aei.buscarPorCodAlumno(codAlumn);
	}
}
