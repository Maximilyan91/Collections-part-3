package Mechanic;

import Transport.Bus;
import Transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport<?>> transportQueue = new ArrayDeque<Transport<?>>();

    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println(" Автобусы не нуждаются в ТО");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runService() {
        Transport transport = transportQueue.poll();
        if (transport != null) {


        }

    }


}
