package Class_Object;
//Libreria para manejo de arrayList
import java.util.ArrayList;

/**
 *
 * @author JAIME
 * Representa las cualidades de una Fruta 
 */
public class Fruit {
    
    //Variables nativas de la clase
    
    public String name;
    private float averageWeigth;
    public ArrayList<String> colors = new ArrayList<>();
    
    /*Usamos los get y Set*/

    public float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
       
    }
    /*Constructor con las variables a utilizar*/
    public Fruit(String name, float averageWeigth) {
        this.name = name;
        this.averageWeigth = averageWeigth;
    }
    /*Constructor por defecto*/
    public Fruit() {
        
    }
    
    
}
