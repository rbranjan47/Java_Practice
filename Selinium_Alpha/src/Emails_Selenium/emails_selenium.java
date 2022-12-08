package Emails_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class emails_selenium {
	public static void main(String[] args) throws IOException, EmailException {
		Properties properties_data = new Properties();
		// System.getProperty("user.dir")+"\\Emails_Data\\emails_data.txt"
		FileInputStream fs = new FileInputStream("./Emails_Data/emails_data.txt");
		properties_data.load(fs);

		extracted();
		System.out.println("email sent");
	}

	private static void extracted() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setSSLOnConnect(true);
		email.setFrom("rbranjan47@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("kumar.rabi@thinksys.com");
		email.send();
	}
}
