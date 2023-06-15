package com.nirbi.oderservice.orderservicegit;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@SpringBootApplication
public class OrderServiceGitApplication {

	@Autowired
	private OrderInventory orderInventory;

	@GetMapping(path = "/fetchOrders")
	public List<Order> fetchAllOrders() {
		return orderInventory.getOrders().stream().sorted(Comparator.comparing(Order::getName))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceGitApplication.class, args);
	}

}
