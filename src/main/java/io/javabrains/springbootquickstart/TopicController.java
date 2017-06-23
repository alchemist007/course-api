package io.javabrains.springbootquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nbasnet on 6/21/2017.
 */

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript", "JavaScript Description")
        );
    }

}
