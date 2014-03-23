/**
 *
 * @author Pedro Gomes 1131252
 */
public abstract class Trabalhador implements Pessoal {
    
//private double vencimento;

private String nome;

public abstract double vencimento();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

