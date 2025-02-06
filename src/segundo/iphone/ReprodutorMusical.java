package segundo.iphone;

public class ReprodutorMusical {
    private String musica;

    String tocar(){return musica == null ? "Selecione uma musica" : "Tocando musica" + musica;}

    String pausar(){return musica == null ? "Selecione uma musica" : "Pausando musica" + musica;}

    void selecionarMusica(String musica){this.musica = musica;}

}
