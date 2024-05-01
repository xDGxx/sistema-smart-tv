public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void avancarCanal(){
        canal++;
        System.out.println("Trocando o canal para " + canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("Trocando o canal para " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }


}

