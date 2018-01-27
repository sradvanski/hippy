package org.seo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.seo.beans.DefaultJMG;

@HippoEssentialsGenerated(internalName = "seocms:Providers")
@Node(jcrType = "seocms:Providers")
public class Providers extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "seocms:providerName")
    public String getProviderName() {
        return getProperty("seocms:providerName");
    }

    @HippoEssentialsGenerated(internalName = "seocms:providerDescription")
    public String getProviderDescription() {
        return getProperty("seocms:providerDescription");
    }

    @HippoEssentialsGenerated(internalName = "seocms:providerLogo")
    public DefaultJMG getProviderLogo() {
        return getLinkedBean("seocms:providerLogo", DefaultJMG.class);
    }
}
