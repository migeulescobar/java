import java.util.ArrayList;
import java.util.Scanner;
public class appi {
    static Scanner input = new Scanner(System.in);
    static ArrayList<alumno> alumnos = new ArrayList<>();
    
    public static void CargaALumno() {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int nAlumnos = input.nextInt();
        for (int i = 1; i <= nAlumnos; i++) {
            System.out.println("informacion estudiante " + i);
            System.out.print("identificacion: ");
            String identificacion = input.next();
            System.out.print("Nombre: ");
            String Nombre = input.next();
            System.out.print("Email: ");
            String email = input.next();
            alumno alumno = new alumno();
            alumno.setIdentificacion(identificacion);
            alumno.setNombre(Nombre);
            alumno.setEmail(email);
            alumnos.add(alumno);
        }
    }

    public static void ConsultaA(){
        System.out.print("Identificacion del aprendiz: ");
        String identificacion = input.next();
        for (int i = 0;i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion().equals(identificacion)) {
                System.out.println(alumnos.get(i).getIdentificacion());
                System.out.println(alumnos.get(i).getNombre());
                System.out.println(alumnos.get(i).getEmail());
            }
        }
    }
    public static void ActuaALumno() {
        System.out.println("Digite la identificacion del estudiante a actualizar");
        String identificacion = input.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion().equals(identificacion)) {
                System.out.println("Digite el nuevo nombre: ");
                String newName = input.next();
                alumnos.get(i).setNombre(newName);
                System.out.println("Nombre actualizado");
                System.out.println("Digite el nuevo email: ");
                String newEmail = input.next();
                alumnos.get(i).setEmail(newEmail);
                System.out.println("Email actualizado");
            }
        }

    }
    public static void Imprimir(){
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println(alumnos.get(i).getIdentificacion());
            System.out.println(alumnos.get(i).getNombre());
            System.out.println(alumnos.get(i).getEmail());
        }
    }
    public static void Opciones(){
        System.out.println("Desea consultar un aprendiz (1) o desea actulizar la informacion de un aprensiz (2) o desea ver todos los aprendices (3) o ya ha finalizado (4)");
        byte opcion = input.nextByte();
        //System.out.println("Desea consultar un aprendiz (1) o desea actulizar la informacion de un aprensiz (2) o desea ver todos los aprendices (3) o ya ha finalizado (4)");
            if (opcion== 1){
                ConsultaA();
            }
            if (opcion==2) {
                ActuaALumno();
            }
            if (opcion==3) {
                Imprimir();
            }
    }
    public static void main(String[] args) {
        CargaALumno();
        Opciones();
    }
}
