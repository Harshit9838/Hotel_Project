/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-02-2022
 *Time: 10:56 PM
 */

package model.customer;

import model.hotel.Hotel;

public interface Customer {

    public void bookHotel(Hotel hotel);

}
// Hotel hotel = new Hotel(); X abstract class -> no object
// Hotel hotel = new Oyo();
// Hotel hotel = new Radisson();
// Hotel hotel = new Taj();

