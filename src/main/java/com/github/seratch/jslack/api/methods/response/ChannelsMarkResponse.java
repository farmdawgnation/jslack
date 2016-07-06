package com.github.seratch.jslack.api.methods.response;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Data;

@Data
public class ChannelsMarkResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
}