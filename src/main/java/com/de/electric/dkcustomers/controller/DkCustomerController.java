package com.de.electric.dkcustomers.controller;

import com.de.electric.dkcustomers.dao.DkCustomerDao;
import com.de.electric.dkcustomers.model.DkCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DkCustomerController {

    @Autowired
    private DkCustomerDao dkCcustomerDao;

    @GetMapping("/customers")
    public List<DkCustomer> getCustomers()
    {
        return dkCcustomerDao.getCustomers()
                .stream().sorted(Comparator.comparing(DkCustomer::getCustomerId))
                .collect(Collectors.toList());
    }

    @PostMapping("/customers")
    public String  updateCustomer(@RequestBody DkCustomer newDkCustomer )
    {
        dkCcustomerDao.getCustomers().add(newDkCustomer); // You need to really add to the DB.

        return  "Customer added :"+newDkCustomer.getCustomerName();
    }

}
