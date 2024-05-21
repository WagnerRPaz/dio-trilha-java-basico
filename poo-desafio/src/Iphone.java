import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico telefonico = new AparelhoTelefonico();
        Navegador navegador = new Navegador();
        ReprodutorMusical musical = new ReprodutorMusical();
        Scanner scanner = new Scanner(System.in);

        navegador.adicionarNovaAba();
        System.out.print("Digite a URL que deseja acessar: ");
        String url = scanner.nextLine();
        navegador.exibirPagina(url);
        navegador.atualizarPagina();

        System.out.println("");

        System.out.print("Digite o nome da música que deseja ouvir: ");
        String musica = scanner.nextLine();
        musical.selecionarMusica(musica);
        musical.tocar();
        musical.pausar();

        System.out.println("");

        telefonico.atender();
        telefonico.iniciarCorreiodeVoz();
        System.out.print("Digite o número que deseja ligar: ");
        String numero = scanner.nextLine();
        telefonico.ligar(numero);
    }
}