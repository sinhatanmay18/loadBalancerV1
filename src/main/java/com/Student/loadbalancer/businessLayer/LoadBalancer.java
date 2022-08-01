package com.Student.loadbalancer.businessLayer;

import com.Student.loadbalancer.dao.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class LoadBalancer {

    public int assignServer(UserInfo userInfo){

        String rID = userInfo.getRequestID();
        String decoded = Base64Coder.decodeString(rID);

        int decodedValue = Integer.parseInt(decoded);
        return decodedValue % 7;
    }
}
