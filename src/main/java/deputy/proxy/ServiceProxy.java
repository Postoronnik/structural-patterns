package deputy.proxy;

import deputy.service.Service;
import deputy.service.ServiceInterface;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ServiceProxy implements ServiceInterface {

    private Service service;
    private String accessLvl;

    @Override
    public void someOperation() {
        if(checkAccess()){
            service.someOperation();
        } else {
            System.out.println("Low access level");
        }
    }

    private boolean checkAccess(){
        if(service.getAccessLvl().equals(accessLvl)){
            return true;
        }
        return false;
    }
}
