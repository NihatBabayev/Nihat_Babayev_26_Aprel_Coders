package az.coders.chapter1.lesson17;

import az.coders.chapter1.lesson1.Main;

import java.util.ArrayList;
import java.util.List;

public class FourthProblem {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Nihat","Babayev", "n.babayev@ufaz.az","0503070524"));
        clients.add(new Client("Murad","Baghirli", "m.baghirli@ufaz.az","0509899768"));
        clients.add(new Client("Valeh","Ismayilov", "v.ismayilov@ufaz.az","0517592669"));
        clients.add(new Client("Ismayil","Abdullazada", "i.abdullazada@ufaz.az","0707293809"));

        Client testClient = new Client("test", "TEST", "ghj","fgh"//for testing addClient method
        );
        ClientController controller = new ClientController(clients);//creating our controller

        controller.addClient(testClient);
        System.out.println(controller.clientList);//list after adding client

        controller.deleteClient(0);//deleting client with index
        System.out.println(controller.clientList);

        System.out.println(controller.findByEmail("m.baghirli@ufaz.az")); //finding by email





    }
}
class Client{
    String name;
    String surname;
    String email;
    String phoneNumber;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Client(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
class ClientController{
    public List<Client> clientList;

    public ClientController(List<Client> clientList) {
        this.clientList = clientList;
    }

    void addClient(Client newClient){
        clientList.add(newClient);
    }
    void deleteClient(int index){
        clientList.remove(index);
    }
    Client findByEmail(String email){
        for (Client client:
             clientList) {
            if (client.email.equals(email)){
                return client;
            }
        }
        return clientList.get(0);

    }

}