package com.de.electric.dkcustomers.dao;


import com.de.electric.dkcustomers.model.DkCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class DkCustomerDao {

    public List<DkCustomer> getCustomers()
    {
        return  Stream.of(
                new DkCustomer( 1,"John", "john@gmail.com"),
                new DkCustomer( 2,"Peter", "peter@gmail.com"),
                new DkCustomer( 3,"Adam", "adam@gmail.com"),
                new DkCustomer( 3,"Eric", "eric@gmail.com"),
                new DkCustomer( 3,"Jack", "jack@gmail.com")
        ).collect(Collectors.toList());
    }
}
