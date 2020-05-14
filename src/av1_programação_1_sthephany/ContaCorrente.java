package av1_programação_1_sthephany;
//Questão 5 criar classes conta corrente, e poupança
public class ContaCorrente extends Conta {
    private double taxaAdministracao;
    private double limite;

    @Override
    public String toString() {
        return "ContaCorrente{" + "taxaAdministracao=" + taxaAdministracao + ", limite=" + limite + '}';
    }
    
    
}
