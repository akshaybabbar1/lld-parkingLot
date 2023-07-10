package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

public class Payment extends BaseModel {

    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private String transactionId;

}
