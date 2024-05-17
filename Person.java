
public class Person {

	private String nume;
	private Transmitter transmitter;
	
	public Person(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public Transmitter getTransmitter() {
		return transmitter;
	}

	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
		
	}
	
	public void send(Person receiver, String message) {
		Message m = new Message(this, receiver, message);
		transmitter.store(m);
	}
	
	
}