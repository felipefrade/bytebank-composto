public class TestaBanco {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.nome = "Felipe Frade";
        felipe.cpf = "123.123.123-00";
        felipe.profissao = "programador";

        Conta contaDoFelipe = new Conta();
        contaDoFelipe.deposita(100);

        // associa o cliente Felipe a conta contrDoFelipe
        contaDoFelipe.titular = felipe;
        System.out.println(contaDoFelipe.titular.nome);
        System.out.println(contaDoFelipe.titular);
        System.out.println(felipe);
    }
}
