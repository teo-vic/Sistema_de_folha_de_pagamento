# Classe funcionario

```java
public class Funcionario {
    public String nome;
    public int registro;
    public int tipo;
    public int vendas;
    public double pcomissao;
    public double valor;
    public int producao;

    public Funcionario(String nome, int registro, int tipo){
        this.nome = nome;
        this.registro = registro;
        this.tipo = tipo;
    }

    public double comissao(){
        return vendas * pcomissao / 100;
    }

    public double producao(){
        return valor * producao;
    }
}

```
# Classe principal (Folha de pagamento)

```java
import java.util.Scanner;
import java.util.ArrayList;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        final double salariobase = 2000.00;

        int opcao = 0;
        int vendas = 0;
        double pcomissao = 0.0;
        double valor = 0.0;
        int producao = 0;

        do{
            System.out.println(" ===MENU===");
            System.out.println("1 - Cadastrar Funcionario Padrao");
            System.out.println("2 -Cadastrar Funcionario Comissionado");
            System.out.println("3 - Cadastrar Funcionario Producao");
            System.out.println("4 - Exibir Folha de Pagamento");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: 
                System.out.println("Digite o nome do funcionario: ");
                String nome1 = sc.nextLine();
                
                System.out.println("Digite o registro do funcionario: ");
                int registro1 = sc.nextInt();
                
                Funcionario funcionario1 = new Funcionario(nome1, registro1, 1);
                funcionarios.add(funcionario1);
                break;

                case 2:
                System.out.println("Digite o nome do funcionario: ");
                String nome2 = sc.nextLine();
                
                System.out.println("Digite o registro do funcionario: ");
                int registro2 = sc.nextInt();
               
                System.out.println("Digite o percentual de comissão: ");
                pcomissao = sc.nextDouble();
                
                System.out.println("Digite o valor obtido pelas vendas: ");
                vendas = sc.nextInt();
                
                Funcionario funcionario2 = new Funcionario(nome2, registro2, 2);
                funcionario2.vendas = vendas;
                funcionario2.pcomissao = pcomissao;

                funcionarios.add(funcionario2);
                break;

                case 3:
                System.out.println("Digite o nome do funcionario: ");
                String nome3 = sc.nextLine();
                
                System.out.println("Digite o registro do funcionario: ");
                int registro3 = sc.nextInt();
                
                System.out.println("Digite o valor da produção: ");
                valor = sc.nextDouble();
                
                System.out.println("Digite a quantidade produzida: ");
                producao = sc.nextInt();
                
                Funcionario funcionario3 = new Funcionario(nome3, registro3, 3);
                funcionario3.valor = valor;
                funcionario3.producao = producao;
                
                funcionarios.add(funcionario3);
                break;

                case 4:
                   System.out.println("Total de pessoas cadastradas: " + funcionarios.size()); 
                for (int i = 0; i < funcionarios.size(); i++){
                        System.out.println("---------------------------------");
                        System.out.println("Nome: " + funcionarios.get(i).nome); 
                        System.out.println("Matrícula: " + funcionarios.get(i).registro);    
                        
                        if(funcionarios.get(i).tipo == 1){
                            System.out.println("Salário base: " + salariobase);
                            System.out.println("Extras: " + 0.0);
                            System.out.println("Salário total: " + salariobase);
                        }else if(funcionarios.get(i).tipo == 2){
                            System.out.println("Salário base: " + salariobase);
                            System.out.println("Extras: " + funcionarios.get(i).comissao());
                            System.out.println("Salário total: " + (salariobase + funcionarios.get(i).comissao()));
                        }else if(funcionarios.get(i).tipo == 3){
                            System.out.println("Salário base: " + salariobase);
                            System.out.println("Extras: " + funcionarios.get(i).producao());
                            System.out.println("Salário total: " + (salariobase + funcionarios.get(i).producao()));
                        }

                    }
                    break;

                case 0:
                    System.out.println("programa encerrado");
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;

            }
        }while (opcao != 0);

        sc.close();

    

    }

}

    
```

