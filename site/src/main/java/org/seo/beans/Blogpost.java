package org.seo.beans;

import java.util.Calendar;
import java.util.List;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.components.model.Authors;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.seo.beans.DefaultJMG;

@HippoEssentialsGenerated(internalName = "seocms:blogpost")
@Node(jcrType = "seocms:blogpost")
public class Blogpost extends HippoDocument implements Authors {
    public static final String TITLE = "seocms:title";
    public static final String INTRODUCTION = "seocms:introduction";
    public static final String CONTENT = "seocms:content";
    public static final String PUBLICATION_DATE = "seocms:publicationdate";
    public static final String CATEGORIES = "seocms:categories";
    public static final String AUTHOR = "seocms:author";
    public static final String AUTHOR_NAMES = "seocms:authornames";
    public static final String LINK = "seocms:link";
    public static final String AUTHORS = "seocms:authors";
    public static final String TAGS = "hippostd:tags";

    @HippoEssentialsGenerated(internalName = "seocms:publicationdate")
    public Calendar getPublicationDate() {
        return getProperty(PUBLICATION_DATE);
    }

    @HippoEssentialsGenerated(internalName = "seocms:authornames")
    public String[] getAuthorNames() {
        return getProperty(AUTHOR_NAMES);
    }

    public String getAuthor() {
        final String[] authorNames = getAuthorNames();
        if (authorNames != null && authorNames.length > 0) {
            return authorNames[0];
        }
        return null;
    }

    @HippoEssentialsGenerated(internalName = "seocms:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    @HippoEssentialsGenerated(internalName = "seocms:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "seocms:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    @HippoEssentialsGenerated(internalName = "seocms:categories")
    public String[] getCategories() {
        return getProperty(CATEGORIES);
    }

    @Override
    @HippoEssentialsGenerated(internalName = "seocms:authors")
    public List<Author> getAuthors() {
        return getLinkedBeans(AUTHORS, Author.class);
    }

    @HippoEssentialsGenerated(internalName = "seocms:image")
    public DefaultJMG getImage() {
        return getLinkedBean("seocms:image", DefaultJMG.class);
    }
}
