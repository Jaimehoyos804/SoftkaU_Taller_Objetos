package Class_Object;

/**
 *
 * @author JAIME
 */
public class Football_Club {
    public String Name;
    public int numbersPlayer;
    private String Owner;
    
    /*Metodo set y get para accerder a clases privadas*/

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }
    /*Contructor con las varibles nativas*/

    public Football_Club(String Name, int numbersPlayer, String Owner) {
        this.Name = Name;
        this.numbersPlayer = numbersPlayer;
        this.Owner = Owner;
    }
    /*Constructor vacio nos permite crear nuevos objetos*/
    public Football_Club() {
    }
    
}
