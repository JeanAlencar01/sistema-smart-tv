public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void ligar () {
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;   //é o mesmo que (volume = volume + 1;)
        System.out.println("Aumentando o Volume para: " + volume);
    }

    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuindo o Volume para: " + volume);
    }

    public void aumentarCanal (){
        canal++;
        System.out.println("Aumentando o Canal para: " + canal);
    }

    public void diminuirCanal (){
        canal--;
        System.out.println("Diminuindo o Canal para:" + canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
