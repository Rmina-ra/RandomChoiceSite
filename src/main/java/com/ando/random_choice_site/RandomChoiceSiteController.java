package com.ando.random_choice_site;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class RandomChoiceSiteController {
	private final String[] images = {"img1.png","img2.png","img3.png","img4.png","img5.png"};

	@GetMapping("/")
	public String showPage(Model model){
		int randomIndex = new Random().nextInt(images.length);
		String selectedImage = images[randomIndex];
		model.addAttribute("imageName", selectedImage);
		return "index";
	}
}
