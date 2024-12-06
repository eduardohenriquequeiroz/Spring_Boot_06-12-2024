import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Enderecos {


	@GetMapping
	public String oi() {
		return "O que deseja fazer";
	}
	@GetMapping(path = "/compra")
	public String compra() {
		return "O que precisa comprar?";
	}
	@GetMapping(path = "/vendas")
	public String vendas() {
		return "O que deseja vender?";
	}
	@GetMapping(path = "/estoque")
	public String estoque() {
		return "Quantidade no estoque: 0";
	}



	@GetMapping(path = "/Users")
	public String Users() {
		return "Usuarios:";
	}
	@GetMapping(path = "/Funcionarios")
	public String Funcionarios() {
		return "Funcionarios:";
	}
	@GetMapping(path = "/Visitantes")
	public String Visitantes() {
		return "Visitantes:";
	}
	@GetMapping(path = "/Adimin")
	public String Adimin() {
		return "AdiminS:";
	}
}