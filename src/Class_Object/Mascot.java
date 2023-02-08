package Class_Object;
//Permite manejar arrayList
import java.util.ArrayList;

/**
 *
 * @author JAIME
 */
public class Mascot {
    public String Name;
    public String Breed;
    public ArrayList <String> colors = new ArrayList();
    
    /*Set y get para accerder a la clase*/

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /*Metodo constructor con las variables a utilizar*/

    public Mascot(String Name, String Breed) {
        this.Name = Name;
        this.Breed = Breed;
        
    }
    
    /*Constructor vacio para poder crear nuevos objetos*/

    public Mascot() {
    }
 
    
}
