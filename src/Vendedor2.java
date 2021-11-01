import java.time.LocalDate;
import java.time.Month;

public class Vendedor2 {

    public static void main(String[] args) {
      //Tipo nome = new Vendedor();

  Vendedor marcio = new Vendedor();
  Vendedor carlos = new Vendedor();
  Vendedor lucia = new Vendedor();
  Vendedor fernanda = new Vendedor();

  Cliente julio = new Cliente
  Cliente joana = new Cliente();
  


  // Modificar as informações
  marcio.nome = "Marcio Garcia";
  marcio.email = "marcio.g@gmail.com";
  marcio.dataDeNascimento = LocalDate.of(1995, Month.SEPTEMBER, 24);
  marcio.telefoneDecontato = "51965875471";
  marcio.endereco = "Rua feliz, 35";
  marcio.salario = 1500.00f;

  carlos.nome = "Carlos Gomes";
  carlos.email = "carlinhosGomes@hotmail.com";
  carlos.dataDeNascimento = LocalDate.of(1986, Month.JULY, 2);
  carlos.telefoneDecontato = "51982465147";
  carlos.endereco = "Rua Aristoteles, 598";
  carlos.salario = 1500.00f;

  lucia.nome = "Lucia Rodrigues Silva";
  lucia.email = "luciars@outlook.com";
  lucia.dataDeNascimento = LocalDate.of(1998, Month.MARCH, 19);
  lucia.telefoneDecontato = "5198654298";
  lucia.endereco = "Rua dos Passos, 4025";
  lucia.salario = 1500.00f;
  
  fernanda.nome = "Fernanda Andrade Costa";
  fernanda.email = "Nandandrade@gmail.com";
  fernanda.dataDeNascimento = LocalDate.of(2000, Month.DECEMBER,29);
  fernanda.telefoneDecontato = "51987456123";
  fernanda.endereco = "Rua cavalo 256";
  fernanda.salario = 1500.00f;

  joana.nome = "Joana ferrreira";
  joana.rg = "5697";
  joana.cpf = "26515865-64";
  joana.email = "joaninhaf.@gmail.com";
  joana.telefone = "51689512580";


  
  //Imprimir os nomes
  System.out.println(marcio.nome);
  System.out.println(marcio.email);
  System.out.println(marcio.dataDeNascimento);
  System.out.println(marcio.telefoneDecontato);
  System.out.println(marcio.endereco);
  System.out.println(marcio.salario);
  System.out.println(carlos.nome);
  System.out.println(carlos.email);
  System.out.println(carlos.dataDeNascimento);
  System.out.println(carlos.telefoneDecontato);
  System.out.println(carlos.endereco);
  System.out.println(carlos.salario);
  System.out.println(lucia.nome);
  System.out.println(lucia.email);
  System.out.println(lucia.dataDeNascimento);
  System.out.println(lucia.telefoneDecontato);
  System.out.println(lucia.endereco);
  System.out.println(lucia.salario);
  System.out.println(fernanda.nome);
  System.out.println(fernanda.email);
  System.out.println(fernanda.dataDeNascimento);
  System.out.println(fernanda.telefoneDecontato);
  System.out.println(fernanda.endereco);
  System.out.println(fernanda.salario);
  
    }
}