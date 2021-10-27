package in.gov.uidai.otpapiclient;

import in.gov.uidai.otpapiclient.model.OtpRes;

import java.util.Scanner;
import java.util.UUID;

public class OtpAPIClientMain {

    public static void main(String[] args) throws Exception {
        OtpAPIService otpAPIService = new OtpAPIService();
        otpAPIService.readProperties();
        String txnId = UUID.randomUUID().toString();
        System.out.println("Printing txnId: " + txnId);
        String uid = args[0];
        OtpRes otpRes = otpAPIService.getOtpRes(uid, txnId);
        System.out.println("Result : " + otpRes.getRet().value() + ", err: " + otpRes.getErr());
    }

}
