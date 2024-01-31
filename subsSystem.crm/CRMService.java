public class CRMService {

    private CRMService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no systema...");
       
    }

    public static void imprimirCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente "+nome+", reside em "+cidade+"-"+estado+", CEP: "+cep+"." );
    }
}
