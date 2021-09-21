package br.com.mbas;

public class ControlePrincipal {

	public static void main(String[] args) {
		
		CadastroCliente c[] = new CadastroCliente[6];
		
		c[0] = new CadastroCliente("Mayara Alves", "Feminino", 23);
		c[1] = new CadastroCliente("Andrea Alves", "Feminino", 44);
		c[2] = new CadastroCliente("Aryadna Seyfarth", "Feminino", 24);
		c[3] = new CadastroCliente("Roberto Silva", "Masculino", 44);
		c[4] = new CadastroCliente("Michelle Santos", "Feminino", 28);
		c[5] = new CadastroCliente("Debora Cruz", "Feminino", 36);
		
		c[0].abrirAssinatura("Basica", 100.0);
		c[0].pagarMensalidade();
		c[0].apresentarCliente();
		c[0].statusCliente();
	}
}
