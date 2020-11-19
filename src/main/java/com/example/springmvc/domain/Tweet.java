package com.example.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@ToString
@Builder(toBuilder = true)
public class Tweet
{
    private final String text;
    private final String userName;

    public static Tweet prototype()
    {
        return Tweet.builder()
                .text("DEFAULT_TWEET")
                .userName("DEFAULT_USER_NAME")
                .build();
    }
}
