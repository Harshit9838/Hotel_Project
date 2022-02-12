/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-02-2022
 *Time: 10:50 PM
 */

package model.hotel;

import model.customer.Customer;

public sealed abstract class Hotel permits Oyo, Radission, Taj {

    // rating number int
    private int rating;

    private int rate;

    public int getRate(Customer customer) {

        return rate;
    }

    public int getRating() {
        return rating;
    }

}
