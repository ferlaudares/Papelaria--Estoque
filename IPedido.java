import java.util.List;

// Interface IPedido
public interface IPedido{
    List<String> getItem();
    double calculaTotal();
    String formaPagamento();
}