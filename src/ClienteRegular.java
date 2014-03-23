/**
 *
 * @author Pedro Gomes 1131252
 */
public class ClienteRegular extends Utente {

    /**
     * Mensalidade atribuida a cada regular
     */
    private double mensalidade;

    /**
     * Constroi instancia de Cliente Regular
     * @param nome
     * @param mensalidade 
     */
    public ClienteRegular(String nome, double mensalidade ){
        //why setNome instead this.nome = nome? (as in vencimentos)
        this.setNome(nome);
        this.mensalidade = mensalidade;
    }
    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public double vencimento(){
        return mensalidade;
    }
    
    
}
