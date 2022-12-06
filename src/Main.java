import com.company.bank.model.Cliente;
import com.company.bank.model.Conta;
import com.company.bank.model.ContaCorrente;
import com.company.bank.model.ContaPoupança;

public class Main {
    public static void main(String[] args) {

        Cliente diego = new Cliente();
        diego.setNome("Diego");

        Conta ccDiego = new ContaCorrente(diego);


        ccDiego.depositar(300);
        ccDiego.sacar(297.50);

        ccDiego.imprimirExtrato();


    }
}