import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);   // aqui usamos la lib para aceptar o entrar datos por teclado
        
        System.out.print("Ingrese el numero del dia: ");   // le pedimos al usuario que ingrese el dia
        int dia = leer.nextInt(); //leemos l dia
        
        String nombreDia = null;
        
        switch (dia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                System.out.println("Numero del día incorrecto");
        }
        System.out.println(nombreDia);
    }
}
