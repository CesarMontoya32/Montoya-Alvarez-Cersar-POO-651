
package temaarrays;


public class Persona { //clase perona
    private int num;
    private String nombre;  //atributos
    private int edad;
    
    //primer conwtructor
    public Persona(){
    }      //crear objeto
    public Persona(int num, String nombre, int edad){
    this.num=num;
    this.nombre=nombre;          //pasar datos y devolver el objeto con los mismos
    this.edad=edad;  
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
