package Open_Closed_Principle;

public class FolhaDePagamento {
	
	protected double saldo;

	
	public void calcularsalario(funcionario) {
		
		if(funcionario.ContratoClt) {
			this.saldo = funcionario.salario();
		}else{
			if (funcionario.Estagio){
				this.saldo = funcionario.bolsaAuxilio();
			}
		}
	}	
	




