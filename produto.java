package Papelaria;

public class produto {
    private String nomeProduto;
    private String codProduto;
    private int quantProduto;
    private double valorTotal;

    public produto(String nomeProduto, String codProduto, int quantProduto, double valorTotal) {
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.quantProduto = quantProduto;
        this.valorTotal = valorTotal;
    }

    // métodos getters e setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCodProduto() {
        return codProduto;

    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;

    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto() {
        this.quantProduto = quantProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.quantProduto = quantProduto;
    }
    
    //Metódos para adicionar item ao estoque
    public void AddEstoque(int quantidade) {
        this.quantProduto += quantidade;
    }

   //Metódos para remover item do estoque
    public void RemovEstoque(int quantidade) {
        if (this.quantProduto >= quantidade) {
            this.quantProduto -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
