public class Main {
    public static void main(String[] args) {
        
    Cliente aline = new Cliente();
    aline.setNome("Aline");

    ContaCorrente cc = new ContaCorrente(aline);  
    ContaPoupanca poupanca = new ContaPoupanca(aline);

    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
    
    }
    
}
