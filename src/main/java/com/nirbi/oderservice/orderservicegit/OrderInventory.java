package com.nirbi.oderservice.orderservicegit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderInventory {
	public List<Order> getOrders() {
		return Stream.of(new Order(200L, "Mobile", 2, 60000.0D), new Order(600L, "Laptop", 1, 40000.0D),
				new Order(400L, "Tablet", 3, 70000.0D)).collect(Collectors.toList());
	}
}
