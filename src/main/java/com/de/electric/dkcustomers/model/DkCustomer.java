package com.de.electric.dkcustomers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DkCustomer {

    private int customerId;
    private String customerName;
    private String customerEmail;

}
