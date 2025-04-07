public class ClienteAcademia implements ContaCliente{
    private String nome;
    private int idade;
    private double mensalidade;

    public ClienteAcademia(String nome, int idade) {
        if(idade < 12) {
            throw new IllegalArgumentException("Idade mínima deve ser maior que 12");
        }
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void pagarMensalidade(double mensalidade) {
        if (mensalidade < 0) {
            System.out.println("Erro: A mensalidade não pode ser negativa");
        } else {
            this.mensalidade = mensalidade;
            System.out.println("Mensalidade pagada com sucesso!");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 12) {
            throw new IllegalArgumentException("Idade deve ser maior que 12");
        }
        else {
            this.idade = idade;
        }

    }

    public void setMensalidade(double mensalidade) {
        if(mensalidade < 0) {
            System.out.println("Erro: A mensalidade não pode ser negativa");
        }
        else {
            this.mensalidade = mensalidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}

