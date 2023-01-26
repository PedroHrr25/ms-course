package com.pedrohrr.hrpayroll.services;


import com.pedrohrr.hrpayroll.entities.Payment;
import com.pedrohrr.hrpayroll.entities.Worker;
import com.pedrohrr.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

     @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment (Long workerId, int days){


        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getdailyIncome(), days);
    }

}
