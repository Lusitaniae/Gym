/**
 *
 * @author Pedro Gomes 1131252
 */
public class ClienteConvidado extends Utente {

    /**
     * Horas de oferta para cada convidado
     */
    private int horasOferta;
   
    /** 
     * Subtrai horas usadas às horas disponíveis
     * @param horas usadas.
     * @validar usadas minor oferta
     */
    private void horasUsadas(int horas){
        setHorasOferta(getHorasOferta() - horas);  
    }
    /**
     * Constroi instância de Cliente Regular
     * @param nome
     * @param name
     * @param horasOferta disponíveis
     */
    public ClienteConvidado(String nome, int horasOferta){
        this.setNome(nome);
        this.horasOferta = horasOferta;
    }

    /**
     * @return the horasOferta
     */
    public int getHorasOferta() {
        return horasOferta;
    }

    /**
     * @param horasOferta the horasOferta to set
     */
    public void setHorasOferta(int horasOferta) {
        this.horasOferta = horasOferta;
    }
    
    
    public double vencimento(){
        return 0;
    }
    
    
}
