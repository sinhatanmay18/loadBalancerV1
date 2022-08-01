package com.Student.loadbalancer.dao;

import com.Student.loadbalancer.dao.model.Server;
import com.Student.loadbalancer.dao.operations.ServerOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServerDAO {

    @Autowired
    private ServerOperation serverOperation;

    public void saveServer(Server server){
        serverOperation.save(server);
    }

    public Server getServerByID(int id){
        return serverOperation.getById(id);
    }

    public List<Server> getAllServer(){
        return serverOperation.findAll();
    }
}
