package Clases;

/**
 * Class to store information about reservations.
 * @author sheilaRodríguez.
 */
public class Reservation
{
    private Client client;
    private int reservationCode;
    private String reservationDate;
    private String reservationHour;
    private int numberOfDiners;
    private String reservationState;

    public Reservation(Client client, int reservationCode, String reservationDate,
                            String reservationHour, int numberOfDiners, String reservationState)
    {
        this.client = client;
        this.reservationCode = reservationCode;
        this.reservationDate = reservationDate;
        this.reservationHour = reservationHour;
        this.numberOfDiners = numberOfDiners;
        this.reservationState = reservationState;
    }

    public Reservation()
    {
        reservationCode = 0;
        reservationDate = " ";
        reservationHour = " ";
        numberOfDiners = 0;
        reservationState = " ";
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(int reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationHour() {
        return reservationHour;
    }

    public void setReservationHour(String reservationHour) {
        this.reservationHour = reservationHour;
    }

    public int getNumberOfDiners() {
        return numberOfDiners;
    }

    public void setNumberOfDiners(int numberOfDiners) {
        this.numberOfDiners = numberOfDiners;
    }

    public String getReservationState() {
        return reservationState;
    }

    public void setReservationState(String reservationState) {
        this.reservationState = reservationState;
    }

    @Override
    public String toString()
    {
        return "Client: " + client + "\n" +
                "Reservation code: " + reservationCode + "\n" +
                "Date and hour: " + reservationDate + reservationHour + "\n" +
                "Number of diners: " + numberOfDiners + "\n" +
                "Reservation state: " + reservationState;
    }
}
