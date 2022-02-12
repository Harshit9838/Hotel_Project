/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-02-2022
 *Time: 10:57 PM
 */

package model.main;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;
import model.hotel.Hotel;
import model.hotel.Oyo;

public class Main {
    public static void main(String[] args) {
        //   Hotel hotel = new Radission();
        Hotel hotel = new Oyo();

        Customer customer1 = new RegularCustomer();
        customer1.bookHotel(hotel);

        Customer customer2 = new RewardCustomer();
        customer2.bookHotel(hotel);
    }
}
