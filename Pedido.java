import java.util.ArrayList;
import java.util.List;

// Classe Pedido implementa interface IPedido
public class Pedido implements IPedido {
    private Data data;
    private int idPedido;
    private Cliente cliente;
    private String status;
    private List<Produto> produtos;
    private String formaPagamento;

    public Pedido(Data data, int idPedido, Cliente cliente, String status) {
        this.data = data;
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.status = status;
        this.produtos = new ArrayList<>();
    }

    public List<String> getProdutos() {
        List<String> nomesProdutos = new ArrayList<>();
        for (Produto produto : produtos) {
            nomesProdutos.add(produto.getNomeProduto());
        }
        return nomesProdutos;
    }

    @Override
    public double calculaTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValorTotal();
        }
        return total;
    }

    @Override
    public String formaPagamento() {
        return this.formaPagamento;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void definirFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}

