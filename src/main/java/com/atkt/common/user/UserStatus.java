package com.atkt.common.user;

/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/15/13
 * Time: 8:03 PM
 * To change this template use File | Settings | File Templates.
 */
public enum UserStatus {

    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    DELETED("DELETED"),
    FAIL("FAIL"),
    SUCCESS("SUCCESS");

    private String statusCode;

    private UserStatus(String status) {
        statusCode = status;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
