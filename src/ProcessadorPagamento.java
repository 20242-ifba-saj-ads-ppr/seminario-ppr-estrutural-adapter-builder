public class ProcessadorPagamento {
        public void processarPagamento(Pagamento pagamento, double valor) {
        pagamento.realizarPagamento(valor);
    }
    
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        
        Pagamento pagamentoModerno = new Pagamento() {
            @Override
            public void realizarPagamento(double valor) {
                System.out.println("Pagamento realizado pelo sistema moderno no valor de: " + valor);
            }
        };
        
        processador.processarPagamento(pagamentoModerno, 150.00);
        
        SistemaPagamentoAntigo sistemaLegado = new SistemaPagamentoAntigo();
        Pagamento pagamentoLegado = new PagamentoAdapter(sistemaLegado);
        

        processador.processarPagamento(pagamentoLegado, 200.00);
    }
}
