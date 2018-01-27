package org.seo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "seocms:DefaultJMG")
@Node(jcrType = "seocms:DefaultJMG")
public class DefaultJMG extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "seocms:largeThumbnail")
    public HippoGalleryImageBean getLargeThumbnail() {
        return getBean("seocms:largeThumbnail", HippoGalleryImageBean.class);
    }
}
