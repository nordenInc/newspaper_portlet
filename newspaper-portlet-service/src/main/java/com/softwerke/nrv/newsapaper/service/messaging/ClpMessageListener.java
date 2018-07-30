package com.softwerke.nrv.newsapaper.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.softwerke.nrv.newsapaper.service.ClpSerializer;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil;
import com.softwerke.nrv.newsapaper.service.UserCommentLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            NewsArticleLocalServiceUtil.clearService();

            UserCommentLocalServiceUtil.clearService();
        }
    }
}
