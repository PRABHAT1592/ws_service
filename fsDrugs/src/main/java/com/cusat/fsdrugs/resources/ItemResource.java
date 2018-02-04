package com.cusat.fsdrugs.resources;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;




import com.cusat.fsdrugs.model.Item;
import com.cusat.fsdrugs.persistence.ItemDao;



@Path("/items")
public class ItemResource {

	@Autowired
	ItemDao itemdao;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Item> getItem()	{
		List<Item> item = itemdao.findAll();
		return item;	
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Item save(@Valid Item item)	{
		return itemdao.save(item);
	}	
}
