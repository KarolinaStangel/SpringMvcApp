package com.example.springmvc.providers;

import com.example.springmvc.domain.Tweet;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class TweetProvider
{
    public List<Tweet> getTweets()
    {
        return asList(
                Tweet.prototype(),
                Tweet.prototype().toBuilder().text("ANOTHER_TWEET").userName("ANOTHER_USER_NAME").build()
        );
    }
}
