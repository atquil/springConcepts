package com.atquil.springconcepts.annotations.qualifier;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


interface Score{
    void topScore();
}

@Component("science")
class ScienceStudent implements Score{
    @Override
    public void topScore() {
        System.out.println("Top score of ScienceStudent:100");

    }
}

@Component("commerce")
class CommerceStudent implements Score{
    @Override
    public void topScore() {
        System.out.println("Top score of CommerceStudent:90");
    }
}
@Component
public class CollegeStudent {
    private final Score score;


//    //More than one been of type Score which to use ?
//    public CollegeStudent(Score score) {
//        this.score = score;
//    }


    @Autowired
    public CollegeStudent(@Qualifier("science") Score score){
        this.score = score;
    }

    @PostConstruct
    public void init(){
        score.topScore();
    }

}


