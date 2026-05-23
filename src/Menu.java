import java.util.Scanner;

public class Menu {

    static Vehiculo[] vehiculos = new Vehiculo[5];

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[38;2;186;85;211m==================================================\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m              REGISTRO DE VEHICULOS       \u001B[0m");
        System.out.println("\u001B[38;2;186;85;211mm==================================================\u001B[0m");

        System.out.println("\u001B[38;2;186;85;211m 1. Registrar vehiculo\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m 2. Mostrar vehiculo\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m 3. Buscar vehiculo por placa\u001B[0m");
        System.out.println("\u001B[38;2;186;85;211m 4. Mostrar vehiculo por marca\u001B[0m");
        System.out.println("\\u001B[38;2;186;85;211m 5. Salir\u001B[0m");

        int opcion = scanner.nextInt();

        scanner.nextLine();

        do{
            switch (opcion) {

                case 1: registrarVehiculo(scanner);
                
                    break;

                case 2: mostrarVehiculo();
                
                    break;

                case 3: bucarPorPlaca(scanner);
                
                    break;

                case 4: mostrarPorMarca(scanner);
                
                    break;

                case 5:
                    System.out.print("Saliendo...");
        
                default:

                    break;
            }

        }while (opcion != 5); 

        scanner.close();

    }

    public static void registrarVehiculo(Scanner scanner){

        for(int i = 0; i < vehiculos.length; i++){

            vehiculos[i] = new Vehiculo();

            System.out.println("----Vehiculo " + (i + 1) + " ----- :");

            System.out.print("Ingrese la placa: ");
            vehiculos[i].setPlaca(scanner.nextLine());

            System.out.print("Ingrese la marca: ");
            vehiculos[i].setMarca(scanner.nextLine());

            System.out.print("Ingrese el modelo: ");
            vehiculos[i].setModelo(scanner.nextLine());

            System.out.print("Ingrese el year del modelo: ");
            vehiculos[i].setYear(scanner.nextInt());

            System.out.print("Ingrese el color:  ");
            vehiculos[i].setColor(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            vehiculos[i].setPrecio(scanner.nextDouble());

            scanner.nextLine();
        }
    }

    public static void mostrarVehiculo(){

        for(int i = 0; i < vehiculos.length; i++){

            System.out.print("Vehiculo " + (i + 1) + " :\n");
            System.out.print("Placa: " + vehiculos[i].getPlaca());
            System.out.print("Marca: " + vehiculos[i].getMarca());
            System.out.print("Modelo: " + vehiculos[i].getModelo());
            System.out.print("Year: " + vehiculos[i].getYear());
            System.out.print("Color: " + vehiculos[i].getColor());
            System.out.print("Precio: " + vehiculos[i].getPrecio());
        }
    }
    
}
