/**
 *
 * @author Pedro Gomes 1131252
 */
public class ClienteEsporadico extends Utente {

    private int horasUso;
    
    private double precoHora = 5.20f;
    
    /**
     * Constroi instancia de Cliente Esporadico
     * @param nome
     * @param horasUso 
     */
    public ClienteEsporadico(String nome, int horasUso){
        this.setNome(nome);
        this.horasUso = horasUso;
    }

    /**
     * @return the horasUso
     */
    public int getHorasUso() {
        return horasUso;
    }

    /**
     * @param horasUso the horasUso to set
     */
    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    /**
     * @return the precoHora
     */
    public double getPrecoHora() {
        return precoHora;
    }

    /**
     * @param precoHora the precoHora to set
     */
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
    public double vencimento(){
        return horasUso * precoHora;
    }
}
