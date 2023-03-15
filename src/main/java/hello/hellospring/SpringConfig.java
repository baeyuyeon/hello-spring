package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    private final MemberRepository memberRepository;

    //spring 이 JPA만들어둔것이 등록된다.
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*private EntityManager em;
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    /*private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    */
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
    //@Bean
    /*public MemberRepository memberRepository(){
        //return new JpaMemberRepository(em);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JdbcMemberRepository(dataSource);
        //return new MemoryMemberRepository();
    }*/



}
