
public class Main {
    public static void main(String[] args) {

        // Criar fábrica de carro a combustão
        FabricaDeCarros fabricaCombustao = new FabricaCarroCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        carroCombustao.exibirInformacoes();

        // Criar fábrica de carro elétrico
        FabricaDeCarros fabricaEletrico = new FabricaCarroEletrico();
        Carro carroEletrico = fabricaEletrico.criarCarro();
        carroEletrico.exibirInformacoes();





    }
}