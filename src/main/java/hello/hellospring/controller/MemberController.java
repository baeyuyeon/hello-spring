package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//얘는 스프링이 관리하는거고, component scan 이 되는거라 @Autowired작성함.
@Controller
public class MemberController {

    private final MemberService memberService;

    //스프링컨테이너에서 가져온다.
    //의존관계를 주입(DI)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
