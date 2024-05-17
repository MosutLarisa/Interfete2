
public class EmailTransmitter implements Transmitter {

	private final static String TYPE = "EMAIL";
	
	public String getType() {
		return TYPE;
	}

	public void store(Message message) {
		message.setContent(message.getSender().getNume()+" said to "+message.getReceiver().getNume()
				+"("+ message.getSender().getTransmitter().getType()+") : \""+ message.getContent()+ "\"");
		this.retrieve(message.getReceiver(), message);
	}

	public Message retrieve(Person receiver, Message message) {
		System.out.println(message.getContent());
		return message;
	}
}