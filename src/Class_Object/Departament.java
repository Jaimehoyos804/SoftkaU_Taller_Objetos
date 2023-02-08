package Class_Object;

/**
 *
 * @author JAIME
 */
public class Departament {
    /*Variable Nativas de la clas*/
    public String Name;
    public int nomberMunicipalities;
    public float surfaceMetres;
    protected float Budget;
       
    /*Constructor de la clase*/

    public Departament(String Name, int nomberMunicipalities, float surfaceMetres, float Budget) {
        this.Name = Name;
        this.nomberMunicipalities = nomberMunicipalities;
        this.surfaceMetres = surfaceMetres;
        this.Budget = Budget;
    }
    /*Constructor Vacio para poder asignarle atributos*/

    public Departament() {
    }
        
    /*Metodos get y set*/
    public float getBudget() {
        return Budget;
    }

    public void setBudget(float Budget) {
        this.Budget = Budget;
    }
    
}
