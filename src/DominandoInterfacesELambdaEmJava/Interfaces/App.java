package DominandoInterfacesELambdaEmJava.Interfaces;

public class App {

    public static void main(String[] args) {
        var music = new MusicPlayer() { // Classe anônima
            @Override
            public void playMusic() {
                System.out.println("A música " + MusicPlayer.music + " está tocando");
            }

            @Override
            public void stopMusic() {

            }

            @Override
            public void exitMusic() {

            }
        };

        music.playMusic();
    }
}
