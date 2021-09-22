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
		
		c[2].abrirAssinatura("Premium", 120.0);
		c[2].pagarMensalidade();
		c[2].statusCliente();
		
		CadastroLivros l[] = new CadastroLivros[5];
		
		l[0] = new CadastroLivros("Assassinato no Expresso do Oriente", "Agatha Christie");
		l[1] = new CadastroLivros("Assassinato na Mesopotamia", "Agatha Christie");
		l[2] = new CadastroLivros("Um corpo na biblioteca", "Agatha Christie");
		l[3] = new CadastroLivros("O caso dos 10 negrinhos", "Agatha Christie");
		l[4] = new CadastroLivros("Assassinato no Rio Nilo", "Agatha Christie");
		
		l[0].status();
		
	}
}
