package com.example.model;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static int ticketCounter = 1;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    private String username;

    private int numberOfTickets;

    // Constructors

    public Ticket() {
    }

    public Ticket(Train train, String username, int numberOfTickets) {
        this.train = train;
        this.username = username;
        this.numberOfTickets = numberOfTickets;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", train=" + train +
                ", username='" + username + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }

	public static int getTicketCounter() {
		return ticketCounter;
	}

	public static void setTicketCounter(int ticketCounter) {
		Ticket.ticketCounter = ticketCounter;
	}

	public String getTicketNumber() {
		// TODO Auto-generated method stub
		return null ;
	}
}
