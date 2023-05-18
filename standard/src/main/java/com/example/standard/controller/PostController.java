
import com.example.standard.entity.Post;
import com.example.standard.response.PostResponse;
import com.example.standard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public PostResponse get(){
    System.out.println("스스로 올리고 스스로 pull request하는 습관을 기릅시다");
        System.out.println("사장은 바지 사장입니다.");

        return null;

    }
}
