package DominandoInterfacesELambdaEmJava.Interfaces;

public class Smartphone implements MusicPlayer, VideoPlayer{
    @Override
    public void playMusic() {
        System.out.println("O celular está tocando a música " + MusicPlayer.music);
    }

    @Override
    public void stopMusic() {
        System.out.println("O celular está pausando a música " + MusicPlayer.music);
    }

    @Override
    public void exitMusic() {
        System.out.println("O celular está saindo da música " + MusicPlayer.music);
    }

    @Override
    public void playVideo() {
        System.out.println("O celular está rodando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O celular está pausando o vídeo");
    }

    @Override
    public void exitVideo() {
        System.out.println("O celular está saíndo do vídeo");
    }
}
