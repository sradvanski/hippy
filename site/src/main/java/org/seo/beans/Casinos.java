package org.seo.beans;

import java.util.List;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.seo.beans.DefaultJMG;


@HippoEssentialsGenerated(internalName = "seocms:Casinos")
@Node(jcrType = "seocms:Casinos")
public class Casinos extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "seocms:casinoName")
    public String getCasinoName() {
        return getProperty("seocms:casinoName");
    }

    @HippoEssentialsGenerated(internalName = "seocms:casinoLogo")
    public DefaultJMG getCasinoLogo() {
        return getLinkedBean("seocms:casinoLogo", DefaultJMG.class);
    }

    @HippoEssentialsGenerated(internalName = "seocms:casinoDescription")
    public String getCasinoDescription() {
        return getProperty("seocms:casinoDescription");
    }

    @HippoEssentialsGenerated(internalName = "seocms:casinoUSPs")
    public String getCasinoUSPs() {
        return getProperty("seocms:casinoUSPs");
    }

    @HippoEssentialsGenerated(internalName = "seocms:casinoRating")
    public String getCasinoRating() {
        return getProperty("seocms:casinoRating");
    }




}
