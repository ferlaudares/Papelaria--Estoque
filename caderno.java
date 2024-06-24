package Papelaria;

public class caderno extends produto;

private String marca;
private String cor;
private String tamanho;


 public caderno(String nomeProduto, String codProduto, int quantProduto, double valorTotal, String marca,String cor, String tamanho) {
        super(nomeProduto, codProduto, quantProduto, valorTotal);
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarcar() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

     public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

     public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }