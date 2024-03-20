package za.ac.cput.factory;

import za.ac.cput.domain.Driver;
import za.ac.cput.util.Helper;
/**
 * DriverFactory.java
 * This is the factory class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 20 March 2024
 */
public class DriverFactory {
    public static Driver buildDriver(String firstName, String lastName, String email, String idNumber, String licenceNo, String telephoneNo, int rentalID) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(idNumber)
                || Helper.isNullOrEmpty(licenceNo) || Helper.isNullOrEmpty(telephoneNo) || Helper.isNullOrEmpty(String.valueOf(rentalID)))
            return null;
        return new Driver.Builder().setFirstName(firstName).setLastName(lastName)
                .setEmail(email).setIdNumber(idNumber).setLicenceNo(licenceNo)
                .setTelephoneNo(telephoneNo).setRentalID(rentalID).build();
    }

    public static Driver buildDriver(String firstName, String lastName, String email, int rentalID) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(String.valueOf(rentalID)))
            return null;
        String idNumber = Helper.generateId();
        return new Driver.Builder().setIdNumber(idNumber)
                .setFirstName(firstName).setLastName(lastName).setEmail(email).setRentalID(rentalID).build();
    }


}
