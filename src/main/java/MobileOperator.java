import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MobileOperator {
    private ArrayList<Client> clientList = new ArrayList<>();

    void addClient(Client client){
        clientList.add(client);
    }

    public  ArrayList<Client> getClientListSortWithExceedingMinutesOnLocal(long clientLocalCallTime){
        ArrayList<Client> clientArrayList = new ArrayList<>();
        for (Client client : clientList){
            if (client.getClientLocalCallTime() > clientLocalCallTime){
                clientArrayList.add(client);
            }
        }
        return clientArrayList;
    }

    public ArrayList<Client> getClientListWithDistanceNumbers(long clientDistanceCallTime){
        ArrayList<Client> clientArrayList = new ArrayList<>();
        for (Client client : clientList){
            if (client.getClientDistanceCallTime() > clientDistanceCallTime){
                clientArrayList.add(client);
            }
        }
        return clientArrayList;
    }

    public ArrayList<Client> getClientListSortByABC(){
        ArrayList<Client> clientArrayList = new ArrayList<>(clientList);
        Collections.sort(clientArrayList, new Comparator<Client>() {
            @Override
            public int compare(Client client1, Client client2) {
                return client1.getClientSecondName().compareToIgnoreCase(client2.getClientSecondName());
            }
        });
        return clientArrayList;
    }


}
