public class App {
    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.power();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(78);
        smartTv.mudarVolume(6);


        String estado = " ";

        if (smartTv.ligada == false){

            estado = "desligada";

            System.out.println("A TV está " + estado + ".");

        }else{

            estado = "ligada";

            System.out.println("A TV está " + estado + ".");
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

        }
    }
}