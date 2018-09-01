package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/30.
 */
public class ZipCode {
    private String zipCode = "";

    /*
    public ZipCode(String inZipCode) {
        setZipCode(inZipCode);
    }
    */

    public String setZipCode(String inZipCode) {
        if ((inZipCode.length() == 5) | (inZipCode.length() == 9))
            zipCode = inZipCode;

        return zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static void main(String[] arguments) {
        ZipCode zip1 = new ZipCode();
        ZipCode zip2 = new ZipCode();
        zip1.setZipCode("22222");
        zip2.setZipCode("143654226");

        if (zip1.getZipCode() != "")
            System.out.println("Zip1: " + zip1.getZipCode());
        if (zip2.getZipCode() != "")
            System.out.println("Zip2: " + zip2.getZipCode());
    }
}
