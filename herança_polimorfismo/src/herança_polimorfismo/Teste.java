package herança_polimorfismo;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica pessoa1 = new PessoaFisica("David", 7500);
		System.out.println(pessoa1.toString());

		PessoaJuriduca pessoa2 = new PessoaJuriduca("Jéssica", 1500);
		System.out.println(pessoa2.toString());

	}

}
