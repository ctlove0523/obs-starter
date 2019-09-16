package io.github.ctlove0523.starter.obs;

import com.obs.services.ObsClient;
import com.obs.services.model.GetObjectRequest;
import com.obs.services.model.ObsObject;

/**
 * 功能描述
 *
 * @since 2019-09-11
 */
public class ObsReader {
    private ObsClient obsClient;
    private String ak;
    private String sk;
    private String endPoint;

    public ObsReader(String ak, String sk, String endPoint) {
        this.ak = ak;
        this.sk = sk;
        this.endPoint = endPoint;
        this.obsClient = new ObsClient(ak, sk, endPoint);
    }

    public ObsObject getObject(GetObjectRequest request) {
        return obsClient.getObject(request);
    }

    public ObsClient getObsClient() {
        return obsClient;
    }

    public String getAk() {
        return ak;
    }

    public String getSk() {
        return sk;
    }

    public String getEndPoint() {
        return endPoint;
    }
}
