import java.util.Scanner;

public class Menu {

    static Vehiculo[] vehiculos = new Vehiculo[3];

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            
            System.out.println("\u001B[38;2;186;85;211m==================================================\u001B[0m");
            System.out.println("\u001B[38;2;186;85;211m              REGISTRO DE VEHICULOS       \u001B[0m");
            System.out.println("\u001B[38;2;186;85;211mm==================================================\u001B[0m");

            System.out.println("\u001B[38;2;186;85;211m 1. Registrar vehiculo\u001B[0m");
            System.out.println("\u001B[38;2;186;85;211m 2. Mostrar vehiculo\u001B[0m");
            System.out.println("\u001B[38;2;186;85;211m 3. Buscar vehiculo por placa\u001B[0m");
            System.out.println("\u001B[38;2;186;85;211m 4. Mostrar vehiculo por marca\u001B[0m");
            System.out.println("\u001B[38;2;186;85;211m 5. Salir\u001B[0m\n");
            System.out.print("\u001B[38;2;186;85;211m Digite la opcion que desea: \u001B[0m");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1: registrarVehiculo(scanner);
                
                    break;

                case 2: mostrarVehiculo();
                
                    break;

                case 3: buscarPorPlaca(scanner);
                
                    break;

                case 4: mostrarPorMarca(scanner);
                
                    break;

                case 5:
                    System.out.print("Saliendo...");

                    break;
        
                default:
                    System.out.print("Elige una opcion valida");

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
            scanner.nextLine();

            System.out.print("Ingrese el color:  ");
            vehiculos[i].setColor(scanner.nextLine());

            System.out.print("Ingrese el precio en $DOP: ");
            vehiculos[i].setPrecio(scanner.nextDouble());
            scanner.nextLine();
        }
    }

    public static void mostrarVehiculo(){

        for(int i = 0; i < vehiculos.length; i++){

            System.out.println("\nVehiculo " + (i + 1) + " :\n");
            System.out.println("Placa: " + vehiculos[i].getPlaca());
            System.out.println("Marca: " + vehiculos[i].getMarca());
            System.out.println("Modelo: " + vehiculos[i].getModelo());
            System.out.println("Year: " + vehiculos[i].getYear());
            System.out.println("Color: " + vehiculos[i].getColor());
            System.out.println("Precio en $DOP: " + vehiculos[i].getPrecio());
            
        }
    }

    public static void buscarPorPlaca(Scanner scanner){

        System.out.print("Digite la placa del vehiculo: ");
        String placaBuscada = scanner.nextLine();

        int i = 0;
        boolean encontrado = false;

        while(i < vehiculos.length && !encontrado){

            if(vehiculos[i].getPlaca().equals(placaBuscada)){
                encontrado = true;
            }
            else{
                i++;
            }
        }  
        
        if(encontrado){
                
                System.out.println("Placa : " + vehiculos[i].getPlaca());
                System.out.println("Marca : " + vehiculos[i].getMarca());
                System.out.println("Modelo : " + vehiculos[i].getModelo());
                System.out.println("Year : " + vehiculos[i].getYear());
                System.out.println("Color : " + vehiculos[i].getColor());
                System.out.println("Precio en $DOP : " + vehiculos[i].getPrecio());
            }
            else{

                System.out.print("Vehiculo no encontrado");
            }
    }

    public static void mostrarPorMarca(Scanner scanner){

        System.out.print("Digite la marca del vehiculo: ");
        String marcaBuscada = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < vehiculos.length; i++){

            if(vehiculos[i].getMarca().equals(marcaBuscada)){
                encontrado = true;

                System.out.println("Placa : " + vehiculos[i].getPlaca());
                System.out.println("Marca : " + vehiculos[i].getMarca());
                System.out.println("Modelo : " + vehiculos[i].getModelo());
                System.out.println("Year : " + vehiculos[i].getYear());
                System.out.println("Color : " + vehiculos[i].getColor());
                System.out.println("Precio en $DOP : " + vehiculos[i].getPrecio());
            }
        }

        if(!encontrado){

            System.out.println("Vehiculo no encontrado");
        }
    }
    
}
