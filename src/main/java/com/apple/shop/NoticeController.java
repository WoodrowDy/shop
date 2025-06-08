package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
class NoticeController {

  private final NoticeRepository noticeRepository;

  @GetMapping("/notice")
  public String notices(Model model) {

    List<Notice> notices = noticeRepository.findAll();
    System.out.println(notices);

    model.addAttribute("notice", notices);

    return "notice.html";
  }

}
