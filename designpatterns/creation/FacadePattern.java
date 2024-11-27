package designpatterns.creation;

class Tv{
    void turnOn(){
        System.out.println("Turning on TV");
    }
}
class SoundSystem{
    void turnOn(){
        System.out.println("Turning on Sound System");
    }
}
class Lights{
    void dim(){
        System.out.println("lights are dimming");
    }
}
class HomeTheater{
    private Tv tv;
    private SoundSystem soundSystem;
    private Lights lights;
    public HomeTheater(Tv tv,SoundSystem soundSystem,Lights lights){
        this.tv=tv;
        this.soundSystem=soundSystem;
        this.lights=lights;
    }

    public void startMovie(){
        System.out.println("Starting movie");
        tv.turnOn();
        soundSystem.turnOn();
        lights.dim();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
    //instantiating all classes
    Tv tv=new Tv();
    SoundSystem soundSystem=new SoundSystem();
    Lights lights=new Lights();

    HomeTheater homeTheater=new HomeTheater(tv, soundSystem, lights);
    homeTheater.startMovie();
}
}
