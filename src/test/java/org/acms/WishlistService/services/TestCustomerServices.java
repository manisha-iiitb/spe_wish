package org.acms.WishlistService.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCustomerServices {

    @Test
    public void testLogin() {
	Login user=new Login();
	user.login_id="Deepika";
	user.password="12345";
	String result=CustomerServices.getUserByLoginID(user)
        assertEquals("sucess", result);
    }

}