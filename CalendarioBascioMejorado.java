



/**
 * Write a description of class CalendarioBascio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBascioMejorado
{
    //La pantalla de las dias
    private PantallaDosDigitos pantallaDia;
    //La pantalla de los meses
    private PantallaDosDigitos pantallaMes;
    //La pantalla de los ano
    private PantallaDosDigitos pantallaAno;
    
    /**
     * Constructor for objects of class CalendarioBascio
     */
    public CalendarioBascioMejorado()
    {
        pantallaDia = new PantallaDosDigitos(1, 30);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaAno = new PantallaDosDigitos(1, 99);   
    }

    
}
   