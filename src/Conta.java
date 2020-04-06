public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    //Declarando um método:
    void deposita(double valor){    //Quando não retorna nada como  resposta, é necessário utilizar o void
        //this.saldo = this.saldo + valor;   Indicando que a conta que ele irá alterar o valor é a conta que invocou o método o new Conta();
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            // this.saldo = this.saldo - valor;   // Forma mais complexa de escrever variavel recebe ela mesma - valor
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    // Método criado para retornar o saldo, pois agora não conseguimos mais acessá-lo pois é do tipo private. Portanto é necessário criar um método para isso.
    public double getSaldo(){
        return this.saldo;
    }
}
