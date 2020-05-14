package av1_programação_1_sthephany;

public class ContaPoupanca extends Conta {
   private double porcentagemRendimento;
   private int diaRendimento; 

    @Override
    public String toString() {
        return "ContaPoupanca{" + "porcentagemRendimento=" + porcentagemRendimento + ", diaRendimento=" + diaRendimento + '}';
    }
   
   
}
