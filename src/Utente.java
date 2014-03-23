import java.text.DecimalFormat;

/**
 * Representa um utente através de nome, género, idade, altura e peso.
 * @author Pedro Gomes 1131252
 *
 */
public abstract class Utente implements Pessoal {
	
	/**
	 * Nome do Utente.
	 */
	
	private String nome;
	
	/**
	 * Género do Utente.
	 */
	
	private String genero;
	
	/**
	 * Idade do Utente.
	 */
	
	private int idade;
	
	/**
	 * Altura do Utente em metros.
	 */
	
	private double altura;
	
	/**
	 * Peso do Utente em kg.
	 */
	
	private double peso;
	
	/** 
	 * Constroi uma instância de Utente recebendo nome, género, idade, peso e altura.
	 * @param nome Nome do Utente
	 * @param genero Género do Utente
	 * @param idade Idade do Utente
	 * @param peso Peso do Utente
	 * @param altura Altura do Utente
	 */
	public Utente(String nome, String genero, int idade, double peso, double altura){
		this.nome=nome;
		this.genero=genero;
		this.idade=idade;
		this.peso=peso;
		this.altura=altura;
	}
	/** 
	 * Constroi uma instância de utente vazia.
	 */
	public Utente(){
		this("","",0,0,0);
	}
	
	/**
	 * Constroi uma instância de Utente com os argumentos recebidos por parâmetro.
	 * @param outroUtente características a copiar
	 * @see . Usado para instanciar a partir de argumentos incompletos? ou constructor cópia?
	 */
	public Utente(Utente outroUtente){
		this(outroUtente.getNome(),
				outroUtente.getGenero(), outroUtente.getIdade(),
				outroUtente.getPeso(),outroUtente.getAltura());
	}
	/**
	 * @return nome do utente.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome define o nome do utente.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return genero do Utente.
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero define o genero do utente.
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return idade do utente.
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade define idade do utente
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return altura do utente.
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura define altura do utente.
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return peso do utente.
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso devolve o peso do utente.
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * Calcula Índice de Massa Corporal do Utente.
	 * @return IMC do Utente
	 */
	public double imc(){
		return peso/(altura*altura);
	}
	
	/**
	 * Determina o grau de obesidade do Utente.
	 * @return1 Magro se IMC menor a 18
	 * @return2 Saudável se IMC entre 18 e 25
	 * @return3 Obeso se IMC maior a 25
	 */
	
	private static int factorObeso = 25;
	private static int factorMagro = 18;
	
	public String grauObesidade(){
			if(imc() < Utente.factorMagro)
				return "Magro";
			else if(imc() >= Utente.factorMagro && imc() <= Utente.factorObeso)
				return "Saudável";
			else
				return "Obeso";
	}

	/**
	 * @param factorObeso Define novo factor de obesidade.
	 */
	public static void setFactorObeso(int factorObeso) {
		Utente.factorObeso = factorObeso;
	}
	/**
	 * @param factorMagro Define novo factor de magreza.
	 */
	public static void setFactorMagro(int factorMagro) {
		Utente.factorMagro = factorMagro;
	}
	/**
	 * Devolve o nome, imc e grau de obesidade do utente.
	 */
	
	public String toString() {
		
		DecimalFormat format = new DecimalFormat("#.0");
		
		return  nome + ": IMC:" + format.format(imc()) + "   Grau de Obesidade: " + grauObesidade();
		//return nome + ": IMC:" + (int) imc() + ", grau de Obesidade: " + 
	}
       
        public abstract double vencimento();
	
	}
	
	
	
	


