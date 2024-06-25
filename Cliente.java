package Papelaria;

public class Cliente {
	private String nomeCliente;
	private String endereco;
	private int cpf;
	private int telefone;
	private int idCliente;
	
//Construtores da Classe Cliente
public Cliente(String nomeCliente, String endereco, int cpf, int telefone, int idCliente) {
    this.nomeCliente = nomeCliente;
    this.endereco = endereco;
    this.cpf = cpf;
    this.telefone = telefone;
    this.idCliente = idCliente;
}

//Getters e Setters dos atributos da Classe Cliente
public String getNomeCliente() {
    return nomeCliente;
}


public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
}


public String getEndereco() {
    return endereco;
}


public void setEndereco(String endereco) {
    this.endereco = enderec…
}
}