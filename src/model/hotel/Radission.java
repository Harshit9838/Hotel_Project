/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-02-2022
 *Time: 10:51 PM
 */

package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public final class Radission extends Hotel {

    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            // weekday -> 130, weekend -> 90
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 110;
            } else {
                return 100;
            }

        } else if (customer instanceof RewardCustomer) {
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 90;
            } else {
                return 100;
            }
        }
        return 0;
    }
}



