package org.seo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.seo.beans.DefaultJMG;

@HippoEssentialsGenerated(internalName = "seocms:bannerdocument")
@Node(jcrType = "seocms:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "seocms:title")
    public String getTitle() {
        return getProperty("seocms:title");
    }

    @HippoEssentialsGenerated(internalName = "seocms:content")
    public HippoHtml getContent() {
        return getHippoHtml("seocms:content");
    }

    @HippoEssentialsGenerated(internalName = "seocms:link")
    public HippoBean getLink() {
        return getLinkedBean("seocms:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "seocms:image")
    public DefaultJMG getImage() {
        return getLinkedBean("seocms:image", DefaultJMG.class);
    }
}
