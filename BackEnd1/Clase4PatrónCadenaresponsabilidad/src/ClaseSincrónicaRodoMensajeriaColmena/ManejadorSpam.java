package ClaseSincrÃ³nicaRodoMensajeriaColmena;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarEmail(Mail mail) {
        System.out.println("El correo estÃ¡ pasando por spam");
        System.out.println("Termina la cadena, es un correo spam");
    return "Mandando a spam";
    }
}
