
public class Teste {

	
	public static void main(String[] args) {
                /*
		Utente u1 = new Utente("John Galt       ", "Masculino", 36, 90, 1.86 );
		System.out.println(u1.toString());
		Utente u2 = new Utente("Marcus Aurelios ", "Masculino", 52, 72, 1.81);
		System.out.println(u2.toString());
		Utente u3 = new Utente("Seneca          ", "Masculino", 43, 58, 1.80);
		System.out.println(u3.toString());
                */
                ClienteRegular CR1 = new ClienteRegular("Arnold Schwarzenegger", 45);
                ClienteRegular CR2 = new ClienteRegular("Clint Eastwood", 40);
                ClienteEsporadico CE1 = new ClienteEsporadico("Shwarznegger", 3);
                ClienteConvidado CC1 = new ClienteConvidado("Seneca", 8);
                ClienteConvidado CC2 = new ClienteConvidado("Marcus Aurelios", 2);
                Treinador T1 = new Treinador("Epictetus");
                Funcionario F1 = new Funcionario("Cicero", 2);
                Funcionario F2 = new Funcionario("Zeno", 15);
                
                Pessoal[] utilizadoresGinasio = new Pessoal[8];
                utilizadoresGinasio[0] = CR1;
                utilizadoresGinasio[1] = CR2;
                utilizadoresGinasio[2] = CE1;
                utilizadoresGinasio[3] = CC1;
                utilizadoresGinasio[5] = T1;
                utilizadoresGinasio[6] = F1;
                utilizadoresGinasio[7] = F2;
                
                double balanco = 0;
                int clientesMensal = 0;
                int trabalhadores = 0;
                
                for(int i=0;i<utilizadoresGinasio.length;i++){
                 if(utilizadoresGinasio[i] != null)
                     if(utilizadoresGinasio[i].vencimento() != 0){
                        System.out.printf( "%+.1f%s%n", utilizadoresGinasio[i].vencimento(), " €");
                        balanco += utilizadoresGinasio[i].vencimento();
                        if(utilizadoresGinasio[i].vencimento() < 0)
                            trabalhadores++;
                        else
                            clientesMensal++;
                        
                     }  
                }
                System.out.printf("Saldo do Ginásio: %.2f%n ", balanco );
                System.out.println("Clientes com Mensalidade: " + clientesMensal);
                System.out.println("Funcionários + Treinadores: " + trabalhadores);
                
                
		/*
		System.out.println("\nNovos factores de obesidade: 18 e 24");
		Utente.setFactorMagro(18);
		Utente.setFactorObeso(24);
		
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
                */
		

	}

}
