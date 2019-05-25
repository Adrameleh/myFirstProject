package lesson12;

public class MeizuM5 implements Phone, Photoapparat {
    @Override
    public void call() {
        System.out.println("MeizuM5 calls...");
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println("MeizuM5 deliveres message..." + msg);
    }

    @Override
    public void takePhoto() {
        System.out.println("Took photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking video...");
    }
}
