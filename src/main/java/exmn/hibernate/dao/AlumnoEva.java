package exmn.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * DAO para la entidad que maneja nuestros Alumnos y sus evaluaciones
 * @author Jmenabc
 */

@Entity
@Table(name = "eva_tch_notas_evaluacion", schema = "sc_evaluacion")
public class AlumnoEva {

	// Atributos
	@Column(name = "md_uuid")
	private String MdUuid;
	@Id
	@Column(name = "id_nota_evaluacion", unique = true, nullable = false)
	private long Id;
	@Column(name = "cod_alumno")
	private String codAlumno;
	@Column(name = "nota_evaluacion")
	private String NotaEv;
	@Column(name = "cod_evaluacion")
	private String CodEva;

	// Constructor
	public AlumnoEva(String mdUuid, String codAlumno, String notaEv, String codEva,long id) {
		super();
		MdUuid = mdUuid;
		this.codAlumno = codAlumno;
		NotaEv = notaEv;
		CodEva = codEva;
		Id = id;
	}

	// Getter y Setters

	public AlumnoEva() {
		super();
	}

	public String getMdUuid() {
		return MdUuid;
	}

	public void setMdUuid(String mdUuid) {
		MdUuid = mdUuid;
	}

	public long getId() {
		return Id;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNotaEv() {
		return NotaEv;
	}

	public void setNotaEv(String notaEv) {
		NotaEv = notaEv;
	}

	public String getCodEva() {
		return CodEva;
	}

	public void setCodEva(String codEva) {
		CodEva = codEva;
	}

	// toString

	@Override
	public String toString() {
		return "AlumnoEva [MdUuid=" + MdUuid + ", Id=" + Id + ", codAlumno=" + codAlumno + ", NotaEv=" + NotaEv
				+ ", CodEva=" + CodEva + "]";
	}

}
