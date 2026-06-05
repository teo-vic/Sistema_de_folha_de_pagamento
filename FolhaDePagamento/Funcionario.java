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


