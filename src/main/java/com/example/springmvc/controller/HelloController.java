package com.example.springmvc.controller;

import com.example.springmvc.domain.Tweet;
import com.example.springmvc.providers.TweetProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
public class HelloController
{
    private final TweetProvider tweetProvider;

    public HelloController(final TweetProvider tweetProvider)
    {
        this.tweetProvider = tweetProvider;
    }

    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value = "search", defaultValue = "Spring") final String search)
    {
        final List<String> tweets = tweetProvider.getTweets().stream().map(Tweet::getText).collect(toList());
        model.addAttribute("tweets", tweets);
        model.addAttribute("search", search);

        return "resultPage";
    }
}
