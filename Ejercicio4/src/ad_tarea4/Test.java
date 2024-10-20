package ad_tarea4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase permite introducir datos de alumnos y guardarlos en un archivo
 * binario. Luego, estos datos pueden ser leídos y mostrados.
 * <p>
 * El programa solicita datos como nombre, apellido, nia, fecha de nacimiento,
 * ciclo, curso, grupo y género. Valida las entradas y luego almacena los datos
 * en un archivo binario.
 * </p>
 * 
 * @author Jesús
 */
public class Test {
	/**
	 * Metodo principal donde se realiza la introducción de ficheros y alumnos.
	 * 
	 * @param args Argumentos de la línea de comandos
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		System.out.println("Introduzca la ruta donde quiere guardar a los alumnos ");
		String ruta = sc.nextLine();
		System.out.println("Escriba el nombre del fichero:");
		String nombre = sc.nextLine();
		nombre = nombre + ".dat";
		File ficheroBin = new File(ruta + "\\" + nombre);

		FileOutputStream os;
		DataOutputStream dos = null;

		System.out.println("Introduce 5 alumnos");
		Alumno alum;
		try {
			os = new FileOutputStream(ficheroBin, true);
			dos = new DataOutputStream(os);

			for (int i = 0; i < 5; i++) {

				try {

					int dia = 0, mes = 0, anhio = 0;
					String vCurso, vCiclo, grupo;
					char genero;

					System.out.println("Alumno " + (i + 1));
					alum = new Alumno();
					System.out.println("Introduce el nombre:");
					alum.setNombre(sc.next());
					dos.writeUTF(alum.getNombre());
					System.out.println("Introduce el Apellido:");
					alum.setApellido(sc.next());
					dos.writeUTF(alum.getApellido());
					do {
						sc.nextLine();
						try {
							System.out.println("Introduce el NIE(9 digitos):");
							alum.setNia(sc.nextInt());

						} catch (InputMismatchException e) {
							System.out.println("El NIE solo puede tener números");
						}
					} while (Integer.toString(alum.getNia()).length() != 9);
					dos.writeInt(alum.getNia());
					do {
						try {
							sc.nextLine();
							System.out.println("Introduce la fecha de nacimiento");
							System.out.println("Introduce dia (1-30):");
							dia = sc.nextInt();

							System.out.println("Introduce mes(1-12):");
							mes = sc.nextInt();

							System.out.println("Introduce anho(1924-2025):");
							anhio = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Solo se pueden escribir numeros enteros");
						}

					} while ((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (anhio < 1924 || anhio > 2024));

					alum.setFechaNacimiento(LocalDate.of(anhio, mes, dia));
					dos.writeUTF(alum.getFechaNacimiento().toString());

					vCiclo = sc.nextLine();
					do {
						System.out.println("Introduce el ciclo:");
						System.out.println("DAM\tDAW\tASIR");
						vCiclo = sc.nextLine();
					} while (!(vCiclo.toUpperCase().equalsIgnoreCase("DAM")
							|| vCiclo.toUpperCase().equalsIgnoreCase("DAW")
							|| vCiclo.toUpperCase().equalsIgnoreCase("ASIR")));

					alum.setCiclo(vCiclo);
					dos.writeUTF(alum.getCiclo());
					do {
						System.out.println("Introduce el curso:");
						System.out.println("Primero\t Segundo");
						vCurso = sc.nextLine();
					} while (!(vCurso.equalsIgnoreCase("Primero") || vCurso.equalsIgnoreCase("Segundo")));
					alum.setCurso(vCurso);
					dos.writeUTF(alum.getCurso());

					do {
						System.out.println("Introduce el grupo");
						System.out.println("1. A\t2. B\t3. C");
						grupo = sc.nextLine();
					} while (!(grupo.equalsIgnoreCase("A") || grupo.equalsIgnoreCase("B")
							|| grupo.equalsIgnoreCase("C")));
					alum.setGrupo(grupo);
					dos.writeUTF(alum.getGrupo());
					do {
						System.out.println("Introduce el género: ");
						System.out.println("1. H\t2. M");
						genero = sc.next().toUpperCase().charAt(0);
					} while (genero != 'H' && genero != 'M');
					alum.setGenero(genero);
					dos.writeChar(alum.getGenero());
					listaAlumnos.add(alum);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			for (Alumno alumno : listaAlumnos) {
				System.out.println(alumno);
			}

			dos.close();
			sc.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
