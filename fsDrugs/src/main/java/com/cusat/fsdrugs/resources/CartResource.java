package com.cusat.fsdrugs.resources;


import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.fsdrugs.model.Cart;
import com.cusat.fsdrugs.persistence.CartDao;


@Path("/cart")
public class CartResource {

	CartDao cartdao;
	
	@Inject
	public CartResource(CartDao cartdao) 	{
	 	this.cartdao=cartdao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Cart> getcart() {
		List<Cart> cart =cartdao.findAll();
		return cart;
	}
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Cart save(@Valid Cart cart) {
        return cartdao.save(cart);
    }
	
}