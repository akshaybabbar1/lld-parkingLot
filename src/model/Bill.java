package model;

import model.enums.PaymentMode;

import javax.xml.crypto.Data;
import java.util.List;

public class Bill extends BaseModel{
    private Float amount;
    private Gates exitGate;
    private Operator operator;
    private Ticket ticket;
    private PaymentMode paymentMode;
    private Data exitTime;
    private String billNumber;
    private List<Payment> payments;



}
