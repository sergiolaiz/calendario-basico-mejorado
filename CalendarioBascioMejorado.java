
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
     * Constructor for objects of class CalendarioBascioMejorado
     */
    public CalendarioBascioMejorado()
    {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAno = new PantallaDosDigitos(1, 99);   
    }
    
   /**
     * Devuelve la hora actual de esta pantalla en el formao HH:MM.
     */
    public String obtenerFecha() {
        return pantallaDia.getTextoDeLaPantalla() + "-" + pantallaMes.getTextoDeLaPantalla()  + "-" + pantallaAno.getTextoDeLaPantalla();
    } 
    
   /**
     * Fija la hora de la pantalla con la hora y los minutos especificados.
     */
    public void setCalendario (int newDia, int newMes, int newAno) {
        pantallaDia.setValorAlmacenado(newDia);
        pantallaMes.setValorAlmacenado(newMes);
        pantallaAno.setValorAlmacenado(newAno);
    }   
    
   /**
     * Este metodo debe invocarse una vez cada dia. Provoca que la
     * pantalla del Calendario avance un dia.
     */
    public void avanzaFecha() {
        pantallaDia.incrementaValorAlmacenado();
        if (pantallaDia.getValorAlmacenado() == 1) {
          pantallaMes.incrementaValorAlmacenado();
          if (pantallaMes.getValorAlmacenado() == 1) {
          pantallaAno.incrementaValorAlmacenado();
           }
        }
    }
}
   