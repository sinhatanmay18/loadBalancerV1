package com.Student.loadbalancer.dao.operations;

import com.Student.loadbalancer.dao.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerOperation extends JpaRepository<Server,Integer>{
}
