/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;


@Entity
public class DiscountFixed extends DiscountType 
{
    double discount = 0.1;

    @Override
    public double calcDiscount(double pricePerItem, int quantity) 
    {
        return discount * pricePerItem * quantity;
    }
}
