package ad_tarea4;

import java.time.LocalDate;

/**
 * En esta clase Alumno, definimos los atributos del alumno Contiene información
 * como nombre, apellido, nia, fecha de nacimiento, curso, ciclo, grupo y
 * genero.
 * 
 * @author Jesús
 * 
 */
public class Alumno {
	private int nia;
	private String nombre, apellido, ciclo, curso, grupo;
	private LocalDate fechaNacimiento;
	private char genero;

	/**
	 * Método constructor
	 */
	public Alumno() {
	}

	/**
	 * Devuelve el nia del alumno
	 * 
	 * @return nia
	 */
	public int getNia() {
		return nia;
	}

	/**
	 * Establece el nia del alumno.
	 * 
	 * @param nia del alumno.
	 * 
	 */
	public void setNia(int nia) {
		this.nia = nia;
	}

	/**
	 * Devuelve el nombre del alumno
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del alumno.
	 * 
	 * @param nombre del alumno.
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el apellido del alumno
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el apellido del alumno.
	 * 
	 * @param apellido del alumno.
	 * 
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Devuelve el ciclo del alumno
	 * 
	 * @return ciclo
	 */
	public String getCiclo() {
		return ciclo;
	}

	/**
	 * Establece el ciclo del alumno.
	 * 
	 * @param ciclo del alumno.
	 * 
	 */
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	/**
	 * Devuelve el curso del alumno
	 * 
	 * @return curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Establece el curso del alumno.
	 * 
	 * @param curso del alumno.
	 * 
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Devuelve el grupo del alumno
	 * 
	 * @return grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * Establece el grupo del alumno.
	 * 
	 * @param grupo del alumno.
	 * 
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * Devuelve la fecha de nacimiento del alumno
	 * 
	 * @return fechaNacimiento del alumno
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del alumno.
	 * 
	 * @param fechaNacimiento del alumno.
	 * 
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devuelve el genero del alumno
	 * 
	 * @return genero
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * Establece el genero del alumno.
	 * 
	 * @param genero del alumno.
	 * 
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * Anhiade a una cadena los atributos del alumno
	 * 
	 * @return Cadena con los detalles del alumno con su nia, nombre, apellido,
	 *         ciclo, curso, grupo, fecha de nacimiento, y su genero.
	 */
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", apellido=" + apellido + ", ciclo=" + ciclo + ", curso="
				+ curso + ", grupo=" + grupo + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + "]";
	}

}
