public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade =  CepApi.getInstancia().recuperarCidade(cep);
        String estado =  CepApi.getInstancia().recuperarEstado(cep);
        CRMService.gravarCliente(nome, cep, cidade, estado);
        CRMService.imprimirCliente(nome,cep,cidade,estado);
    }
}
