package com.company;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Ticket {

    private int PRICE = 100;
    private int SUM = 0;
    private List<Ticket> components = new ArrayList<>();

    public void addComponent(Ticket component) {
        components.add(component);
    }

    public void removeComponent(Ticket component) {
        components.remove(component);
    }

    @Override
    public void sell() {
        for(Ticket component : components) {
            component.sell();
            if (component instanceof Child){
                System.out.println(100 * 0.2);
                SUM += 100 * 0.2;
            } else if ( component instanceof Adult ) {
                System.out.println(100 * 1);
                SUM += 100 * 1;
            } else if ( component instanceof Student ) {
                System.out.println(100 * 0.8);
                SUM += 100 * 0.8;
            }
        }
        if ( SUM > 0 ) System.out.println("TOTAL: " + SUM + " lei");
    }
}
