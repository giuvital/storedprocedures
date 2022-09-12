package model;

import java.sql.SQLException;
import java.util.Date;

import persistence.ClienteDao;
import persistence.GenericDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClienteDao cd = new ClienteDao(new GenericDao());

		//Cliente c = cd.selectOne("12345678911");
		//System.out.println(c);

		// List<Cliente> clientes = cd.selectAll();
		// clientes.forEach(c -> System.out.println(c.toString()));

		Cliente cliente = new Cliente("12345678911", "Vital", "giullia.vital@gmail.com", 100.90, new Date());
		cd.update(cliente);
		// cd.insert(cliente);
		// cd.delete(cliente.getCpf());
	}
}
