package Papelaria;

public class lapis extends produto;

private String marca;
private String cor;

 public lapis(String nomeProduto, String codProduto, int quantProduto, double valorTotal, String Marca,String Cor) {
        super(nomeProduto, codProduto, quantProduto, valorTotal);
        this.marca = marca;
        this.cor = cor;
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