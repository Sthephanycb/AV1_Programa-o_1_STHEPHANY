package av1_programação_1_sthephany;
// Questão 2: Classe conta, visibilidade e encapsulamento.
public class Conta {
    private String conta;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    
    //métodos da conta: sacar, depositar, transferir
    public void depositar(double valor){
        if (valor > 0)  {  
        saldo += valor;
        }
    }
    public void sacar(double valor){
            saldo -= valor;
    }
    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
    

//métodos get e set
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
//Questão 3: método toString que retorna infromações da conta 

    @Override
    public String toString() {
        return "Conta{" + "conta=" + conta + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + '}';
    }
   
                 
  
     
   
    
 
}