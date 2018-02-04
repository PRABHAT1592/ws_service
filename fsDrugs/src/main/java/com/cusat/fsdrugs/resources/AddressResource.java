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

import com.cusat.fsdrugs.model.Address;
import com.cusat.fsdrugs.persistence.AddressDao;
import com.cusat.fsdrugs.persistence.CartDao;

@Path("/addreaa")
public class AddressResource {
	
	AddressDao addressdao; CartDao cartdao;
	
	@Inject
	public AddressResource(AddressDao addressdao) 	{
	 	this.addressdao=addressdao;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Address> getaddress() {
		List<Address> address =addressdao.findAll();
		return address;
	}
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Address save(@Valid Address address) {
        return addressdao.save(address);
    }
}
