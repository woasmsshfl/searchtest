package site.metacoding.test220323.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.test220323.domain.post.PostRepository;
import site.metacoding.test220323.service.PostService;

@RequiredArgsConstructor
@Controller
public class PostController {
    
    private final PostService postService;
    private final HttpSession session;
    private final PostRepository postRespository;

    

    @GetMapping({"/", "/list"})
    public String home(@RequestParam(defaultValue = "") String keyword, Model model) {

        model.addAttribute("boards", postService.글목록보기(keyword));

        return "post/list";
    }

}
