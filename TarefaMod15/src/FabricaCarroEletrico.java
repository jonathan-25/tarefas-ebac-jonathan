


public class FabricaCarroEletrico implements FabricaDeCarros {


    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }


}
