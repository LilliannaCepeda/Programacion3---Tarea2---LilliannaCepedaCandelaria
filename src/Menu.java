import java.util.Scanner;

public class Menu {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        System.out.println("\u001B[38;2;186;85;211m==================================================\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m              REGISTRO DE VEHICULOS       \u001B[0m");
        System.out.println("\u001B[38;2;186;85;211mm==================================================\u001B[0m");

        System.out.println("\u001B[38;2;186;85;211m1. Registrar vehiculo\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m2. Mostrar vehiculo\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m3. Buscar vehiculo por placa\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m4. Mostrar vehiculo por marca\u001B[0m");
        System.out.println("\\u001B[38;2;186;85;211m5. Salir\u001B[0m");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1: registrarVehiculo(scanner);
                
                break;

             case 2: mostrarVehiculo(scanner);
                
                break;

             case 3: bucarPorPlaca(scanner);
                
                break;

             case 4: registrarVehiculo(scanner);
                
                break;
        
            default:
                break;
        }
    }
    
    
}
