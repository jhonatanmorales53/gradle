package co.com.saimyrtestservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.com.saimyrdomain.Persona;
import co.com.saimyrservice.EmailService;
import co.com.saimyrservice.NotifyPersonService;
import co.com.saimyrtestdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {

	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup(){
		//emailService = new EmailService();
		emailService = Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest(){
		//Arrange - preparar datos
		Persona person = new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendEmail(Mockito.anyString())).thenReturn(null);
		//Actv - ejecutar
		String message = notifyPersonService.notify(person);
		//Assert - verificar
		Assert.assertNotNull(message);
	}
}
