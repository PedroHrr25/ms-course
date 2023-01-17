package com.pedrohrr.hrpayroll.services;


import com.pedrohrr.hrpayroll.entities.Payment;
import com.pedrohrr.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {


    @Value("${hr-worker.host}")
    private String workerHost;


    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment (Long workerId, int days){
        Map<String,String> urlVariable = new HashMap<>();
        urlVariable.put("id",""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/worker/{id}", Worker.class, urlVariable);
        return new Payment(worker.getName(),worker.getDayleIncome(),days);
    }

}
