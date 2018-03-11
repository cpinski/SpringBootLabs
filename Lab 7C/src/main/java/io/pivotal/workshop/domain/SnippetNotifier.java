package io.pivotal.workshop.domain;

import java.util.Date;

public class SnippetNotifier {

    private String id;
    private String title;
    private Date created;

    public SnippetNotifier(){}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreated() {
        return created;
    }
}
