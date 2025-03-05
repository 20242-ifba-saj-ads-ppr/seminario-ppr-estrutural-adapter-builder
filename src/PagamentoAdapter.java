public class PagamentoAdapter implements Pagamento {
    private SistemaPagamentoAntigo sistemaPagamentoAntigo;

    public PagamentoAdapter(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
        this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    }

    @Override
    public void realizarPagamento(double valor) {
        String valorFormatado = String.format("%.2f", valor);
        sistemaPagamentoAntigo.efetuarPagamento(valorFormatado);
    }
     
}
