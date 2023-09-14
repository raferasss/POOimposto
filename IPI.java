public class IPI {
    double aliquota = 0.25;

    double calcular_IPI(Produto p) {
        double valor = p.valor + (aliquota*p.valor);
        return valor;
    }
}
