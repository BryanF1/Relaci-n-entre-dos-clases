package clase1;
//CLASE PRINCIPAL
public class Main 
{
    public static void main(String args[])
    {
        Actor actor1 = new Actor("Bryan", "Rojas",2003,"Huanuco");
        Actor actor2 = new Actor("Fisher", "Chavez", 2003 , "Lima");

        Pelicula pelicula = new Pelicula("Un triangulo amoroso", "Ronal Romero", 2);
        pelicula.setActores(actor1);
        pelicula.setActores(actor2);

         
        for(Actor a: pelicula.getActor())
        {
            System.out.println();
            System.out.println("........Actores.........");
            System.out.println(a.toString());
            System.out.println("........Pelicula.........");
            System.out.println(pelicula.toString());
        }

    }
}

