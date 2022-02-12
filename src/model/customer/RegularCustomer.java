/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-02-2022
 *Time: 10:56 PM
 */

package model.customer;

import model.hotel.Hotel;
import model.hotel.Oyo;
import model.hotel.Radission;
import model.hotel.Taj;

import javax.swing.*;

public final class RegularCustomer implements Customer {

    @Override
    public void bookHotel(Hotel hotel) {
        int bookingRate = 0;
        if (hotel instanceof Oyo) {
            // call the getRate method of Oyo
            Oyo oyo = new Oyo();
            bookingRate = oyo.getRate(this);
        } else if (hotel instanceof Radission) {
            // call the getRate method of Radisson
            Radission radisson = new Radission();
            bookingRate = radisson.getRate(this);
        } else if (hotel instanceof Taj) {
            // call the getRate method of Taj
            Taj taj = new Taj();
            bookingRate = taj.getRate(this);
        }
        JOptionPane.showConfirmDialog(
                null,
                "The booking rate for the hotel is ₹ " + bookingRate
        );
    }

}
