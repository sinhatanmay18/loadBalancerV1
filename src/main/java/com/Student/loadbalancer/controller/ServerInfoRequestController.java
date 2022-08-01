package com.Student.loadbalancer.controller;


import com.Student.loadbalancer.dao.ServerDAO;
import com.Student.loadbalancer.dao.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //1
@RequestMapping("/api/v3") //2
public class ServerInfoRequestController {

    @Autowired
    public ServerDAO serverDAO;

    @PostMapping("/saveServer")
    public ResponseEntity<?> saveServer(@RequestBody Server server) {
        serverDAO.saveServer(server);
        return ResponseEntity.ok().body("Server info received");
    }

    @GetMapping("/getAllServer")
    public ResponseEntity<List<Server>> getAllServer(){
        List<Server> servers = serverDAO.getAllServer();
        return ResponseEntity.ok().body(servers);
    }
}
