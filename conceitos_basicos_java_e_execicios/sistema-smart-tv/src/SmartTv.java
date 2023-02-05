public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("TV Atual: " + smartTv.canal);
        System.out.println("TV Atual: " + smartTv.volume);
    
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}