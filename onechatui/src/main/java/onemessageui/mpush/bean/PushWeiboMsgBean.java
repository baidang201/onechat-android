package onemessageui.mpush.bean;

import java.io.Serializable;

import oneapp.onechat.oneandroid.onewallet.network.ServiceConstants;

public class PushWeiboMsgBean implements Serializable {
    private static final long serialVersionUID = 123456L;

    /**
     *
     */
    private String account_id;
    private String account_name;
    private String avatar_url;
    private String nickname;
    private String group_uid;
    private String group_name;
    private String weibo_id;
    private String comment_content;
    private String weibo_content;


    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getWeibo_id() {
        return weibo_id;
    }

    public void setWeibo_id(String weibo_id) {
        this.weibo_id = weibo_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getAvatar_url() {
        return ServiceConstants.GetAvatarConfigServer() + avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWeibo_content() {
        return weibo_content;
    }

    public void setWeibo_content(String weibo_content) {
        this.weibo_content = weibo_content;
    }

    public String getGroup_uid() {
        return group_uid;
    }

    public void setGroup_uid(String group_uid) {
        this.group_uid = group_uid;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }
}
