package springTestPackage;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {


    public void  doMyInit(){
        System.out.println("Doing my itilization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Vivaldi spring";
    }
}
