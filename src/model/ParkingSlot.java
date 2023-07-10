package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private String number;
    private ParkingSpotStatus spotStatus;
    private VehicleType supportedVehicleType;
}
