package proxy.start.point;

import proxy.proxy.ServiceProxy;
import proxy.service.Service;
import proxy.service.ServiceInterface;

public class Main {
    public static void main(String[] args) {
        ServiceInterface serviceProxy1 = new ServiceProxy(new Service("High"),"High");
        serviceProxy1.someOperation();

        ServiceInterface serviceProxy2 = new ServiceProxy(new Service("High"),"Low");
        serviceProxy2.someOperation();
    }
}
