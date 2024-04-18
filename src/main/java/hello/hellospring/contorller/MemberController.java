package hello.hellospring.contorller;

import hello.hellospring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
        private final MemberService memberService;

        @Autowired  //스프링 컨테이너와 생성자를 연결
        public MemberController(MemberService memberService) {
            this.memberService = memberService;
        }
    }
