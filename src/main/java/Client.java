public class Client {

    private String clientSecondName;
    private String clientFirstName;
    private String clientPatronymic;
    private String clientAddress;
    private long clientCardNumber;
    private double clientDebit;
    private double clientCredit;
    private double clientLocalCallTime;
    private double clientDistanceCallTime;

    public String getClientSecondName() {
        return clientSecondName;
    }

    public double getClientLocalCallTime() {
        return clientLocalCallTime;
    }

    public double getClientDistanceCallTime() {
        return clientDistanceCallTime;
    }

    public Client(String clientSecondName, String clientFirstName, String clientPatronymic,
                  String clientAddress, long clientCardNumber, double clientDebit,
                  double clientCredit, double clientLocalCallTime, double clientDistanceCallTime) {

        this.clientSecondName = clientSecondName;
        this.clientFirstName = clientFirstName;
        this.clientPatronymic = clientPatronymic;
        this.clientAddress = clientAddress;
        this.clientCardNumber = clientCardNumber;
        this.clientDebit = clientDebit;
        this.clientCredit = clientCredit;
        this.clientLocalCallTime = clientLocalCallTime;
        this.clientDistanceCallTime = clientDistanceCallTime;
    }

    public String toString(){
        return String.format("Client: %s %s %s",clientSecondName, clientFirstName,  clientPatronymic) + "\n" +
                String.format("\t\tCardNumber: %d\t Debit: %10.2f\t  Credit: %10.2f.", clientCardNumber, clientDebit,
                        clientCredit) + "\n" + "\t\tLocal time: " + clientLocalCallTime + "min,\t Distant time: "
                        + clientDistanceCallTime + "min.";
    }
}
