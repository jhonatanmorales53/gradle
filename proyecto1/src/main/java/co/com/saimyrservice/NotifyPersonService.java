package co.com.saimyrservice;

import co.com.saimyrdomain.Persona;

public class NotifyPersonService {

	private EmailService emailService;

	public NotifyPersonService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public String notify(Persona person){
		String message = "welcome" + person.getName();
		return emailService.sendEmail(message);
	}
}
