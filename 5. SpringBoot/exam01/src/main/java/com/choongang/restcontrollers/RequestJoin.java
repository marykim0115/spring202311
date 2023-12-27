package com.choongang.restcontrollers;

import lombok.Data;

@Data
public class RequestJoin {
    private String userId;
    private String userPw;
    private String confirmPw;
    private String userName;
    private String email;
}
