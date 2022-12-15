package exmn.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
/*
 * Clase donde ejecutamos las consultas SQL para saber que parametros traerme de vuelta
 * @author Jmenabc
 */

@Component
public class AlumnoEvaImpl implements EvaluacionServicio {

	//Declaramos el entity manager
	@PersistenceContext
	private EntityManager em;
	
	//metodo para listar todas las evaluaciones

	public List<AlumnoEva> buscarTodasLasEvaluaciones() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT Alumno FROM AlumnoEva Alumno").getResultList();

	}
	//metodo para listar la primera evaluacion
	public List<AlumnoEva> buscarEvaluacionUno() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT alumno FROM AlumnoEva alumno WHERE CodEva like 'PR' ").getResultList();
	}
	//metodo para listar la evaluacion 2
	public List<AlumnoEva> buscarEvaluacionDos() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT alumno FROM AlumnoEva alumno WHERE CodEva like 'SG'").getResultList();
	}
	//metodo para listar la evaluacion 3
	public List<AlumnoEva> buscarEvaluacionTres() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT alumno FROM AlumnoEva alumno WHERE CodEva like 'TC'").getResultList();
	}
	//metodo para insertar datos
	public void insertarDatosAlumnoEv(AlumnoEva eva) {
		em.persist(eva);

	}
	//metodo para listar por codigo de alumno
	public List<AlumnoEva> buscarPorCodAlumno(String codEva) {
		return em.createQuery("SELECT Alumno FROM eva_tch_notas_evaluacion WHERE cod_alumno='' Alumno").getResultList();
	}

}
