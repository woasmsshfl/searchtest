package site.metacoding.test220323.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import site.metacoding.test220323.domain.post.PostRepository;
import site.metacoding.test220323.domain.post.BoardTbl;

// 웹 브라우저 -> 컨트롤러 -> 서비스 -> 레파지토리 -> 영속성컨텍스트 -> 디비
@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public List<BoardTbl> 글목록보기(String keyword) {
       return postRepository.mSearch(keyword);
        
        
        }

}
