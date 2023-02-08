package Class_Object;
/*Librerias para poder asignar fecha a los objetos*/
import java.time.LocalDate;
/**
 *
 * @author JAIME
 * Representa la cualidades de una persona
 */
public class People {
    /*
        Variables Nativas de la Clase
    */
    public String Name;
    public String lastName1;
    public String lastName2;
    public LocalDate dataBrith;;
    public float Heigth;
    
    /*Metodo Constructor por defecto*/
    People() {
       
    }
    
    /*
        Metodos setter y getter
    */
    //Metodo set

    public void setName(String Name) {
        this.Name = Name;
    }
    //Metodo Get

    public String getName() {
        return Name;
    }
    
    
    /*
        Metodo Constructor Con los atributos
    */

    public People(String Name, String lastName1, String lastName2, LocalDate dataBrith, float Heigth) {
        this.Name = Name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dataBrith = dataBrith;
        this.Heigth = Heigth;
    }
    
    
}
