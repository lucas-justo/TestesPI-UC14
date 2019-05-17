	import java.util.List;

	import javax.swing.JOptionPane;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TestePagContato{
		
		private static final String KEY = "webdriver.gecko.driver";
		private static final String VALUE = "C:\\Users\\181710122\\Documents\\Automatizados\\eclipse\\geckodriver.exe";

		FirefoxDriver pagina;
		
		@Before
		public void antes(){
			System.setProperty(KEY, VALUE);
			
			pagina = new FirefoxDriver();
			pagina.get("http://localhost/PI-UC14/contato.php");
		}

		
		@Test
		public void test() {
			WebElement nome = pagina.findElementByName("vSCONNOME");
			nome.sendKeys("Lucas Gay");
			
			WebElement email = pagina.findElementByName("vSCONEMAIL");
			email.sendKeys("dolphintech171@gmail.com");
			
			WebElement telefone = pagina.findElementByName("vSCONTELEFONE");
			telefone.sendKeys("30950643");
			
			WebElement endereco = pagina.findElementByName("vSCONENDERECO");
			endereco.sendKeys("Disney Fucking World N° 13");
			
			WebElement mensagem = pagina.findElementByName("vSCONMENSAGEM");
			mensagem.sendKeys("É us guri pae");
			
			WebElement senha = pagina.findElementByXPath("/html/body/div[2]/form/div[8]/input");
			senha.sendKeys("1219978Po");
			
			WebElement confirmaSenha = pagina.findElementByName("txtSenhaConfirma");
			confirmaSenha.sendKeys("1219978Po");
			
			WebElement btnSalvar = pagina.findElementByXPath("/html/body/div[2]/form/div[11]/input[1]");
				btnSalvar.click();
			
			WebElement tabela = pagina.findElementByXPath("/html/body/div[2]/table");
			if(tabela.getText().contains("TesteCadastroCliente")) {
				JOptionPane.showMessageDialog(null, "Teste realizado com sucesso meu mano!");
			}
		}

	}