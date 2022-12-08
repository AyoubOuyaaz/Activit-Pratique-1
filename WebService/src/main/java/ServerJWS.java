import WebServices.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        //on fait pas localhost car on veut consommer le web service depuis l'extérieur.
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service déployé sur l'adresse http://0.0.0.0:9191/");
    }
}
