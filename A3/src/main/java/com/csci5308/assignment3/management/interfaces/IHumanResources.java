package com.csci5308.assignment3.management.interfaces;

import com.csci5308.assignment3.staff.Driver;
import com.csci5308.assignment3.staff.ForkliftOperator;
import com.csci5308.assignment3.staff.Picker;

public interface IHumanResources {
    public Driver getDriver();
    public Picker getPicker();
    public ForkliftOperator forkLiftOperator();
    public int getTotalMinutesWorked();
}
