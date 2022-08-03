package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Rudolf");
        client.setYear(1995);
        client.setAddress("Budapest");
        System.out.println("név:" + client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Balatonkenese");
        System.out.println(client.getAddress());
    }
}
