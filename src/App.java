import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int opcao;
    System.out.println("Digite qual operação você quer entrar\n 1:Cadastrar produtos\n 2:listar produtos \n 3:Atualizar produto \n 4:Excluir produto \n 0:Sair");
    int operacao = entrada.nextInt();
    do{
        switch (operacao) {
            case 1:
                System.out.println("digite qual produto você quer adicionar");
                String produto = entrada.next();
                System.out.println("qual a quantidade desse produto:");
                int quantidade = entrada.nextInt();
                break;
            case 2:
                System.out.println("lista de produtos");
                break;
            case 3:
                System.out.println("qual produto voce quer atualizar");
                break;
            case 4:
                System.out.println("Selecione o produto que deseja excluir");
                break;
            case 0:
                System.out.println("Parando funcionamento");
            break;
            }
        System.out.println("Digite \n 1:Para Continuar \n 0:Para Sair");
        opcao = entrada.nextInt();
        if (opcao != 0) {
            opcao = operacao;
        }
    }while (opcao != 0);
        System.out.println("sistema encerrado");
        entrada.close();
    }
}



