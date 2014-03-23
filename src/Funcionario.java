/**
 *
 * @author Pedro Gomes 1131252
 */
public class Funcionario extends Trabalhador implements Pessoal  {

    private double salarioBase = 750;
    
    private int comissao = 6;
    
    private int utentesAngariados;
    
    public Funcionario(String nome, int utentesAngariados){
        this.setNome(nome);
        this.utentesAngariados = utentesAngariados;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the comissao
     */
    public int getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
    
    public double vencimento(){
        return -(salarioBase + comissao*utentesAngariados);
    }

    /**
     * @return the utentesAngariados
     */
    public int getUtentesAngariados() {
        return utentesAngariados;
    }

    /**
     * @param utentesAngariados the utentesAngariados to set
     */
    public void setUtentesAngariados(int utentesAngariados) {
        this.utentesAngariados = utentesAngariados;
    }
    
    
}
