package av1_programação_1_sthephany;

public class AV1_Programação_1_STHEPHANY {

    public static void main(String[] args) {
        //Questão 4
        Conta conta1 = new Conta();
        conta1.depositar(500);
        conta1.sacar(5);
               
        
        Conta conta2 = new Conta();
        conta2.depositar(10000);
        
        conta2.transferir(conta1, 1000);
        System.out.println(conta1);
        System.out.println(conta2);
    }
    
}
