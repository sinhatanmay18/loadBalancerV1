package com.Student.loadbalancer.controller;

import com.Student.loadbalancer.businessLayer.LoadBalancer;
import com.Student.loadbalancer.dao.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class LoadBalanceRequestController {

    @Autowired
    private LoadBalancer loadBalancer;


    @PostMapping("/userInformation")
    public ResponseEntity<?> serverAllot(@RequestBody UserInfo userInfo) {
        int serverID = loadBalancer.assignServer(userInfo);
        return ResponseEntity.ok().body(serverID);
    }
}
