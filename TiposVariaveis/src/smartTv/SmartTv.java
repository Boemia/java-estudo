public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou para o canal " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentou o canal 1 vez");
    }

    public void diminuirCanal(){
        canal++;
        System.out.println("Diminuiu o canal 1 vez");
    }

    public void mudarVolume(int novoVolume){
        volume = novoVolume;
        System.out.println("Mudou para o volume " + volume);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para " + volume);
    }

    public void power(){
        if(ligada == true){

            ligada = false;
            System.out.println("A TV foi desligada");

        }else{

            ligada = true;
            System.out.println("A TV foi ligada");

        }
    }
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}

