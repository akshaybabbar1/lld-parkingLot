package model;

import model.enums.VehicleType;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private ParkingSlot assignedSlot;
    private Vehicle vehicle;
    private Gates entryGate;

    private Operator operator;

}
