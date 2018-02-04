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

import com.cusat.fsdrugs.model.Order;
import com.cusat.fsdrugs.persistence.OrderDao;

@Path("/order")
public class OrderResource {
	
	OrderDao orderdao;
	
	@Inject
	public OrderResource(OrderDao orderdao) {
		this.orderdao=orderdao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Order> getorder() {
		List<Order> order =orderdao.findAll();
		return order;
	}@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Order save(@Valid Order order) {
        return orderdao.save(order);
    }
	
}
