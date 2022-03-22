package com.csci5308.assignment3.operations.interfaces;

public interface IFacade {
    public void receive(String item, int count);
    public void ship(String item, String account, int count);
}
