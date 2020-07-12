package springTestPackage;

public class RockMusic implements Music {
    private RockMusic() {
    }

    @Override
    public String getSong() {
        return "We will rock you";
    }
}
