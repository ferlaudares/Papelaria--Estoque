package Papelaria;

public class Fornecedor {
private String nomeFornecedor;
private String endereco;
private int cnpj;
private int telefone;
private int idCliente;

//Construtores da Classe Fornecedor
public Fornecedor(String nomeFornecedor, String endereco, int cnpj, int telefone, int idCliente) {
    this.nomeFornecedor = nomeFornecedor;
    this.endereco = endereco;
    this.cnpj = cnpj;
    this.telefone = telefone;
    this.idCliente = idCliente;
}
//Getters e Setters dos atributos da Classe Fornecedor
public String getNomeFornecedor() {
    return nomeFornecedor;
}

public void setNomeFornecedor(String nomeFornecedor) {
    this.nomeFornecedor = nomeFornecedor;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public int getCnpj() {
    return cnpj;
}

public void setCnpj(int cnpj) {
    this.cnpj = cnpj;
}

public int getTelefone() {
    return telefone;
}

public void setTelefone(int telefone) {
    this.telefone = telefone;
}

public int getIdCliente() {
    return idCliente;
}

public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
}
}