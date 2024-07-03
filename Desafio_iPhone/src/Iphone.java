import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet {
    
    private String numeroTelefone;
    
    public Iphone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero + "...");
        // Lógica para fazer a chamada
    }
    
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
        // Lógica para receber a chamada
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
        // Lógica para tocar música
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando música...");
        // Lógica para pausar música
    }
    
    @Override
    public void avancar() {
        System.out.println("Avançando para a próxima faixa...");
        // Lógica para avançar música
    }
    
    @Override
    public void retroceder() {
        System.out.println("Retrocedendo para a faixa anterior...");
        // Lógica para retroceder música
    }
    
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo navegador com a URL: " + url);
        // Lógica para abrir o navegador com a URL especificada
    }
    
    @Override
    public void voltar() {
        System.out.println("Voltando para a página anterior...");
        // Lógica para voltar no navegador
    }
    
}