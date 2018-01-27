package org.seo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.seo.beans.DefaultJMG;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import java.util.List;



@HippoEssentialsGenerated(internalName = "seocms:Operators")
@Node(jcrType = "seocms:Operators")
public class Operators extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "seocms:operatorName")
    public String getOperatorName() {
        return getProperty("seocms:operatorName");
    }

    @HippoEssentialsGenerated(internalName = "seocms:operatorDescription")
    public String getOperatorDescription() {
        return getProperty("seocms:operatorDescription");
    }

    @HippoEssentialsGenerated(internalName = "seocms:operatorImage")
    public HippoGalleryImageSet getOperatorImage() {
        return getLinkedBean("seocms:operatorImage", HippoGalleryImageSet.class);
    }








}
