package clase1;
//CLASE PELICULA
public class Pelicula
{
    private String titulo;
    private String director;
    private int numeroActores;
    private Actor[] actores;
    private int contador;

    Pelicula(String titulo,String director,int numeroActores)
    {
       this.titulo=titulo;
       this.director=director;
       this.numeroActores=numeroActores;
       this.actores= new Actor[2];
       this.contador=0;
    }

    public String getTitulo()
    {
        return titulo;
    }
    public String getDirector()
    {
        return director;
    }

    public int getNumAct()
    {
        return numeroActores;
    }

    public void setActores(Actor actores)
    {
        this.actores[this.contador]= actores;
        this.contador++;
    }

    public Actor[] getActor()
    {
      return actores;
    }
    public String toString()
    {
        return ("\nTitulo: "+getTitulo()+
        "\nDirector: "+getDirector()+
        "\nNumero de Act.: "+getNumAct());
    }
}
