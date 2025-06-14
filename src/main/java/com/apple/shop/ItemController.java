package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

  private final ItemRepository itemRepository;


  @GetMapping("/list")
  String gets(Model model) {
    List<Item> item = itemRepository.findAll();
    System.out.println(item);



    model.addAttribute("item", item);


    return "list.html";
  }
}
