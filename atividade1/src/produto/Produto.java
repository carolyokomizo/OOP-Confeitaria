package produto;

public class Produto {
    private int codigo;
    private int fabricanteNumero;
    private String fabricanteNome;
    private String nomeProduto;
    private String descricao;
    private double custo;
    private int estoque;
    
    // Método para inserir os dados do produto
    public void inserirDados(int codigo, int fabricanteNumero, String fabricanteNome,
                             String nomeProduto, String descricao, double custo, int estoque) {
        this.codigo = codigo;
        this.fabricanteNumero = fabricanteNumero;
        this.fabricanteNome = fabricanteNome;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.custo = custo;
        this.estoque = estoque;
    }
    
    // Método para calcular o valor de venda do produto
    public double calcularValorVenda(double margemLucro) {
        return custo * (1 + margemLucro);
    }
    
    // Método para mostrar todos os dados do produto
    public void mostrarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Fabricante Número: " + fabricanteNumero);
        System.out.println("Fabricante Nome: " + fabricanteNome);
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Custo: " + custo);
        System.out.println("Estoque: " + estoque);
    }
}
