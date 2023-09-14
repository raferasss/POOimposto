public class ISS {
    double aliquota = 0.046;

    double calcular_ISS(Servico s) {
        double valor = (s.valor*aliquota);
        return valor;
    }
}
