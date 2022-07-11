package clase1;
//CLASE ACTOR
public class Actor 
{
    private String nombre;
    private String apellido;
    private String lugarNac;
    private int anioNac;

    Actor(String nombre,String apellido,int anioNac,String lugarNac)
    {
       this.nombre=nombre;
       this.apellido=apellido;
       this.lugarNac=lugarNac;
       this.anioNac= anioNac;
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido ;
    }
    public String getLugarNac()
    {
        return lugarNac;
    }
    public int getAnioNac()
    {
        return anioNac;
    }
    

    public String toString()
    {
        return ("\nNombre: "+getNombre()+
        "\nApellido: "+getApellido()+
        "\nLugar de Nacimiento: "+getLugarNac()+
        "\nAnio de Nac.: "+getAnioNac());
    }
}
