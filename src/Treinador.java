/**
 *
 * @author Pedro Gomes 1131252
 */
public class Treinador extends Trabalhador implements Pessoal {

    private double salario;
    
    public Treinador(String nome){
        this.setNome(nome);
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double vencimento(){
        return -salario;
    }
    
    
}
