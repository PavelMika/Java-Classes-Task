import java.util.ArrayList;

public class ClientInformation {
    public static void main(String[] args) {

        MobileOperator operator = new MobileOperator();
        operator.addClient(new Client("Зябликов","Артур", "Петрович",
                "Минск, Кальварийская 21, кв.17.", 8365479658741236L,8965.63,
                300.2, 456,42));
        operator.addClient(new Client("Литехин","Максим","Андреевич",
                "Минск, Пушкина 83, кв.45.", 1458796325412358L,276.50,
                856.35,345,0));
        operator.addClient(new Client("Андропов","Петр","Максимович",
                "Минск, Рафиева 16, кв.89.", 2354789632145698L,5659.56,
                46.34,225,0));
        operator.addClient(new Client("Копытина","Анастасия","Сегеевна",
                "Минск, Машиностроителей 10, кв.23.", 8789654789654214L,294.35,
                850.35, 656,35));
        operator.addClient(new Client("Мормышкина","Зинаида","Алексеевна",
                "Минск, Победителей 156, кв.36.", 8963214769854126L,336.98,
                45.75,1089,15));
        System.out.println("Clients sorted by name:");

        ArrayList<Client> listName = operator.getClientListSortByABC();
        for (Client client : listName) {
            System.out.println(client);
        }

        System.out.println("\n\nClients who have exceeded the call time to local numbers by 500min:");
        ArrayList<Client> listLocal = operator.getClientListSortWithExceedingMinutesOnLocal(500);
        for (Client client : listLocal) {
            System.out.println(client);
        }

        System.out.println("\n\nClients who called long distance numbers:");
        ArrayList<Client> listInternational = operator.getClientListWithDistanceNumbers(0);
        for (Client client : listInternational) {
            System.out.println(client);
        }

    }
}
