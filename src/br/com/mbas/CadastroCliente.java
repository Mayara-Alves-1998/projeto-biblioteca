package br.com.mbas;

public class CadastroCliente implements Cliente_Inter {

	final static Double MENSAL_BASICA = 5.0;
	final static Double MENSAL_PREMIUM = 12.0;
	
	private String nome;
	private String sexo;
	private Integer idade;
	private Integer alugados;
	private Double credito;
	private Boolean assinaturaAtiva;
	private Boolean mensalidadePaga;
	private String tipoAssinatura;
	
	public CadastroCliente(String nome, String sexo, Integer idade) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setAlugados(0);
		this.setAssinaturaAtiva(false);
		this.setCredito(0.0);
		this.setMensalidadePaga(false);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String sexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getAlugados() {
		return this.alugados;
	}
	public void setAlugados(Integer alugados) {
		this.alugados = alugados;
	}
	public Double getCredito() {
		return this.credito;
	}
	public void setCredito(Double credito) {
		this.credito = credito;
	}
	public Boolean getAssinaturaAtiva() {
		return this.assinaturaAtiva;
	}
	public void setAssinaturaAtiva(Boolean assAtiva) {
		this.assinaturaAtiva = assAtiva;
	}
	public Boolean getMensalidadePaga() {
		return this.mensalidadePaga;
	}
	public void setMensalidadePaga(Boolean mensalPg) {
		this.mensalidadePaga = mensalPg;
	}
	public String getTipoAssinatura() {
		return this.tipoAssinatura;
	}
	public void setTipoAssinatura(String tipo) {
		this.tipoAssinatura = tipo;
	}

	@Override
	public void apresentarCliente() {
		System.out.println("------------------APRESENTAÇÃO------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Crédito: " + this.getCredito());
		if(this.getAssinaturaAtiva()) {
			System.out.println("Tipo de assinatura: " + this.getTipoAssinatura());
			if(this.getTipoAssinatura() == "Basica") {
				System.out.println("Valor da Mensalidade: " + MENSAL_BASICA);
			} else if (this.getTipoAssinatura() == "Premium") {
				System.out.println("Valor da Mensalidade: " + MENSAL_PREMIUM);
			}
		} else {
			System.out.println("Ainda não é assinante!");
		}
		System.out.println("------------------------------------------------");
	}

	@Override
	public void statusCliente() {
		System.out.println("---------------------STATUS---------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.idade);
		System.out.println("Crédito: " + this.getCredito());
		if(this.getAssinaturaAtiva()) {
			System.out.println("Tipo de assinatura: " + this.getTipoAssinatura());
			if(this.getTipoAssinatura() == "Basica") {
				System.out.println("Valor pago mensalmente: R$" + MENSAL_BASICA);
			} else if (this.getTipoAssinatura() == "Premium") {
				System.out.println("Valor pago mensalmente: R$" + MENSAL_PREMIUM);
			}
			if(this.getMensalidadePaga()) {
				System.out.println("Mensalidade em dia!");
			} else {
				System.out.println("Atenção! Mensalidade em atraso!");
			}
		} else {
			System.out.println("Ainda não é assinante!");
		}
		System.out.println("------------------------------------------------");
	}

	@Override
	public void abrirAssinatura(String tipo, Double credito) {
		if(!this.getAssinaturaAtiva()) {
			if(tipo == "Basica") {
				System.out.println("### Assinatura Basica aberta com sucesso ###");
				this.setAssinaturaAtiva(true);
				this.setCredito(credito);
				this.setTipoAssinatura(tipo);
			} else if(tipo == "Premium") {
				System.out.println("### Assinatura Premium aberta com sucesso ###");
				this.setAssinaturaAtiva(true);
				this.setCredito(credito);
				this.setTipoAssinatura(tipo);
			} else {
				System.err.println("Tipo de assinatura inválido!");
			}
		} else {
			System.err.println("Conta já ativa!");
		}
	}

	@Override
	public void fecharAssinatura() {
		if(this.getAssinaturaAtiva()) {
			if(this.getAlugados() == 0) {
				if(this.getCredito() < 0) {
					System.out.println("Acerte os débitos antes de finalizar a assinatura!");
				} else if(this.getCredito() > 0) {
					System.out.println("Devolva o crédito disponivel antes de finalizar a assinatura");
				} else {
					System.out.println("Assinatura fechada com sucesso!");
					this.setAssinaturaAtiva(false);
				}
			} else {
				System.err.println("A assinatura só pode ser finalizada quando os alugados forem devolvidos!");
			}
		} else {
			System.err.println("Conta já inátiva!");
		}
	}

	@Override
	public void alugar() {
		
	}

	@Override
	public void pagarMensalidade() {
		if(this.getAssinaturaAtiva()) {
			if(this.getTipoAssinatura() == "Basica") {
				System.out.println("Mensalidade basica paga!");
				this.setMensalidadePaga(true);
				this.setCredito(this.getCredito() - MENSAL_BASICA);
			} else if (this.getTipoAssinatura() == "Premium") {
				System.out.println("Mensalidade premium paga!");
				this.setMensalidadePaga(true);
				this.setCredito(this.getCredito() - MENSAL_PREMIUM);
			}
		} else {
			System.err.println("Conta inátiva!");
		}
	}
}
