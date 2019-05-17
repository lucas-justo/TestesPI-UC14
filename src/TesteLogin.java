import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteLogin {
	private static final String KEY = "webdriver.gecko.driver";
	private static final String VALUE = "C:\\Users\\181710134\\Desktop\\Automatizados\\eclipse\\geckodriver.exe";
	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty( KEY , VALUE );
		
		pagina = new FirefoxDriver();
		pagina.get("http://localhost/PI-UC14/index.php");
	}
	
	@Test
	public void test() {
	WebElement dropdown = pagina.findElementById("dropdownMenuButton");
	dropdown.click();
	
	WebElement email = pagina.findElementByName("txtLogin");
	email.sendKeys("usuarioerrado");
	
	WebElement senha = pagina.findElementByName("txtSenha");
	senha.sendKeys("senhaerrada");
	
	WebElement entrar = pagina.findElementById("btndropdown");
	entrar.click();
	
	}
	
	@After
	public void depois() {
		try{
			WebElement logado = pagina.findElementByClassName("logado");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Teste efetuado com sucesso");
		}
		
	}

}
