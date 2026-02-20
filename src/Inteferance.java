interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface GPS {
    void navigate();
}

class SmartPhone implements Camera, MusicPlayer, GPS {

    @Override
    public void takePhoto() {
        System.out.println("Photo captured");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to destination");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
        phone.navigate();
    }
}
