package org.seo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.seo.beans.DefaultJMG;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import java.util.List;
import java.util.Calendar;

@HippoEssentialsGenerated(internalName = "seocms:Coupons")
@Node(jcrType = "seocms:Coupons")
public class Coupons extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "seocms:offerHeader")
    public String getOfferHeader() {
        return getProperty("seocms:offerHeader");
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerLink")
    public String getOfferLink() {
        return getProperty("seocms:offerLink");
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerImage")
    public DefaultJMG getOfferImage() {
        return getLinkedBean("seocms:offerImage", DefaultJMG.class);
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerTeaser")
    public String getOfferTeaser() {
        return getProperty("seocms:offerTeaser");
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerTcs")
    public String getOfferTcs() {
        return getProperty("seocms:offerTcs");
    }

    @HippoEssentialsGenerated(internalName = "seocms:coupontypes")
    public String[] getCoupontypes() {
        return getProperty("seocms:coupontypes");
    }

    @HippoEssentialsGenerated(internalName = "seocms:casinoPath")
    public HippoBean getCasinoPath() {
        final String item = getProperty("seocms:casinoPath");
        if (item == null) {
            return null;
        }
        return getBeanByUUID(item, HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerExpiry")
    public Calendar getOfferExpiry() {
        return getProperty("seocms:offerExpiry");
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerCode")
    public String getOfferCode() {
        return getProperty("seocms:offerCode");
    }

    @HippoEssentialsGenerated(internalName = "seocms:offerCasino")
    public List<HippoBean> getOfferCasino() {
        return getLinkedBeans("seocms:offerCasino", HippoBean.class);
    }
}
