package io.github.ctlove0523.starter.obs;

import com.obs.services.ObsClient;
import com.obs.services.exception.ObsException;
import com.obs.services.model.ListBucketsRequest;
import com.obs.services.model.ObsBucket;
import com.obs.services.model.PutObjectRequest;
import com.obs.services.model.PutObjectResult;
import java.util.List;

/**
 * 功能描述
 *
 * @since 2019-09-11
 */
public class ObsWriter {
    private ObsClient obsClient;
    private String ak;
    private String sk;
    private String endPoint;

    public ObsWriter(String ak, String sk, String endPoint) {
        this.ak = ak;
        this.sk = sk;
        this.endPoint = endPoint;
        this.obsClient = new ObsClient(ak, sk, endPoint);
    }

    public ObsBucket createBucket(ObsBucket obsBucket) {
        return obsClient.createBucket(obsBucket);
    }

    public List<ObsBucket> listBuckets(ListBucketsRequest request) throws ObsException {
        return obsClient.listBuckets(request);
    }

    public PutObjectResult writeObject(PutObjectRequest request) {
        return obsClient.putObject(request);
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
