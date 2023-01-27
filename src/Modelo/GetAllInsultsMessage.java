package Modelo;

public class GetAllInsultsMessage implements MessageInterface{
	String message;
	ActorInterface sender;


	public GetAllInsultsMessage(ActorInterface sender, String message){
		this.sender=sender;
		this.message= message;
	}

	public String getMessage() {

		return message;
	}

	@Override
	public void setMessage(String message) {

		this.message= message;
	}

	@Override
	public ActorInterface getSender() {
		return sender;
	}

	@Override
	public void setSender(ActorInterface sender) {
		this.sender= sender;
	}
	public String toString() {
		return "El mensaje fue enviado por" + this.sender + "\nMSG getallinsults message: "+this.message;
	}
}
