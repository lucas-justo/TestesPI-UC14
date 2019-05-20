import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCadastro {
	private static final String KEY = "webdriver.gecko.driver";
	private static final String VALUE = "T:\\DIOGOD\\geckodriver.exe";
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty( KEY , VALUE );		
		pagina = new FirefoxDriver();
		pagina.get("http://localhost/PI-UC14/frmCliente.php");
	}
	
	@Test
	public void test() {
		WebElement nome = pagina.findElementByName("txtNome");
		nome.sendKeys("TesteNome");
		WebElement telefone = pagina.findElementByName("txtTelefone");
		nome.sendKeys("TesteTelefone");
		WebElement email = pagina.findElementByName("txtEmail");
		nome.sendKeys("TesteEmail@gmail.com");
		WebElement cpf = pagina.findElementByName("txtCPF");
		nome.sendKeys("TesteCPF");
		
		Select cidade = new Select(pagina.findElementByName("cidade"));
		cidade.selectByIndex(1);
		
		List<WebElement> radios = pagina.findElementsByName("rbSexo");
		radios.get(0).click();
		
		WebElement foto = pagina.findElementByName("foto");
		foto.sendKeys("C:\\Users\\181710134\\Documents\\totori.jpg");
		
		WebElement senha = pagina.findElementByName("txtSenha");
		nome.sendKeys("TesteSenha");
		WebElement senhaconfirma = pagina.findElementByName("txtSenhaConfirma");
		nome.sendKeys("TesteSenha");
		WebElement salvar = pagina.findElementByName("Salvar");
		salvar.click();
	}
	
	@After
	public void depois() {
		WebElement dropdown = pagina.findElementById("dropdownMenuButton");
		dropdown.click();
		
		WebElement email = pagina.findElementByName("txtLogin");
		email.sendKeys("TesteEmail@gmail.com");
		
		WebElement senha = pagina.findElementByName("txtSenha");
		senha.sendKeys("TesteSenha");
		
		WebElement entrar = pagina.findElementById("btndropdown");
		entrar.click();
		
		try{
			WebElement logado = pagina.findElementByClassName("logado");
			JOptionPane.showMessageDialog(null, "Teste efetuado com sucesso");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "O Teste Falhou");
		}
		
		
	}

}
