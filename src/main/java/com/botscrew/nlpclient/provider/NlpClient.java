package com.botscrew.nlpclient.provider;

import com.botscrew.botframework.model.ChatUser;

public interface NlpClient {

    void query(ChatUser user, String query);

    void query(ChatUser user, String query, String sessionId);

}
