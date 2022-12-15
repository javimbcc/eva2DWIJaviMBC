package exmn.hibernate.controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import exmn.hibernate.dao.AlumnoEva;
import exmn.hibernate.impl.ConsultasPostgreSQL;


@Controller
public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recogemos ela rchivo de configuracion de los beans de nuestra aplicacion
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		//Recogemos nuestro bean de consultas para poder ejecutar las consultas
		ConsultasPostgreSQL pg = (ConsultasPostgreSQL) context.getBean(ConsultasPostgreSQL.class);
		//ejecutamos la consulta que nos trae todos los datos de todas las evaluaciones
		//System.out.println(pg.buscarTodasEvaluaciones());
		//ejecutamos la consuta que nos trae los registros de la primera evaluacion
		System.out.println(pg.buscarEva1());
		//ejecutamos la consulta que nos trae registros de la segunda evaluacion
		//System.out.println(pg.buscarEva2());
		//ejecutamos la consulta que nos trae registros de la tercera evaluacion
		//System.out.println(pg.buscarEva3().toString());

		//ejecutamos la consulta que nos añade registros
		//Nos hacemos nuestro ejemplo
		//AlumnoEva ej1 = new AlumnoEva("ejemplo","JavierMena","10","PC",10000);
		//pg.insertarDatos(ej1);
	}

}
