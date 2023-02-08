package Class_Object;

/*Libreria para manejar fecha */
import java.time.LocalDate;
/*Libreria para recibir datos por teclado*/
import java.util.Scanner;

/**
 *
 * @author JAIME
 */
public class Main {

    public static void main(String[] args) {
        /*Recibimos datos por teclado*/
        Scanner input = new Scanner(System.in);
        /*Recibir la opcion del  usuario*/
        int option = 0;
        /*Iteramos las opciones a mostrar al usuario*/
        do {
            /*Menu iterativo*/
            System.out.println("Bienvenido elija la opcion de su preferencia"); 
            System.out.println("1. Mostrar persona creada");
            System.out.println("2. Mostrar fruta creada");
            System.out.println("3. Mostrar cuenta bancaria");
            System.out.println("4. Mostrar mascota");
            System.out.println("5. Mostrar departamento");
            System.out.println("6. Mostrar Club de Futbol");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion : ");
            /*Recibimos la opcion ingresada por el usuario*/
            option = input.nextInt();
            switch (option) {
                /*Mostrar solo la informacion del objeto persona*/
                case 1:
                    /*Creamos objeto de tipo persona y le asignamos valores a sus atributos*/
                    People people1 = new People();
                    people1.setName("Jaime");
                    people1.lastName1 = "Hoyos";
                    people1.lastName2 = "Madera";
                    //Variable localdate.of permite asignar la fecha deseada en formato YDM//
                    people1.dataBrith = LocalDate.of(2000, 4, 8);
                    people1.Heigth = (float) 1.86;
                    System.out.println("Name:" + people1.Name + "\n"
                            + "LastName1:" + people1.lastName1 + "\n"
                            + "LasName2:" + people1.lastName2 + "\n"
                            + "DataBrith:" + people1.dataBrith + "\n"
                            + "Heigth:" + people1.Heigth);
                            System.out.println("");
                    break;
                /*Mostramos solo la informacion del objeto fruta*/
                case 2:

                    /*Creamos un objeto de tipo fruta y le asignamos valores a sus atributos*/
                    Fruit frutics = new Fruit();
                    frutics.name = ("Guayaba");
                    frutics.setAverageWeigth((float) 1.5);
                    frutics.colors.add("Verde");
                    frutics.colors.add("Amarillo");
                    System.out.println("Name:" + frutics.name + "\n"
                            + "AverageWeigth:" + frutics.getAverageWeigth() + "\n"
                            + "Colors:" + frutics.getColors());
                            System.out.println("");
                    break;
                /*Mostramos solo la informacion de la clase cuenta bancaria*/
                case 3:
                    /*Creamos un objeto de cuenta bancaria*/
                    BankAccount bankAccount1 = new BankAccount();
                    bankAccount1.setAccountNumber(999089765);
                    bankAccount1.setActivated(true);
                    bankAccount1.holderName = "Jaime Hoyos";
                    System.out.println("Informacion de la cuenta");
                    System.out.println("Number Account: " + bankAccount1.getAccountNumber() + "\n"
                            + "Activated:" + bankAccount1.isActivated() + "\n"
                            + "Holder Name: " + bankAccount1.holderName);
                            System.out.println("");
                break;
                /*Mostramos solo la informacion de la mascota*/
                case 4:
                    /*Creamos objeto de clase mascota*/
                    Mascot mascot1 = new Mascot();
                    mascot1.Name = "Luna";
                    mascot1.Breed = "Bulgdog";
                    mascot1.colors.add("Negro");
                    mascot1.colors.add("Cafe");
                    mascot1.colors.add("Blanco");
                    System.out.println("Name: " + mascot1.Name + "\n"
                            + "Breed:" + mascot1.Breed + "\n"
                            + "Colors: " + mascot1.colors);
                    System.out.println("");
                break;
                /*Mostramos solo la informacion dela clase Departamento*/
                case 5:
                    /*Creamos un objeto de tipo departamento*/
                    Departament departament1 = new Departament();
                    departament1.Name = "Antioquia";
                    departament1.nomberMunicipalities = 32;
                    departament1.surfaceMetres = (float) 61.655;
                    departament1.setBudget(12000000.0f);
                     System.out.println("Name: " + departament1.Name + "\n"
                            + "Numbers Municipalities:" + departament1.nomberMunicipalities + "\n"
                            + "Surfe Meters: " + departament1.nomberMunicipalities + "\n"+
                             "Budget: "+departament1.getBudget());
                    System.out.println("");
                    break;
                /*Mostramos solo la informacion del club de futbol*/
                case 6:
                    /*Creamos un objeto de tipo club de futbol*/
                    Football_Club club1 = new Football_Club();
                    club1.Name = "Arsenal";
                    club1.numbersPlayer = 32;
                    club1.setOwner("Stan Kroenke");
                    System.out.println("Name: " + club1.Name + "\n"
                            + "Numbers Players:" + club1.numbersPlayer + "\n"
                            + "Ower: " + club1.getOwner() + "\n");
                    System.out.println("");
                    break;
            }
        } while (option != 0);
    }
}
