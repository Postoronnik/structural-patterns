package proxy.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Service implements ServiceInterface{

    private String accessLvl;

    @Override
    public void someOperation() {
        System.out.println("Some operation from service");
    }

}
