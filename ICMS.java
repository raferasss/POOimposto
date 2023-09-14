public class ICMS {
    double aliquota = 0.17;

    double calcular_ICMS(Servico s) {
        double valor =(s.valor*aliquota);
        return valor;
    }
    double calcular_ICMS(Produto p) {
        double valor =(p.valor*aliquota);
        return valor;
    }
}
