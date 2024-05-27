package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Cart;
import com.example.demo.model.Item;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.ItemRepository;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cart cart=new Cart("Household23");
		Cart cart1=new Cart("Outfit");
		Item shampoo=new Item("sh2344",cart);
		Item chocolate=new Item("ch2221",cart);
		Item shirt=new Item("tshirt131",cart1);
		Item shoes=new Item("paragon55",cart1);
		
		
		List<Item> items=Arrays.asList(shampoo,chocolate);
		List<Item> items1=Arrays.asList(shirt,shoes);
		
		cart.setItems(items);
		cart1.setItems(items1);
		
		cartRepository.save(cart);
		cartRepository.save(cart1);
	}

}
