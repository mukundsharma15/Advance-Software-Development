package com.csci5308.assignment3.operations;

import com.csci5308.assignment3.management.HumanResources;
import com.csci5308.assignment3.management.Warehouse;
import com.csci5308.assignment3.management.interfaces.IWarehouse;
import com.csci5308.assignment3.operations.interfaces.IFacade;
import com.csci5308.assignment3.management.interfaces.IHumanResources;
import com.csci5308.assignment3.operations.interfaces.IReceiving;
import com.csci5308.assignment3.operations.interfaces.IShipping;

public class Facade implements IFacade {

    IHumanResources humanResources;
    IWarehouse warehouse;
    IShipping shipping;
    IReceiving receiving;

    public Facade(IHumanResources humanResources, IWarehouse warehouse){
        this.humanResources = new HumanResources();
        this.warehouse = new Warehouse();
        this.receiving = new Receiving(humanResources, warehouse);
        this.shipping = new Shipping(humanResources, warehouse);
    }

    @Override
    public void receive(String item, int count) {
        this.receiving.receive(item, count);
    }

    @Override
    public void ship(String item, String account, int count) {
        this.shipping.ship(item, account, count);
    }
}
