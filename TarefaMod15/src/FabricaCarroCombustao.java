


public class FabricaCarroCombustao implements FabricaDeCarros {


    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

}
