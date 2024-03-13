package com.sentilab;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    // get방식의 매소드로 이 주소를 호출하면 이함수를 실행 할 수 잇어!!
    @ResponseStatus(value = HttpStatus.OK)
    // OK = 200 : 정상적으로 결과를 주겠다
    public String getApiTest() {

        return "{\"result\":\"ok\"}";
    }
    @RequestMapping(value = "/api/test2", method = RequestMethod.POST)
    // get방식의 매소드로 이 주소를 호출하면 이함수를 실행 할 수 잇어!!
    @ResponseStatus(value = HttpStatus.OK)
    // OK = 200 : 정상적으로 결과를 주겠다
    public String getApiTest2() {

        return "{\"result\":\"ok222\"}";
    }

    // localhost:8080/api/test
}
