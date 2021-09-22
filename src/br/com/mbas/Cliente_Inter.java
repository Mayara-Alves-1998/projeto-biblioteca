package br.com.mbas;

public interface Cliente_Inter {

	public abstract void apresentarCliente();
	public abstract void statusCliente();
	public abstract void abrirAssinatura(String tipo, Double credito);
	public abstract void fecharAssinatura();
	public abstract void pagarMensalidade();
}
