import java.util.HashMap;  //1º importamos la clase
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private  HashMap<String, String> agenda; //Cuantos par. ponemos? Dado que en el mt enterNumber nos pide dos parámetros ponemos dos.
    //tendrá, claves de tipo String asociadas a valores de tipo String
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number){
        //para introducir en agenda una clave denominada name, con un valor llamado number recurrimos al mt put()
        agenda.put(name, number);
    }

}
