package exmn.hibernate.dao;

import java.util.List;

/*
 * Interfaz con la firma de los metodos que nos ayuden a hacer las consultas
 */
public interface EvaluacionServicio {
	
	//Metodo para listar los datos de un alumno en especifico
	//mediante su codigo
	
	public List<AlumnoEva> buscarPorCodAlumno(String codalum);
	
	//Metodo para seleccionar las notas de todas las evaluaciones
	
	public List<AlumnoEva> buscarTodasLasEvaluaciones();
	
	//Metodo para listar las notas de la primera evaluacion
	
	public List<AlumnoEva> buscarEvaluacionUno();
	
	//Metodo para listar las notas de la segunda evaluacion
	
	public List<AlumnoEva> buscarEvaluacionDos();
	
	//Metodo para listar las notas de la tercera evaluacion
	
	public List<AlumnoEva> buscarEvaluacionTres();
	
	//Metodo para insertar alumnos y sus notas
	
	public void insertarDatosAlumnoEv(AlumnoEva eva);

}
